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
import com.plaid.client.model.PartnerEndCustomerFlowdownStatus;
import com.plaid.client.model.PartnerEndCustomerOAuthInstitution;
import com.plaid.client.model.PartnerEndCustomerQuestionnaireStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Response schema for &#x60;/partner/customer/oauth_institutions/get&#x60;.
 */
@ApiModel(description = "Response schema for `/partner/customer/oauth_institutions/get`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-15T19:49:08.269481Z[Etc/UTC]")
public class PartnerCustomerOAuthInstitutionsGetResponse {
  public static final String SERIALIZED_NAME_FLOWDOWN_STATUS = "flowdown_status";
  @SerializedName(SERIALIZED_NAME_FLOWDOWN_STATUS)
  private PartnerEndCustomerFlowdownStatus flowdownStatus;

  public static final String SERIALIZED_NAME_QUESTIONNAIRE_STATUS = "questionnaire_status";
  @SerializedName(SERIALIZED_NAME_QUESTIONNAIRE_STATUS)
  private PartnerEndCustomerQuestionnaireStatus questionnaireStatus;

  public static final String SERIALIZED_NAME_INSTITUTIONS = "institutions";
  @SerializedName(SERIALIZED_NAME_INSTITUTIONS)
  private List<PartnerEndCustomerOAuthInstitution> institutions = null;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public PartnerCustomerOAuthInstitutionsGetResponse flowdownStatus(PartnerEndCustomerFlowdownStatus flowdownStatus) {
    
    this.flowdownStatus = flowdownStatus;
    return this;
  }

   /**
   * Get flowdownStatus
   * @return flowdownStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PartnerEndCustomerFlowdownStatus getFlowdownStatus() {
    return flowdownStatus;
  }


  public void setFlowdownStatus(PartnerEndCustomerFlowdownStatus flowdownStatus) {
    this.flowdownStatus = flowdownStatus;
  }


  public PartnerCustomerOAuthInstitutionsGetResponse questionnaireStatus(PartnerEndCustomerQuestionnaireStatus questionnaireStatus) {
    
    this.questionnaireStatus = questionnaireStatus;
    return this;
  }

   /**
   * Get questionnaireStatus
   * @return questionnaireStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PartnerEndCustomerQuestionnaireStatus getQuestionnaireStatus() {
    return questionnaireStatus;
  }


  public void setQuestionnaireStatus(PartnerEndCustomerQuestionnaireStatus questionnaireStatus) {
    this.questionnaireStatus = questionnaireStatus;
  }


  public PartnerCustomerOAuthInstitutionsGetResponse institutions(List<PartnerEndCustomerOAuthInstitution> institutions) {
    
    this.institutions = institutions;
    return this;
  }

  public PartnerCustomerOAuthInstitutionsGetResponse addInstitutionsItem(PartnerEndCustomerOAuthInstitution institutionsItem) {
    if (this.institutions == null) {
      this.institutions = new ArrayList<>();
    }
    this.institutions.add(institutionsItem);
    return this;
  }

   /**
   * The OAuth institutions with which the end customer&#39;s application is being registered.
   * @return institutions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The OAuth institutions with which the end customer's application is being registered.")

  public List<PartnerEndCustomerOAuthInstitution> getInstitutions() {
    return institutions;
  }


  public void setInstitutions(List<PartnerEndCustomerOAuthInstitution> institutions) {
    this.institutions = institutions;
  }


  public PartnerCustomerOAuthInstitutionsGetResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.")

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
    PartnerCustomerOAuthInstitutionsGetResponse partnerCustomerOAuthInstitutionsGetResponse = (PartnerCustomerOAuthInstitutionsGetResponse) o;
    return Objects.equals(this.flowdownStatus, partnerCustomerOAuthInstitutionsGetResponse.flowdownStatus) &&
        Objects.equals(this.questionnaireStatus, partnerCustomerOAuthInstitutionsGetResponse.questionnaireStatus) &&
        Objects.equals(this.institutions, partnerCustomerOAuthInstitutionsGetResponse.institutions) &&
        Objects.equals(this.requestId, partnerCustomerOAuthInstitutionsGetResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowdownStatus, questionnaireStatus, institutions, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerCustomerOAuthInstitutionsGetResponse {\n");
    sb.append("    flowdownStatus: ").append(toIndentedString(flowdownStatus)).append("\n");
    sb.append("    questionnaireStatus: ").append(toIndentedString(questionnaireStatus)).append("\n");
    sb.append("    institutions: ").append(toIndentedString(institutions)).append("\n");
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

