
package com.mattjohnson.teai5_1.pojo_launches;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "block",
    "payloads"
})
public class SecondStage {

    @JsonProperty("block")
    private Integer block;
    @JsonProperty("payloads")
    private List<Payload> payloads = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("block")
    public Integer getBlock() {
        return block;
    }

    @JsonProperty("block")
    public void setBlock(Integer block) {
        this.block = block;
    }

    @JsonProperty("payloads")
    public List<Payload> getPayloads() {
        return payloads;
    }

    @JsonProperty("payloads")
    public void setPayloads(List<Payload> payloads) {
        this.payloads = payloads;
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
        return "SecondStage{" +
                "block=" + block +
                ", payloads=" + payloads +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
