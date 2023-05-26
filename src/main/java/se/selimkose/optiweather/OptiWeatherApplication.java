package se.selimkose.optiweather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;
import se.selimkose.optiweather.entity.met.Met;
import se.selimkose.optiweather.entity.smhi.Smhi;

@SpringBootApplication
public class OptiWeatherApplication {

	public static void main(String[] args) {
		SpringApplication.run(OptiWeatherApplication.class, args);
	}

	@Bean
	public WebClient getWebClient(){
		return WebClient.create();
	}

	@Bean
	public Met getMet(){return new Met();}

	@Bean
	public Smhi getSmhi(){return new Smhi();}

}
