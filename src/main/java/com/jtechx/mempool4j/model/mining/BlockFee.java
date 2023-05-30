package com.jtechx.mempool4j.model.mining;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BlockFee represents the average total fees for a block.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BlockFee extends BlockMeta {
    private final long avgFees;

    // using long because it is hyperinflation-proof
    private final long usd;

    /**
     * Constructs a BlockFee object.
     *
     * @param avgHeight The average height of the block.
     * @param timestamp The timestamp of the block.
     * @param avgFees   The average total fees for the block.
     * @param usd       The average total fees in USD for the block.
     */
    @JsonCreator
    public BlockFee(
            @JsonProperty("avgHeight") int avgHeight,
            @JsonProperty("timestamp") long timestamp,
            @JsonProperty("avgFees") long avgFees,
            @JsonProperty("USD") long usd) {
        super(avgHeight, timestamp);
        this.avgFees = avgFees;
        this.usd = usd;
    }

    /**
     * Retrieves the average height of the block.
     *
     * @return The average height of the block.
     */
    public int getAvgHeight() {
        return avgHeight;
    }

    /**
     * Retrieves the timestamp of the block.
     *
     * @return The timestamp of the block.
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * Retrieves the average total fees for the block.
     *
     * @return The average total fees for the block.
     */
    public long getAvgFees() {
        return avgFees;
    }

    /**
     * Retrieves the average total fees in USD for the block.
     *
     * @return The average total fees in USD for the block.
     */
    public long getUsd() {
        return usd;
    }

    /**
     * Returns a string representation of the BlockFee object.
     *
     * @return The string representation of the BlockFee object.
     */
    @Override
    public String toString() {
        return "BlockFee{" +
                "avgHeight=" + avgHeight +
                ", timestamp=" + timestamp +
                ", avgFees=" + avgFees +
                ", usd=" + usd +
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
        BlockFee blockFee = (BlockFee) o;
        return avgHeight == blockFee.avgHeight &&
                timestamp == blockFee.timestamp &&
                avgFees == blockFee.avgFees &&
                usd == blockFee.usd;
    }

    /**
     * Returns a hash code value for the BlockFee object.
     *
     * @return The hash code value for the BlockFee object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(avgHeight, timestamp, avgFees, usd);
    }
}
