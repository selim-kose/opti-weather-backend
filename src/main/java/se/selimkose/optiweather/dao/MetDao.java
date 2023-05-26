package se.selimkose.optiweather.dao;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import se.selimkose.optiweather.entity.met.Met;

import static se.selimkose.optiweather.Constants.*;


@Component
@AllArgsConstructor
public class MetDao {
    WebClient webClient;


    public Mono<Met> getMet(){
        return webClient.get()
                .uri("https://api.met.no/weatherapi/locationforecast/2.0/compact?lat="+ LAT +"&lon="+ LONG)
                .retrieve()
                .bodyToMono(Met.class);
    }
}
