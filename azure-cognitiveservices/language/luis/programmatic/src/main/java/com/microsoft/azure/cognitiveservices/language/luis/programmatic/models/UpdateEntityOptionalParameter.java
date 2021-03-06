/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.programmatic.models;


/**
 * The optional parameters class for "updateEntity" method.
 */
public class UpdateEntityOptionalParameter {
    /**
    * The entity's new name.
    */
    private String name;

    /**
    * Get the name value.
    *
    * @return the name value
    */
    public String name() {
        return this.name;
    }

    /**
    * Set the name value.
    * <p>
    * The entity's new name.
    *
    * @param name the name value to set
    * @return the updateEntityOptionalParameter object itself.
    */
    public UpdateEntityOptionalParameter withName(String name) {
        this.name = name;
        return this;
    }

    }
