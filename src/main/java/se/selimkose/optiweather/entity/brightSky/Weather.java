
package se.selimkose.optiweather.entity.brightSky;

import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "timestamp",
    "source_id",
    "precipitation",
    "pressure_msl",
    "sunshine",
    "temperature",
    "wind_direction",
    "wind_speed",
    "cloud_cover",
    "dew_point",
    "relative_humidity",
    "visibility",
    "wind_gust_direction",
    "wind_gust_speed",
    "condition",
    "precipitation_probability",
    "precipitation_probability_6h",
    "solar",
    "fallback_source_ids",
    "icon"
})

public class Weather {

    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("source_id")
    private Integer sourceId;
    @JsonProperty("precipitation")
    private Double precipitation;
    @JsonProperty("pressure_msl")
    private Double pressureMsl;
    @JsonProperty("sunshine")
    private Double sunshine;
    @JsonProperty("temperature")
    private Double temperature;
    @JsonProperty("wind_direction")
    private Integer windDirection;
    @JsonProperty("wind_speed")
    private Double windSpeed;
    @JsonProperty("cloud_cover")
    private Integer cloudCover;
    @JsonProperty("dew_point")
    private Double dewPoint;
    @JsonProperty("relative_humidity")
    private Double relativeHumidity;
    @JsonProperty("visibility")
    private Integer visibility;
    @JsonProperty("wind_gust_direction")
    private Object windGustDirection;
    @JsonProperty("wind_gust_speed")
    private Double windGustSpeed;
    @JsonProperty("condition")
    private String condition;
    @JsonProperty("precipitation_probability")
    private Integer precipitationProbability;
    @JsonProperty("precipitation_probability_6h")
    private Integer precipitationProbability6h;
    @JsonProperty("solar")
    private Double solar;
    @JsonProperty("fallback_source_ids")
    private FallbackSourceIds fallbackSourceIds;
    @JsonProperty("icon")
    private String icon;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("source_id")
    public Integer getSourceId() {
        return sourceId;
    }

    @JsonProperty("source_id")
    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    @JsonProperty("precipitation")
    public Double getPrecipitation() {
        return precipitation;
    }

    @JsonProperty("precipitation")
    public void setPrecipitation(Double precipitation) {
        this.precipitation = precipitation;
    }

    @JsonProperty("pressure_msl")
    public Double getPressureMsl() {
        return pressureMsl;
    }

    @JsonProperty("pressure_msl")
    public void setPressureMsl(Double pressureMsl) {
        this.pressureMsl = pressureMsl;
    }

    @JsonProperty("sunshine")
    public Double getSunshine() {
        return sunshine;
    }

    @JsonProperty("sunshine")
    public void setSunshine(Double sunshine) {
        this.sunshine = sunshine;
    }

    @JsonProperty("temperature")
    public Double getTemperature() {
        return temperature;
    }

    @JsonProperty("temperature")
    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    @JsonProperty("wind_direction")
    public Integer getWindDirection() {
        return windDirection;
    }

    @JsonProperty("wind_direction")
    public void setWindDirection(Integer windDirection) {
        this.windDirection = windDirection;
    }

    @JsonProperty("wind_speed")
    public Double getWindSpeed() {
        return windSpeed;
    }

    @JsonProperty("wind_speed")
    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    @JsonProperty("cloud_cover")
    public Integer getCloudCover() {
        return cloudCover;
    }

    @JsonProperty("cloud_cover")
    public void setCloudCover(Integer cloudCover) {
        this.cloudCover = cloudCover;
    }

    @JsonProperty("dew_point")
    public Double getDewPoint() {
        return dewPoint;
    }

    @JsonProperty("dew_point")
    public void setDewPoint(Double dewPoint) {
        this.dewPoint = dewPoint;
    }

    @JsonProperty("relative_humidity")
    public Double getRelativeHumidity() {
        return relativeHumidity;
    }

