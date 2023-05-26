
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
    "id",
    "dwd_station_id",
    "observation_type",
    "lat",
    "lon",
    "height",
    "station_name",
    "wmo_station_id",
    "first_record",
    "last_record",
    "distance"
})



public class Source {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("dwd_station_id")
    private Object dwdStationId;
    @JsonProperty("observation_type")
    private String observationType;
    @JsonProperty("lat")
    private Double lat;
    @JsonProperty("lon")
    private Double lon;
    @JsonProperty("height")
    private Double height;
    @JsonProperty("station_name")
    private String stationName;
    @JsonProperty("wmo_station_id")
    private String wmoStationId;
    @JsonProperty("first_record")
    private String firstRecord;
    @JsonProperty("last_record")
    private String lastRecord;
    @JsonProperty("distance")
    private Double distance;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("dwd_station_id")
    public Object getDwdStationId() {
        return dwdStationId;
    }

    @JsonProperty("dwd_station_id")
    public void setDwdStationId(Object dwdStationId) {
        this.dwdStationId = dwdStationId;
    }

    @JsonProperty("observation_type")
    public String getObservationType() {
        return observationType;
    }

    @JsonProperty("observation_type")
    public void setObservationType(String observationType) {
        this.observationType = observationType;
    }

    @JsonProperty("lat")
    public Double getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(Double lat) {
        this.lat = lat;
    }

    @JsonProperty("lon")
    public Double getLon() {
        return lon;
    }

    @JsonProperty("lon")
    public void setLon(Double lon) {
        this.lon = lon;
    }

    @JsonProperty("height")
    public Double getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Double height) {
        this.height = height;
    }

    @JsonProperty("station_name")
    public String getStationName() {
        return stationName;
    }

    @JsonProperty("station_name")
    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    @JsonProperty("wmo_station_id")
    public String getWmoStationId() {
        return wmoStationId;
    }

    @JsonProperty("wmo_station_id")
    public void setWmoStationId(String wmoStationId) {
        this.wmoStationId = wmoStationId;
    }

    @JsonProperty("first_record")
    public String getFirstRecord() {
        return firstRecord;
    }

    @JsonProperty("first_record")
    public void setFirstRecord(String firstRecord) {
        this.firstRecord = firstRecord;
    }

    @JsonProperty("last_record")
    public String getLastRecord() {
        return lastRecord;
    }

    @JsonProperty("last_record")
    public void setLastRecord(String lastRecord) {
        this.lastRecord = lastRecord;
    }

    @JsonProperty("distance")
    public Double getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(Double distance) {
        this.distance = distance;
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
        sb.append(Source.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("dwdStationId");
        sb.append('=');
        sb.append(((this.dwdStationId == null)?"<null>":this.dwdStationId));
        sb.append(',');
        sb.append("observationType");
        sb.append('=');
        sb.append(((this.observationType == null)?"<null>":this.observationType));
        sb.append(',');
        sb.append("lat");
        sb.append('=');
        sb.append(((this.lat == null)?"<null>":this.lat));
        sb.append(',');
        sb.append("lon");
        sb.append('=');
        sb.append(((this.lon == null)?"<null>":this.lon));
        sb.append(',');
        sb.append("height");
        sb.append('=');
        sb.append(((this.height == null)?"<null>":this.height));
        sb.append(',');
        sb.append("stationName");
        sb.append('=');
        sb.append(((this.stationName == null)?"<null>":this.stationName));
        sb.append(',');
        sb.append("wmoStationId");
        sb.append('=');
        sb.append(((this.wmoStationId == null)?"<null>":this.wmoStationId));
        sb.append(',');
        sb.append("firstRecord");
        sb.append('=');
        sb.append(((this.firstRecord == null)?"<null>":this.firstRecord));
        sb.append(',');
        sb.append("lastRecord");
        sb.append('=');
        sb.append(((this.lastRecord == null)?"<null>":this.lastRecord));
        sb.append(',');
        sb.append("distance");
        sb.append('=');
        sb.append(((this.distance == null)?"<null>":this.distance));
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
