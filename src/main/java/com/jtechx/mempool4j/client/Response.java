package com.jtechx.mempool4j.client;

public class Response {
    /**
     * HTTP response status code (e.g. 200).
     */
    private final Integer statusCode;

    /**
     * HTTP response body as text.
     */
    private final byte[] body;

    /**
     * Creates a response with the given HTTP status code and response body as text.
     *
     * @param statusCode
     *          The HTTP status code of the response.
     * @param body
     *          The response body as text.
     */
    public Response(Integer statusCode, byte[] body) {
        this.statusCode = statusCode;
        this.body = body;
    }

    /**
     * Gets the HTTP status code.
     *
     * @return The HTTP status code.
     */
    public Integer getStatusCode() {
        return statusCode;
    }

    /**
     * Gets the HTTP response body as text.
     *
     * @return The HTTP response body as text.
     */
    public byte[] getBody() {
        return body;
    }
}
