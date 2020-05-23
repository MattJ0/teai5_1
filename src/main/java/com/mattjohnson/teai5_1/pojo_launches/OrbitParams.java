
package com.mattjohnson.teai5_1.pojo_launches;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "reference_system",
    "regime",
    "longitude",
    "semi_major_axis_km",
    "eccentricity",
    "periapsis_km",
    "apoapsis_km",
    "inclination_deg",
    "period_min",
    "lifespan_years",
    "epoch",
    "mean_motion",
    "raan",
    "arg_of_pericenter",
    "mean_anomaly"
})
public class OrbitParams {

    @JsonProperty("reference_system")
    private Object referenceSystem;
    @JsonProperty("regime")
    private Object regime;
    @JsonProperty("longitude")
    private Object longitude;
    @JsonProperty("semi_major_axis_km")
    private Object semiMajorAxisKm;
    @JsonProperty("eccentricity")
    private Object eccentricity;
    @JsonProperty("periapsis_km")
    private Object periapsisKm;
    @JsonProperty("apoapsis_km")
    private Object apoapsisKm;
    @JsonProperty("inclination_deg")
    private Object inclinationDeg;
    @JsonProperty("period_min")
    private Object periodMin;
    @JsonProperty("lifespan_years")
    private Double lifespanYears;
    @JsonProperty("epoch")
    private Object epoch;
    @JsonProperty("mean_motion")
    private Object meanMotion;
    @JsonProperty("raan")
    private Object raan;
    @JsonProperty("arg_of_pericenter")
    private Object argOfPericenter;
    @JsonProperty("mean_anomaly")
    private Object meanAnomaly;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("reference_system")
    public Object getReferenceSystem() {
        return referenceSystem;
    }

    @JsonProperty("reference_system")
    public void setReferenceSystem(Object referenceSystem) {
        this.referenceSystem = referenceSystem;
    }

    @JsonProperty("regime")
    public Object getRegime() {
        return regime;
    }

    @JsonProperty("regime")
    public void setRegime(Object regime) {
        this.regime = regime;
    }

    @JsonProperty("longitude")
    public Object getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(Object longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("semi_major_axis_km")
    public Object getSemiMajorAxisKm() {
        return semiMajorAxisKm;
    }

    @JsonProperty("semi_major_axis_km")
    public void setSemiMajorAxisKm(Object semiMajorAxisKm) {
        this.semiMajorAxisKm = semiMajorAxisKm;
    }

    @JsonProperty("eccentricity")
    public Object getEccentricity() {
        return eccentricity;
    }

    @JsonProperty("eccentricity")
    public void setEccentricity(Object eccentricity) {
        this.eccentricity = eccentricity;
    }

    @JsonProperty("periapsis_km")
    public Object getPeriapsisKm() {
        return periapsisKm;
    }

    @JsonProperty("periapsis_km")
    public void setPeriapsisKm(Object periapsisKm) {
        this.periapsisKm = periapsisKm;
    }

    @JsonProperty("apoapsis_km")
    public Object getApoapsisKm() {
        return apoapsisKm;
    }

    @JsonProperty("apoapsis_km")
    public void setApoapsisKm(Object apoapsisKm) {
        this.apoapsisKm = apoapsisKm;
    }

    @JsonProperty("inclination_deg")
    public Object getInclinationDeg() {
        return inclinationDeg;
    }

    @JsonProperty("inclination_deg")
    public void setInclinationDeg(Object inclinationDeg) {
        this.inclinationDeg = inclinationDeg;
    }

    @JsonProperty("period_min")
    public Object getPeriodMin() {
        return periodMin;
    }

    @JsonProperty("period_min")
    public void setPeriodMin(Object periodMin) {
        this.periodMin = periodMin;
    }

    @JsonProperty("lifespan_years")
    public Double getLifespanYears() {
        return lifespanYears;
    }

    @JsonProperty("lifespan_years")
    public void setLifespanYears(Double lifespanYears) {
        this.lifespanYears = lifespanYears;
    }

    @JsonProperty("epoch")
    public Object getEpoch() {
        return epoch;
    }

    @JsonProperty("epoch")
    public void setEpoch(Object epoch) {
        this.epoch = epoch;
    }

    @JsonProperty("mean_motion")
    public Object getMeanMotion() {
        return meanMotion;
    }

    @JsonProperty("mean_motion")
    public void setMeanMotion(Object meanMotion) {
        this.meanMotion = meanMotion;
    }

    @JsonProperty("raan")
    public Object getRaan() {
        return raan;
    }

    @JsonProperty("raan")
    public void setRaan(Object raan) {
        this.raan = raan;
    }

    @JsonProperty("arg_of_pericenter")
    public Object getArgOfPericenter() {
        return argOfPericenter;
    }

    @JsonProperty("arg_of_pericenter")
    public void setArgOfPericenter(Object argOfPericenter) {
        this.argOfPericenter = argOfPericenter;
    }

    @JsonProperty("mean_anomaly")
    public Object getMeanAnomaly() {
        return meanAnomaly;
    }

    @JsonProperty("mean_anomaly")
    public void setMeanAnomaly(Object meanAnomaly) {
        this.meanAnomaly = meanAnomaly;
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
        return "OrbitParams{" +
                "referenceSystem=" + referenceSystem +
                ", regime=" + regime +
                ", longitude=" + longitude +
                ", semiMajorAxisKm=" + semiMajorAxisKm +
                ", eccentricity=" + eccentricity +
                ", periapsisKm=" + periapsisKm +
                ", apoapsisKm=" + apoapsisKm +
                ", inclinationDeg=" + inclinationDeg +
                ", periodMin=" + periodMin +
                ", lifespanYears=" + lifespanYears +
                ", epoch=" + epoch +
                ", meanMotion=" + meanMotion +
                ", raan=" + raan +
                ", argOfPericenter=" + argOfPericenter +
                ", meanAnomaly=" + meanAnomaly +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
