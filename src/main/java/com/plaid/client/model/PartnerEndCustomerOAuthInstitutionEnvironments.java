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
import com.plaid.client.model.PartnerEndCustomerOAuthInstitutionApplicationStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Registration statuses by environment.
 */
@ApiModel(description = "Registration statuses by environment.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-11T17:45:40.635640Z[Etc/UTC]")
public class PartnerEndCustomerOAuthInstitutionEnvironments {
  public static final String SERIALIZED_NAME_DEVELOPMENT = "development";
  @SerializedName(SERIALIZED_NAME_DEVELOPMENT)
  private PartnerEndCustomerOAuthInstitutionApplicationStatus development;

  public static final String SERIALIZED_NAME_PRODUCTION = "production";
  @SerializedName(SERIALIZED_NAME_PRODUCTION)
  private PartnerEndCustomerOAuthInstitutionApplicationStatus production;


  public PartnerEndCustomerOAuthInstitutionEnvironments development(PartnerEndCustomerOAuthInstitutionApplicationStatus development) {
    
    this.development = development;
    return this;
  }

   /**
   * Get development
   * @return development
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PartnerEndCustomerOAuthInstitutionApplicationStatus getDevelopment() {
    return development;
  }


  public void setDevelopment(PartnerEndCustomerOAuthInstitutionApplicationStatus development) {
    this.development = development;
  }


  public PartnerEndCustomerOAuthInstitutionEnvironments production(PartnerEndCustomerOAuthInstitutionApplicationStatus production) {
    
    this.production = production;
    return this;
  }

   /**
   * Get production
   * @return production
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PartnerEndCustomerOAuthInstitutionApplicationStatus getProduction() {
    return production;
  }


  public void setProduction(PartnerEndCustomerOAuthInstitutionApplicationStatus production) {
    this.production = production;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerEndCustomerOAuthInstitutionEnvironments partnerEndCustomerOAuthInstitutionEnvironments = (PartnerEndCustomerOAuthInstitutionEnvironments) o;
    return Objects.equals(this.development, partnerEndCustomerOAuthInstitutionEnvironments.development) &&
        Objects.equals(this.production, partnerEndCustomerOAuthInstitutionEnvironments.production);
  }

  @Override
  public int hashCode() {
    return Objects.hash(development, production);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerEndCustomerOAuthInstitutionEnvironments {\n");
    sb.append("    development: ").append(toIndentedString(development)).append("\n");
    sb.append("    production: ").append(toIndentedString(production)).append("\n");
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

