package com.jtechx.mempool4j.model.transaction;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Represents an output (vout) in a transaction.
 */
public class Vout {
    private final String scriptPubKey;
    private final String scriptPubKeyAsm;
    private final String scriptPubKeyType;
    private final String scriptPubKeyAddress;
    private final long value;

    /**
     * Constructs a Vout object with the provided values.
     *
     * @param scriptPubKey        The script public key.
     * @param scriptPubKeyAsm     The script public key ASM.
     * @param scriptPubKeyType    The script public key type.
     * @param scriptPubKeyAddress The script public key address.
     * @param value               The output value.
     */
    @JsonCreator
    public Vout(@JsonProperty("scriptpubkey") String scriptPubKey,
            @JsonProperty("scriptpubkey_asm") String scriptPubKeyAsm,
            @JsonProperty("scriptpubkey_type") String scriptPubKeyType,
            @JsonProperty("scriptpubkey_address") String scriptPubKeyAddress,
            @JsonProperty("value") long value) {
        this.scriptPubKey = scriptPubKey;
        this.scriptPubKeyAsm = scriptPubKeyAsm;
        this.scriptPubKeyType = scriptPubKeyType;
        this.scriptPubKeyAddress = scriptPubKeyAddress;
        this.value = value;
    }

    /**
     * Retrieves the script public key.
     *
     * @return The script public key.
     */
    public String getScriptPubKey() {
        return scriptPubKey;
    }

    /**
     * Retrieves the script public key ASM.
     *
     * @return The script public key ASM.
     */
    public String getScriptPubKeyAsm() {
        return scriptPubKeyAsm;
    }

    /**
     * Retrieves the script public key type.
     *
     * @return The script public key type.
     */
    public String getScriptPubKeyType() {
        return scriptPubKeyType;
    }

    /**
     * Retrieves the script public key address.
     *
     * @return The script public key address.
     */
    public String getScriptPubKeyAddress() {
        return scriptPubKeyAddress;
    }

    /**
     * Retrieves the output value.
     *
     * @return The output value.
     */
    public long getValue() {
        return value;
    }

    /**
     * Returns a string representation of the Vout object.
     *
     * @return A string representation of the object.
     */
    @Override
    public String toString() {
        return "Vout{" +
                "scriptPubKey='" + scriptPubKey + '\'' +
                ", scriptPubKeyAsm='" + scriptPubKeyAsm + '\'' +
                ", scriptPubKeyType='" + scriptPubKeyType + '\'' +
                ", scriptPubKeyAddress='" + scriptPubKeyAddress + '\'' +
                ", value=" + value +
                '}';
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * @param o The reference object with which to compare.
     * @return true if this object is the same as the obj argument; false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Vout vout = (Vout) o;
        return value == vout.value &&
                Objects.equals(scriptPubKey, vout.scriptPubKey) &&
                Objects.equals(scriptPubKeyAsm, vout.scriptPubKeyAsm) &&
                Objects.equals(scriptPubKeyType, vout.scriptPubKeyType) &&
                Objects.equals(scriptPubKeyAddress, vout.scriptPubKeyAddress);
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return A hash code value for this object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(scriptPubKey, scriptPubKeyAsm, scriptPubKeyType, scriptPubKeyAddress, value);
    }
}
