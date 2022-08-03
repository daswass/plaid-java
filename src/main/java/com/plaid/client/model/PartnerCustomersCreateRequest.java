/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.161.5
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
import com.plaid.client.model.Products;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Request schema for &#x60;/partner/v1/customers/create&#x60;.
 */
@ApiModel(description = "Request schema for `/partner/v1/customers/create`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T20:38:07.102590Z[Etc/UTC]")
public class PartnerCustomersCreateRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "company_name";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName;

  public static final String SERIALIZED_NAME_IS_DILIGENCE_ATTESTED = "is_diligence_attested";
  @SerializedName(SERIALIZED_NAME_IS_DILIGENCE_ATTESTED)
  private Boolean isDiligenceAttested;

  public static final String SERIALIZED_NAME_PRODUCTS = "products";
  @SerializedName(SERIALIZED_NAME_PRODUCTS)
  private List<Products> products = new ArrayList<>();

  public static final String SERIALIZED_NAME_CREATE_LINK_CUSTOMIZATION = "create_link_customization";
  @SerializedName(SERIALIZED_NAME_CREATE_LINK_CUSTOMIZATION)
  private Boolean createLinkCustomization;


  public PartnerCustomersCreateRequest clientId(String clientId) {
    
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


  public PartnerCustomersCreateRequest secret(String secret) {
    
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


  public PartnerCustomersCreateRequest companyName(String companyName) {
    
    this.companyName = companyName;
    return this;
  }

   /**
   * The company name of the end customer being created.
   * @return companyName
  **/
  @ApiModelProperty(required = true, value = "The company name of the end customer being created.")

  public String getCompanyName() {
    return companyName;
  }


  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public PartnerCustomersCreateRequest isDiligenceAttested(Boolean isDiligenceAttested) {
    
    this.isDiligenceAttested = isDiligenceAttested;
    return this;
  }

   /**
   * Denotes whether or not the partner has completed attestation of diligence for the end customer to be created.
   * @return isDiligenceAttested
  **/
  @ApiModelProperty(required = true, value = "Denotes whether or not the partner has completed attestation of diligence for the end customer to be created.")

  public Boolean getIsDiligenceAttested() {
    return isDiligenceAttested;
  }


  public void setIsDiligenceAttested(Boolean isDiligenceAttested) {
    this.isDiligenceAttested = isDiligenceAttested;
  }


  public PartnerCustomersCreateRequest products(List<Products> products) {
    
    this.products = products;
    return this;
  }

  public PartnerCustomersCreateRequest addProductsItem(Products productsItem) {
    this.products.add(productsItem);
    return this;
  }

   /**
   * The products to be enabled on for the end customer.
   * @return products
  **/
  @ApiModelProperty(required = true, value = "The products to be enabled on for the end customer.")

  public List<Products> getProducts() {
    return products;
  }


  public void setProducts(List<Products> products) {
    this.products = products;
  }


  public PartnerCustomersCreateRequest createLinkCustomization(Boolean createLinkCustomization) {
    
    this.createLinkCustomization = createLinkCustomization;
    return this;
  }

   /**
   * If true, sets end customer&#39;s link customization to match partner&#39;s link customization.
   * @return createLinkCustomization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, sets end customer's link customization to match partner's link customization.")

  public Boolean getCreateLinkCustomization() {
    return createLinkCustomization;
  }


  public void setCreateLinkCustomization(Boolean createLinkCustomization) {
    this.createLinkCustomization = createLinkCustomization;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerCustomersCreateRequest partnerCustomersCreateRequest = (PartnerCustomersCreateRequest) o;
    return Objects.equals(this.clientId, partnerCustomersCreateRequest.clientId) &&
        Objects.equals(this.secret, partnerCustomersCreateRequest.secret) &&
        Objects.equals(this.companyName, partnerCustomersCreateRequest.companyName) &&
        Objects.equals(this.isDiligenceAttested, partnerCustomersCreateRequest.isDiligenceAttested) &&
        Objects.equals(this.products, partnerCustomersCreateRequest.products) &&
        Objects.equals(this.createLinkCustomization, partnerCustomersCreateRequest.createLinkCustomization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, companyName, isDiligenceAttested, products, createLinkCustomization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerCustomersCreateRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    isDiligenceAttested: ").append(toIndentedString(isDiligenceAttested)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    createLinkCustomization: ").append(toIndentedString(createLinkCustomization)).append("\n");
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
