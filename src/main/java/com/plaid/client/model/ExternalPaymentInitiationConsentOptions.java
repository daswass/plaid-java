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
import com.plaid.client.model.PaymentInitiationOptionalRestrictionBacs;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Additional payment consent options
 */
@ApiModel(description = "Additional payment consent options")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-15T19:49:08.269481Z[Etc/UTC]")
public class ExternalPaymentInitiationConsentOptions {
  public static final String SERIALIZED_NAME_REQUEST_REFUND_DETAILS = "request_refund_details";
  @SerializedName(SERIALIZED_NAME_REQUEST_REFUND_DETAILS)
  private Boolean requestRefundDetails;

  public static final String SERIALIZED_NAME_IBAN = "iban";
  @SerializedName(SERIALIZED_NAME_IBAN)
  private String iban;

  public static final String SERIALIZED_NAME_BACS = "bacs";
  @SerializedName(SERIALIZED_NAME_BACS)
  private PaymentInitiationOptionalRestrictionBacs bacs;


  public ExternalPaymentInitiationConsentOptions requestRefundDetails(Boolean requestRefundDetails) {
    
    this.requestRefundDetails = requestRefundDetails;
    return this;
  }

   /**
   * When &#x60;true&#x60;, Plaid will attempt to request refund details from the payee&#39;s financial institution.  Support varies between financial institutions and will not always be available.  If refund details could be retrieved, they will be available in the &#x60;/payment_initiation/payment/get&#x60; response.
   * @return requestRefundDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When `true`, Plaid will attempt to request refund details from the payee's financial institution.  Support varies between financial institutions and will not always be available.  If refund details could be retrieved, they will be available in the `/payment_initiation/payment/get` response.")

  public Boolean getRequestRefundDetails() {
    return requestRefundDetails;
  }


  public void setRequestRefundDetails(Boolean requestRefundDetails) {
    this.requestRefundDetails = requestRefundDetails;
  }


  public ExternalPaymentInitiationConsentOptions iban(String iban) {
    
    this.iban = iban;
    return this;
  }

   /**
   * The International Bank Account Number (IBAN) for the payer&#39;s account. Where possible, the end user will be able to set up payment consent using only the specified bank account if provided.
   * @return iban
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The International Bank Account Number (IBAN) for the payer's account. Where possible, the end user will be able to set up payment consent using only the specified bank account if provided.")

  public String getIban() {
    return iban;
  }


  public void setIban(String iban) {
    this.iban = iban;
  }


  public ExternalPaymentInitiationConsentOptions bacs(PaymentInitiationOptionalRestrictionBacs bacs) {
    
    this.bacs = bacs;
    return this;
  }

   /**
   * Get bacs
   * @return bacs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentInitiationOptionalRestrictionBacs getBacs() {
    return bacs;
  }


  public void setBacs(PaymentInitiationOptionalRestrictionBacs bacs) {
    this.bacs = bacs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalPaymentInitiationConsentOptions externalPaymentInitiationConsentOptions = (ExternalPaymentInitiationConsentOptions) o;
    return Objects.equals(this.requestRefundDetails, externalPaymentInitiationConsentOptions.requestRefundDetails) &&
        Objects.equals(this.iban, externalPaymentInitiationConsentOptions.iban) &&
        Objects.equals(this.bacs, externalPaymentInitiationConsentOptions.bacs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestRefundDetails, iban, bacs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalPaymentInitiationConsentOptions {\n");
    sb.append("    requestRefundDetails: ").append(toIndentedString(requestRefundDetails)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bacs: ").append(toIndentedString(bacs)).append("\n");
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

