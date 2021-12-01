/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.54.2
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
import com.plaid.client.model.EmploymentVerification;
import com.plaid.client.model.Error;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * EmploymentVerificationGetResponse defines the response schema for &#x60;/employment/verification/get&#x60;.
 */
@ApiModel(description = "EmploymentVerificationGetResponse defines the response schema for `/employment/verification/get`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-01T18:55:04.982Z[GMT]")
public class EmploymentVerificationGetResponse {
  public static final String SERIALIZED_NAME_EMPLOYMENTS = "employments";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENTS)
  private List<EmploymentVerification> employments = new ArrayList<>();

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private Error error;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public EmploymentVerificationGetResponse employments(List<EmploymentVerification> employments) {
    
    this.employments = employments;
    return this;
  }

  public EmploymentVerificationGetResponse addEmploymentsItem(EmploymentVerification employmentsItem) {
    this.employments.add(employmentsItem);
    return this;
  }

   /**
   * A list of employment verification summaries.
   * @return employments
  **/
  @ApiModelProperty(required = true, value = "A list of employment verification summaries.")

  public List<EmploymentVerification> getEmployments() {
    return employments;
  }


  public void setEmployments(List<EmploymentVerification> employments) {
    this.employments = employments;
  }


  public EmploymentVerificationGetResponse error(Error error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Error getError() {
    return error;
  }


  public void setError(Error error) {
    this.error = error;
  }


  public EmploymentVerificationGetResponse requestId(String requestId) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmploymentVerificationGetResponse employmentVerificationGetResponse = (EmploymentVerificationGetResponse) o;
    return Objects.equals(this.employments, employmentVerificationGetResponse.employments) &&
        Objects.equals(this.error, employmentVerificationGetResponse.error) &&
        Objects.equals(this.requestId, employmentVerificationGetResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employments, error, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmploymentVerificationGetResponse {\n");
    sb.append("    employments: ").append(toIndentedString(employments)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

