package se.selimkose.optiweather.dao;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import se.selimkose.optiweather.entity.brightSky.BrightSky;
import se.selimkose.optiweather.service.WeatherService;

import static se.selimkose.optiweather.Constants.*;

@Component
@AllArgsConstructor
public class BrightSkyDAO {
    WebClient webClient;

    public Mono<BrightSky> getBrightSkyWeather(String date) {
        return webClient.get()
                .uri("https://api.brightsky.dev/weather?lat="+LAT+"&lon="+LONG+ "&date="+date)
                .retrieve()
                .bodyToMono(BrightSky.class);
    }
}



    //    "https://api.openweathermap.org/data/3.0/onecall?lat=59.3110&lon=18.0300&exclude=minutely&appid=9fab484755c6333aa56e2d4c19b1c9c0"