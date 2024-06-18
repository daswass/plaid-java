/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.525.1
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
import com.plaid.client.model.TransferAuthorizationDecisionRationaleCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The rationale for Plaid&#39;s decision regarding a proposed transfer. It is always set for &#x60;declined&#x60; decisions, and may or may not be null for &#x60;approved&#x60; decisions.
 */
@ApiModel(description = "The rationale for Plaid's decision regarding a proposed transfer. It is always set for `declined` decisions, and may or may not be null for `approved` decisions.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-18T18:48:06.627309Z[Etc/UTC]")
public class TransferAuthorizationDecisionRationale {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private TransferAuthorizationDecisionRationaleCode code;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;


  public TransferAuthorizationDecisionRationale code(TransferAuthorizationDecisionRationaleCode code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferAuthorizationDecisionRationaleCode getCode() {
    return code;
  }


  public void setCode(TransferAuthorizationDecisionRationaleCode code) {
    this.code = code;
  }


  public TransferAuthorizationDecisionRationale description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A human-readable description of the code associated with a transfer approval or transfer decline.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "A human-readable description of the code associated with a transfer approval or transfer decline.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferAuthorizationDecisionRationale transferAuthorizationDecisionRationale = (TransferAuthorizationDecisionRationale) o;
    return Objects.equals(this.code, transferAuthorizationDecisionRationale.code) &&
        Objects.equals(this.description, transferAuthorizationDecisionRationale.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferAuthorizationDecisionRationale {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

