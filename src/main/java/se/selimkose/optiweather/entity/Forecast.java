package se.selimkose.optiweather.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Forecast {

    private String weatherServiceName;
    private String timeStamp;
    private Double rh;
    private Double temp;

}
