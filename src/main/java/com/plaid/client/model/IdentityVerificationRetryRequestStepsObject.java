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
 * Instructions for the &#x60;custom&#x60; retry strategy specifying which steps should be required or skipped.   Note:   This field must be provided when the retry strategy is &#x60;custom&#x60; and must be omitted otherwise.  Custom retries override settings in your Plaid Template. For example, if your Plaid Template has &#x60;verify_sms&#x60; disabled, a custom retry with &#x60;verify_sms&#x60; enabled will still require the step.  The &#x60;selfie_check&#x60; step is currently not supported on the sandbox server. Sandbox requests will silently disable the &#x60;selfie_check&#x60; step when provided.
 */
@ApiModel(description = "Instructions for the `custom` retry strategy specifying which steps should be required or skipped.   Note:   This field must be provided when the retry strategy is `custom` and must be omitted otherwise.  Custom retries override settings in your Plaid Template. For example, if your Plaid Template has `verify_sms` disabled, a custom retry with `verify_sms` enabled will still require the step.  The `selfie_check` step is currently not supported on the sandbox server. Sandbox requests will silently disable the `selfie_check` step when provided.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-29T22:27:17.580916Z[Etc/UTC]")
public class IdentityVerificationRetryRequestStepsObject {
  public static final String SERIALIZED_NAME_VERIFY_SMS = "verify_sms";
  @SerializedName(SERIALIZED_NAME_VERIFY_SMS)
  private Boolean verifySms;

  public static final String SERIALIZED_NAME_KYC_CHECK = "kyc_check";
  @SerializedName(SERIALIZED_NAME_KYC_CHECK)
  private Boolean kycCheck;

  public static final String SERIALIZED_NAME_DOCUMENTARY_VERIFICATION = "documentary_verification";
  @SerializedName(SERIALIZED_NAME_DOCUMENTARY_VERIFICATION)
  private Boolean documentaryVerification;

  public static final String SERIALIZED_NAME_SELFIE_CHECK = "selfie_check";
  @SerializedName(SERIALIZED_NAME_SELFIE_CHECK)
  private Boolean selfieCheck;


  public IdentityVerificationRetryRequestStepsObject verifySms(Boolean verifySms) {
    
    this.verifySms = verifySms;
    return this;
  }

   /**
   * A boolean field specifying whether the new session should require or skip the &#x60;verify_sms&#x60; step.
   * @return verifySms
  **/
  @ApiModelProperty(required = true, value = "A boolean field specifying whether the new session should require or skip the `verify_sms` step.")

  public Boolean getVerifySms() {
    return verifySms;
  }


  public void setVerifySms(Boolean verifySms) {
    this.verifySms = verifySms;
  }


  public IdentityVerificationRetryRequestStepsObject kycCheck(Boolean kycCheck) {
    
    this.kycCheck = kycCheck;
    return this;
  }

   /**
   * A boolean field specifying whether the new session should require or skip the &#x60;kyc_check&#x60; step.
   * @return kycCheck
  **/
  @ApiModelProperty(required = true, value = "A boolean field specifying whether the new session should require or skip the `kyc_check` step.")

  public Boolean getKycCheck() {
    return kycCheck;
  }


  public void setKycCheck(Boolean kycCheck) {
    this.kycCheck = kycCheck;
  }


  public IdentityVerificationRetryRequestStepsObject documentaryVerification(Boolean documentaryVerification) {
    
    this.documentaryVerification = documentaryVerification;
    return this;
  }

   /**
   * A boolean field specifying whether the new session should require or skip the &#x60;documentary_verification&#x60; step.
   * @return documentaryVerification
  **/
  @ApiModelProperty(required = true, value = "A boolean field specifying whether the new session should require or skip the `documentary_verification` step.")

  public Boolean getDocumentaryVerification() {
    return documentaryVerification;
  }


  public void setDocumentaryVerification(Boolean documentaryVerification) {
    this.documentaryVerification = documentaryVerification;
  }


  public IdentityVerificationRetryRequestStepsObject selfieCheck(Boolean selfieCheck) {
    
    this.selfieCheck = selfieCheck;
    return this;
  }

   /**
   * A boolean field specifying whether the new session should require or skip the &#x60;selfie_check&#x60; step.
   * @return selfieCheck
  **/
  @ApiModelProperty(required = true, value = "A boolean field specifying whether the new session should require or skip the `selfie_check` step.")

  public Boolean getSelfieCheck() {
    return selfieCheck;
  }


  public void setSelfieCheck(Boolean selfieCheck) {
    this.selfieCheck = selfieCheck;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityVerificationRetryRequestStepsObject identityVerificationRetryRequestStepsObject = (IdentityVerificationRetryRequestStepsObject) o;
    return Objects.equals(this.verifySms, identityVerificationRetryRequestStepsObject.verifySms) &&
        Objects.equals(this.kycCheck, identityVerificationRetryRequestStepsObject.kycCheck) &&
        Objects.equals(this.documentaryVerification, identityVerificationRetryRequestStepsObject.documentaryVerification) &&
        Objects.equals(this.selfieCheck, identityVerificationRetryRequestStepsObject.selfieCheck);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verifySms, kycCheck, documentaryVerification, selfieCheck);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityVerificationRetryRequestStepsObject {\n");
    sb.append("    verifySms: ").append(toIndentedString(verifySms)).append("\n");
    sb.append("    kycCheck: ").append(toIndentedString(kycCheck)).append("\n");
    sb.append("    documentaryVerification: ").append(toIndentedString(documentaryVerification)).append("\n");
    sb.append("    selfieCheck: ").append(toIndentedString(selfieCheck)).append("\n");
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

