package com.jtechx.mempool4j.model.mining;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RewardStats represents statistics about rewards in a mining pool.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RewardStats {
    private final int startBlock;
    private final int endBlock;
    private final String totalReward;
    private final String totalFee;
    private final String totalTx;

    /**
     * Constructs a RewardStats object.
     *
     * @param startBlock   The starting block number.
     * @param endBlock     The ending block number.
     * @param totalReward  The total reward.
     * @param totalFee     The total fee.
     * @param totalTx      The total number of transactions.
     */
    @JsonCreator
    public RewardStats(@JsonProperty("startBlock") int startBlock,
            @JsonProperty("endBlock") int endBlock,
            @JsonProperty("totalReward") String totalReward,
            @JsonProperty("totalFee") String totalFee,
            @JsonProperty("totalTx") String totalTx) {
        this.startBlock = startBlock;
        this.endBlock = endBlock;
        this.totalReward = totalReward;
        this.totalFee = totalFee;
        this.totalTx = totalTx;
    }

    /**
     * Retrieves the starting block number.
     *
     * @return The starting block number.
     */
    public int getStartBlock() {
        return startBlock;
    }

    /**
     * Retrieves the ending block number.
     *
     * @return The ending block number.
     */
    public int getEndBlock() {
        return endBlock;
    }

    /**
     * Retrieves the total reward.
     *
     * @return The total reward.
     */
    public String getTotalReward() {
        return totalReward;
    }

    /**
     * Retrieves the total fee.
     *
     * @return The total fee.
     */
    public String getTotalFee() {
        return totalFee;
    }

    /**
     * Retrieves the total number of transactions.
     *
     * @return The total number of transactions.
     */
    public String getTotalTx() {
        return totalTx;
    }

    /**
     * Returns a string representation of the RewardStats object.
     *
     * @return The string representation of the RewardStats object.
     */
    @Override
    public String toString() {
        return "RewardStats{" +
                "startBlock=" + startBlock +
                ", endBlock=" + endBlock +
                ", totalReward=" + totalReward +
                ", totalFee=" + totalFee +
                ", totalTx=" + totalTx +
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
        RewardStats that = (RewardStats) o;
        return startBlock == that.startBlock &&
                endBlock == that.endBlock &&
                Objects.equals(totalReward, that.totalReward) &&
                Objects.equals(totalFee, that.totalFee) &&
                Objects.equals(totalTx, that.totalTx);
    }

    /**
     * Returns a hash code value for the RewardStats object.
     *
     * @return The hash code value for the RewardStats object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(startBlock, endBlock, totalReward, totalFee, totalTx);
    }
}
