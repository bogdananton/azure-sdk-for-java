/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.16.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.resources.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Tag information.
 */
public class TagValue {
    /**
     * Gets or sets the tag ID.
     */
    private String id;

    /**
     * Gets or sets the tag value.
     */
    @JsonProperty(value = "tagValue")
    private String tagValueProperty;

    /**
     * Gets or sets the tag value count.
     */
    private TagCount count;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get the tagValueProperty value.
     *
     * @return the tagValueProperty value
     */
    public String getTagValueProperty() {
        return this.tagValueProperty;
    }

    /**
     * Set the tagValueProperty value.
     *
     * @param tagValueProperty the tagValueProperty value to set
     */
    public void setTagValueProperty(String tagValueProperty) {
        this.tagValueProperty = tagValueProperty;
    }

    /**
     * Get the count value.
     *
     * @return the count value
     */
    public TagCount getCount() {
        return this.count;
    }

    /**
     * Set the count value.
     *
     * @param count the count value to set
     */
    public void setCount(TagCount count) {
        this.count = count;
    }

}