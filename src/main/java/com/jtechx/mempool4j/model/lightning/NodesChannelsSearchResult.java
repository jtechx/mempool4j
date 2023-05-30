package com.jtechx.mempool4j.model.lightning;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

/**
 * Represents the found lightning network nodes and channels based on a text search.
 */
public class NodesChannelsSearchResult {
    private final List<NodeResult> nodes;
    private final List<ChannelResult> channels;

    @JsonCreator
    public NodesChannelsSearchResult(@JsonProperty("nodes") List<NodeResult> nodes,
            @JsonProperty("channels") List<ChannelResult> channels) {
        this.nodes = nodes;
        this.channels = channels;
    }

    /**
     * Retrieves the list of lightning network nodes.
     *
     * @return The list of lightning network nodes.
     */
    public List<NodeResult> getNodes() {
        return nodes;
    }

    /**
     * Retrieves the list of lightning network channels.
     *
     * @return The list of lightning network channels.
     */
    public List<ChannelResult> getChannels() {
        return channels;
    }

    /**
     * Returns a string representation of the NodesChannelsSearch object.
     *
     * @return The string representation of the NodesChannelsSearch object.
     */
    @Override
    public String toString() {
        return "NodesChannelsSearchResult{" +
                "nodes=" + nodes +
                ", channels=" + channels +
                '}';
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
        NodesChannelsSearchResult that = (NodesChannelsSearchResult) o;
        return Objects.equals(nodes, that.nodes) &&
                Objects.equals(channels, that.channels);
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return The hash code value for the object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(nodes, channels);
    }
}
