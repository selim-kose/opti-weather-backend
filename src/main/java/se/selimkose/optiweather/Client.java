package se.selimkose.optiweather;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import se.selimkose.optiweather.entity.met.Met;
import se.selimkose.optiweather.entity.smhi.Smhi;
import se.selimkose.optiweather.entity.smhi.TimeSeries;
import se.selimkose.optiweather.service.WeatherService;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class Client implements CommandLineRunner {
    WeatherService weatherService;

    @Override
    public void run(String... args) throws Exception {
     /*   Smhi smhi = weatherService.getSmhi().block();
        System.out.println("\n###\n");

        System.out.println(smhi.getTimeSeries().get(24).getValidTime());
        System.out.println(smhi.getTimeSeries().get(24).getParameters().get(1));

        System.out.println("\n###\n");

        Met met = weatherService.getMet().block();
        System.out.println(met.getProperties().getTimeseries().get(24).getTime());
        System.out.println(met.getProperties().getTimeseries().get(24).getData().getInstant().getDetails().getAirTemperature());

        weatherService.getForecasts();*/


     /*   for(int i= 0; i< 19; i++ ){
            System.out.println(smhi.getTimeSeries().get(24).getParameters().get(i));
        }

        */

    }
}
