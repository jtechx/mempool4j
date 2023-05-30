package com.jtechx.mempool4j.model.block;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Represents the status of a block from the REST API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BlockStatus {
    private final boolean inBestChain;
    private final long height;
    private final String nextBest;

    /**
     * Constructs a BlockStatus object.
     *
     * @param inBestChain The confirmation status of the block in the best chain.
     * @param height      The height of the block.
     * @param nextBest    The hash of the next block in the best chain.
     */
    @JsonCreator
    public BlockStatus(
            @JsonProperty("in_best_chain") boolean inBestChain,
            @JsonProperty("height") long height,
            @JsonProperty("next_best") String nextBest) {
        this.inBestChain = inBestChain;
        this.height = height;
        this.nextBest = nextBest;
    }

    /**
     * Retrieves the confirmation status of the block in the best chain.
     *
     * @return The confirmation status.
     */
    public boolean isInBestChain() {
        return inBestChain;
    }

    /**
     * Retrieves the height of the block.
     *
     * @return The block height.
     */
    public long getHeight() {
        return height;
    }

    /**
     * Retrieves the hash of the next block in the best chain.
     *
     * @return The hash of the next block.
     */
    public String getNextBest() {
        return nextBest;
    }

    /**
     * Returns a string representation of the BlockStatus object.
     *
     * @return A string representation of the object.
     */
    @Override
    public String toString() {
        return "BlockStatus{" +
                "inBestChain=" + inBestChain +
                ", height=" + height +
                ", nextBest='" + nextBest + '\'' +
                '}';
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * @param o The reference object with which to compare.
     * @return true if this object is the same as the obj argument; false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BlockStatus that = (BlockStatus) o;
        return inBestChain == that.inBestChain &&
                height == that.height &&
                Objects.equals(nextBest, that.nextBest);
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return A hash code value for this object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(inBestChain, height, nextBest);
    }
}
