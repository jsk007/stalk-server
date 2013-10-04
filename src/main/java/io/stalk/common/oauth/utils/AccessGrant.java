package io.stalk.common.oauth.utils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Stores the keys and secret for OAuth access token as well as OAuth request
 * token.
 *
 * @author tarunn@brickred.com
 */
public class AccessGrant implements Serializable {

    private static final long serialVersionUID = -7120362372191191930L;
    private String key;
    private String secret;
    private String providerId;
    private Map<String, Object> _attributes;

    /**
     * @param key    the Key
     * @param secret the Secret
     */
    public AccessGrant(final String key, final String secret) {
        this.key = key;
        this.secret = secret;
    }

    public AccessGrant() {
    }

    /**
     * Retrieves the Token Key
     *
     * @return the Token Key
     */
    public String getKey() {
        return key;
    }

    /**
     * Updates the Token Key
     *
     * @param key the Token Key
     */
    public void setKey(final String key) {
        this.key = key;
    }

    /**
     * Retrieves the Token Secret
     *
     * @return the Token Secret
     */
    public String getSecret() {
        return secret;
    }

    /**
     * Updates the Token Secret
     *
     * @param secret the Token Secret
     */
    public void setSecret(final String secret) {
        this.secret = secret;
    }

    /**
     * Gets the attributes of this token.
     */
    public Map<String, Object> getAttributes() {
        return _attributes;
    }

    /**
     * Gets an attribute based from the given key.
     */
    public Object getAttribute(final String key) {
        return _attributes == null ? null : _attributes.get(key);
    }

    /**
     * Sets an attribute based from the given key and value.
     */
    public void setAttribute(final String key, final Object value) {
        if (_attributes == null) {
            _attributes = new HashMap<String, Object>();
        }

        _attributes.put(key, value);
    }

    /**
     * Sets an attributes from given attributes map.
     */
    public void setAttributes(final Map<String, Object> attributes) {
        if (_attributes == null) {
            _attributes = new HashMap<String, Object>();
        }

        _attributes.putAll(attributes);
    }

    /**
     * Retrieves the provider id.
     *
     * @return the provider id.
     */
    public String getProviderId() {
        return providerId;
    }

    /**
     * Updates the provider id.
     *
     * @param providerId the provider id.
     */
    public void setProviderId(final String providerId) {
        this.providerId = providerId;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        String NEW_LINE = System.getProperty("line.separator");
        result.append(this.getClass().getName() + " Object {" + NEW_LINE);
        result.append(" token key : " + key + NEW_LINE);
        result.append(" token secret : " + secret + NEW_LINE);
        result.append("provider id : " + providerId + NEW_LINE);
        if (_attributes != null) {
            result.append(_attributes.toString());
        }
        result.append("}");

        return result.toString();
    }

}
