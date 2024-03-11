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
import com.plaid.client.model.RiskCheckStolenIdentity;
import com.plaid.client.model.RiskCheckSyntheticIdentity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Result summary object capturing abuse signals related to &#x60;identity abuse&#x60;, e.g. stolen and synthetic identity fraud.
 */
@ApiModel(description = "Result summary object capturing abuse signals related to `identity abuse`, e.g. stolen and synthetic identity fraud.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-11T17:45:40.635640Z[Etc/UTC]")
public class RiskCheckIdentityAbuseSignals {
  public static final String SERIALIZED_NAME_SYNTHETIC_IDENTITY = "synthetic_identity";
  @SerializedName(SERIALIZED_NAME_SYNTHETIC_IDENTITY)
  private RiskCheckSyntheticIdentity syntheticIdentity;

  public static final String SERIALIZED_NAME_STOLEN_IDENTITY = "stolen_identity";
  @SerializedName(SERIALIZED_NAME_STOLEN_IDENTITY)
  private RiskCheckStolenIdentity stolenIdentity;


  public RiskCheckIdentityAbuseSignals syntheticIdentity(RiskCheckSyntheticIdentity syntheticIdentity) {
    
    this.syntheticIdentity = syntheticIdentity;
    return this;
  }

   /**
   * Get syntheticIdentity
   * @return syntheticIdentity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public RiskCheckSyntheticIdentity getSyntheticIdentity() {
    return syntheticIdentity;
  }


  public void setSyntheticIdentity(RiskCheckSyntheticIdentity syntheticIdentity) {
    this.syntheticIdentity = syntheticIdentity;
  }


  public RiskCheckIdentityAbuseSignals stolenIdentity(RiskCheckStolenIdentity stolenIdentity) {
    
    this.stolenIdentity = stolenIdentity;
    return this;
  }

   /**
   * Get stolenIdentity
   * @return stolenIdentity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public RiskCheckStolenIdentity getStolenIdentity() {
    return stolenIdentity;
  }


  public void setStolenIdentity(RiskCheckStolenIdentity stolenIdentity) {
    this.stolenIdentity = stolenIdentity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskCheckIdentityAbuseSignals riskCheckIdentityAbuseSignals = (RiskCheckIdentityAbuseSignals) o;
    return Objects.equals(this.syntheticIdentity, riskCheckIdentityAbuseSignals.syntheticIdentity) &&
        Objects.equals(this.stolenIdentity, riskCheckIdentityAbuseSignals.stolenIdentity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(syntheticIdentity, stolenIdentity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskCheckIdentityAbuseSignals {\n");
    sb.append("    syntheticIdentity: ").append(toIndentedString(syntheticIdentity)).append("\n");
    sb.append("    stolenIdentity: ").append(toIndentedString(stolenIdentity)).append("\n");
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