    @JsonProperty("relative_humidity")
    public void setRelativeHumidity(Double relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    @JsonProperty("visibility")
    public Integer getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    @JsonProperty("wind_gust_direction")
    public Object getWindGustDirection() {
        return windGustDirection;
    }

    @JsonProperty("wind_gust_direction")
    public void setWindGustDirection(Object windGustDirection) {
        this.windGustDirection = windGustDirection;
    }

    @JsonProperty("wind_gust_speed")
    public Double getWindGustSpeed() {
        return windGustSpeed;
    }

    @JsonProperty("wind_gust_speed")
    public void setWindGustSpeed(Double windGustSpeed) {
        this.windGustSpeed = windGustSpeed;
    }

    @JsonProperty("condition")
    public String getCondition() {
        return condition;
    }

    @JsonProperty("condition")
    public void setCondition(String condition) {
        this.condition = condition;
    }

    @JsonProperty("precipitation_probability")
    public Integer getPrecipitationProbability() {
        return precipitationProbability;
    }

    @JsonProperty("precipitation_probability")
    public void setPrecipitationProbability(Integer precipitationProbability) {
        this.precipitationProbability = precipitationProbability;
    }

    @JsonProperty("precipitation_probability_6h")
    public Integer getPrecipitationProbability6h() {
        return precipitationProbability6h;
    }

    @JsonProperty("precipitation_probability_6h")
    public void setPrecipitationProbability6h(Integer precipitationProbability6h) {
        this.precipitationProbability6h = precipitationProbability6h;
    }

    @JsonProperty("solar")
    public Double getSolar() {
        return solar;
    }

    @JsonProperty("solar")
    public void setSolar(Double solar) {
        this.solar = solar;
    }

    @JsonProperty("fallback_source_ids")
    public FallbackSourceIds getFallbackSourceIds() {
        return fallbackSourceIds;
    }

    @JsonProperty("fallback_source_ids")
    public void setFallbackSourceIds(FallbackSourceIds fallbackSourceIds) {
        this.fallbackSourceIds = fallbackSourceIds;
    }

    @JsonProperty("icon")
    public String getIcon() {
        return icon;
    }

    @JsonProperty("icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Weather.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("sourceId");
        sb.append('=');
        sb.append(((this.sourceId == null)?"<null>":this.sourceId));
        sb.append(',');
        sb.append("precipitation");
        sb.append('=');
        sb.append(((this.precipitation == null)?"<null>":this.precipitation));
        sb.append(',');
        sb.append("pressureMsl");
        sb.append('=');
        sb.append(((this.pressureMsl == null)?"<null>":this.pressureMsl));
        sb.append(',');
        sb.append("sunshine");
        sb.append('=');
        sb.append(((this.sunshine == null)?"<null>":this.sunshine));
        sb.append(',');
        sb.append("temperature");
        sb.append('=');
        sb.append(((this.temperature == null)?"<null>":this.temperature));
        sb.append(',');
        sb.append("windDirection");
        sb.append('=');
        sb.append(((this.windDirection == null)?"<null>":this.windDirection));
        sb.append(',');
        sb.append("windSpeed");
        sb.append('=');
        sb.append(((this.windSpeed == null)?"<null>":this.windSpeed));
        sb.append(',');
        sb.append("cloudCover");
        sb.append('=');
        sb.append(((this.cloudCover == null)?"<null>":this.cloudCover));
        sb.append(',');
        sb.append("dewPoint");
        sb.append('=');
        sb.append(((this.dewPoint == null)?"<null>":this.dewPoint));
        sb.append(',');
        sb.append("relativeHumidity");
        sb.append('=');
        sb.append(((this.relativeHumidity == null)?"<null>":this.relativeHumidity));
        sb.append(',');
        sb.append("visibility");
        sb.append('=');
        sb.append(((this.visibility == null)?"<null>":this.visibility));
        sb.append(',');
        sb.append("windGustDirection");
        sb.append('=');
        sb.append(((this.windGustDirection == null)?"<null>":this.windGustDirection));
        sb.append(',');
        sb.append("windGustSpeed");
        sb.append('=');
        sb.append(((this.windGustSpeed == null)?"<null>":this.windGustSpeed));
        sb.append(',');
        sb.append("condition");
        sb.append('=');
        sb.append(((this.condition == null)?"<null>":this.condition));
        sb.append(',');
        sb.append("precipitationProbability");
        sb.append('=');
        sb.append(((this.precipitationProbability == null)?"<null>":this.precipitationProbability));
        sb.append(',');
        sb.append("precipitationProbability6h");
        sb.append('=');
        sb.append(((this.precipitationProbability6h == null)?"<null>":this.precipitationProbability6h));
        sb.append(',');
        sb.append("solar");
        sb.append('=');
        sb.append(((this.solar == null)?"<null>":this.solar));
        sb.append(',');
        sb.append("fallbackSourceIds");
        sb.append('=');
        sb.append(((this.fallbackSourceIds == null)?"<null>":this.fallbackSourceIds));
        sb.append(',');
        sb.append("icon");
        sb.append('=');
        sb.append(((this.icon == null)?"<null>":this.icon));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
