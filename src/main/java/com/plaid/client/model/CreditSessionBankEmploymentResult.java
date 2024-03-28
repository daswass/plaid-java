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
import com.plaid.client.model.CreditSessionBankEmploymentStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The details of a bank employment verification in Link.
 */
@ApiModel(description = "The details of a bank employment verification in Link.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-28T21:00:55.745394Z[Etc/UTC]")
public class CreditSessionBankEmploymentResult {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private CreditSessionBankEmploymentStatus status;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_INSTITUTION_ID = "institution_id";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_ID)
  private String institutionId;


  public CreditSessionBankEmploymentResult status(CreditSessionBankEmploymentStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreditSessionBankEmploymentStatus getStatus() {
    return status;
  }


  public void setStatus(CreditSessionBankEmploymentStatus status) {
    this.status = status;
  }


  public CreditSessionBankEmploymentResult itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * The Plaid Item ID. The &#x60;item_id&#x60; is always unique; linking the same account at the same institution twice will result in two Items with different &#x60;item_id&#x60; values. Like all Plaid identifiers, the &#x60;item_id&#x60; is case-sensitive.
   * @return itemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Plaid Item ID. The `item_id` is always unique; linking the same account at the same institution twice will result in two Items with different `item_id` values. Like all Plaid identifiers, the `item_id` is case-sensitive.")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public CreditSessionBankEmploymentResult institutionId(String institutionId) {
    
    this.institutionId = institutionId;
    return this;
  }

   /**
   * The Plaid Institution ID associated with the Item.
   * @return institutionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Plaid Institution ID associated with the Item.")

  public String getInstitutionId() {
    return institutionId;
  }


  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditSessionBankEmploymentResult creditSessionBankEmploymentResult = (CreditSessionBankEmploymentResult) o;
    return Objects.equals(this.status, creditSessionBankEmploymentResult.status) &&
        Objects.equals(this.itemId, creditSessionBankEmploymentResult.itemId) &&
        Objects.equals(this.institutionId, creditSessionBankEmploymentResult.institutionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, itemId, institutionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditSessionBankEmploymentResult {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
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

