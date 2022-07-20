/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.146.0
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
import com.plaid.client.model.PlaidError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Fired when new or canceled transactions have been detected on an investment account.
 */
@ApiModel(description = "Fired when new or canceled transactions have been detected on an investment account.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-19T23:07:20.107473Z[Etc/UTC]")
public class InvestmentsDefaultUpdateWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private PlaidError error;

  public static final String SERIALIZED_NAME_NEW_INVESTMENTS_TRANSACTIONS = "new_investments_transactions";
  @SerializedName(SERIALIZED_NAME_NEW_INVESTMENTS_TRANSACTIONS)
  private Double newInvestmentsTransactions;

  public static final String SERIALIZED_NAME_CANCELED_INVESTMENTS_TRANSACTIONS = "canceled_investments_transactions";
  @SerializedName(SERIALIZED_NAME_CANCELED_INVESTMENTS_TRANSACTIONS)
  private Double canceledInvestmentsTransactions;


  public InvestmentsDefaultUpdateWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;INVESTMENTS_TRANSACTIONS&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`INVESTMENTS_TRANSACTIONS`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public InvestmentsDefaultUpdateWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;DEFAULT_UPDATE&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`DEFAULT_UPDATE`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public InvestmentsDefaultUpdateWebhook itemId(String itemId) {
    
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


  public InvestmentsDefaultUpdateWebhook error(PlaidError error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PlaidError getError() {
    return error;
  }


  public void setError(PlaidError error) {
    this.error = error;
  }


  public InvestmentsDefaultUpdateWebhook newInvestmentsTransactions(Double newInvestmentsTransactions) {
    
    this.newInvestmentsTransactions = newInvestmentsTransactions;
    return this;
  }

   /**
   * The number of new transactions reported since the last time this webhook was fired.
   * @return newInvestmentsTransactions
  **/
  @ApiModelProperty(required = true, value = "The number of new transactions reported since the last time this webhook was fired.")

  public Double getNewInvestmentsTransactions() {
    return newInvestmentsTransactions;
  }


  public void setNewInvestmentsTransactions(Double newInvestmentsTransactions) {
    this.newInvestmentsTransactions = newInvestmentsTransactions;
  }


  public InvestmentsDefaultUpdateWebhook canceledInvestmentsTransactions(Double canceledInvestmentsTransactions) {
    
    this.canceledInvestmentsTransactions = canceledInvestmentsTransactions;
    return this;
  }

   /**
   * The number of canceled transactions reported since the last time this webhook was fired.
   * @return canceledInvestmentsTransactions
  **/
  @ApiModelProperty(required = true, value = "The number of canceled transactions reported since the last time this webhook was fired.")

  public Double getCanceledInvestmentsTransactions() {
    return canceledInvestmentsTransactions;
  }


  public void setCanceledInvestmentsTransactions(Double canceledInvestmentsTransactions) {
    this.canceledInvestmentsTransactions = canceledInvestmentsTransactions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvestmentsDefaultUpdateWebhook investmentsDefaultUpdateWebhook = (InvestmentsDefaultUpdateWebhook) o;
    return Objects.equals(this.webhookType, investmentsDefaultUpdateWebhook.webhookType) &&
        Objects.equals(this.webhookCode, investmentsDefaultUpdateWebhook.webhookCode) &&
        Objects.equals(this.itemId, investmentsDefaultUpdateWebhook.itemId) &&
        Objects.equals(this.error, investmentsDefaultUpdateWebhook.error) &&
        Objects.equals(this.newInvestmentsTransactions, investmentsDefaultUpdateWebhook.newInvestmentsTransactions) &&
        Objects.equals(this.canceledInvestmentsTransactions, investmentsDefaultUpdateWebhook.canceledInvestmentsTransactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, itemId, error, newInvestmentsTransactions, canceledInvestmentsTransactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvestmentsDefaultUpdateWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    newInvestmentsTransactions: ").append(toIndentedString(newInvestmentsTransactions)).append("\n");
    sb.append("    canceledInvestmentsTransactions: ").append(toIndentedString(canceledInvestmentsTransactions)).append("\n");
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

