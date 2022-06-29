/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.131.3
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
 * Specifies options for initializing Link for use with Bank Income. This field is required if &#x60;income_verification&#x60; is included in the &#x60;products&#x60; array and &#x60;bank&#x60; is specified in &#x60;income_source_types&#x60;.
 */
@ApiModel(description = "Specifies options for initializing Link for use with Bank Income. This field is required if `income_verification` is included in the `products` array and `bank` is specified in `income_source_types`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-29T22:27:17.580916Z[Etc/UTC]")
public class LinkTokenCreateRequestIncomeVerificationBankIncome {
  public static final String SERIALIZED_NAME_DAYS_REQUESTED = "days_requested";
  @SerializedName(SERIALIZED_NAME_DAYS_REQUESTED)
  private Integer daysRequested;

  public static final String SERIALIZED_NAME_ENABLE_MULTIPLE_ITEMS = "enable_multiple_items";
  @SerializedName(SERIALIZED_NAME_ENABLE_MULTIPLE_ITEMS)
  private Boolean enableMultipleItems = false;


  public LinkTokenCreateRequestIncomeVerificationBankIncome daysRequested(Integer daysRequested) {
    
    this.daysRequested = daysRequested;
    return this;
  }

   /**
   * The number of days of data to request for the Bank Income product
   * @return daysRequested
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of days of data to request for the Bank Income product")

  public Integer getDaysRequested() {
    return daysRequested;
  }


  public void setDaysRequested(Integer daysRequested) {
    this.daysRequested = daysRequested;
  }


  public LinkTokenCreateRequestIncomeVerificationBankIncome enableMultipleItems(Boolean enableMultipleItems) {
    
    this.enableMultipleItems = enableMultipleItems;
    return this;
  }

   /**
   * Whether to enable multiple items to be added in the link session
   * @return enableMultipleItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to enable multiple items to be added in the link session")

  public Boolean getEnableMultipleItems() {
    return enableMultipleItems;
  }


  public void setEnableMultipleItems(Boolean enableMultipleItems) {
    this.enableMultipleItems = enableMultipleItems;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkTokenCreateRequestIncomeVerificationBankIncome linkTokenCreateRequestIncomeVerificationBankIncome = (LinkTokenCreateRequestIncomeVerificationBankIncome) o;
    return Objects.equals(this.daysRequested, linkTokenCreateRequestIncomeVerificationBankIncome.daysRequested) &&
        Objects.equals(this.enableMultipleItems, linkTokenCreateRequestIncomeVerificationBankIncome.enableMultipleItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(daysRequested, enableMultipleItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkTokenCreateRequestIncomeVerificationBankIncome {\n");
    sb.append("    daysRequested: ").append(toIndentedString(daysRequested)).append("\n");
    sb.append("    enableMultipleItems: ").append(toIndentedString(enableMultipleItems)).append("\n");
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

