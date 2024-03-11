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
import com.plaid.client.model.PaymentAmount;
import com.plaid.client.model.PaymentInitiationConsentScope;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PaymentInitiationConsentPaymentExecuteRequest defines the request schema for &#x60;/payment_initiation/consent/payment/execute&#x60;
 */
@ApiModel(description = "PaymentInitiationConsentPaymentExecuteRequest defines the request schema for `/payment_initiation/consent/payment/execute`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-11T17:45:40.635640Z[Etc/UTC]")
public class PaymentInitiationConsentPaymentExecuteRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_CONSENT_ID = "consent_id";
  @SerializedName(SERIALIZED_NAME_CONSENT_ID)
  private String consentId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private PaymentAmount amount;

  public static final String SERIALIZED_NAME_IDEMPOTENCY_KEY = "idempotency_key";
  @SerializedName(SERIALIZED_NAME_IDEMPOTENCY_KEY)
  private String idempotencyKey;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private PaymentInitiationConsentScope scope;


  public PaymentInitiationConsentPaymentExecuteRequest clientId(String clientId) {
    
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


  public PaymentInitiationConsentPaymentExecuteRequest secret(String secret) {
    
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


  public PaymentInitiationConsentPaymentExecuteRequest consentId(String consentId) {
    
    this.consentId = consentId;
    return this;
  }

   /**
   * The consent ID.
   * @return consentId
  **/
  @ApiModelProperty(required = true, value = "The consent ID.")

  public String getConsentId() {
    return consentId;
  }


  public void setConsentId(String consentId) {
    this.consentId = consentId;
  }


  public PaymentInitiationConsentPaymentExecuteRequest amount(PaymentAmount amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")

  public PaymentAmount getAmount() {
    return amount;
  }


  public void setAmount(PaymentAmount amount) {
    this.amount = amount;
  }


  public PaymentInitiationConsentPaymentExecuteRequest idempotencyKey(String idempotencyKey) {
    
    this.idempotencyKey = idempotencyKey;
    return this;
  }

   /**
   * A random key provided by the client, per unique consent payment. Maximum of 128 characters.  The API supports idempotency for safely retrying requests without accidentally performing the same operation twice. If a request to execute a consent payment fails due to a network connection error, you can retry the request with the same idempotency key to guarantee that only a single payment is created. If the request was successfully processed, it will prevent any payment that uses the same idempotency key, and was received within 24 hours of the first request, from being processed.
   * @return idempotencyKey
  **/
  @ApiModelProperty(required = true, value = "A random key provided by the client, per unique consent payment. Maximum of 128 characters.  The API supports idempotency for safely retrying requests without accidentally performing the same operation twice. If a request to execute a consent payment fails due to a network connection error, you can retry the request with the same idempotency key to guarantee that only a single payment is created. If the request was successfully processed, it will prevent any payment that uses the same idempotency key, and was received within 24 hours of the first request, from being processed.")

  public String getIdempotencyKey() {
    return idempotencyKey;
  }


  public void setIdempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
  }


  public PaymentInitiationConsentPaymentExecuteRequest reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * A reference for the payment. This must be an alphanumeric string with at most 18 characters and must not contain any special characters (since not all institutions support them). If not provided, Plaid will automatically fall back to the reference from consent. In order to track settlement via Payment Confirmation, each payment must have a unique reference. If the reference provided through the API is not unique, Plaid will adjust it. Some institutions may limit the reference to less than 18 characters. If necessary, Plaid will adjust the reference by truncating it to fit the institution&#39;s requirements. Both the originally provided and automatically adjusted references (if any) can be found in the &#x60;reference&#x60; and &#x60;adjusted_reference&#x60; fields, respectively.
   * @return reference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A reference for the payment. This must be an alphanumeric string with at most 18 characters and must not contain any special characters (since not all institutions support them). If not provided, Plaid will automatically fall back to the reference from consent. In order to track settlement via Payment Confirmation, each payment must have a unique reference. If the reference provided through the API is not unique, Plaid will adjust it. Some institutions may limit the reference to less than 18 characters. If necessary, Plaid will adjust the reference by truncating it to fit the institution's requirements. Both the originally provided and automatically adjusted references (if any) can be found in the `reference` and `adjusted_reference` fields, respectively.")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public PaymentInitiationConsentPaymentExecuteRequest scope(PaymentInitiationConsentScope scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentInitiationConsentScope getScope() {
    return scope;
  }


  public void setScope(PaymentInitiationConsentScope scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInitiationConsentPaymentExecuteRequest paymentInitiationConsentPaymentExecuteRequest = (PaymentInitiationConsentPaymentExecuteRequest) o;
    return Objects.equals(this.clientId, paymentInitiationConsentPaymentExecuteRequest.clientId) &&
        Objects.equals(this.secret, paymentInitiationConsentPaymentExecuteRequest.secret) &&
        Objects.equals(this.consentId, paymentInitiationConsentPaymentExecuteRequest.consentId) &&
        Objects.equals(this.amount, paymentInitiationConsentPaymentExecuteRequest.amount) &&
        Objects.equals(this.idempotencyKey, paymentInitiationConsentPaymentExecuteRequest.idempotencyKey) &&
        Objects.equals(this.reference, paymentInitiationConsentPaymentExecuteRequest.reference) &&
        Objects.equals(this.scope, paymentInitiationConsentPaymentExecuteRequest.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, consentId, amount, idempotencyKey, reference, scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInitiationConsentPaymentExecuteRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

