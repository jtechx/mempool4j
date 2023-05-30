package com.jtechx.mempool4j.model.mining;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Represents information about a mining pool.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MiningPoolInfo {
    private final int poolId;
    private final String name;
    private final String link;
    private final int blockCount;
    private final int rank;
    private final int emptyBlocks;
    private final String slug;
    private final double avgMatchRate;

    /**
     * Constructs a new MiningPoolInfo object.
     *
     * @param poolId       The ID of the mining pool.
     * @param name         The name of the mining pool.
     * @param link         The link to the mining pool.
     * @param blockCount   The total block count of the mining pool.
     * @param rank         The rank of the mining pool.
     * @param emptyBlocks  The number of empty blocks in the mining pool.
     * @param slug         The slug of the mining pool.
     * @param avgMatchRate The average match rate.
     */
    @JsonCreator
    public MiningPoolInfo(@JsonProperty("poolId") int poolId,
            @JsonProperty("name") String name,
            @JsonProperty("link") String link,
            @JsonProperty("blockCount") int blockCount,
            @JsonProperty("rank") int rank,
            @JsonProperty("emptyBlocks") int emptyBlocks,
            @JsonProperty("slug") String slug,
            @JsonProperty("avgMatchRate") double avgMatchRate) {
        this.poolId = poolId;
        this.name = name;
        this.link = link;
        this.blockCount = blockCount;
        this.rank = rank;
        this.emptyBlocks = emptyBlocks;
        this.slug = slug;
        this.avgMatchRate = avgMatchRate;
    }

    /**
     * Retrieves the ID of the mining pool.
     *
     * @return The ID of the mining pool.
     */
    public int getPoolId() {
        return poolId;
    }

    /**
     * Retrieves the name of the mining pool.
     *
     * @return The name of the mining pool.
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the link to the mining pool.
     *
     * @return The link to the mining pool.
     */
    public String getLink() {
        return link;
    }

    /**
     * Retrieves the total block count of the mining pool.
     *
     * @return The total block count of the mining pool.
     */
    public int getBlockCount() {
        return blockCount;
    }

    /**
     * Retrieves the rank of the mining pool.
     *
     * @return The rank of the mining pool.
     */
    public int getRank() {
        return rank;
    }

    /**
     * Retrieves the number of empty blocks in the mining pool.
     *
     * @return The number of empty blocks.
     */
    public int getEmptyBlocks() {
        return emptyBlocks;
    }

    /**
     * Retrieves the slug of the mining pool.
     *
     * @return The slug of the mining pool.
     */
    public String getSlug() {
        return slug;
    }

    /**
     * Retrieves the average match rate.
     *
     * @return The average match rate.
     */
    public double getAvgMatchRate() {
        return avgMatchRate;
    }

    /**
     * Returns a string representation of the MiningPoolInfo object.
     *
     * @return The string representation of the MiningPoolInfo object.
     */
    @Override
    public String toString() {
        return "MiningPoolInfo{" +
                "poolId=" + poolId +
                ", name='" + name + '\'' +
                ", link='" + link + '\'' +
                ", blockCount=" + blockCount +
                ", rank=" + rank +
                ", emptyBlocks=" + emptyBlocks +
                ", slug='" + slug + '\'' +
                ", avgMatchRate=" + avgMatchRate +
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
        MiningPoolInfo that = (MiningPoolInfo) o;
        return poolId == that.poolId &&
                blockCount == that.blockCount &&
                rank == that.rank &&
                emptyBlocks == that.emptyBlocks &&
                Double.compare(that.avgMatchRate, avgMatchRate) == 0 &&
                Objects.equals(name, that.name) &&
                Objects.equals(link, that.link) &&
                Objects.equals(slug, that.slug);
    }

    /**
     * Returns a hash code value for the MiningPoolInfo object.
     *
     * @return The hash code value for the MiningPoolInfo object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(poolId, name, link, blockCount, rank, emptyBlocks, slug, avgMatchRate);
    }
}
