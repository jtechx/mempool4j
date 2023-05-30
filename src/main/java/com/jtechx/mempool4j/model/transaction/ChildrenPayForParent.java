package com.jtechx.mempool4j.model.transaction;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Objects;

public class ChildrenPayForParent {
    private final List<CPFPTransaction> descendants;
    private final List<CPFPTransaction> ancestors;

    /**
     * Constructs a MempoolTransactionResponse object.
     *
     * @param descendants The list of descendant transactions.
     * @param ancestors   The list of ancestor transactions.
     */
    @JsonCreator
    public ChildrenPayForParent(@JsonProperty("descendants") List<CPFPTransaction> descendants,
            @JsonProperty("ancestors") List<CPFPTransaction> ancestors) {
        this.descendants = descendants;
        this.ancestors = ancestors;
    }

    /**
     * Returns the list of descendant transactions.
     *
     * @return The list of descendant transactions.
     */
    public List<CPFPTransaction> getDescendants() {
        return descendants;
    }

    /**
     * Returns the list of ancestor transactions.
     *
     * @return The list of ancestor transactions.
     */
    public List<CPFPTransaction> getAncestors() {
        return ancestors;
    }

    @Override
    public String toString() {
        return "MempoolTransactionResponse{" +
                "descendants=" + descendants +
                ", ancestors=" + ancestors +
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
        ChildrenPayForParent that = (ChildrenPayForParent) o;
        return Objects.equals(descendants, that.descendants) &&
                Objects.equals(ancestors, that.ancestors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descendants, ancestors);
    }
}
