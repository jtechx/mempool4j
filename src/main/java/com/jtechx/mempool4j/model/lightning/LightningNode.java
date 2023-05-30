package com.jtechx.mempool4j.model.lightning;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;
import java.util.Objects;

/**
 * Represents a Lightning network node.
 */
public class LightningNode {
    private final String publicKey;
    private final String alias;
    private final long firstSeen;
    private final long updatedAt;
    private final String color;
    private final String sockets;
    private final int asNumber;
    private final int cityId;
    private final int countryId;
    private final int subdivisionId;
    private final double longitude;
    private final double latitude;
    private final String isoCode;
    private final String asOrganization;
    private final Map<String, String> city;
    private final Map<String, String> country;
    private final Map<String, String> subdivision;
    private final int activeChannelCount;
    private final String capacity;
    private final int channels;
    private final int openedChannelCount;
    private final int closedChannelCount;
    private final Map<String, Object> customRecords;

    @JsonCreator
    public LightningNode(@JsonProperty("public_key") String publicKey,
            @JsonProperty("alias") String alias,
            @JsonProperty("first_seen") long firstSeen,
            @JsonProperty("updated_at") long updatedAt,
            @JsonProperty("color") String color,
            @JsonProperty("sockets") String sockets,
            @JsonProperty("as_number") int asNumber,
            @JsonProperty("city_id") int cityId,
            @JsonProperty("country_id") int countryId,
            @JsonProperty("subdivision_id") int subdivisionId,
            @JsonProperty("longitude") double longitude,
            @JsonProperty("latitude") double latitude,
            @JsonProperty("iso_code") String isoCode,
            @JsonProperty("as_organization") String asOrganization,
            @JsonProperty("city") Map<String, String> city,
            @JsonProperty("country") Map<String, String> country,
            @JsonProperty("subdivision") Map<String, String> subdivision,
            @JsonProperty("active_channel_count") int activeChannelCount,
            @JsonProperty("capacity") String capacity,
            @JsonProperty("channels") int channels,
            @JsonProperty("opened_channel_count") int openedChannelCount,
            @JsonProperty("closed_channel_count") int closedChannelCount,
            @JsonProperty("custom_records") Map<String, Object> customRecords) {
        this.publicKey = publicKey;
        this.alias = alias;
        this.firstSeen = firstSeen;
        this.updatedAt = updatedAt;
        this.color = color;
        this.sockets = sockets;
        this.asNumber = asNumber;
        this.cityId = cityId;
        this.countryId = countryId;
        this.subdivisionId = subdivisionId;
        this.longitude = longitude;
        this.latitude = latitude;
        this.isoCode = isoCode;
        this.asOrganization = asOrganization;
        this.city = city;
        this.country = country;
        this.subdivision = subdivision;
        this.activeChannelCount = activeChannelCount;
        this.capacity = capacity;
        this.channels = channels;
        this.openedChannelCount = openedChannelCount;
        this.closedChannelCount = closedChannelCount;
        this.customRecords = customRecords;
    }

    /**
     * Returns the public key of the node.
     *
     * @return The public key of the node.
     */
    public String getPublicKey() {
        return publicKey;
    }

    /**
     * Returns the alias of the node.
     *
     * @return The alias of the node.
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Returns the timestamp when the node was first seen.
     *
     * @return The timestamp when the node was first seen.
     */
    public long getFirstSeen() {
        return firstSeen;
    }

    /**
     * Returns the timestamp when the node was last updated.
     *
     * @return The timestamp when the node was last updated.
     */
    public long getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Returns the color of the node.
     *
     * @return The color of the node.
     */
    public String getColor() {
        return color;
    }

    /**
     * Returns the sockets of the node.
     *
     * @return The sockets of the node.
     */
    public String getSockets() {
        return sockets;
    }

    /**
     * Returns the autonomous system number of the node.
     *
     * @return The autonomous system number of the node.
     */
    public int getAsNumber() {
        return asNumber;
    }

    /**
     * Returns the ID of the city where the node is located.
     *
     * @return The ID of the city where the node is located.
     */
    public int getCityId() {
        return cityId;
    }

    /**
     * Returns the ID of the country where the node is located.
     *
     * @return The ID of the country where the node is located.
     */
    public int getCountryId() {
        return countryId;
    }

    /**
     * Returns the ID of the subdivision where the node is located.
     *
     * @return The ID of the subdivision where the node is located.
     */
    public int getSubdivisionId() {
        return subdivisionId;
    }

