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
 * Object model for updating a Phraselist.
 */
public class PhraselistUpdateObject {
    /**
     * List of comma-separated phrases that represent the Phraselist.
     */
    @JsonProperty(value = "phrases")
    private String phrases;

    /**
     * The Phraselist name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Indicates if the Phraselist is enabled.
     */
    @JsonProperty(value = "isActive")
    private Boolean isActive;

    /**
     * An exchangeable phrase list feature are serves as single feature to the
     * LUIS underlying training algorithm. It is used as a lexicon lookup
     * feature where its value is 1 if the lexicon contains a given word or 0
     * if it doesn’t. Think of an exchangeable as a synonyms list. A
     * non-exchangeable phrase list feature has all the phrases in the list
     * serve as separate features to the underlying training algorithm. So, if
     * you your phrase list feature contains 5 phrases, they will be mapped to
     * 5 separate features. You can think of the non-exchangeable phrase list
     * feature as an additional bag of words that you are willing to add to
     * LUIS existing vocabulary features. Think of a non-exchangeable as set of
     * different words. Default value is true.
     */
    @JsonProperty(value = "isExchangeable")
    private Boolean isExchangeable;

    /**
     * Get the phrases value.
     *
     * @return the phrases value
     */
    public String phrases() {
        return this.phrases;
    }

    /**
     * Set the phrases value.
     *
     * @param phrases the phrases value to set
     * @return the PhraselistUpdateObject object itself.
     */
    public PhraselistUpdateObject withPhrases(String phrases) {
        this.phrases = phrases;
        return this;
    }

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
     *
     * @param name the name value to set
     * @return the PhraselistUpdateObject object itself.
     */
    public PhraselistUpdateObject withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the isActive value.
     *
     * @return the isActive value
     */
    public Boolean isActive() {
        return this.isActive;
    }

    /**
     * Set the isActive value.
     *
     * @param isActive the isActive value to set
     * @return the PhraselistUpdateObject object itself.
     */
    public PhraselistUpdateObject withIsActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    /**
     * Get the isExchangeable value.
     *
     * @return the isExchangeable value
     */
    public Boolean isExchangeable() {
        return this.isExchangeable;
    }

    /**
     * Set the isExchangeable value.
     *
     * @param isExchangeable the isExchangeable value to set
     * @return the PhraselistUpdateObject object itself.
     */
    public PhraselistUpdateObject withIsExchangeable(Boolean isExchangeable) {
        this.isExchangeable = isExchangeable;
        return this;
    }

}
