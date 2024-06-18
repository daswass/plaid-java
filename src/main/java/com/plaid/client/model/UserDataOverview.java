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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * metadata for the set of insights provided in &#x60;TransactionsUserInsightsGetResponse&#x60;
 */
@ApiModel(description = "metadata for the set of insights provided in `TransactionsUserInsightsGetResponse`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-18T18:48:06.627309Z[Etc/UTC]")
public class UserDataOverview {
  public static final String SERIALIZED_NAME_TRANSACTION_COUNT = "transaction_count";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_COUNT)
  private Integer transactionCount;

  public static final String SERIALIZED_NAME_OLDEST_TRANSACTION_DATE = "oldest_transaction_date";
  @SerializedName(SERIALIZED_NAME_OLDEST_TRANSACTION_DATE)
  private LocalDate oldestTransactionDate;

  public static final String SERIALIZED_NAME_NEWEST_TRANSACTION_DATE = "newest_transaction_date";
  @SerializedName(SERIALIZED_NAME_NEWEST_TRANSACTION_DATE)
  private LocalDate newestTransactionDate;

  public static final String SERIALIZED_NAME_DAYS_AVAILABLE = "days_available";
  @SerializedName(SERIALIZED_NAME_DAYS_AVAILABLE)
  private Integer daysAvailable;

  public static final String SERIALIZED_NAME_TOTAL_OUTFLOWS = "total_outflows";
  @SerializedName(SERIALIZED_NAME_TOTAL_OUTFLOWS)
  private Double totalOutflows;

  public static final String SERIALIZED_NAME_TOTAL_INFLOWS = "total_inflows";
  @SerializedName(SERIALIZED_NAME_TOTAL_INFLOWS)
  private Double totalInflows;


  public UserDataOverview transactionCount(Integer transactionCount) {
    
    this.transactionCount = transactionCount;
    return this;
  }

   /**
   * The total number of transactions.
   * @return transactionCount
  **/
  @ApiModelProperty(required = true, value = "The total number of transactions.")

  public Integer getTransactionCount() {
    return transactionCount;
  }


  public void setTransactionCount(Integer transactionCount) {
    this.transactionCount = transactionCount;
  }


  public UserDataOverview oldestTransactionDate(LocalDate oldestTransactionDate) {
    
    this.oldestTransactionDate = oldestTransactionDate;
    return this;
  }

   /**
   * The date of the oldest transaction processed to generate insights.
   * @return oldestTransactionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date of the oldest transaction processed to generate insights.")

  public LocalDate getOldestTransactionDate() {
    return oldestTransactionDate;
  }


  public void setOldestTransactionDate(LocalDate oldestTransactionDate) {
    this.oldestTransactionDate = oldestTransactionDate;
  }


  public UserDataOverview newestTransactionDate(LocalDate newestTransactionDate) {
    
    this.newestTransactionDate = newestTransactionDate;
    return this;
  }

   /**
   * The date of the newest transaction processed to generate insights.
   * @return newestTransactionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date of the newest transaction processed to generate insights.")

  public LocalDate getNewestTransactionDate() {
    return newestTransactionDate;
  }


  public void setNewestTransactionDate(LocalDate newestTransactionDate) {
    this.newestTransactionDate = newestTransactionDate;
  }


  public UserDataOverview daysAvailable(Integer daysAvailable) {
    
    this.daysAvailable = daysAvailable;
    return this;
  }

   /**
   * The range of days of transactions available.
   * @return daysAvailable
  **/
  @ApiModelProperty(required = true, value = "The range of days of transactions available.")

  public Integer getDaysAvailable() {
    return daysAvailable;
  }


  public void setDaysAvailable(Integer daysAvailable) {
    this.daysAvailable = daysAvailable;
  }


  public UserDataOverview totalOutflows(Double totalOutflows) {
    
    this.totalOutflows = totalOutflows;
    return this;
  }

   /**
   * Sum of outflow amounts.
   * @return totalOutflows
  **/
  @ApiModelProperty(required = true, value = "Sum of outflow amounts.")

  public Double getTotalOutflows() {
    return totalOutflows;
  }


  public void setTotalOutflows(Double totalOutflows) {
    this.totalOutflows = totalOutflows;
  }


  public UserDataOverview totalInflows(Double totalInflows) {
    
    this.totalInflows = totalInflows;
    return this;
  }

   /**
   * Sum of inflow amounts.
   * @return totalInflows
  **/
  @ApiModelProperty(required = true, value = "Sum of inflow amounts.")

  public Double getTotalInflows() {
    return totalInflows;
  }


  public void setTotalInflows(Double totalInflows) {
    this.totalInflows = totalInflows;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDataOverview userDataOverview = (UserDataOverview) o;
    return Objects.equals(this.transactionCount, userDataOverview.transactionCount) &&
        Objects.equals(this.oldestTransactionDate, userDataOverview.oldestTransactionDate) &&
        Objects.equals(this.newestTransactionDate, userDataOverview.newestTransactionDate) &&
        Objects.equals(this.daysAvailable, userDataOverview.daysAvailable) &&
        Objects.equals(this.totalOutflows, userDataOverview.totalOutflows) &&
        Objects.equals(this.totalInflows, userDataOverview.totalInflows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionCount, oldestTransactionDate, newestTransactionDate, daysAvailable, totalOutflows, totalInflows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDataOverview {\n");
    sb.append("    transactionCount: ").append(toIndentedString(transactionCount)).append("\n");
    sb.append("    oldestTransactionDate: ").append(toIndentedString(oldestTransactionDate)).append("\n");
    sb.append("    newestTransactionDate: ").append(toIndentedString(newestTransactionDate)).append("\n");
    sb.append("    daysAvailable: ").append(toIndentedString(daysAvailable)).append("\n");
    sb.append("    totalOutflows: ").append(toIndentedString(totalOutflows)).append("\n");
    sb.append("    totalInflows: ").append(toIndentedString(totalInflows)).append("\n");
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

