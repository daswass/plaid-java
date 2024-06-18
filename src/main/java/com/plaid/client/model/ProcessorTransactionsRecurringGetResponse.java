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
import com.plaid.client.model.TransactionStream;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * ProcessorTransactionsRecurringGetResponse defines the response schema for &#x60;/processor/transactions/recurring/get&#x60;
 */
@ApiModel(description = "ProcessorTransactionsRecurringGetResponse defines the response schema for `/processor/transactions/recurring/get`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-18T18:48:06.627309Z[Etc/UTC]")
public class ProcessorTransactionsRecurringGetResponse {
  public static final String SERIALIZED_NAME_INFLOW_STREAMS = "inflow_streams";
  @SerializedName(SERIALIZED_NAME_INFLOW_STREAMS)
  private List<TransactionStream> inflowStreams = new ArrayList<>();

  public static final String SERIALIZED_NAME_OUTFLOW_STREAMS = "outflow_streams";
  @SerializedName(SERIALIZED_NAME_OUTFLOW_STREAMS)
  private List<TransactionStream> outflowStreams = new ArrayList<>();

  public static final String SERIALIZED_NAME_UPDATED_DATETIME = "updated_datetime";
  @SerializedName(SERIALIZED_NAME_UPDATED_DATETIME)
  private OffsetDateTime updatedDatetime;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public ProcessorTransactionsRecurringGetResponse inflowStreams(List<TransactionStream> inflowStreams) {
    
    this.inflowStreams = inflowStreams;
    return this;
  }

  public ProcessorTransactionsRecurringGetResponse addInflowStreamsItem(TransactionStream inflowStreamsItem) {
    this.inflowStreams.add(inflowStreamsItem);
    return this;
  }

   /**
   * An array of depository transaction streams.
   * @return inflowStreams
  **/
  @ApiModelProperty(required = true, value = "An array of depository transaction streams.")

  public List<TransactionStream> getInflowStreams() {
    return inflowStreams;
  }


  public void setInflowStreams(List<TransactionStream> inflowStreams) {
    this.inflowStreams = inflowStreams;
  }


  public ProcessorTransactionsRecurringGetResponse outflowStreams(List<TransactionStream> outflowStreams) {
    
    this.outflowStreams = outflowStreams;
    return this;
  }

  public ProcessorTransactionsRecurringGetResponse addOutflowStreamsItem(TransactionStream outflowStreamsItem) {
    this.outflowStreams.add(outflowStreamsItem);
    return this;
  }

   /**
   * An array of expense transaction streams.
   * @return outflowStreams
  **/
  @ApiModelProperty(required = true, value = "An array of expense transaction streams.")

  public List<TransactionStream> getOutflowStreams() {
    return outflowStreams;
  }


  public void setOutflowStreams(List<TransactionStream> outflowStreams) {
    this.outflowStreams = outflowStreams;
  }


  public ProcessorTransactionsRecurringGetResponse updatedDatetime(OffsetDateTime updatedDatetime) {
    
    this.updatedDatetime = updatedDatetime;
    return this;
  }

   /**
   * Timestamp in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (&#x60;YYYY-MM-DDTHH:mm:ssZ&#x60;) indicating the last time transaction streams for the given account were updated on
   * @return updatedDatetime
  **/
  @ApiModelProperty(required = true, value = "Timestamp in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (`YYYY-MM-DDTHH:mm:ssZ`) indicating the last time transaction streams for the given account were updated on")

  public OffsetDateTime getUpdatedDatetime() {
    return updatedDatetime;
  }


  public void setUpdatedDatetime(OffsetDateTime updatedDatetime) {
    this.updatedDatetime = updatedDatetime;
  }


  public ProcessorTransactionsRecurringGetResponse requestId(String requestId) {
    
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
    ProcessorTransactionsRecurringGetResponse processorTransactionsRecurringGetResponse = (ProcessorTransactionsRecurringGetResponse) o;
    return Objects.equals(this.inflowStreams, processorTransactionsRecurringGetResponse.inflowStreams) &&
        Objects.equals(this.outflowStreams, processorTransactionsRecurringGetResponse.outflowStreams) &&
        Objects.equals(this.updatedDatetime, processorTransactionsRecurringGetResponse.updatedDatetime) &&
        Objects.equals(this.requestId, processorTransactionsRecurringGetResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inflowStreams, outflowStreams, updatedDatetime, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessorTransactionsRecurringGetResponse {\n");
    sb.append("    inflowStreams: ").append(toIndentedString(inflowStreams)).append("\n");
    sb.append("    outflowStreams: ").append(toIndentedString(outflowStreams)).append("\n");
    sb.append("    updatedDatetime: ").append(toIndentedString(updatedDatetime)).append("\n");
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

