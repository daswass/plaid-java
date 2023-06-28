/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.385.1
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
import java.math.BigDecimal;

/**
 * An object representing both the current pay period and year to date amount for an earning category.
 */
@ApiModel(description = "An object representing both the current pay period and year to date amount for an earning category.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-28T17:05:32.818783Z[Etc/UTC]")
public class PayStubEarningsTotal {
  public static final String SERIALIZED_NAME_CURRENT_AMOUNT = "current_amount";
  @SerializedName(SERIALIZED_NAME_CURRENT_AMOUNT)
  private Double currentAmount;

  public static final String SERIALIZED_NAME_HOURS = "hours";
  @SerializedName(SERIALIZED_NAME_HOURS)
  private Double hours;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;

  public static final String SERIALIZED_NAME_UNOFFICIAL_CURRENCY_CODE = "unofficial_currency_code";
  @SerializedName(SERIALIZED_NAME_UNOFFICIAL_CURRENCY_CODE)
  private String unofficialCurrencyCode;

  public static final String SERIALIZED_NAME_YTD_AMOUNT = "ytd_amount";
  @SerializedName(SERIALIZED_NAME_YTD_AMOUNT)
  private Double ytdAmount;


  public PayStubEarningsTotal currentAmount(Double currentAmount) {
    
    this.currentAmount = currentAmount;
    return this;
  }

   /**
   * Total amount of the earnings for this pay period.
   * @return currentAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Total amount of the earnings for this pay period.")

  public Double getCurrentAmount() {
    return currentAmount;
  }


  public void setCurrentAmount(Double currentAmount) {
    this.currentAmount = currentAmount;
  }


  public PayStubEarningsTotal hours(Double hours) {
    
    this.hours = hours;
    return this;
  }

   /**
   * Total number of hours worked for this pay period.
   * @return hours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Total number of hours worked for this pay period.")

  public Double getHours() {
    return hours;
  }


  public void setHours(Double hours) {
    this.hours = hours;
  }


  public PayStubEarningsTotal isoCurrencyCode(String isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * The ISO-4217 currency code of the line item. Always &#x60;null&#x60; if &#x60;unofficial_currency_code&#x60; is non-null.
   * @return isoCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The ISO-4217 currency code of the line item. Always `null` if `unofficial_currency_code` is non-null.")

  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  public PayStubEarningsTotal unofficialCurrencyCode(String unofficialCurrencyCode) {
    
    this.unofficialCurrencyCode = unofficialCurrencyCode;
    return this;
  }

   /**
   * The unofficial currency code associated with the security. Always &#x60;null&#x60; if &#x60;iso_currency_code&#x60; is non-&#x60;null&#x60;. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries.  See the [currency code schema](https://plaid.com/docs/api/accounts#currency-code-schema) for a full listing of supported &#x60;iso_currency_code&#x60;s.
   * @return unofficialCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The unofficial currency code associated with the security. Always `null` if `iso_currency_code` is non-`null`. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries.  See the [currency code schema](https://plaid.com/docs/api/accounts#currency-code-schema) for a full listing of supported `iso_currency_code`s.")

  public String getUnofficialCurrencyCode() {
    return unofficialCurrencyCode;
  }


  public void setUnofficialCurrencyCode(String unofficialCurrencyCode) {
    this.unofficialCurrencyCode = unofficialCurrencyCode;
  }


  public PayStubEarningsTotal ytdAmount(Double ytdAmount) {
    
    this.ytdAmount = ytdAmount;
    return this;
  }

   /**
   * The total year-to-date amount of the earnings.
   * @return ytdAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The total year-to-date amount of the earnings.")

  public Double getYtdAmount() {
    return ytdAmount;
  }


  public void setYtdAmount(Double ytdAmount) {
    this.ytdAmount = ytdAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayStubEarningsTotal payStubEarningsTotal = (PayStubEarningsTotal) o;
    return Objects.equals(this.currentAmount, payStubEarningsTotal.currentAmount) &&
        Objects.equals(this.hours, payStubEarningsTotal.hours) &&
        Objects.equals(this.isoCurrencyCode, payStubEarningsTotal.isoCurrencyCode) &&
        Objects.equals(this.unofficialCurrencyCode, payStubEarningsTotal.unofficialCurrencyCode) &&
        Objects.equals(this.ytdAmount, payStubEarningsTotal.ytdAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAmount, hours, isoCurrencyCode, unofficialCurrencyCode, ytdAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayStubEarningsTotal {\n");
    sb.append("    currentAmount: ").append(toIndentedString(currentAmount)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
    sb.append("    unofficialCurrencyCode: ").append(toIndentedString(unofficialCurrencyCode)).append("\n");
    sb.append("    ytdAmount: ").append(toIndentedString(ytdAmount)).append("\n");
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

