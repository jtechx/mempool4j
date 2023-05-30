package com.jtechx.mempool4j.model.mining;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigInteger;
import java.util.Objects;

/**
 * MiningPoolHashrate represents the hashrate details of a mining pool at a specific timestamp.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MiningPoolHashrate {
    private final long timestamp;
    private final BigInteger avgHashrate;
    private final double share;
    private final String poolName;

    /**
     * Constructs a MiningPoolHashrate object.
     *
     * @param timestamp   The timestamp when the hashrate was measured.
     * @param avgHashrate The average hashrate of the mining pool.
     * @param share       The share of the total hashrate contributed by the mining pool.
     * @param poolName    The name of the mining pool.
     */
    @JsonCreator
    public MiningPoolHashrate(@JsonProperty("timestamp") long timestamp,
            @JsonProperty("avgHashrate") BigInteger avgHashrate,
            @JsonProperty("share") double share,
            @JsonProperty("poolName") String poolName) {
        this.timestamp = timestamp;
        this.avgHashrate = avgHashrate;
        this.share = share;
        this.poolName = poolName;
    }

    /**
     * Retrieves the timestamp when the hashrate was measured.
     *
     * @return The timestamp of the hashrate measurement.
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * Retrieves the average hashrate of the mining pool.
     *
     * @return The average hashrate of the mining pool.
     */
    public BigInteger getAvgHashrate() {
        return avgHashrate;
    }

    /**
     * Retrieves the share of the total hashrate contributed by the mining pool.
     *
     * @return The share of the total hashrate.
     */
    public double getShare() {
        return share;
    }

    /**
     * Retrieves the name of the mining pool.
     *
     * @return The name of the mining pool.
     */
    public String getPoolName() {
        return poolName;
    }

    /**
     * Returns a string representation of the MiningPoolHashrate object.
     *
     * @return The string representation of the MiningPoolHashrate object.
     */
    @Override
    public String toString() {
        return "MiningPoolHashrate{" +
                "timestamp=" + timestamp +
                ", avgHashrate=" + avgHashrate +
                ", share=" + share +
                ", poolName='" + poolName + '\'' +
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
        MiningPoolHashrate that = (MiningPoolHashrate) o;
        return timestamp == that.timestamp &&
                Objects.equals(avgHashrate, that.avgHashrate) &&
                Double.compare(that.share, share) == 0 &&
                Objects.equals(poolName, that.poolName);
    }

    /**
     * Returns a hash code value for the MiningPoolHashrate object.
     *
     * @return The hash code value for the MiningPoolHashrate object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(timestamp, avgHashrate, share, poolName);
    }
}
