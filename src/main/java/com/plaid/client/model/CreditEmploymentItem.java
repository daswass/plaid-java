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
import com.plaid.client.model.CreditEmploymentVerification;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The object containing employment items.
 */
@ApiModel(description = "The object containing employment items.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-11T17:45:40.635640Z[Etc/UTC]")
public class CreditEmploymentItem {
  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_EMPLOYMENTS = "employments";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENTS)
  private List<CreditEmploymentVerification> employments = new ArrayList<>();

  public static final String SERIALIZED_NAME_EMPLOYMENT_REPORT_TOKEN = "employment_report_token";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT_REPORT_TOKEN)
  private String employmentReportToken;


  public CreditEmploymentItem itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * The &#x60;item_id&#x60; of the Item associated with this webhook, warning, or error
   * @return itemId
  **/
  @ApiModelProperty(required = true, value = "The `item_id` of the Item associated with this webhook, warning, or error")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public CreditEmploymentItem employments(List<CreditEmploymentVerification> employments) {
    
    this.employments = employments;
    return this;
  }

  public CreditEmploymentItem addEmploymentsItem(CreditEmploymentVerification employmentsItem) {
    this.employments.add(employmentsItem);
    return this;
  }

   /**
   * Get employments
   * @return employments
  **/
  @ApiModelProperty(required = true, value = "")

  public List<CreditEmploymentVerification> getEmployments() {
    return employments;
  }


  public void setEmployments(List<CreditEmploymentVerification> employments) {
    this.employments = employments;
  }


  public CreditEmploymentItem employmentReportToken(String employmentReportToken) {
    
    this.employmentReportToken = employmentReportToken;
    return this;
  }

   /**
   * Token to represent the underlying Employment data
   * @return employmentReportToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Token to represent the underlying Employment data")

  public String getEmploymentReportToken() {
    return employmentReportToken;
  }


  public void setEmploymentReportToken(String employmentReportToken) {
    this.employmentReportToken = employmentReportToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditEmploymentItem creditEmploymentItem = (CreditEmploymentItem) o;
    return Objects.equals(this.itemId, creditEmploymentItem.itemId) &&
        Objects.equals(this.employments, creditEmploymentItem.employments) &&
        Objects.equals(this.employmentReportToken, creditEmploymentItem.employmentReportToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, employments, employmentReportToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditEmploymentItem {\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    employments: ").append(toIndentedString(employments)).append("\n");
    sb.append("    employmentReportToken: ").append(toIndentedString(employmentReportToken)).append("\n");
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

