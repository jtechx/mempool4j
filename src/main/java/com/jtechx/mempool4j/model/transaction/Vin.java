package com.jtechx.mempool4j.model.transaction;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

/**
 * Represents the input of a transaction (Vin).
 */
public class Vin {
    private final String txId;
    private final long vout;
    private final Vout prevout;
    private final String scriptSig;
    private final String scriptSigAsm;
    private final List<String> witness;
    private final boolean isCoinbase;
    private final long sequence;
    private final String innerRedeemScriptAsm;
    private final String innerWitnessScriptAsm;

    @JsonCreator
    public Vin(@JsonProperty("txid") String txId,
            @JsonProperty("vout") long vout,
            @JsonProperty("prevout") Vout prevout,
            @JsonProperty("scriptsig") String scriptSig,
            @JsonProperty("scriptsig_asm") String scriptSigAsm,
            @JsonProperty("witness") List<String> witness,
            @JsonProperty("is_coinbase") boolean isCoinbase,
            @JsonProperty("sequence") long sequence,
            @JsonProperty("inner_redeemscript_asm") String innerRedeemScriptAsm,
            @JsonProperty("inner_witnessscript_asm") String innerWitnessScriptAsm) {
        this.txId = txId;
        this.vout = vout;
        this.prevout = prevout;
        this.scriptSig = scriptSig;
        this.scriptSigAsm = scriptSigAsm;
        this.witness = witness;
        this.isCoinbase = isCoinbase;
        this.sequence = sequence;
        this.innerRedeemScriptAsm = innerRedeemScriptAsm;
        this.innerWitnessScriptAsm = innerWitnessScriptAsm;
    }

    /**
     * Returns the transaction ID of the previous transaction (TxId).
     *
     * @return The transaction ID.
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Returns the output index of the previous transaction (Vout).
     *
     * @return The output index.
     */
    public long getVout() {
        return vout;
    }

    /**
     * Returns the previous output of the transaction (Prevout).
     *
     * @return The previous output.
     */
    public Vout getPrevout() {
        return prevout;
    }

    /**
     * Returns the signature script (ScriptSig) of the input.
     *
     * @return The signature script.
     */
    public String getScriptSig() {
        return scriptSig;
    }

    /**
     * Returns the ASM representation of the signature script (ScriptSig).
     *
     * @return The ASM representation of the signature script.
     */
    public String getScriptSigAsm() {
        return scriptSigAsm;
    }

    /**
     * Returns the witness data (Witness) of the input.
     *
     * @return The witness data.
     */
    public List<String> getWitness() {
        return witness;
    }

    /**
     * Checks if the input is a coinbase input.
     *
     * @return {@code true} if the input is a coinbase input, {@code false} otherwise.
     */
    public boolean isCoinbase() {
        return isCoinbase;
    }

    /**
     * Returns the sequence number (Sequence) of the input.
     *
     * @return The sequence number.
     */
    public long getSequence() {
        return sequence;
    }

    /**
     * Returns the ASM representation of the inner redeem script (InnerRedeemScript).
     *
     * @return The ASM representation of the inner redeem script.
     */
    public String getInnerRedeemScriptAsm() {
        return innerRedeemScriptAsm;
    }

    /**
     * Returns the ASM representation of the inner witness script (InnerWitnessScript).
     *
     * @return The ASM representation of the inner witness script.
     */
    public String getInnerWitnessScriptAsm() {
        return innerWitnessScriptAsm;
    }

    @Override
    public String toString() {
        return "Vin{" +
                "txId='" + txId + '\'' +
                ", vout=" + vout +
                ", prevout=" + prevout +
                ", scriptSig='" + scriptSig + '\'' +
                ", scriptSigAsm='" + scriptSigAsm + '\'' +
                ", witness=" + witness +
                ", isCoinbase=" + isCoinbase +
                ", sequence=" + sequence +
                ", innerRedeemScriptAsm='" + innerRedeemScriptAsm + '\'' +
                ", innerWitnessScriptAsm='" + innerWitnessScriptAsm + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vin vin = (Vin) o;
        return vout == vin.vout &&
                isCoinbase == vin.isCoinbase &&
                sequence == vin.sequence &&
                Objects.equals(txId, vin.txId) &&
                Objects.equals(prevout, vin.prevout) &&
                Objects.equals(scriptSig, vin.scriptSig) &&
                Objects.equals(scriptSigAsm, vin.scriptSigAsm) &&
                Objects.equals(witness, vin.witness) &&
                Objects.equals(innerRedeemScriptAsm, vin.innerRedeemScriptAsm) &&
                Objects.equals(innerWitnessScriptAsm, vin.innerWitnessScriptAsm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(txId, vout, prevout, scriptSig, scriptSigAsm, witness, isCoinbase, sequence,
                innerRedeemScriptAsm, innerWitnessScriptAsm);
    }
}
