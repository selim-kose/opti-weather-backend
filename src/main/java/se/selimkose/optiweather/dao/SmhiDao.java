package se.selimkose.optiweather.dao;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import se.selimkose.optiweather.entity.smhi.Smhi;

import static se.selimkose.optiweather.Constants.*;


@Component
@AllArgsConstructor
public class SmhiDao {
    WebClient webClient;

    public Mono<Smhi> getSmhi(){
        return webClient.get()
                .uri("https://opendata-download-metfcst.smhi.se/api/category/pmp3g/version/2/geotype/point/lon/"+LONG+"/lat/"+LAT+"/data.json")
                .retrieve()
                .bodyToMono(Smhi.class);

    }
}
