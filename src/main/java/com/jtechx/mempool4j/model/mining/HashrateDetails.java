package com.jtechx.mempool4j.model.mining;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigInteger;
import java.util.List;
import java.util.Objects;

/**
 * HashrateDetails represents the details of hashrate and difficulty for a mining pool.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HashrateDetails {
    private final List<Hashrate> hashrates;
    private final List<MiningPoolDifficulty> difficulty;
    private final BigInteger currentHashrate;
    private final double currentDifficulty;

    /**
     * Constructs a HashrateDetails object.
     *
     * @param hashrates          The list of hashrate measurements.
     * @param difficulty         The list of mining pool difficulties.
     * @param currentHashrate    The current hashrate.
     * @param currentDifficulty  The current mining difficulty.
     */
    @JsonCreator
    public HashrateDetails(
            @JsonProperty("hashrates") List<Hashrate> hashrates,
            @JsonProperty("difficulty") List<MiningPoolDifficulty> difficulty,
            @JsonProperty("currentHashrate") BigInteger currentHashrate,
            @JsonProperty("currentDifficulty") double currentDifficulty) {
        this.hashrates = hashrates;
        this.difficulty = difficulty;
        this.currentHashrate = currentHashrate;
        this.currentDifficulty = currentDifficulty;
    }

    /**
     * Retrieves the list of hashrate measurements.
     *
     * @return The list of hashrate measurements.
     */
    public List<Hashrate> getHashrates() {
        return hashrates;
    }

    /**
     * Retrieves the list of mining pool difficulties.
     *
     * @return The list of mining pool difficulties.
     */
    public List<MiningPoolDifficulty> getDifficulty() {
        return difficulty;
    }

    /**
     * Retrieves the current hashrate.
     *
     * @return The current hashrate.
     */
    public BigInteger getCurrentHashrate() {
        return currentHashrate;
    }

    /**
     * Retrieves the current mining difficulty.
     *
     * @return The current mining difficulty.
     */
    public double getCurrentDifficulty() {
        return currentDifficulty;
    }

    /**
     * Returns a string representation of the HashrateDetails object.
     *
     * @return The string representation of the HashrateDetails object.
     */
    @Override
    public String toString() {
        return "HashrateDetails{" +
                "hashrates=" + hashrates +
                ", difficulty=" + difficulty +
                ", currentHashrate=" + currentHashrate +
                ", currentDifficulty=" + currentDifficulty +
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
        HashrateDetails that = (HashrateDetails) o;
        return Objects.equals(currentHashrate, that.currentHashrate) &&
                Double.compare(that.currentDifficulty, currentDifficulty) == 0 &&
                Objects.equals(hashrates, that.hashrates) &&
                Objects.equals(difficulty, that.difficulty);
    }

    /**
     * Returns a hash code value for the HashrateDetails object.
     *
     * @return The hash code value for the HashrateDetails object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(hashrates, difficulty, currentHashrate, currentDifficulty);
    }
}
