package com.jtechx.mempool4j.model.mining;

/**
 * Represents the metadata of a block.
 */
public abstract class BlockMeta {
    protected final int avgHeight;
    protected final long timestamp;

    /**
     * Constructs a BlockMeta object with the specified average height and timestamp.
     *
     * @param avgHeight  The average height of the block.
     * @param timestamp  The timestamp of the block.
     */
    protected BlockMeta(int avgHeight, long timestamp) {
        this.avgHeight = avgHeight;
        this.timestamp = timestamp;
    }
}
