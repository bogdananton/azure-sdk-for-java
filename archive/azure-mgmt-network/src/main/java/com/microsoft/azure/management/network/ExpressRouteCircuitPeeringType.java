/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ExpressRouteCircuitPeeringType.
 */
public final class ExpressRouteCircuitPeeringType {
    /** Static value AzurePublicPeering for ExpressRouteCircuitPeeringType. */
    public static final ExpressRouteCircuitPeeringType AZURE_PUBLIC_PEERING = new ExpressRouteCircuitPeeringType("AzurePublicPeering");

    /** Static value AzurePrivatePeering for ExpressRouteCircuitPeeringType. */
    public static final ExpressRouteCircuitPeeringType AZURE_PRIVATE_PEERING = new ExpressRouteCircuitPeeringType("AzurePrivatePeering");

    /** Static value MicrosoftPeering for ExpressRouteCircuitPeeringType. */
    public static final ExpressRouteCircuitPeeringType MICROSOFT_PEERING = new ExpressRouteCircuitPeeringType("MicrosoftPeering");

    private String value;

    /**
     * Creates a custom value for ExpressRouteCircuitPeeringType.
     * @param value the custom value
     */
    public ExpressRouteCircuitPeeringType(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ExpressRouteCircuitPeeringType)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ExpressRouteCircuitPeeringType rhs = (ExpressRouteCircuitPeeringType) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}
