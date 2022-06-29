/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.131.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.plaid.client.model.DocumentAuthenticityMatchCode;
import com.plaid.client.model.ImageQuality;
import com.plaid.client.model.PhysicalDocumentExtractedDataAnalysis;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * High level descriptions of how the associated document was processed. If a document fails verification, the details in the &#x60;analysis&#x60; object should help clarify why the document was rejected.
 */
@ApiModel(description = "High level descriptions of how the associated document was processed. If a document fails verification, the details in the `analysis` object should help clarify why the document was rejected.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-29T22:27:17.580916Z[Etc/UTC]")
public class DocumentAnalysis {
  public static final String SERIALIZED_NAME_AUTHENTICITY = "authenticity";
  @SerializedName(SERIALIZED_NAME_AUTHENTICITY)
  private DocumentAuthenticityMatchCode authenticity;

  public static final String SERIALIZED_NAME_IMAGE_QUALITY = "image_quality";
  @SerializedName(SERIALIZED_NAME_IMAGE_QUALITY)
  private ImageQuality imageQuality;

  public static final String SERIALIZED_NAME_EXTRACTED_DATA = "extracted_data";
  @SerializedName(SERIALIZED_NAME_EXTRACTED_DATA)
  private PhysicalDocumentExtractedDataAnalysis extractedData;


  public DocumentAnalysis authenticity(DocumentAuthenticityMatchCode authenticity) {
    
    this.authenticity = authenticity;
    return this;
  }

   /**
   * Get authenticity
   * @return authenticity
  **/
  @ApiModelProperty(required = true, value = "")

  public DocumentAuthenticityMatchCode getAuthenticity() {
    return authenticity;
  }


  public void setAuthenticity(DocumentAuthenticityMatchCode authenticity) {
    this.authenticity = authenticity;
  }


  public DocumentAnalysis imageQuality(ImageQuality imageQuality) {
    
    this.imageQuality = imageQuality;
    return this;
  }

   /**
   * Get imageQuality
   * @return imageQuality
  **/
  @ApiModelProperty(required = true, value = "")

  public ImageQuality getImageQuality() {
    return imageQuality;
  }


  public void setImageQuality(ImageQuality imageQuality) {
    this.imageQuality = imageQuality;
  }


  public DocumentAnalysis extractedData(PhysicalDocumentExtractedDataAnalysis extractedData) {
    
    this.extractedData = extractedData;
    return this;
  }

   /**
   * Get extractedData
   * @return extractedData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public PhysicalDocumentExtractedDataAnalysis getExtractedData() {
    return extractedData;
  }


  public void setExtractedData(PhysicalDocumentExtractedDataAnalysis extractedData) {
    this.extractedData = extractedData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentAnalysis documentAnalysis = (DocumentAnalysis) o;
    return Objects.equals(this.authenticity, documentAnalysis.authenticity) &&
        Objects.equals(this.imageQuality, documentAnalysis.imageQuality) &&
        Objects.equals(this.extractedData, documentAnalysis.extractedData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticity, imageQuality, extractedData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentAnalysis {\n");
    sb.append("    authenticity: ").append(toIndentedString(authenticity)).append("\n");
    sb.append("    imageQuality: ").append(toIndentedString(imageQuality)).append("\n");
    sb.append("    extractedData: ").append(toIndentedString(extractedData)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

