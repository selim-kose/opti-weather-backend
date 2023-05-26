package se.selimkose.optiweather.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.selimkose.optiweather.entity.Forecast;
import se.selimkose.optiweather.service.WeatherService;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
@CrossOrigin("http://localhost:4200")
public class WeatherController {

    WeatherService weatherService;

    @GetMapping("/getforecast")
    public ResponseEntity<Forecast> getForecast(){
        return new ResponseEntity<>(weatherService.getForecasts(), HttpStatus.OK);
    }

}
