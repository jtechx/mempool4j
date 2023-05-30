package com.jtechx.mempool4j.model.mining;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BlockCount represents the block count statistics of a mining pool.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BlockCount {
    private final int all;
    private final int _24h;
    private final int _1w;

    /**
     * Constructs a BlockCount object.
     *
     * @param all  The total block count.
     * @param _24h The block count in the last 24 hours.
     * @param _1w  The block count in the last 1 week.
     */
    @JsonCreator
    public BlockCount(
            @JsonProperty("all") int all,
            @JsonProperty("24h") int _24h,
            @JsonProperty("1w") int _1w) {
        this.all = all;
        this._24h = _24h;
        this._1w = _1w;
    }

    /**
     * Retrieves the total block count.
     *
     * @return The total block count.
     */
    public int getAll() {
        return all;
    }

    /**
     * Retrieves the block count in the last 24 hours.
     *
     * @return The block count in the last 24 hours.
     */
    @JsonProperty("24h")
    public int get24h() {
        return _24h;
    }

    /**
     * Retrieves the block count in the last 1 week.
     *
     * @return The block count in the last 1 week.
     */
    @JsonProperty("1w")
    public int get1w() {
        return _1w;
    }

    /**
     * Returns a string representation of the BlockCount object.
     *
     * @return The string representation of the BlockCount object.
     */
    @Override
    public String toString() {
        return "BlockCount{" +
                "all=" + all +
                ", 24h=" + _24h +
                ", 1w=" + _1w +
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
        BlockCount that = (BlockCount) o;
        return all == that.all &&
                _24h == that._24h &&
                _1w == that._1w;
    }

    /**
     * Returns a hash code value for the BlockCount object.
     *
     * @return The hash code value for the BlockCount object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(all, _24h, _1w);
    }
}
