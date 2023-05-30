package com.jtechx.mempool4j.model.mining;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BlockWeight represents the average weight of a block.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BlockWeight extends BlockMeta {
    private final int avgWeight;

    /**
     * Constructs a BlockWeight object.
     *
     * @param avgHeight The average height of the block.
     * @param timestamp The timestamp of the block.
     * @param avgWeight The average weight of the block.
     */
    @JsonCreator
    public BlockWeight(
            @JsonProperty("avgHeight") int avgHeight,
            @JsonProperty("timestamp") long timestamp,
            @JsonProperty("avgWeight") int avgWeight) {
        super(avgHeight, timestamp);
        this.avgWeight = avgWeight;
    }

    /**
     * Retrieves the average weight of the block.
     *
     * @return The average weight of the block.
     */
    public int getAvgWeight() {
        return avgWeight;
    }

    /**
     * Returns a string representation of the BlockWeight object.
     *
     * @return The string representation of the BlockWeight object.
     */
    @Override
    public String toString() {
        return "BlockWeight{" +
                "avgHeight=" + avgHeight +
                ", timestamp=" + timestamp +
                ", avgWeight=" + avgWeight +
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
        BlockWeight that = (BlockWeight) o;
        return avgHeight == that.avgHeight &&
                timestamp == that.timestamp &&
                avgWeight == that.avgWeight;
    }

    /**
     * Returns a hash code value for the BlockWeight object.
     *
     * @return The hash code value for the BlockWeight object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(avgHeight, timestamp, avgWeight);
    }
}
