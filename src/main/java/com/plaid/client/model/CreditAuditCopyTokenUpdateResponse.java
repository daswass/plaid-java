/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.345.1
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
 * CreditAuditCopyTokenUpdateResponse defines the response schema for &#x60;/credit/audit_copy_token/update&#x60;
 */
@ApiModel(description = "CreditAuditCopyTokenUpdateResponse defines the response schema for `/credit/audit_copy_token/update`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-17T21:11:54.856293Z[Etc/UTC]")
public class CreditAuditCopyTokenUpdateResponse {
  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private Boolean updated;


  public CreditAuditCopyTokenUpdateResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public CreditAuditCopyTokenUpdateResponse updated(Boolean updated) {
    
    this.updated = updated;
    return this;
  }

   /**
   * &#x60;true&#x60; if the Audit Copy Token was successfully updated.
   * @return updated
  **/
  @ApiModelProperty(required = true, value = "`true` if the Audit Copy Token was successfully updated.")

  public Boolean getUpdated() {
    return updated;
  }


  public void setUpdated(Boolean updated) {
    this.updated = updated;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditAuditCopyTokenUpdateResponse creditAuditCopyTokenUpdateResponse = (CreditAuditCopyTokenUpdateResponse) o;
    return Objects.equals(this.requestId, creditAuditCopyTokenUpdateResponse.requestId) &&
        Objects.equals(this.updated, creditAuditCopyTokenUpdateResponse.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, updated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditAuditCopyTokenUpdateResponse {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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

