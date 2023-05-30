package com.jtechx.mempool4j.model.mining;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigInteger;
import java.util.Objects;

/**
 * Hashrate represents the average hashrate of a mining pool.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Hashrate {
    private final long timestamp;
    private final BigInteger avgHashrate;

    /**
     * Constructs a Hashrate object.
     *
     * @param timestamp    The timestamp of the hashrate measurement.
     * @param avgHashrate  The average hashrate.
     */
    @JsonCreator
    public Hashrate(
            @JsonProperty("timestamp") long timestamp,
            @JsonProperty("avgHashrate") BigInteger avgHashrate) {
        this.timestamp = timestamp;
        this.avgHashrate = avgHashrate;
    }

    /**
     * Retrieves the timestamp of the hashrate measurement.
     *
     * @return The timestamp of the hashrate measurement.
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * Retrieves the average hashrate.
     *
     * @return The average hashrate.
     */
    public BigInteger getAvgHashrate() {
        return avgHashrate;
    }

    /**
     * Returns a string representation of the Hashrate object.
     *
     * @return The string representation of the Hashrate object.
     */
    @Override
    public String toString() {
        return "Hashrate{" +
                "timestamp=" + timestamp +
                ", avgHashrate=" + avgHashrate +
                '}';
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * @param o The reference object with which to compare.
     * @return true if this object is the same as the o argument; false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Hashrate hashrate = (Hashrate) o;
        return timestamp == hashrate.timestamp &&
                Objects.equals(avgHashrate, hashrate.avgHashrate);
    }

    /**
     * Returns a hash code value for the Hashrate object.
     *
     * @return The hash code value for the Hashrate object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(timestamp, avgHashrate);
    }
}