    /**
     * Returns the longitude coordinate of the node's location.
     *
     * @return The longitude coordinate of the node's location.
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Returns the latitude coordinate of the node's location.
     *
     * @return The latitude coordinate of the node's location.
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Returns the ISO code of the country where the node is located.
     *
     * @return The ISO code of the country where the node is located.
     */
    public String getIsoCode() {
        return isoCode;
    }

    /**
     * Returns the autonomous system organization of the node.
     *
     * @return The autonomous system organization of the node.
     */
    public String getAsOrganization() {
        return asOrganization;
    }

    /**
     * Returns the map of localized city names.
     *
     * @return The map of localized city names.
     */
    public Map<String, String> getCity() {
        return city;
    }

    /**
     * Returns the map of localized country names.
     *
     * @return The map of localized country names.
     */
    public Map<String, String> getCountry() {
        return country;
    }

    /**
     * Returns the map of localized subdivision names.
     *
     * @return The map of localized subdivision names.
     */
    public Map<String, String> getSubdivision() {
        return subdivision;
    }

    /**
     * Returns the number of active channels of the node.
     *
     * @return The number of active channels of the node.
     */
    public int getActiveChannelCount() {
        return activeChannelCount;
    }

    /**
     * Returns the capacity of the node.
     *
     * @return The capacity of the node.
     */
    public String getCapacity() {
        return capacity;
    }

    /**
     * Returns the channels count of the node.
     *
     * @return The channels count of the node.
     */
    public int getChannels() {
        return channels;
    }

    /**
     * Returns the number of opened channels of the node.
     *
     * @return The number of opened channels of the node.
     */
    public int getOpenedChannelCount() {
        return openedChannelCount;
    }

    /**
     * Returns the number of closed channels of the node.
     *
     * @return The number of closed channels of the node.
     */
    public int getClosedChannelCount() {
        return closedChannelCount;
    }

    /**
     * Returns the custom records of the node.
     *
     * @return The custom records of the node.
     */
    public Map<String, Object> getCustomRecords() {
        return customRecords;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LightningNode that = (LightningNode) o;
        return firstSeen == that.firstSeen &&
                updatedAt == that.updatedAt &&
                asNumber == that.asNumber &&
                cityId == that.cityId &&
                countryId == that.countryId &&
                subdivisionId == that.subdivisionId &&
                Double.compare(that.longitude, longitude) == 0 &&
                Double.compare(that.latitude, latitude) == 0 &&
                activeChannelCount == that.activeChannelCount &&
                openedChannelCount == that.openedChannelCount &&
                closedChannelCount == that.closedChannelCount &&
                Objects.equals(publicKey, that.publicKey) &&
                Objects.equals(alias, that.alias) &&
                Objects.equals(color, that.color) &&
                Objects.equals(sockets, that.sockets) &&
                Objects.equals(isoCode, that.isoCode) &&
                Objects.equals(asOrganization, that.asOrganization) &&
                Objects.equals(city, that.city) &&
                Objects.equals(country, that.country) &&
                Objects.equals(subdivision, that.subdivision) &&
                Objects.equals(capacity, that.capacity) &&
                Objects.equals(customRecords, that.customRecords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicKey, alias, firstSeen, updatedAt, color, sockets, asNumber, cityId, countryId,
                subdivisionId, longitude, latitude, isoCode, asOrganization, city, country, subdivision,
                activeChannelCount, capacity, openedChannelCount, closedChannelCount, customRecords);
    }

    @Override
    public String toString() {
        return "LightningNode{" +
                "publicKey='" + publicKey + '\'' +
                ", alias='" + alias + '\'' +
                ", firstSeen=" + firstSeen +
                ", updatedAt=" + updatedAt +
                ", color='" + color + '\'' +
                ", sockets='" + sockets + '\'' +
                ", asNumber=" + asNumber +
                ", cityId=" + cityId +
                ", countryId=" + countryId +
                ", subdivisionId=" + subdivisionId +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", isoCode='" + isoCode + '\'' +
                ", asOrganization='" + asOrganization + '\'' +
                ", city=" + city +
                ", country=" + country +
                ", subdivision=" + subdivision +
                ", activeChannelCount=" + activeChannelCount +
                ", capacity='" + capacity + '\'' +
                ", openedChannelCount=" + openedChannelCount +
                ", closedChannelCount=" + closedChannelCount +
                ", customRecords=" + customRecords +
                '}';
    }
}
