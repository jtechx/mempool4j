package com.jtechx.mempool4j.model.mining;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BlockShare represents the block share statistics of a mining pool.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BlockShare {
    private final double all;
    private final double _24h;
    private final double _1w;

    /**
     * Constructs a BlockShare object.
     *
     * @param all  The total block share.
     * @param _24h The block share in the last 24 hours.
     * @param _1w  The block share in the last 1 week.
     */
    @JsonCreator
    public BlockShare(
            @JsonProperty("all") double all,
            @JsonProperty("24h") double _24h,
            @JsonProperty("1w") double _1w) {
        this.all = all;
        this._24h = _24h;
        this._1w = _1w;
    }

    /**
     * Retrieves the total block share.
     *
     * @return The total block share.
     */
    public double getAll() {
        return all;
    }

    /**
     * Retrieves the block share in the last 24 hours.
     *
     * @return The block share in the last 24 hours.
     */
    @JsonProperty("24h")
    public double get24h() {
        return _24h;
    }

    /**
     * Retrieves the block share in the last 1 week.
     *
     * @return The block share in the last 1 week.
     */
    @JsonProperty("1w")
    public double get1w() {
        return _1w;
    }

    /**
     * Returns a string representation of the BlockShare object.
     *
     * @return The string representation of the BlockShare object.
     */
    @Override
    public String toString() {
        return "BlockShare{" +
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
        BlockShare that = (BlockShare) o;
        return Double.compare(that.all, all) == 0 &&
                Double.compare(that._24h, _24h) == 0 &&
                Double.compare(that._1w, _1w) == 0;
    }

    /**
     * Returns a hash code value for the BlockShare object.
     *
     * @return The hash code value for the BlockShare object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(all, _24h, _1w);
    }
}
