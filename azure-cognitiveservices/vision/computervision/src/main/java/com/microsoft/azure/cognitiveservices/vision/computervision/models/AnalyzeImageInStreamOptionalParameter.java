/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.computervision.models;

import java.util.List;

/**
 * The optional parameters class for "analyzeImageInStream" method.
 */
public class AnalyzeImageInStreamOptionalParameter {
    /**
    * A string indicating what visual feature types to return. Multiple values should be comma-separated. Valid visual
    * feature types include:Categories - categorizes image content according to a taxonomy defined in documentation. Tags -
    * tags the image with a detailed list of words related to the image content. Description - describes the image content
    * with a complete English sentence. Faces - detects if faces are present. If present, generate coordinates, gender and
    * age. ImageType - detects if image is clipart or a line drawing. Color - determines the accent color, dominant color,
    * and whether an image is black&amp;white.Adult - detects if the image is pornographic in nature (depicts nudity or a sex
    * act).  Sexually suggestive content is also detected.
    */
    private List<VisualFeatureTypes> visualFeatures;

    /**
    * A string indicating which domain-specific details to return. Multiple values should be comma-separated. Valid visual
    * feature types include:Celebrities - identifies celebrities if detected in the image. Possible values include:
    * 'Celebrities', 'Landmarks'.
    */
    private String details;

    /**
    * A string indicating which language to return. The service will return recognition results in specified language. If
    * this parameter is not specified, the default value is &amp;quot;en&amp;quot;.Supported languages:en - English,
    * Default.zh - Simplified Chinese. Possible values include: 'en', 'zh'.
    */
    private String language;

    /**
    * Get the visualFeatures value.
    *
    * @return the visualFeatures value
    */
    public List<VisualFeatureTypes> visualFeatures() {
        return this.visualFeatures;
    }

    /**
    * Get the details value.
    *
    * @return the details value
    */
    public String details() {
        return this.details;
    }

    /**
    * Get the language value.
    *
    * @return the language value
    */
    public String language() {
        return this.language;
    }

    /**
    * Set the visualFeatures value.
    * <p>
    * A string indicating what visual feature types to return. Multiple values should be comma-separated. Valid visual
    * feature types include:Categories - categorizes image content according to a taxonomy defined in documentation. Tags -
    * tags the image with a detailed list of words related to the image content. Description - describes the image content
    * with a complete English sentence. Faces - detects if faces are present. If present, generate coordinates, gender and
    * age. ImageType - detects if image is clipart or a line drawing. Color - determines the accent color, dominant color,
    * and whether an image is black&amp;white.Adult - detects if the image is pornographic in nature (depicts nudity or a sex
    * act).  Sexually suggestive content is also detected.
    *
    * @param visualFeatures the visualFeatures value to set
    * @return the analyzeImageInStreamOptionalParameter object itself.
    */
    public AnalyzeImageInStreamOptionalParameter withVisualFeatures(List<VisualFeatureTypes> visualFeatures) {
        this.visualFeatures = visualFeatures;
        return this;
    }

    /**
    * Set the details value.
    * <p>
    * A string indicating which domain-specific details to return. Multiple values should be comma-separated. Valid visual
    * feature types include:Celebrities - identifies celebrities if detected in the image. Possible values include:
    * 'Celebrities', 'Landmarks'.
    *
    * @param details the details value to set
    * @return the analyzeImageInStreamOptionalParameter object itself.
    */
    public AnalyzeImageInStreamOptionalParameter withDetails(String details) {
        this.details = details;
        return this;
    }

    /**
    * Set the language value.
    * <p>
    * A string indicating which language to return. The service will return recognition results in specified language. If
    * this parameter is not specified, the default value is &amp;quot;en&amp;quot;.Supported languages:en - English,
    * Default.zh - Simplified Chinese. Possible values include: 'en', 'zh'.
    *
    * @param language the language value to set
    * @return the analyzeImageInStreamOptionalParameter object itself.
    */
    public AnalyzeImageInStreamOptionalParameter withLanguage(String language) {
        this.language = language;
        return this;
    }

    }
