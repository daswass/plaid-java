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
import com.plaid.client.model.CreditBankIncomeErrorType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An error object and associated &#x60;item_id&#x60; used to identify a specific Item and error when a batch operation operating on multiple Items has encountered an error in one of the Items.
 */
@ApiModel(description = "An error object and associated `item_id` used to identify a specific Item and error when a batch operation operating on multiple Items has encountered an error in one of the Items.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-11T17:45:40.635640Z[Etc/UTC]")
public class CreditBankIncomeCause {
  public static final String SERIALIZED_NAME_ERROR_TYPE = "error_type";
  @SerializedName(SERIALIZED_NAME_ERROR_TYPE)
  private CreditBankIncomeErrorType errorType;

  public static final String SERIALIZED_NAME_ERROR_CODE = "error_code";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private String errorCode;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "error_message";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;

  public static final String SERIALIZED_NAME_DISPLAY_MESSAGE = "display_message";
  @SerializedName(SERIALIZED_NAME_DISPLAY_MESSAGE)
  private String displayMessage;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;


  public CreditBankIncomeCause errorType(CreditBankIncomeErrorType errorType) {
    
    this.errorType = errorType;
    return this;
  }

   /**
   * Get errorType
   * @return errorType
  **/
  @ApiModelProperty(required = true, value = "")

  public CreditBankIncomeErrorType getErrorType() {
    return errorType;
  }


  public void setErrorType(CreditBankIncomeErrorType errorType) {
    this.errorType = errorType;
  }


  public CreditBankIncomeCause errorCode(String errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * We use standard HTTP response codes for success and failure notifications, and our errors are further classified by &#x60;error_type&#x60;. In general, 200 HTTP codes correspond to success, 40X codes are for developer- or user-related failures, and 50X codes are for Plaid-related issues. Error fields will be &#x60;null&#x60; if no error has occurred.
   * @return errorCode
  **/
  @ApiModelProperty(required = true, value = "We use standard HTTP response codes for success and failure notifications, and our errors are further classified by `error_type`. In general, 200 HTTP codes correspond to success, 40X codes are for developer- or user-related failures, and 50X codes are for Plaid-related issues. Error fields will be `null` if no error has occurred.")

  public String getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public CreditBankIncomeCause errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * A developer-friendly representation of the error code. This may change over time and is not safe for programmatic use.
   * @return errorMessage
  **/
  @ApiModelProperty(required = true, value = "A developer-friendly representation of the error code. This may change over time and is not safe for programmatic use.")

  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public CreditBankIncomeCause displayMessage(String displayMessage) {
    
    this.displayMessage = displayMessage;
    return this;
  }

   /**
   * A user-friendly representation of the error code. null if the error is not related to user action. This may change over time and is not safe for programmatic use.
   * @return displayMessage
  **/
  @ApiModelProperty(required = true, value = "A user-friendly representation of the error code. null if the error is not related to user action. This may change over time and is not safe for programmatic use.")

  public String getDisplayMessage() {
    return displayMessage;
  }


  public void setDisplayMessage(String displayMessage) {
    this.displayMessage = displayMessage;
  }


  public CreditBankIncomeCause itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * The &#x60;item_id&#x60; of the Item associated with this warning.
   * @return itemId
  **/
  @ApiModelProperty(required = true, value = "The `item_id` of the Item associated with this warning.")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditBankIncomeCause creditBankIncomeCause = (CreditBankIncomeCause) o;
    return Objects.equals(this.errorType, creditBankIncomeCause.errorType) &&
        Objects.equals(this.errorCode, creditBankIncomeCause.errorCode) &&
        Objects.equals(this.errorMessage, creditBankIncomeCause.errorMessage) &&
        Objects.equals(this.displayMessage, creditBankIncomeCause.displayMessage) &&
        Objects.equals(this.itemId, creditBankIncomeCause.itemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorType, errorCode, errorMessage, displayMessage, itemId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditBankIncomeCause {\n");
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    displayMessage: ").append(toIndentedString(displayMessage)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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

