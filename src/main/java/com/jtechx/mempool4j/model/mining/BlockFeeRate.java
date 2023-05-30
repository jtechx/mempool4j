package com.jtechx.mempool4j.model.mining;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BlockFeeRate represents the average feerate percentiles for a block.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BlockFeeRate extends BlockMeta {
    private final int avgFee_0;
    private final int avgFee_10;
    private final int avgFee_25;
    private final int avgFee_50;
    private final int avgFee_75;
    private final int avgFee_90;
    private final int avgFee_100;

    /**
     * Constructs a BlockFeeRate object.
     *
     * @param avgHeight   The average height of the block.
     * @param timestamp   The timestamp of the block.
     * @param avgFee_0    The average fee rate at percentile 0.
     * @param avgFee_10   The average fee rate at percentile 10.
     * @param avgFee_25   The average fee rate at percentile 25.
     * @param avgFee_50   The average fee rate at percentile 50.
     * @param avgFee_75   The average fee rate at percentile 75.
     * @param avgFee_90   The average fee rate at percentile 90.
     * @param avgFee_100  The average fee rate at percentile 100.
     */
    @JsonCreator
    public BlockFeeRate(
            @JsonProperty("avgHeight") int avgHeight,
            @JsonProperty("timestamp") long timestamp,
            @JsonProperty("avgFee_0") int avgFee_0,
            @JsonProperty("avgFee_10") int avgFee_10,
            @JsonProperty("avgFee_25") int avgFee_25,
            @JsonProperty("avgFee_50") int avgFee_50,
            @JsonProperty("avgFee_75") int avgFee_75,
            @JsonProperty("avgFee_90") int avgFee_90,
            @JsonProperty("avgFee_100") int avgFee_100) {
        super(avgHeight, timestamp);
        this.avgFee_0 = avgFee_0;
        this.avgFee_10 = avgFee_10;
        this.avgFee_25 = avgFee_25;
        this.avgFee_50 = avgFee_50;
        this.avgFee_75 = avgFee_75;
        this.avgFee_90 = avgFee_90;
        this.avgFee_100 = avgFee_100;
    }

    /**
     * Retrieves the average fee rate at percentile 0.
     *
     * @return The average fee rate at percentile 0.
     */
    public int getAvgFee_0() {
        return avgFee_0;
    }

    /**
     * Retrieves the average fee rate at percentile 10.
     *
     * @return The average fee rate at percentile 10.
     */
    public int getAvgFee_10() {
        return avgFee_10;
    }

    /**
     * Retrieves the average fee rate at percentile 25.
     *
     * @return The average fee rate at percentile 25.
     */
    public int getAvgFee_25() {
        return avgFee_25;
    }

    /**
     * Retrieves the average fee rate at percentile 50.
     *
     * @return The average fee rate at percentile 50.
     */
    public int getAvgFee_50() {
        return avgFee_50;
    }

    /**
     * Retrieves the average fee rate at percentile 75.
     *
     * @return The average fee rate at percentile 75.
     */
    public int getAvgFee_75() {
        return avgFee_75;
    }

    /**
     * Retrieves the average fee rate at percentile 90.
     *
     * @return The average fee rate at percentile 90.
     */
    public int getAvgFee_90() {
        return avgFee_90;
    }

    /**
     * Retrieves the average fee rate at percentile 100.
     *
     * @return The average fee rate at percentile 100.
     */
    public int getAvgFee_100() {
        return avgFee_100;
    }

    /**
     * Returns a string representation of the BlockFeeRate object.
     *
     * @return The string representation of the BlockFeeRate object.
     */
    @Override
    public String toString() {
        return "BlockFeeRate{" +
                "avgHeight=" + avgHeight +
                ", timestamp=" + timestamp +
                ", avgFee_0=" + avgFee_0 +
                ", avgFee_10=" + avgFee_10 +
                ", avgFee_25=" + avgFee_25 +
                ", avgFee_50=" + avgFee_50 +
                ", avgFee_75=" + avgFee_75 +
                ", avgFee_90=" + avgFee_90 +
                ", avgFee_100=" + avgFee_100 +
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
        BlockFeeRate that = (BlockFeeRate) o;
        return avgHeight == that.avgHeight &&
                timestamp == that.timestamp &&
                avgFee_0 == that.avgFee_0 &&
                avgFee_10 == that.avgFee_10 &&
                avgFee_25 == that.avgFee_25 &&
                avgFee_50 == that.avgFee_50 &&
                avgFee_75 == that.avgFee_75 &&
                avgFee_90 == that.avgFee_90 &&
                avgFee_100 == that.avgFee_100;
    }

    /**
     * Returns a hash code value for the BlockFeeRate object.
     *
     * @return The hash code value for the BlockFeeRate object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(avgHeight, timestamp, avgFee_0, avgFee_10, avgFee_25, avgFee_50, avgFee_75, avgFee_90, avgFee_100);
    }
}
