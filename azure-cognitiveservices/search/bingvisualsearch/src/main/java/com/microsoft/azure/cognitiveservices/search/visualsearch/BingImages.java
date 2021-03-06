/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.search.visualsearch;

import com.microsoft.azure.cognitiveservices.search.visualsearch.models.VisualSearchOptionalParameter;
import com.microsoft.azure.cognitiveservices.search.visualsearch.models.ErrorResponseException;
import com.microsoft.azure.cognitiveservices.search.visualsearch.models.ImageKnowledge;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in BingImages.
 */
public interface BingImages {
    /**
     * Visual Search API lets you discover insights about an image such as visually similar images, shopping
     *  sources, and related searches. The API can also perform text recognition, identify entities (people, places,
     *  things), return other topical content for the user to explore, and more. For more information, see [Visual
     *  Search Overview](https://docs.microsoft.com/azure/cognitive-services/bing-visual-search/overview).
     *
     * @param visualSearchOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ImageKnowledge object if successful.
     */
    ImageKnowledge visualSearch(VisualSearchOptionalParameter visualSearchOptionalParameter);

    /**
     * Visual Search API lets you discover insights about an image such as visually similar images, shopping
     *  sources, and related searches. The API can also perform text recognition, identify entities (people, places,
     *  things), return other topical content for the user to explore, and more. For more information, see [Visual
     *  Search Overview](https://docs.microsoft.com/azure/cognitive-services/bing-visual-search/overview).
     *
     * @param visualSearchOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ImageKnowledge object
     */
    Observable<ImageKnowledge> visualSearchAsync(VisualSearchOptionalParameter visualSearchOptionalParameter);

}
