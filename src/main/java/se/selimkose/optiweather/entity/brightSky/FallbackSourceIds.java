
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
    "sunshine",
    "solar"
})

public class FallbackSourceIds {

    @JsonProperty("sunshine")
    private Integer sunshine;
    @JsonProperty("solar")
    private Integer solar;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("sunshine")
    public Integer getSunshine() {
        return sunshine;
    }

    @JsonProperty("sunshine")
    public void setSunshine(Integer sunshine) {
        this.sunshine = sunshine;
    }

    @JsonProperty("solar")
    public Integer getSolar() {
        return solar;
    }

    @JsonProperty("solar")
    public void setSolar(Integer solar) {
        this.solar = solar;
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
        sb.append(FallbackSourceIds.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sunshine");
        sb.append('=');
        sb.append(((this.sunshine == null)?"<null>":this.sunshine));
        sb.append(',');
        sb.append("solar");
        sb.append('=');
        sb.append(((this.solar == null)?"<null>":this.solar));
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
