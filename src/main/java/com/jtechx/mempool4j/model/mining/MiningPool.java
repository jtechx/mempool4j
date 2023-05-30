package com.jtechx.mempool4j.model.mining;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

/**
 * MiningPool represents a mining pool.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MiningPool {
    private final int id;
    private final String name;
    private final String link;
    private final List<String> addresses;
    private final List<String> regexes;
    private final String slug;
    private final boolean uniqueId;

    /**
     * Constructs a MiningPool object.
     *
     * @param id        The ID of the mining pool.
     * @param name      The name of the mining pool.
     * @param link      The link to the mining pool.
     * @param addresses The addresses associated with the mining pool.
     * @param regexes   The regular expressions associated with the mining pool.
     * @param slug      The slug of the mining pool.
     * @param uniqueId  The flag indicating if the ID is unique.
     */
    @JsonCreator
    public MiningPool(@JsonProperty("id") int id,
            @JsonProperty("name") String name,
            @JsonProperty("link") String link,
            @JsonProperty("addresses") List<String> addresses,
            @JsonProperty("regexes") List<String> regexes,
            @JsonProperty("slug") String slug,
            @JsonProperty("unique_id") boolean uniqueId) {
        this.id = id;
        this.name = name;
        this.link = link;
        this.addresses = addresses;
        this.regexes = regexes;
        this.slug = slug;
        this.uniqueId = uniqueId;
    }

    /**
     * Retrieves the ID of the mining pool.
     *
     * @return The ID of the mining pool.
     */
    public int getId() {
        return id;
    }

    /**
     * Retrieves the name of the mining pool.
     *
     * @return The name of the mining pool.
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the link to the mining pool.
     *
     * @return The link to the mining pool.
     */
    public String getLink() {
        return link;
    }

    /**
     * Retrieves the addresses associated with the mining pool.
     *
     * @return The addresses associated with the mining pool.
     */
    public List<String> getAddresses() {
        return addresses;
    }

    /**
     * Retrieves the regular expressions associated with the mining pool.
     *
     * @return The regular expressions associated with the mining pool.
     */
    public List<String> getRegexes() {
        return regexes;
    }

    /**
     * Retrieves the slug of the mining pool.
     *
     * @return The slug of the mining pool.
     */
    public String getSlug() {
        return slug;
    }

    /**
     * Retrieves the flag indicating if the ID is unique.
     *
     * @return The flag indicating if the ID is unique.
     */
    public boolean isUniqueId() {
        return uniqueId;
    }

    /**
     * Returns a string representation of the MiningPool object.
     *
     * @return The string representation of the MiningPool object.
     */
    @Override
    public String toString() {
        return "MiningPool{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", link='" + link + '\'' +
                ", addresses=" + addresses +
                ", regexes=" + regexes +
                ", slug='" + slug + '\'' +
                ", uniqueId=" + uniqueId +
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
        MiningPool that = (MiningPool) o;
        return id == that.id &&
                uniqueId == that.uniqueId &&
                Objects.equals(name, that.name) &&
                Objects.equals(link, that.link) &&
                Objects.equals(addresses, that.addresses) &&
                Objects.equals(regexes, that.regexes) &&
                Objects.equals(slug, that.slug);
    }

    /**
     * Returns a hash code value for the MiningPool object.
     *
     * @return The hash code value for the MiningPool object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, name, link, addresses, regexes, slug, uniqueId);
    }
}
