/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.517.0
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Risk summary of an uploaded document
 */
@ApiModel(description = "Risk summary of an uploaded document")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-10T20:14:45.051727Z[Etc/UTC]")
public class IdentityDocumentUploadRiskSummary {
  public static final String SERIALIZED_NAME_RISK_SCORE = "risk_score";
  @SerializedName(SERIALIZED_NAME_RISK_SCORE)
  private Integer riskScore;


  public IdentityDocumentUploadRiskSummary riskScore(Integer riskScore) {
    
    this.riskScore = riskScore;
    return this;
  }

   /**
   * Integer value representing the risk score of the document
   * @return riskScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Integer value representing the risk score of the document")

  public Integer getRiskScore() {
    return riskScore;
  }


  public void setRiskScore(Integer riskScore) {
    this.riskScore = riskScore;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityDocumentUploadRiskSummary identityDocumentUploadRiskSummary = (IdentityDocumentUploadRiskSummary) o;
    return Objects.equals(this.riskScore, identityDocumentUploadRiskSummary.riskScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(riskScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityDocumentUploadRiskSummary {\n");
    sb.append("    riskScore: ").append(toIndentedString(riskScore)).append("\n");
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
