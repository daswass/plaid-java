/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.496.0
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
import com.plaid.client.model.WalletTransactionStatus;
import com.plaid.client.model.WebhookEnvironmentValues;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Fired when the status of a wallet transaction has changed.
 */
@ApiModel(description = "Fired when the status of a wallet transaction has changed.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-15T19:49:08.269481Z[Etc/UTC]")
public class WalletTransactionStatusUpdateWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transaction_id";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_PAYMENT_ID = "payment_id";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ID)
  private String paymentId;

  public static final String SERIALIZED_NAME_WALLET_ID = "wallet_id";
  @SerializedName(SERIALIZED_NAME_WALLET_ID)
  private String walletId;

  public static final String SERIALIZED_NAME_NEW_STATUS = "new_status";
  @SerializedName(SERIALIZED_NAME_NEW_STATUS)
  private WalletTransactionStatus newStatus;

  public static final String SERIALIZED_NAME_OLD_STATUS = "old_status";
  @SerializedName(SERIALIZED_NAME_OLD_STATUS)
  private WalletTransactionStatus oldStatus;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private WebhookEnvironmentValues environment;


  public WalletTransactionStatusUpdateWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;WALLET&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`WALLET`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public WalletTransactionStatusUpdateWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;WALLET_TRANSACTION_STATUS_UPDATE&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`WALLET_TRANSACTION_STATUS_UPDATE`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public WalletTransactionStatusUpdateWebhook transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * The &#x60;transaction_id&#x60; for the wallet transaction being updated
   * @return transactionId
  **/
  @ApiModelProperty(required = true, value = "The `transaction_id` for the wallet transaction being updated")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public WalletTransactionStatusUpdateWebhook paymentId(String paymentId) {
    
    this.paymentId = paymentId;
    return this;
  }

   /**
   * The &#x60;payment_id&#x60; associated with the transaction. This will be present in case of &#x60;REFUND&#x60; and &#x60;PIS_PAY_IN&#x60;.
   * @return paymentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `payment_id` associated with the transaction. This will be present in case of `REFUND` and `PIS_PAY_IN`.")

  public String getPaymentId() {
    return paymentId;
  }


  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }


  public WalletTransactionStatusUpdateWebhook walletId(String walletId) {
    
    this.walletId = walletId;
    return this;
  }

   /**
   * The EMI (E-Money Institution) wallet that this payment is associated with. This wallet is used as an intermediary account to enable Plaid to reconcile the settlement of funds for Payment Initiation requests.
   * @return walletId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The EMI (E-Money Institution) wallet that this payment is associated with. This wallet is used as an intermediary account to enable Plaid to reconcile the settlement of funds for Payment Initiation requests.")

  public String getWalletId() {
    return walletId;
  }


  public void setWalletId(String walletId) {
    this.walletId = walletId;
  }


  public WalletTransactionStatusUpdateWebhook newStatus(WalletTransactionStatus newStatus) {
    
    this.newStatus = newStatus;
    return this;
  }

   /**
   * Get newStatus
   * @return newStatus
  **/
  @ApiModelProperty(required = true, value = "")

  public WalletTransactionStatus getNewStatus() {
    return newStatus;
  }


  public void setNewStatus(WalletTransactionStatus newStatus) {
    this.newStatus = newStatus;
  }


  public WalletTransactionStatusUpdateWebhook oldStatus(WalletTransactionStatus oldStatus) {
    
    this.oldStatus = oldStatus;
    return this;
  }

   /**
   * Get oldStatus
   * @return oldStatus
  **/
  @ApiModelProperty(required = true, value = "")

  public WalletTransactionStatus getOldStatus() {
    return oldStatus;
  }


  public void setOldStatus(WalletTransactionStatus oldStatus) {
    this.oldStatus = oldStatus;
  }


  public WalletTransactionStatusUpdateWebhook timestamp(OffsetDateTime timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The timestamp of the update, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format, e.g. &#x60;\&quot;2017-09-14T14:42:19.350Z\&quot;&#x60;
   * @return timestamp
  **/
  @ApiModelProperty(required = true, value = "The timestamp of the update, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format, e.g. `\"2017-09-14T14:42:19.350Z\"`")

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public WalletTransactionStatusUpdateWebhook environment(WebhookEnvironmentValues environment) {
    
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
    WalletTransactionStatusUpdateWebhook walletTransactionStatusUpdateWebhook = (WalletTransactionStatusUpdateWebhook) o;
    return Objects.equals(this.webhookType, walletTransactionStatusUpdateWebhook.webhookType) &&
        Objects.equals(this.webhookCode, walletTransactionStatusUpdateWebhook.webhookCode) &&
        Objects.equals(this.transactionId, walletTransactionStatusUpdateWebhook.transactionId) &&
        Objects.equals(this.paymentId, walletTransactionStatusUpdateWebhook.paymentId) &&
        Objects.equals(this.walletId, walletTransactionStatusUpdateWebhook.walletId) &&
        Objects.equals(this.newStatus, walletTransactionStatusUpdateWebhook.newStatus) &&
        Objects.equals(this.oldStatus, walletTransactionStatusUpdateWebhook.oldStatus) &&
        Objects.equals(this.timestamp, walletTransactionStatusUpdateWebhook.timestamp) &&
        Objects.equals(this.environment, walletTransactionStatusUpdateWebhook.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, transactionId, paymentId, walletId, newStatus, oldStatus, timestamp, environment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletTransactionStatusUpdateWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
    sb.append("    newStatus: ").append(toIndentedString(newStatus)).append("\n");
    sb.append("    oldStatus: ").append(toIndentedString(oldStatus)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

