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
import com.plaid.client.model.TransferEventListTransferType;
import com.plaid.client.model.TransferEventType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Defines the request schema for &#x60;/transfer/event/list&#x60;
 */
@ApiModel(description = "Defines the request schema for `/transfer/event/list`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-18T18:48:06.627309Z[Etc/UTC]")
public class TransferEventListRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_TRANSFER_ID = "transfer_id";
  @SerializedName(SERIALIZED_NAME_TRANSFER_ID)
  private String transferId;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_TRANSFER_TYPE = "transfer_type";
  @SerializedName(SERIALIZED_NAME_TRANSFER_TYPE)
  private TransferEventListTransferType transferType;

  public static final String SERIALIZED_NAME_EVENT_TYPES = "event_types";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPES)
  private List<TransferEventType> eventTypes = null;

  public static final String SERIALIZED_NAME_SWEEP_ID = "sweep_id";
  @SerializedName(SERIALIZED_NAME_SWEEP_ID)
  private String sweepId;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count = 25;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset = 0;

  public static final String SERIALIZED_NAME_ORIGINATION_ACCOUNT_ID = "origination_account_id";
  @SerializedName(SERIALIZED_NAME_ORIGINATION_ACCOUNT_ID)
  private String originationAccountId;

  public static final String SERIALIZED_NAME_ORIGINATOR_CLIENT_ID = "originator_client_id";
  @SerializedName(SERIALIZED_NAME_ORIGINATOR_CLIENT_ID)
  private String originatorClientId;

  public static final String SERIALIZED_NAME_FUNDING_ACCOUNT_ID = "funding_account_id";
  @SerializedName(SERIALIZED_NAME_FUNDING_ACCOUNT_ID)
  private String fundingAccountId;


  public TransferEventListRequest clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public TransferEventListRequest secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body.
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body.")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public TransferEventListRequest startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The start datetime of transfers to list. This should be in RFC 3339 format (i.e. &#x60;2019-12-06T22:35:49Z&#x60;)
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The start datetime of transfers to list. This should be in RFC 3339 format (i.e. `2019-12-06T22:35:49Z`)")

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public TransferEventListRequest endDate(OffsetDateTime endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The end datetime of transfers to list. This should be in RFC 3339 format (i.e. &#x60;2019-12-06T22:35:49Z&#x60;)
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The end datetime of transfers to list. This should be in RFC 3339 format (i.e. `2019-12-06T22:35:49Z`)")

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public TransferEventListRequest transferId(String transferId) {
    
    this.transferId = transferId;
    return this;
  }

   /**
   * Plaid’s unique identifier for a transfer.
   * @return transferId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Plaid’s unique identifier for a transfer.")

  public String getTransferId() {
    return transferId;
  }


  public void setTransferId(String transferId) {
    this.transferId = transferId;
  }


  public TransferEventListRequest accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The account ID to get events for all transactions to/from an account.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The account ID to get events for all transactions to/from an account.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public TransferEventListRequest transferType(TransferEventListTransferType transferType) {
    
    this.transferType = transferType;
    return this;
  }

   /**
   * Get transferType
   * @return transferType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransferEventListTransferType getTransferType() {
    return transferType;
  }


  public void setTransferType(TransferEventListTransferType transferType) {
    this.transferType = transferType;
  }


  public TransferEventListRequest eventTypes(List<TransferEventType> eventTypes) {
    
    this.eventTypes = eventTypes;
    return this;
  }

  public TransferEventListRequest addEventTypesItem(TransferEventType eventTypesItem) {
    if (this.eventTypes == null) {
      this.eventTypes = new ArrayList<>();
    }
    this.eventTypes.add(eventTypesItem);
    return this;
  }

   /**
   * Filter events by event type.
   * @return eventTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter events by event type.")

  public List<TransferEventType> getEventTypes() {
    return eventTypes;
  }


  public void setEventTypes(List<TransferEventType> eventTypes) {
    this.eventTypes = eventTypes;
  }


  public TransferEventListRequest sweepId(String sweepId) {
    
    this.sweepId = sweepId;
    return this;
  }

   /**
   * Plaid’s unique identifier for a sweep.
   * @return sweepId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Plaid’s unique identifier for a sweep.")

  public String getSweepId() {
    return sweepId;
  }


  public void setSweepId(String sweepId) {
    this.sweepId = sweepId;
  }


  public TransferEventListRequest count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * The maximum number of transfer events to return. If the number of events matching the above parameters is greater than &#x60;count&#x60;, the most recent events will be returned.
   * minimum: 1
   * maximum: 25
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum number of transfer events to return. If the number of events matching the above parameters is greater than `count`, the most recent events will be returned.")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  public TransferEventListRequest offset(Integer offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * The offset into the list of transfer events. When &#x60;count&#x60;&#x3D;25 and &#x60;offset&#x60;&#x3D;0, the first 25 events will be returned. When &#x60;count&#x60;&#x3D;25 and &#x60;offset&#x60;&#x3D;25, the next 25 events will be returned.
   * minimum: 0
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The offset into the list of transfer events. When `count`=25 and `offset`=0, the first 25 events will be returned. When `count`=25 and `offset`=25, the next 25 events will be returned.")

  public Integer getOffset() {
    return offset;
  }


  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public TransferEventListRequest originationAccountId(String originationAccountId) {
    
    this.originationAccountId = originationAccountId;
    return this;
  }

   /**
   * The origination account ID to get events for transfers from a specific origination account.
   * @return originationAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The origination account ID to get events for transfers from a specific origination account.")

  public String getOriginationAccountId() {
    return originationAccountId;
  }


  public void setOriginationAccountId(String originationAccountId) {
    this.originationAccountId = originationAccountId;
  }


  public TransferEventListRequest originatorClientId(String originatorClientId) {
    
    this.originatorClientId = originatorClientId;
    return this;
  }

   /**
   * Filter transfer events to only those with the specified originator client.
   * @return originatorClientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter transfer events to only those with the specified originator client.")

  public String getOriginatorClientId() {
    return originatorClientId;
  }


  public void setOriginatorClientId(String originatorClientId) {
    this.originatorClientId = originatorClientId;
  }


  public TransferEventListRequest fundingAccountId(String fundingAccountId) {
    
    this.fundingAccountId = fundingAccountId;
    return this;
  }

   /**
   * Filter transfer events to only those with the specified &#x60;funding_account_id&#x60;.
   * @return fundingAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter transfer events to only those with the specified `funding_account_id`.")

  public String getFundingAccountId() {
    return fundingAccountId;
  }


  public void setFundingAccountId(String fundingAccountId) {
    this.fundingAccountId = fundingAccountId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferEventListRequest transferEventListRequest = (TransferEventListRequest) o;
    return Objects.equals(this.clientId, transferEventListRequest.clientId) &&
        Objects.equals(this.secret, transferEventListRequest.secret) &&
        Objects.equals(this.startDate, transferEventListRequest.startDate) &&
        Objects.equals(this.endDate, transferEventListRequest.endDate) &&
        Objects.equals(this.transferId, transferEventListRequest.transferId) &&
        Objects.equals(this.accountId, transferEventListRequest.accountId) &&
        Objects.equals(this.transferType, transferEventListRequest.transferType) &&
        Objects.equals(this.eventTypes, transferEventListRequest.eventTypes) &&
        Objects.equals(this.sweepId, transferEventListRequest.sweepId) &&
        Objects.equals(this.count, transferEventListRequest.count) &&
        Objects.equals(this.offset, transferEventListRequest.offset) &&
        Objects.equals(this.originationAccountId, transferEventListRequest.originationAccountId) &&
        Objects.equals(this.originatorClientId, transferEventListRequest.originatorClientId) &&
        Objects.equals(this.fundingAccountId, transferEventListRequest.fundingAccountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, startDate, endDate, transferId, accountId, transferType, eventTypes, sweepId, count, offset, originationAccountId, originatorClientId, fundingAccountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferEventListRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    transferId: ").append(toIndentedString(transferId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
    sb.append("    eventTypes: ").append(toIndentedString(eventTypes)).append("\n");
    sb.append("    sweepId: ").append(toIndentedString(sweepId)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    originationAccountId: ").append(toIndentedString(originationAccountId)).append("\n");
    sb.append("    originatorClientId: ").append(toIndentedString(originatorClientId)).append("\n");
    sb.append("    fundingAccountId: ").append(toIndentedString(fundingAccountId)).append("\n");
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

