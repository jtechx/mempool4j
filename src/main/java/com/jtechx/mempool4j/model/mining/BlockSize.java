package com.jtechx.mempool4j.model.mining;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BlockSize represents the average size of a block.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BlockSize extends BlockMeta {
    private final int avgSize;

    /**
     * Constructs a BlockSize object.
     *
     * @param avgHeight The average height of the block.
     * @param timestamp The timestamp of the block.
     * @param avgSize   The average size of the block.
     */
    @JsonCreator
    public BlockSize(
            @JsonProperty("avgHeight") int avgHeight,
            @JsonProperty("timestamp") long timestamp,
            @JsonProperty("avgSize") int avgSize) {
        super(avgHeight, timestamp);
        this.avgSize = avgSize;
    }

    /**
     * Retrieves the average size of the block.
     *
     * @return The average size of the block.
     */
    public int getAvgSize() {
        return avgSize;
    }

    /**
     * Returns a string representation of the BlockSize object.
     *
     * @return The string representation of the BlockSize object.
     */
    @Override
    public String toString() {
        return "BlockSize{" +
                "avgHeight=" + avgHeight +
                ", timestamp=" + timestamp +
                ", avgSize=" + avgSize +
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
        BlockSize blockSize = (BlockSize) o;
        return avgHeight == blockSize.avgHeight &&
                timestamp == blockSize.timestamp &&
                avgSize == blockSize.avgSize;
    }

    /**
     * Returns a hash code value for the BlockSize object.
     *
     * @return The hash code value for the BlockSize object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(avgHeight, timestamp, avgSize);
    }
}
