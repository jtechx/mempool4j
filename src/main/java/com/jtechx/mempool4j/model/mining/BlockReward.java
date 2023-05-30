package com.jtechx.mempool4j.model.mining;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BlockReward represents the average block rewards for a block.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BlockReward extends BlockMeta {
    private final long avgRewards;
    // using long because it is hyperinflation-proof
    private final long usd;

    /**
     * Constructs a BlockReward object.
     *
     * @param avgHeight   The average height of the block.
     * @param timestamp   The timestamp of the block.
     * @param avgRewards  The average block rewards.
     * @param usd       The average total fees in USD for the block.
     */
    @JsonCreator
    public BlockReward(
            @JsonProperty("avgHeight") int avgHeight,
            @JsonProperty("timestamp") long timestamp,
            @JsonProperty("avgRewards") long avgRewards,
            @JsonProperty("USD") long usd) {
        super(avgHeight, timestamp);
        this.avgRewards = avgRewards;
        this.usd = usd;
    }

    /**
     * Retrieves the average block rewards.
     *
     * @return The average block rewards.
     */
    public long getAvgRewards() {
        return avgRewards;
    }

    /**
     * Retrieves the average total rewards in USD for the block.
     *
     * @return The average total rewards in USD for the block.
     */
    public long getUsd() {
        return usd;
    }

    /**
     * Returns a string representation of the BlockReward object.
     *
     * @return The string representation of the BlockReward object.
     */
    @Override
    public String toString() {
        return "BlockReward{" +
                "avgHeight=" + avgHeight +
                ", timestamp=" + timestamp +
                ", avgRewards=" + avgRewards +
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
        BlockReward that = (BlockReward) o;
        return avgHeight == that.avgHeight &&
                timestamp == that.timestamp &&
                avgRewards == that.avgRewards &&
                usd == that.usd;
    }

    /**
     * Returns a hash code value for the BlockReward object.
     *
     * @return The hash code value for the BlockReward object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(avgHeight, timestamp, avgRewards, usd);
    }
}
