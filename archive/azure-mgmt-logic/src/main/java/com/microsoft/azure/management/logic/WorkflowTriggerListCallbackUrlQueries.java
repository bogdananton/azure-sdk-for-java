/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Gets the workflow trigger callback URL query parameters.
 */
public class WorkflowTriggerListCallbackUrlQueries {
    /**
     * The api version.
     */
    @JsonProperty(value = "api-version")
    private String apiVersion;

    /**
     * The SAS permissions.
     */
    @JsonProperty(value = "sp")
    private String sp;

    /**
     * The SAS version.
     */
    @JsonProperty(value = "sv")
    private String sv;

    /**
     * The SAS signature.
     */
    @JsonProperty(value = "sig")
    private String sig;

    /**
     * Get the apiVersion value.
     *
     * @return the apiVersion value
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /**
     * Set the apiVersion value.
     *
     * @param apiVersion the apiVersion value to set
     * @return the WorkflowTriggerListCallbackUrlQueries object itself.
     */
    public WorkflowTriggerListCallbackUrlQueries withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * Get the sp value.
     *
     * @return the sp value
     */
    public String sp() {
        return this.sp;
    }

    /**
     * Set the sp value.
     *
     * @param sp the sp value to set
     * @return the WorkflowTriggerListCallbackUrlQueries object itself.
     */
    public WorkflowTriggerListCallbackUrlQueries withSp(String sp) {
        this.sp = sp;
        return this;
    }

    /**
     * Get the sv value.
     *
     * @return the sv value
     */
    public String sv() {
        return this.sv;
    }

    /**
     * Set the sv value.
     *
     * @param sv the sv value to set
     * @return the WorkflowTriggerListCallbackUrlQueries object itself.
     */
    public WorkflowTriggerListCallbackUrlQueries withSv(String sv) {
        this.sv = sv;
        return this;
    }

    /**
     * Get the sig value.
     *
     * @return the sig value
     */
    public String sig() {
        return this.sig;
    }

    /**
     * Set the sig value.
     *
     * @param sig the sig value to set
     * @return the WorkflowTriggerListCallbackUrlQueries object itself.
     */
    public WorkflowTriggerListCallbackUrlQueries withSig(String sig) {
        this.sig = sig;
        return this;
    }

}
