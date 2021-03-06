/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ReportingCycleType.
 */
public final class ReportingCycleType {
    /** Static value CalendarMonth for ReportingCycleType. */
    public static final ReportingCycleType CALENDAR_MONTH = new ReportingCycleType("CalendarMonth");

    /** Static value Custom for ReportingCycleType. */
    public static final ReportingCycleType CUSTOM = new ReportingCycleType("Custom");

    private String value;

    /**
     * Creates a custom value for ReportingCycleType.
     * @param value the custom value
     */
    public ReportingCycleType(String value) {
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
        if (!(obj instanceof ReportingCycleType)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ReportingCycleType rhs = (ReportingCycleType) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}
