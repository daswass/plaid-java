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
import com.plaid.client.model.PaymentInitiationRecipientGetResponseAllOf;
import com.plaid.client.model.WalletTransaction;
import com.plaid.client.model.WalletTransactionAmount;
import com.plaid.client.model.WalletTransactionCounterparty;
import com.plaid.client.model.WalletTransactionStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * WalletTransactionGetResponse defines the response schema for &#x60;/wallet/transaction/get&#x60;
 */
@ApiModel(description = "WalletTransactionGetResponse defines the response schema for `/wallet/transaction/get`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-19T23:07:20.107473Z[Etc/UTC]")
public class WalletTransactionGetResponse {
  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transaction_id";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  /**
   * The type of the transaction. The supported transaction types that are returned are: &#x60;BANK_TRANSFER:&#x60; a transaction which credits an e-wallet through an external bank transfer.  &#x60;PAYOUT:&#x60; a transaction which debits an e-wallet by disbursing funds to a counterparty.  &#x60;PIS_PAY_IN:&#x60; a payment which credits an e-wallet through Plaid&#39;s Payment Initiation Services (PIS) APIs. For more information see the [Payment Initiation endpoints](https://plaid.com/docs/api/products/payment-initiation/).  &#x60;REFUND:&#x60; a transaction which debits an e-wallet by refunding a previously initated payment made through Plaid&#39;s [PIS APIs](https://plaid.com/docs/api/products/payment-initiation/).
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    BANK_TRANSFER("BANK_TRANSFER"),
    
    PAYOUT("PAYOUT"),
    
    PIS_PAY_IN("PIS_PAY_IN"),
    
    REFUND("REFUND");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private WalletTransactionAmount amount;

  public static final String SERIALIZED_NAME_COUNTERPARTY = "counterparty";
  @SerializedName(SERIALIZED_NAME_COUNTERPARTY)
  private WalletTransactionCounterparty counterparty;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private WalletTransactionStatus status;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public WalletTransactionGetResponse transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * A unique ID identifying the transaction
   * @return transactionId
  **/
  @ApiModelProperty(required = true, value = "A unique ID identifying the transaction")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public WalletTransactionGetResponse reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * A reference for the transaction
   * @return reference
  **/
  @ApiModelProperty(required = true, value = "A reference for the transaction")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public WalletTransactionGetResponse type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the transaction. The supported transaction types that are returned are: &#x60;BANK_TRANSFER:&#x60; a transaction which credits an e-wallet through an external bank transfer.  &#x60;PAYOUT:&#x60; a transaction which debits an e-wallet by disbursing funds to a counterparty.  &#x60;PIS_PAY_IN:&#x60; a payment which credits an e-wallet through Plaid&#39;s Payment Initiation Services (PIS) APIs. For more information see the [Payment Initiation endpoints](https://plaid.com/docs/api/products/payment-initiation/).  &#x60;REFUND:&#x60; a transaction which debits an e-wallet by refunding a previously initated payment made through Plaid&#39;s [PIS APIs](https://plaid.com/docs/api/products/payment-initiation/).
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of the transaction. The supported transaction types that are returned are: `BANK_TRANSFER:` a transaction which credits an e-wallet through an external bank transfer.  `PAYOUT:` a transaction which debits an e-wallet by disbursing funds to a counterparty.  `PIS_PAY_IN:` a payment which credits an e-wallet through Plaid's Payment Initiation Services (PIS) APIs. For more information see the [Payment Initiation endpoints](https://plaid.com/docs/api/products/payment-initiation/).  `REFUND:` a transaction which debits an e-wallet by refunding a previously initated payment made through Plaid's [PIS APIs](https://plaid.com/docs/api/products/payment-initiation/).")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public WalletTransactionGetResponse amount(WalletTransactionAmount amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")

  public WalletTransactionAmount getAmount() {
    return amount;
  }


  public void setAmount(WalletTransactionAmount amount) {
    this.amount = amount;
  }


  public WalletTransactionGetResponse counterparty(WalletTransactionCounterparty counterparty) {
    
    this.counterparty = counterparty;
    return this;
  }

   /**
   * Get counterparty
   * @return counterparty
  **/
  @ApiModelProperty(required = true, value = "")

  public WalletTransactionCounterparty getCounterparty() {
    return counterparty;
  }


  public void setCounterparty(WalletTransactionCounterparty counterparty) {
    this.counterparty = counterparty;
  }


  public WalletTransactionGetResponse status(WalletTransactionStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")

  public WalletTransactionStatus getStatus() {
    return status;
  }


  public void setStatus(WalletTransactionStatus status) {
    this.status = status;
  }


  public WalletTransactionGetResponse createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp when the transaction was created, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format.
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "Timestamp when the transaction was created, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public WalletTransactionGetResponse requestId(String requestId) {
    
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
    WalletTransactionGetResponse walletTransactionGetResponse = (WalletTransactionGetResponse) o;
    return Objects.equals(this.transactionId, walletTransactionGetResponse.transactionId) &&
        Objects.equals(this.reference, walletTransactionGetResponse.reference) &&
        Objects.equals(this.type, walletTransactionGetResponse.type) &&
        Objects.equals(this.amount, walletTransactionGetResponse.amount) &&
        Objects.equals(this.counterparty, walletTransactionGetResponse.counterparty) &&
        Objects.equals(this.status, walletTransactionGetResponse.status) &&
        Objects.equals(this.createdAt, walletTransactionGetResponse.createdAt) &&
        Objects.equals(this.requestId, walletTransactionGetResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, reference, type, amount, counterparty, status, createdAt, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletTransactionGetResponse {\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    counterparty: ").append(toIndentedString(counterparty)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

