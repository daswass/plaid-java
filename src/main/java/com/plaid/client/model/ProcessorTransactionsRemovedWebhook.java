/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.413.0
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
import com.plaid.client.model.WebhookEnvironmentValues;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This webhook is only sent to [Plaid processor partners](https://plaid.com/docs/auth/partnerships/).  Fired when transaction(s) for an Item are deleted. The deleted transaction IDs are included in the webhook payload. Plaid will typically check for deleted transaction data several times a day.  This webhook is intended for use with &#x60;/processor/transactions/get&#x60;; if you are using the newer &#x60;/processor/transactions/sync&#x60; endpoint, this webhook will still be fired to maintain backwards compatibility, but it is recommended to listen for and respond to the &#x60;SYNC_UPDATES_AVAILABLE&#x60; webhook instead.
 */
@ApiModel(description = "This webhook is only sent to [Plaid processor partners](https://plaid.com/docs/auth/partnerships/).  Fired when transaction(s) for an Item are deleted. The deleted transaction IDs are included in the webhook payload. Plaid will typically check for deleted transaction data several times a day.  This webhook is intended for use with `/processor/transactions/get`; if you are using the newer `/processor/transactions/sync` endpoint, this webhook will still be fired to maintain backwards compatibility, but it is recommended to listen for and respond to the `SYNC_UPDATES_AVAILABLE` webhook instead.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-16T22:28:13.023935Z[Etc/UTC]")
public class ProcessorTransactionsRemovedWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private PlaidError error;

  public static final String SERIALIZED_NAME_REMOVED_TRANSACTIONS = "removed_transactions";
  @SerializedName(SERIALIZED_NAME_REMOVED_TRANSACTIONS)
  private List<String> removedTransactions = new ArrayList<>();

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private WebhookEnvironmentValues environment;


  public ProcessorTransactionsRemovedWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;TRANSACTIONS&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`TRANSACTIONS`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public ProcessorTransactionsRemovedWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;TRANSACTIONS_REMOVED&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`TRANSACTIONS_REMOVED`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public ProcessorTransactionsRemovedWebhook error(PlaidError error) {
    
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


  public ProcessorTransactionsRemovedWebhook removedTransactions(List<String> removedTransactions) {
    
    this.removedTransactions = removedTransactions;
    return this;
  }

  public ProcessorTransactionsRemovedWebhook addRemovedTransactionsItem(String removedTransactionsItem) {
    this.removedTransactions.add(removedTransactionsItem);
    return this;
  }

   /**
   * An array of &#x60;transaction_ids&#x60; corresponding to the removed transactions
   * @return removedTransactions
  **/
  @ApiModelProperty(required = true, value = "An array of `transaction_ids` corresponding to the removed transactions")

  public List<String> getRemovedTransactions() {
    return removedTransactions;
  }


  public void setRemovedTransactions(List<String> removedTransactions) {
    this.removedTransactions = removedTransactions;
  }


  public ProcessorTransactionsRemovedWebhook accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID of the account.
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The ID of the account.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public ProcessorTransactionsRemovedWebhook environment(WebhookEnvironmentValues environment) {
    
    this.environment = environment;
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @ApiModelProperty(required = true, value = "")

  public WebhookEnvironmentValues getEnvironment() {
    return environment;
  }


  public void setEnvironment(WebhookEnvironmentValues environment) {
    this.environment = environment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessorTransactionsRemovedWebhook processorTransactionsRemovedWebhook = (ProcessorTransactionsRemovedWebhook) o;
    return Objects.equals(this.webhookType, processorTransactionsRemovedWebhook.webhookType) &&
        Objects.equals(this.webhookCode, processorTransactionsRemovedWebhook.webhookCode) &&
        Objects.equals(this.error, processorTransactionsRemovedWebhook.error) &&
        Objects.equals(this.removedTransactions, processorTransactionsRemovedWebhook.removedTransactions) &&
        Objects.equals(this.accountId, processorTransactionsRemovedWebhook.accountId) &&
        Objects.equals(this.environment, processorTransactionsRemovedWebhook.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, error, removedTransactions, accountId, environment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessorTransactionsRemovedWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    removedTransactions: ").append(toIndentedString(removedTransactions)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
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
