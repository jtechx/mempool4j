package com.jtechx.mempool4j.model.lightning;

import java.util.Map;
import java.util.Objects;

/**
 * Represents the channels associated with a transaction ID (TXID).
 */
public class ChannelsFromTXID {
    private Map<String, LightningChannel> inputs;
    private Map<String, LightningChannel> outputs;

    /**
     * Constructs an empty ChannelsFromTXID object.
     */
    public ChannelsFromTXID() {
    }

    /**
     * Retrieves the map of inputs associated with the transaction ID.
     *
     * @return The map of inputs.
     */
    public Map<String, LightningChannel> getInputs() {
        return inputs;
    }

    /**
     * Sets the map of inputs associated with the transaction ID.
     *
     * @param inputs The map of inputs.
     */
    public void setInputs(Map<String, LightningChannel> inputs) {
        this.inputs = inputs;
    }

    /**
     * Retrieves the map of outputs associated with the transaction ID.
     *
     * @return The map of outputs.
     */
    public Map<String, LightningChannel> getOutputs() {
        return outputs;
    }

    /**
     * Sets the map of outputs associated with the transaction ID.
     *
     * @param outputs The map of outputs.
     */
    public void setOutputs(Map<String, LightningChannel> outputs) {
        this.outputs = outputs;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * @param o The reference object with which to compare.
     * @return True if this object is the same as the o argument; false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChannelsFromTXID that = (ChannelsFromTXID) o;
        return Objects.equals(inputs, that.inputs) && Objects.equals(outputs, that.outputs);
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return The hash code value for the object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(inputs, outputs);
    }

    /**
     * Returns a string representation of the ChannelsFromTXID object.
     *
     * @return The string representation of the ChannelsFromTXID object.
     */
    @Override
    public String toString() {
        return "ChannelsFromTXID{" +
                "inputs=" + inputs +
                ", outputs=" + outputs +
                '}';
    }
}
