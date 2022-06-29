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
import com.plaid.client.model.PayStubVerificationAttribute;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * An object containing details on the paystub&#39;s verification status. This object will only be populated if the [&#x60;income_verification.access_tokens&#x60;](/docs/api/tokens/#link-token-create-request-income-verification-access-tokens) parameter was provided during the &#x60;/link/token/create&#x60; call or if a problem was detected with the information supplied by the user; otherwise it will be &#x60;null&#x60;.
 */
@ApiModel(description = "An object containing details on the paystub's verification status. This object will only be populated if the [`income_verification.access_tokens`](/docs/api/tokens/#link-token-create-request-income-verification-access-tokens) parameter was provided during the `/link/token/create` call or if a problem was detected with the information supplied by the user; otherwise it will be `null`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-29T22:27:17.580916Z[Etc/UTC]")
public class CreditPayStubVerification {
  public static final String SERIALIZED_NAME_VERIFICATION_STATUS = "verification_status";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_STATUS)
  private String verificationStatus;

  public static final String SERIALIZED_NAME_VERIFICATION_ATTRIBUTES = "verification_attributes";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_ATTRIBUTES)
  private List<PayStubVerificationAttribute> verificationAttributes = new ArrayList<>();


  public CreditPayStubVerification verificationStatus(String verificationStatus) {
    
    this.verificationStatus = verificationStatus;
    return this;
  }

   /**
   * Derived verification status.
   * @return verificationStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Derived verification status.")

  public String getVerificationStatus() {
    return verificationStatus;
  }


  public void setVerificationStatus(String verificationStatus) {
    this.verificationStatus = verificationStatus;
  }


  public CreditPayStubVerification verificationAttributes(List<PayStubVerificationAttribute> verificationAttributes) {
    
    this.verificationAttributes = verificationAttributes;
    return this;
  }

  public CreditPayStubVerification addVerificationAttributesItem(PayStubVerificationAttribute verificationAttributesItem) {
    this.verificationAttributes.add(verificationAttributesItem);
    return this;
  }

   /**
   * Get verificationAttributes
   * @return verificationAttributes
  **/
  @ApiModelProperty(required = true, value = "")

  public List<PayStubVerificationAttribute> getVerificationAttributes() {
    return verificationAttributes;
  }


  public void setVerificationAttributes(List<PayStubVerificationAttribute> verificationAttributes) {
    this.verificationAttributes = verificationAttributes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditPayStubVerification creditPayStubVerification = (CreditPayStubVerification) o;
    return Objects.equals(this.verificationStatus, creditPayStubVerification.verificationStatus) &&
        Objects.equals(this.verificationAttributes, creditPayStubVerification.verificationAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verificationStatus, verificationAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditPayStubVerification {\n");
    sb.append("    verificationStatus: ").append(toIndentedString(verificationStatus)).append("\n");
    sb.append("    verificationAttributes: ").append(toIndentedString(verificationAttributes)).append("\n");
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

