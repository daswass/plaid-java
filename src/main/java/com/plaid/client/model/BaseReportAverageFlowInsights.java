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
import com.plaid.client.model.CreditAmountWithCurrency;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * Average dollar amount of credit or debit transactions out of the account. This field will only added for depository accounts
 */
@ApiModel(description = "Average dollar amount of credit or debit transactions out of the account. This field will only added for depository accounts")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-18T18:48:06.627309Z[Etc/UTC]")
public class BaseReportAverageFlowInsights {
  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "total_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private CreditAmountWithCurrency totalAmount;


  public BaseReportAverageFlowInsights startDate(LocalDate startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date of this time period. The date will be returned in an ISO 8601 format (YYYY-MM-DD).
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The start date of this time period. The date will be returned in an ISO 8601 format (YYYY-MM-DD).")

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  public BaseReportAverageFlowInsights endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date of this time period. The date will be returned in an ISO 8601 format (YYYY-MM-DD).
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The end date of this time period. The date will be returned in an ISO 8601 format (YYYY-MM-DD).")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public BaseReportAverageFlowInsights totalAmount(CreditAmountWithCurrency totalAmount) {
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Get totalAmount
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreditAmountWithCurrency getTotalAmount() {
    return totalAmount;
  }


  public void setTotalAmount(CreditAmountWithCurrency totalAmount) {
    this.totalAmount = totalAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseReportAverageFlowInsights baseReportAverageFlowInsights = (BaseReportAverageFlowInsights) o;
    return Objects.equals(this.startDate, baseReportAverageFlowInsights.startDate) &&
        Objects.equals(this.endDate, baseReportAverageFlowInsights.endDate) &&
        Objects.equals(this.totalAmount, baseReportAverageFlowInsights.totalAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, totalAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseReportAverageFlowInsights {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
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

