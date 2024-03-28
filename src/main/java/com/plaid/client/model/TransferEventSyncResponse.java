/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.503.5
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
import com.plaid.client.model.TransferEvent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Defines the response schema for &#x60;/transfer/event/sync&#x60;
 */
@ApiModel(description = "Defines the response schema for `/transfer/event/sync`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-28T21:00:55.745394Z[Etc/UTC]")
public class TransferEventSyncResponse {
  public static final String SERIALIZED_NAME_TRANSFER_EVENTS = "transfer_events";
  @SerializedName(SERIALIZED_NAME_TRANSFER_EVENTS)
  private List<TransferEvent> transferEvents = new ArrayList<>();

  public static final String SERIALIZED_NAME_HAS_MORE = "has_more";
  @SerializedName(SERIALIZED_NAME_HAS_MORE)
  private Boolean hasMore;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public TransferEventSyncResponse transferEvents(List<TransferEvent> transferEvents) {
    
    this.transferEvents = transferEvents;
    return this;
  }

  public TransferEventSyncResponse addTransferEventsItem(TransferEvent transferEventsItem) {
    this.transferEvents.add(transferEventsItem);
    return this;
  }

   /**
   * Get transferEvents
   * @return transferEvents
  **/
  @ApiModelProperty(required = true, value = "")

  public List<TransferEvent> getTransferEvents() {
    return transferEvents;
  }


  public void setTransferEvents(List<TransferEvent> transferEvents) {
    this.transferEvents = transferEvents;
  }


  public TransferEventSyncResponse hasMore(Boolean hasMore) {
    
    this.hasMore = hasMore;
    return this;
  }

   /**
   * Whether there are more events to be pulled from the endpoint that have not already been returned
   * @return hasMore
  **/
  @ApiModelProperty(required = true, value = "Whether there are more events to be pulled from the endpoint that have not already been returned")

  public Boolean getHasMore() {
    return hasMore;
  }


  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }


  public TransferEventSyncResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferEventSyncResponse transferEventSyncResponse = (TransferEventSyncResponse) o;
    return Objects.equals(this.transferEvents, transferEventSyncResponse.transferEvents) &&
        Objects.equals(this.hasMore, transferEventSyncResponse.hasMore) &&
        Objects.equals(this.requestId, transferEventSyncResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transferEvents, hasMore, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferEventSyncResponse {\n");
    sb.append("    transferEvents: ").append(toIndentedString(transferEvents)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

