package com.jtechx.mempool4j.model.mining;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

/**
 * BlockSizesAndWeights represents a response containing average block sizes and weights for blocks in a specified time period.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BlockSizesAndWeights {
    private final List<BlockSize> sizes;
    private final List<BlockWeight> weights;

    /**
     * Constructs a BlockSizesAndWeights object.
     *
     * @param sizes   The list of block sizes.
     * @param weights The list of block weights.
     */
    @JsonCreator
    public BlockSizesAndWeights(
            @JsonProperty("sizes") List<BlockSize> sizes,
            @JsonProperty("weights") List<BlockWeight> weights) {
        this.sizes = sizes;
        this.weights = weights;
    }

    /**
     * Retrieves the list of block sizes.
     *
     * @return The list of block sizes.
     */
    public List<BlockSize> getSizes() {
        return sizes;
    }

    /**
     * Retrieves the list of block weights.
     *
     * @return The list of block weights.
     */
    public List<BlockWeight> getWeights() {
        return weights;
    }

    /**
     * Returns a string representation of the BlockSizesAndWeights object.
     *
     * @return The string representation of the BlockSizesAndWeights object.
     */
    @Override
    public String toString() {
        return "BlockSizesAndWeights{" +
                "sizes=" + sizes +
                ", weights=" + weights +
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
        BlockSizesAndWeights that = (BlockSizesAndWeights) o;
        return Objects.equals(sizes, that.sizes) &&
                Objects.equals(weights, that.weights);
    }

    /**
     * Returns a hash code value for the BlockSizesAndWeights object.
     *
     * @return The hash code value for the BlockSizesAndWeights object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(sizes, weights);
    }
}
