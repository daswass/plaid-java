/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.499.0
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
import com.plaid.client.model.PrismCashScoreMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The data from the Detect product returned by Prism.
 */
@ApiModel(description = "The data from the Detect product returned by Prism.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-11T17:45:40.635640Z[Etc/UTC]")
public class PrismDetect {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Integer score;

  public static final String SERIALIZED_NAME_REASON_CODES = "reason_codes";
  @SerializedName(SERIALIZED_NAME_REASON_CODES)
  private List<String> reasonCodes = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private PrismCashScoreMetadata metadata;


  public PrismDetect version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * The version of Prism&#39;s detect model used.
   * @return version
  **/
  @ApiModelProperty(required = true, value = "The version of Prism's detect model used.")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public PrismDetect score(Integer score) {
    
    this.score = score;
    return this;
  }

   /**
   * The score returned by Prism. Ranges from 1-999, with higher score indicating lower risk.
   * @return score
  **/
  @ApiModelProperty(required = true, value = "The score returned by Prism. Ranges from 1-999, with higher score indicating lower risk.")

  public Integer getScore() {
    return score;
  }


  public void setScore(Integer score) {
    this.score = score;
  }


  public PrismDetect reasonCodes(List<String> reasonCodes) {
    
    this.reasonCodes = reasonCodes;
    return this;
  }

  public PrismDetect addReasonCodesItem(String reasonCodesItem) {
    if (this.reasonCodes == null) {
      this.reasonCodes = new ArrayList<>();
    }
    this.reasonCodes.add(reasonCodesItem);
    return this;
  }

   /**
   * The reasons for an individual having risk according to the detect cash score.
   * @return reasonCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The reasons for an individual having risk according to the detect cash score.")

  public List<String> getReasonCodes() {
    return reasonCodes;
  }


  public void setReasonCodes(List<String> reasonCodes) {
    this.reasonCodes = reasonCodes;
  }


  public PrismDetect metadata(PrismCashScoreMetadata metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PrismCashScoreMetadata getMetadata() {
    return metadata;
  }


  public void setMetadata(PrismCashScoreMetadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrismDetect prismDetect = (PrismDetect) o;
    return Objects.equals(this.version, prismDetect.version) &&
        Objects.equals(this.score, prismDetect.score) &&
        Objects.equals(this.reasonCodes, prismDetect.reasonCodes) &&
        Objects.equals(this.metadata, prismDetect.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, score, reasonCodes, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrismDetect {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    reasonCodes: ").append(toIndentedString(reasonCodes)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

