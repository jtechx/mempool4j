package com.jtechx.mempool4j.model.mining;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MiningPoolDifficulty represents the mining pool difficulty at a specific time and block height.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MiningPoolDifficulty {
    private final long time;
    private final double difficulty;
    private final int height;
    private final double adjustment;

    /**
     * Constructs a MiningPoolDifficulty object.
     *
     * @param time       The time when the mining pool difficulty was measured.
     * @param difficulty The difficulty value of the mining pool.
     * @param height     The block height associated with the difficulty.
     * @param adjustment The adjustment value of the mining pool difficulty.
     */
    @JsonCreator
    public MiningPoolDifficulty(@JsonProperty("time") long time,
            @JsonProperty("difficulty") double difficulty,
            @JsonProperty("height") int height,
            @JsonProperty("adjustment") double adjustment) {
        this.time = time;
        this.difficulty = difficulty;
        this.height = height;
        this.adjustment = adjustment;
    }

    /**
     * Retrieves the time when the mining pool difficulty was measured.
     *
     * @return The time of the mining pool difficulty measurement.
     */
    public long getTime() {
        return time;
    }

    /**
     * Retrieves the difficulty value of the mining pool.
     *
     * @return The difficulty value of the mining pool.
     */
    public double getDifficulty() {
        return difficulty;
    }

    /**
     * Retrieves the block height associated with the mining pool difficulty.
     *
     * @return The block height of the mining pool difficulty.
     */
    public int getHeight() {
        return height;
    }

    /**
     * Retrieves the adjustment value of the mining pool difficulty.
     *
     * @return The adjustment value of the mining pool difficulty.
     */
    public double getAdjustment() {
        return adjustment;
    }

    /**
     * Returns a string representation of the MiningPoolDifficulty object.
     *
     * @return The string representation of the MiningPoolDifficulty object.
     */
    @Override
    public String toString() {
        return "MiningPoolDifficulty{" +
                "time=" + time +
                ", difficulty=" + difficulty +
                ", height=" + height +
                ", adjustment=" + adjustment +
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
        MiningPoolDifficulty that = (MiningPoolDifficulty) o;
        return time == that.time &&
                Double.compare(that.difficulty, difficulty) == 0 &&
                height == that.height &&
                Double.compare(that.adjustment, adjustment) == 0;
    }

    /**
     * Returns a hash code value for the MiningPoolDifficulty object.
     *
     * @return The hash code value for the MiningPoolDifficulty object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(time, difficulty, height, adjustment);
    }
}
