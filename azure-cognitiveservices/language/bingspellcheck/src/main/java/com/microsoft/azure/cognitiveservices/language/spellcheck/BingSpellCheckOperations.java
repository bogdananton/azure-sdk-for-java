/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.spellcheck;

import com.microsoft.azure.cognitiveservices.language.spellcheck.models.SpellCheckerOptionalParameter;
import com.microsoft.azure.cognitiveservices.language.spellcheck.models.ErrorResponseException;
import com.microsoft.azure.cognitiveservices.language.spellcheck.models.SpellCheck;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in BingSpellCheckOperations.
 */
public interface BingSpellCheckOperations {
    /**
     * The Bing Spell Check API lets you perform contextual grammar and spell checking. Bing has developed a
     *  web-based spell-checker that leverages machine learning and statistical machine translation to dynamically
     *  train a constantly evolving and highly contextual algorithm. The spell-checker is based on a massive corpus
     *  of web searches and documents.
     *
     * @param text The text string to check for spelling and grammar errors. The combined length of the text string,
     *  preContextText string, and postContextText string may not exceed 10,000 characters. You may specify this
     *  parameter in the query string of a GET request or in the body of a POST request. Because of the query string
     *  length limit, you'll typically use a POST request unless you're checking only short strings.
     * @param spellCheckerOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SpellCheck object if successful.
     */
    SpellCheck spellChecker(String text, SpellCheckerOptionalParameter spellCheckerOptionalParameter);

    /**
     * The Bing Spell Check API lets you perform contextual grammar and spell checking. Bing has developed a
     *  web-based spell-checker that leverages machine learning and statistical machine translation to dynamically
     *  train a constantly evolving and highly contextual algorithm. The spell-checker is based on a massive corpus
     *  of web searches and documents.
     *
     * @param text The text string to check for spelling and grammar errors. The combined length of the text string,
     *  preContextText string, and postContextText string may not exceed 10,000 characters. You may specify this
     *  parameter in the query string of a GET request or in the body of a POST request. Because of the query string
     *  length limit, you'll typically use a POST request unless you're checking only short strings.
     * @param spellCheckerOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SpellCheck object
     */
    Observable<SpellCheck> spellCheckerAsync(String text, SpellCheckerOptionalParameter spellCheckerOptionalParameter);

}
