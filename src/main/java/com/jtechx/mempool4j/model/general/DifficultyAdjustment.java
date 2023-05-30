package com.jtechx.mempool4j.model.general;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Represents the difficulty adjustment details.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DifficultyAdjustment {
    private final double progressPercent;

    private final double difficultyChange;

    private final long estimatedRetargetDate;

    private final int remainingBlocks;

    private final int remainingTime;

    private final double previousRetarget;

    private final int previousTime;

    private final int nextRetargetHeight;

    private final int timeAvg;

    private final int timeOffset;

    private final double expectedBlocks;

    /**
     * Constructs a new DifficultyAdjustment object with the provided values.
     *
     * @param progressPercent      The progress percentage of difficulty adjustment.
     * @param difficultyChange     The difficulty change value.
     * @param estimatedRetargetDate The estimated retarget date in seconds.
     * @param remainingBlocks      The number of remaining blocks.
     * @param remainingTime        The remaining time in seconds.
     * @param previousRetarget     The previous retarget value.
     * @param nextRetargetHeight   The height of the next retarget.
     * @param timeAvg              The average time in seconds.
     * @param timeOffset           The time offset value.
     */
    public DifficultyAdjustment(
            @JsonProperty("progressPercent") double progressPercent,
            @JsonProperty("difficultyChange") double difficultyChange,
            @JsonProperty("estimatedRetargetDate") long estimatedRetargetDate,
            @JsonProperty("remainingBlocks") int remainingBlocks,
            @JsonProperty("remainingTime") int remainingTime,
            @JsonProperty("previousRetarget") double previousRetarget,
            @JsonProperty("previousTime") int previousTime,
            @JsonProperty("nextRetargetHeight") int nextRetargetHeight,
            @JsonProperty("timeAvg") int timeAvg,
            @JsonProperty("timeOffset") int timeOffset,
            @JsonProperty("expectedBlocks") double expectedBlocks) {
        this.progressPercent = progressPercent;
        this.difficultyChange = difficultyChange;
        this.estimatedRetargetDate = estimatedRetargetDate;
        this.remainingBlocks = remainingBlocks;
        this.remainingTime = remainingTime;
        this.previousRetarget = previousRetarget;
        this.previousTime = previousTime;
        this.nextRetargetHeight = nextRetargetHeight;
        this.timeAvg = timeAvg;
        this.timeOffset = timeOffset;
        this.expectedBlocks = expectedBlocks;
    }

    /**
     * Retrieves the progress percentage of difficulty adjustment.
     *
     * @return The progress percentage.
     */
    public double getProgressPercent() {
        return progressPercent;
    }

    /**
     * Retrieves the difficulty change value.
     *
     * @return The difficulty change.
     */
    public double getDifficultyChange() {
        return difficultyChange;
    }

    /**
     * Retrieves the estimated retarget date in seconds.
     *
     * @return The estimated retarget date.
     */
    public long getEstimatedRetargetDate() {
        return estimatedRetargetDate;
    }

    /**
     * Retrieves the number of remaining blocks.
     *
     * @return The remaining blocks.
     */
    public int getRemainingBlocks() {
        return remainingBlocks;
    }

    /**
     * Retrieves the remaining time in seconds.
     *
     * @return The remaining time.
     */
    public int getRemainingTime() {
        return remainingTime;
    }

    /**
     * Retrieves the previous retarget value.
     *
     * @return The previous retarget.
     */
    public double getPreviousRetarget() {
        return previousRetarget;
    }

    /**
     * Retrieves the previous retarget time.
     *
     * @return The previous retarget time.
     */
    public int getPreviousTime() {
        return previousTime;
    }

    /**
     * Retrieves the height of the next retarget.
     *
     * @return The next retarget height.
     */
    public int getNextRetargetHeight() {
        return nextRetargetHeight;
    }

    /**
     * Retrieves the average time in seconds.
     *
     * @return The average time.
     */
    public int getTimeAvg() {
        return timeAvg;
    }

    /**
     * Retrieves the time offset value.
     *
     * @return The time offset.
     */
    public int getTimeOffset() {
        return timeOffset;
    }

    /**
     * Retrieves the expected blocks.
     *
     * @return The expected blocks.
     */
    public double getExpectedBlocks() {
        return expectedBlocks;
    }

    @Override
    public String toString() {
        return "DifficultyAdjustment{" +
                "progressPercent=" + progressPercent +
                ", difficultyChange=" + difficultyChange +
                ", estimatedRetargetDate=" + estimatedRetargetDate +
                ", remainingBlocks=" + remainingBlocks +
                ", remainingTime=" + remainingTime +
                ", previousRetarget=" + previousRetarget +
                ", nextRetargetHeight=" + nextRetargetHeight +
                ", timeAvg=" + timeAvg +
                ", timeOffset=" + timeOffset +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DifficultyAdjustment that = (DifficultyAdjustment) o;
        return Double.compare(that.progressPercent, progressPercent) == 0 &&
                Double.compare(that.difficultyChange, difficultyChange) == 0 &&
                estimatedRetargetDate == that.estimatedRetargetDate &&
                remainingBlocks == that.remainingBlocks &&
                remainingTime == that.remainingTime &&
                Double.compare(that.previousRetarget, previousRetarget) == 0 &&
                nextRetargetHeight == that.nextRetargetHeight &&
                timeAvg == that.timeAvg &&
                timeOffset == that.timeOffset;
    }

    @Override
    public int hashCode() {
        return Objects.hash(progressPercent, difficultyChange, estimatedRetargetDate, remainingBlocks,
                remainingTime, previousRetarget, nextRetargetHeight, timeAvg, timeOffset);
    }
}
