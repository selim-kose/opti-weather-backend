package se.selimkose.optiweather.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.Disposable;
import reactor.core.publisher.Mono;
import se.selimkose.optiweather.dao.MetDao;
import se.selimkose.optiweather.dao.SmhiDao;
import se.selimkose.optiweather.entity.Forecast;
import se.selimkose.optiweather.entity.met.*;

import static se.selimkose.optiweather.Constants.*;

import se.selimkose.optiweather.entity.smhi.Smhi;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

@Service
@AllArgsConstructor
public class WeatherService {
    SmhiDao smhiDao;
    MetDao metDao;
    List<Forecast> forecasts;

    public Forecast getForecasts() {
        return calcBestForecast(buildForecasts());
    }

    public List<Forecast> buildForecasts(){
      forecasts = new ArrayList<>();

        metDao.getMet().subscribe(response -> {
            Forecast metForecast = Forecast.builder()
                    .weatherServiceName(response.getClass().getSimpleName())
                    .rh(response.getProperties().getTimeseries().get(24).getData().getInstant().getDetails().getRelativeHumidity())
                    .temp(response.getProperties().getTimeseries().get(24).getData().getInstant().getDetails().getAirTemperature())
                    .timeStamp(response.getProperties().getTimeseries().get(24).getTime())
                    .build();

            forecasts.add(metForecast);
        });


        smhiDao.getSmhi().subscribe(response -> {
            Forecast smhiForecast = Forecast.builder()
                    .weatherServiceName(response.getClass().getSimpleName())
                    .rh(response.getTimeSeries().get(24).getParameters().get(5).getValues().get(0))
                    .temp(response.getTimeSeries().get(24).getParameters().get(1).getValues().get(0))
                    .timeStamp(response.getTimeSeries().get(24).getValidTime())
                    .build();

            forecasts.add(smhiForecast);



        });


       // Met met = metDao.getMet().block();
       // Smhi smhi = smhiDao.getSmhi().block();

       /* Forecast metForecast = Forecast.builder()
                .weatherServiceName(met.getClass().getSimpleName())
                .rh(met.getProperties().getTimeseries().get(24).getData().getInstant().getDetails().getRelativeHumidity())
                .temp(met.getProperties().getTimeseries().get(24).getData().getInstant().getDetails().getAirTemperature())
                .timeStamp(met.getProperties().getTimeseries().get(24).getTime())
                .build();

        forecasts.add(metForecast);*/

    /*    Forecast smhiForecast = Forecast.builder()
                .weatherServiceName(smhi.getClass().getSimpleName())
                .rh(smhi.getTimeSeries().get(24).getParameters().get(5).getValues().get(0))
                .temp(smhi.getTimeSeries().get(24).getParameters().get(1).getValues().get(0))
                .timeStamp(smhi.getTimeSeries().get(24).getValidTime())
                .build();

        forecasts.add(smhiForecast);*/
/*


        System.out.println(forecasts.get(1));
        System.out.println(forecasts.get(0));*/



        while(forecasts.size() < 2) {
            try {
                Thread.sleep(1000);
                System.out.println(forecasts.size());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        return forecasts;
    }

    public Forecast calcBestForecast(List<Forecast> forecasts) {


        if (forecasts.get(0).getTemp() > forecasts.get(1).getTemp()) {
            return forecasts.get(0);
        }else {
            return forecasts.get(1);
        }
    }

}
