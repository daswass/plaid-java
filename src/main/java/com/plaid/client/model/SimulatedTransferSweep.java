/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.345.1
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
import com.plaid.client.model.TransferSweep;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.time.OffsetDateTime;

/**
 * A sweep returned from the &#x60;/sandbox/transfer/sweep/simulate&#x60; endpoint. Can be null if there are no transfers to include in a sweep.
 */
@ApiModel(description = "A sweep returned from the `/sandbox/transfer/sweep/simulate` endpoint. Can be null if there are no transfers to include in a sweep.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-17T21:11:54.856293Z[Etc/UTC]")
public class SimulatedTransferSweep {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_FUNDING_ACCOUNT_ID = "funding_account_id";
  @SerializedName(SERIALIZED_NAME_FUNDING_ACCOUNT_ID)
  private String fundingAccountId;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;

  public static final String SERIALIZED_NAME_SETTLED = "settled";
  @SerializedName(SERIALIZED_NAME_SETTLED)
  private LocalDate settled;


  public SimulatedTransferSweep id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Identifier of the sweep.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Identifier of the sweep.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public SimulatedTransferSweep fundingAccountId(String fundingAccountId) {
    
    this.fundingAccountId = fundingAccountId;
    return this;
  }

   /**
   * The id of the funding account to use, available in the Plaid Dashboard. This determines which of your business checking accounts will be credited or debited.
   * @return fundingAccountId
  **/
  @ApiModelProperty(required = true, value = "The id of the funding account to use, available in the Plaid Dashboard. This determines which of your business checking accounts will be credited or debited.")

  public String getFundingAccountId() {
    return fundingAccountId;
  }


  public void setFundingAccountId(String fundingAccountId) {
    this.fundingAccountId = fundingAccountId;
  }


  public SimulatedTransferSweep created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * The datetime when the sweep occurred, in RFC 3339 format.
   * @return created
  **/
  @ApiModelProperty(required = true, value = "The datetime when the sweep occurred, in RFC 3339 format.")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public SimulatedTransferSweep amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Signed decimal amount of the sweep as it appears on your sweep account ledger (e.g. \&quot;-10.00\&quot;)  If amount is not present, the sweep was net-settled to zero and outstanding debits and credits between the sweep account and Plaid are balanced.
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "Signed decimal amount of the sweep as it appears on your sweep account ledger (e.g. \"-10.00\")  If amount is not present, the sweep was net-settled to zero and outstanding debits and credits between the sweep account and Plaid are balanced.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public SimulatedTransferSweep isoCurrencyCode(String isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * The currency of the sweep, e.g. \&quot;USD\&quot;.
   * @return isoCurrencyCode
  **/
  @ApiModelProperty(required = true, value = "The currency of the sweep, e.g. \"USD\".")

  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  public SimulatedTransferSweep settled(LocalDate settled) {
    
    this.settled = settled;
    return this;
  }

   /**
   * The date when the sweep settled, in the YYYY-MM-DD format.
   * @return settled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The date when the sweep settled, in the YYYY-MM-DD format.")

  public LocalDate getSettled() {
    return settled;
  }


  public void setSettled(LocalDate settled) {
    this.settled = settled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimulatedTransferSweep simulatedTransferSweep = (SimulatedTransferSweep) o;
    return Objects.equals(this.id, simulatedTransferSweep.id) &&
        Objects.equals(this.fundingAccountId, simulatedTransferSweep.fundingAccountId) &&
        Objects.equals(this.created, simulatedTransferSweep.created) &&
        Objects.equals(this.amount, simulatedTransferSweep.amount) &&
        Objects.equals(this.isoCurrencyCode, simulatedTransferSweep.isoCurrencyCode) &&
        Objects.equals(this.settled, simulatedTransferSweep.settled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fundingAccountId, created, amount, isoCurrencyCode, settled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimulatedTransferSweep {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fundingAccountId: ").append(toIndentedString(fundingAccountId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
    sb.append("    settled: ").append(toIndentedString(settled)).append("\n");
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

