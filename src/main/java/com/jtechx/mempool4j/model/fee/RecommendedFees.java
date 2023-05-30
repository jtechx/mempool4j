package com.jtechx.mempool4j.model.fee;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RecommendedFees represents the recommended fees for mempool transactions.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RecommendedFees {
    private final int fastestFee;
    private final int halfHourFee;
    private final int hourFee;
    private final int economyFee;
    private final int minimumFee;

    /**
     * Constructs a RecommendedFees object.
     *
     * @param fastestFee   The fastest fee recommendation.
     * @param halfHourFee  The fee recommendation for confirmation within half an hour.
     * @param hourFee      The fee recommendation for confirmation within an hour.
     * @param economyFee   The fee recommendation for economical transactions.
     * @param minimumFee   The minimum fee recommendation.
     */
    @JsonCreator
    public RecommendedFees(@JsonProperty("fastestFee") int fastestFee,
            @JsonProperty("halfHourFee") int halfHourFee,
            @JsonProperty("hourFee") int hourFee,
            @JsonProperty("economyFee") int economyFee,
            @JsonProperty("minimumFee") int minimumFee) {
        this.fastestFee = fastestFee;
        this.halfHourFee = halfHourFee;
        this.hourFee = hourFee;
        this.economyFee = economyFee;
        this.minimumFee = minimumFee;
    }

    /**
     * Retrieves the fastest fee recommendation.
     *
     * @return The fastest fee recommendation.
     */
    public int getFastestFee() {
        return fastestFee;
    }

    /**
     * Retrieves the fee recommendation for confirmation within half an hour.
     *
     * @return The fee recommendation for confirmation within half an hour.
     */
    public int getHalfHourFee() {
        return halfHourFee;
    }

    /**
     * Retrieves the fee recommendation for confirmation within an hour.
     *
     * @return The fee recommendation for confirmation within an hour.
     */
    public int getHourFee() {
        return hourFee;
    }

    /**
     * Retrieves the fee recommendation for economical transactions.
     *
     * @return The fee recommendation for economical transactions.
     */
    public int getEconomyFee() {
        return economyFee;
    }

    /**
     * Retrieves the minimum fee recommendation.
     *
     * @return The minimum fee recommendation.
     */
    public int getMinimumFee() {
        return minimumFee;
    }

    /**
     * Returns a string representation of the RecommendedFees object.
     *
     * @return The string representation of the RecommendedFees object.
     */
    @Override
    public String toString() {
        return "RecommendedFees{" +
                "fastestFee=" + fastestFee +
                ", halfHourFee=" + halfHourFee +
                ", hourFee=" + hourFee +
                ", economyFee=" + economyFee +
                ", minimumFee=" + minimumFee +
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
        RecommendedFees that = (RecommendedFees) o;
        return fastestFee == that.fastestFee &&
                halfHourFee == that.halfHourFee &&
                hourFee == that.hourFee &&
                economyFee == that.economyFee &&
                minimumFee == that.minimumFee;
    }

    /**
     * Returns a hash code value for the RecommendedFees object.
     *
     * @return The hash code value for the RecommendedFees object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(fastestFee, halfHourFee, hourFee, economyFee, minimumFee);
    }
}
