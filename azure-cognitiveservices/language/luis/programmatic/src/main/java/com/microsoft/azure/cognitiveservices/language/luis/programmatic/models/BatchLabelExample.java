/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.programmatic.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response when adding a batch of labeled examples.
 */
public class BatchLabelExample {
    /**
     * The value property.
     */
    @JsonProperty(value = "value")
    private LabelExampleResponse value;

    /**
     * The hasError property.
     */
    @JsonProperty(value = "hasError")
    private Boolean hasError;

    /**
     * The error property.
     */
    @JsonProperty(value = "error")
    private OperationStatus error;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public LabelExampleResponse value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the BatchLabelExample object itself.
     */
    public BatchLabelExample withValue(LabelExampleResponse value) {
        this.value = value;
        return this;
    }

    /**
     * Get the hasError value.
     *
     * @return the hasError value
     */
    public Boolean hasError() {
        return this.hasError;
    }

    /**
     * Set the hasError value.
     *
     * @param hasError the hasError value to set
     * @return the BatchLabelExample object itself.
     */
    public BatchLabelExample withHasError(Boolean hasError) {
        this.hasError = hasError;
        return this;
    }

    /**
     * Get the error value.
     *
     * @return the error value
     */
    public OperationStatus error() {
        return this.error;
    }

    /**
     * Set the error value.
     *
     * @param error the error value to set
     * @return the BatchLabelExample object itself.
     */
    public BatchLabelExample withError(OperationStatus error) {
        this.error = error;
        return this;
    }

}
