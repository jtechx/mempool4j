package com.jtechx.mempool4j.model.mining;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigInteger;
import java.util.Objects;

/**
 * MiningPoolDetails represents a response containing details about a mining pool.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MiningPoolDetails {
    private final MiningPool pool;
    private final BlockCount blockCount;
    private final BlockShare blockShare;
    private final BigInteger estimatedHashrate;
    private final BigInteger reportedHashrate;
    private final double avgBlockHealth;
    private final String totalReward;

    /**
     * Constructs a MiningPoolDetails object.
     *
     * @param pool               The mining pool details.
     * @param blockCount         The block count statistics.
     * @param blockShare         The block share statistics.
     * @param estimatedHashrate  The estimated hashrate of the mining pool.
     * @param reportedHashrate   The reported hashrate of the mining pool (optional).
     * @param avgBlockHealth     The average block health of the mining pool.
     * @param totalReward        The total reward of the mining pool.
     */
    @JsonCreator
    public MiningPoolDetails(@JsonProperty("pool") MiningPool pool,
            @JsonProperty("blockCount") BlockCount blockCount,
            @JsonProperty("blockShare") BlockShare blockShare,
            @JsonProperty("estimatedHashrate") BigInteger estimatedHashrate,
            @JsonProperty("reportedHashrate") BigInteger reportedHashrate,
            @JsonProperty("avgBlockHealth") double avgBlockHealth,
            @JsonProperty("totalReward") String totalReward) {
        this.pool = pool;
        this.blockCount = blockCount;
        this.blockShare = blockShare;
        this.estimatedHashrate = estimatedHashrate;
        this.reportedHashrate = reportedHashrate;
        this.avgBlockHealth = avgBlockHealth;
        this.totalReward = totalReward;
    }

    /**
     * Retrieves the mining pool details.
     *
     * @return The mining pool details.
     */
    public MiningPool getPool() {
        return pool;
    }

    /**
     * Retrieves the block count statistics.
     *
     * @return The block count statistics.
     */
    public BlockCount getBlockCount() {
        return blockCount;
    }

    /**
     * Retrieves the block share statistics.
     *
     * @return The block share statistics.
     */
    public BlockShare getBlockShare() {
        return blockShare;
    }

    /**
     * Retrieves the estimated hashrate of the mining pool.
     *
     * @return The estimated hashrate.
     */
    public BigInteger getEstimatedHashrate() {
        return estimatedHashrate;
    }

    /**
     * Retrieves the reported hashrate of the mining pool (optional).
     *
     * @return The reported hashrate, or null if not available.
     */
    public BigInteger getReportedHashrate() {
        return reportedHashrate;
    }

    /**
     * Retrieves the average block health of the mining pool.
     *
     * @return The average block health.
     */
    public double getAvgBlockHealth() {
        return avgBlockHealth;
    }

    /**
     * Retrieves the total reward of the mining pool.
     *
     * @return The total reward.
     */
    public String getTotalReward() {
        return totalReward;
    }

    /**
     * Returns a string representation of the MiningPoolDetails object.
     *
     * @return The string representation of the MiningPoolDetails object.
     */
    @Override
    public String toString() {
        return "MiningPoolDetails{" +
                "pool=" + pool +
                ", blockCount=" + blockCount +
                ", blockShare=" + blockShare +
                ", estimatedHashrate=" + estimatedHashrate +
                ", reportedHashrate=" + reportedHashrate +
                ", avgBlockHealth=" + avgBlockHealth +
                ", totalReward='" + totalReward + '\'' +
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
        MiningPoolDetails that = (MiningPoolDetails) o;
        return Double.compare(that.avgBlockHealth, avgBlockHealth) == 0 &&
                Objects.equals(pool, that.pool) &&
                Objects.equals(blockCount, that.blockCount) &&
                Objects.equals(blockShare, that.blockShare) &&
                Objects.equals(estimatedHashrate, that.estimatedHashrate) &&
                Objects.equals(reportedHashrate, that.reportedHashrate) &&
                Objects.equals(totalReward, that.totalReward);
    }

    /**
     * Returns a hash code value for the MiningPoolDetails object.
     *
     * @return The hash code value for the MiningPoolDetails object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(pool, blockCount, blockShare, estimatedHashrate, reportedHashrate, avgBlockHealth, totalReward);
    }
}
