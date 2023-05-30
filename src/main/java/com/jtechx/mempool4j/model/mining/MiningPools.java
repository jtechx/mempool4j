package com.jtechx.mempool4j.model.mining;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.math.BigInteger;
import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MiningPools represents a response containing a list of mining pools.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MiningPools {
    private final List<MiningPoolInfo> pools;
    private final int blockCount;
    private final BigInteger lastEstimatedHashrate;

    /**
     * Constructs a MiningPools object.
     *
     * @param pools                The list of mining pools.
     * @param blockCount           The total block count.
     * @param lastEstimatedHashrate The last estimated hashrate.
     */
    @JsonCreator
    public MiningPools(@JsonProperty("pools") List<MiningPoolInfo> pools,
            @JsonProperty("blockCount") int blockCount,
            @JsonProperty("lastEstimatedHashrate") BigInteger lastEstimatedHashrate) {
        this.pools = pools;
        this.blockCount = blockCount;
        this.lastEstimatedHashrate = lastEstimatedHashrate;
    }

    /**
     * Retrieves the list of mining pools.
     *
     * @return The list of mining pools.
     */
    public List<MiningPoolInfo> getPools() {
        return pools;
    }

    /**
     * Retrieves the total block count.
     *
     * @return The total block count.
     */
    public int getBlockCount() {
        return blockCount;
    }

    /**
     * Retrieves the last estimated hashrate.
     *
     * @return The last estimated hashrate.
     */
    public BigInteger getLastEstimatedHashrate() {
        return lastEstimatedHashrate;
    }

    /**
     * Returns a string representation of the MiningPools object.
     *
     * @return The string representation of the MiningPools object.
     */
    @Override
    public String toString() {
        return "MiningPools{" +
                "pools=" + pools +
                ", blockCount=" + blockCount +
                ", lastEstimatedHashrate=" + lastEstimatedHashrate +
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
        MiningPools that = (MiningPools) o;
        return blockCount == that.blockCount &&
                Objects.equals(lastEstimatedHashrate, that.lastEstimatedHashrate) &&
                Objects.equals(pools, that.pools);
    }

    /**
     * Returns a hash code value for the MiningPools object.
     *
     * @return The hash code value for the MiningPools object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(pools, blockCount, lastEstimatedHashrate);
    }
}
