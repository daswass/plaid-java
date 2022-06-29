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
 * Fired when an Item&#39;s transactions change. This can be due to any event resulting in new changes, such as an initial, historical, or default pull. After receipt of this webhook, the new changes can be fetched for the Item from &#x60;/transactions/sync&#x60;.  Note that to receive this webhook for an Item, &#x60;/transactions/sync&#x60; must have been called at least once on that Item.
 */
@ApiModel(description = "Fired when an Item's transactions change. This can be due to any event resulting in new changes, such as an initial, historical, or default pull. After receipt of this webhook, the new changes can be fetched for the Item from `/transactions/sync`.  Note that to receive this webhook for an Item, `/transactions/sync` must have been called at least once on that Item.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-29T22:27:17.580916Z[Etc/UTC]")
public class SyncUpdatesAvailableWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_INITIAL_UPDATE_COMPLETE = "initial_update_complete";
  @SerializedName(SERIALIZED_NAME_INITIAL_UPDATE_COMPLETE)
  private Boolean initialUpdateComplete;

  public static final String SERIALIZED_NAME_HISTORICAL_UPDATE_COMPLETE = "historical_update_complete";
  @SerializedName(SERIALIZED_NAME_HISTORICAL_UPDATE_COMPLETE)
  private Boolean historicalUpdateComplete;


  public SyncUpdatesAvailableWebhook webhookType(String webhookType) {
    
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


  public SyncUpdatesAvailableWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;SYNC_UPDATES_AVAILABLE&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`SYNC_UPDATES_AVAILABLE`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public SyncUpdatesAvailableWebhook itemId(String itemId) {
    
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


  public SyncUpdatesAvailableWebhook initialUpdateComplete(Boolean initialUpdateComplete) {
    
    this.initialUpdateComplete = initialUpdateComplete;
    return this;
  }

   /**
   * Indicates if initial pull information is available.
   * @return initialUpdateComplete
  **/
  @ApiModelProperty(required = true, value = "Indicates if initial pull information is available.")

  public Boolean getInitialUpdateComplete() {
    return initialUpdateComplete;
  }


  public void setInitialUpdateComplete(Boolean initialUpdateComplete) {
    this.initialUpdateComplete = initialUpdateComplete;
  }


  public SyncUpdatesAvailableWebhook historicalUpdateComplete(Boolean historicalUpdateComplete) {
    
    this.historicalUpdateComplete = historicalUpdateComplete;
    return this;
  }

   /**
   * Indicates if historical pull information is available.
   * @return historicalUpdateComplete
  **/
  @ApiModelProperty(required = true, value = "Indicates if historical pull information is available.")

  public Boolean getHistoricalUpdateComplete() {
    return historicalUpdateComplete;
  }


  public void setHistoricalUpdateComplete(Boolean historicalUpdateComplete) {
    this.historicalUpdateComplete = historicalUpdateComplete;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncUpdatesAvailableWebhook syncUpdatesAvailableWebhook = (SyncUpdatesAvailableWebhook) o;
    return Objects.equals(this.webhookType, syncUpdatesAvailableWebhook.webhookType) &&
        Objects.equals(this.webhookCode, syncUpdatesAvailableWebhook.webhookCode) &&
        Objects.equals(this.itemId, syncUpdatesAvailableWebhook.itemId) &&
        Objects.equals(this.initialUpdateComplete, syncUpdatesAvailableWebhook.initialUpdateComplete) &&
        Objects.equals(this.historicalUpdateComplete, syncUpdatesAvailableWebhook.historicalUpdateComplete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, itemId, initialUpdateComplete, historicalUpdateComplete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncUpdatesAvailableWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    initialUpdateComplete: ").append(toIndentedString(initialUpdateComplete)).append("\n");
    sb.append("    historicalUpdateComplete: ").append(toIndentedString(historicalUpdateComplete)).append("\n");
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

