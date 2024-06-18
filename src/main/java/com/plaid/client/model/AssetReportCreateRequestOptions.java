/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.525.1
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
import com.plaid.client.model.AssetReportAddOns;
import com.plaid.client.model.AssetReportUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * An optional object to filter &#x60;/asset_report/create&#x60; results. If provided, must be non-&#x60;null&#x60;. The optional &#x60;user&#x60; object is required for the report to be eligible for Fannie Mae&#39;s Day 1 Certainty program.
 */
@ApiModel(description = "An optional object to filter `/asset_report/create` results. If provided, must be non-`null`. The optional `user` object is required for the report to be eligible for Fannie Mae's Day 1 Certainty program.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-18T18:48:06.627309Z[Etc/UTC]")
public class AssetReportCreateRequestOptions {
  public static final String SERIALIZED_NAME_CLIENT_REPORT_ID = "client_report_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_REPORT_ID)
  private String clientReportId;

  public static final String SERIALIZED_NAME_WEBHOOK = "webhook";
  @SerializedName(SERIALIZED_NAME_WEBHOOK)
  private String webhook;

  public static final String SERIALIZED_NAME_INCLUDE_FAST_REPORT = "include_fast_report";
  @SerializedName(SERIALIZED_NAME_INCLUDE_FAST_REPORT)
  private Boolean includeFastReport;

  public static final String SERIALIZED_NAME_PRODUCTS = "products";
  @SerializedName(SERIALIZED_NAME_PRODUCTS)
  private List<String> products = null;

  public static final String SERIALIZED_NAME_ADD_ONS = "add_ons";
  @SerializedName(SERIALIZED_NAME_ADD_ONS)
  private List<AssetReportAddOns> addOns = null;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private AssetReportUser user;


  public AssetReportCreateRequestOptions clientReportId(String clientReportId) {
    
    this.clientReportId = clientReportId;
    return this;
  }

   /**
   * Client-generated identifier, which can be used by lenders to track loan applications.
   * @return clientReportId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Client-generated identifier, which can be used by lenders to track loan applications.")

  public String getClientReportId() {
    return clientReportId;
  }


  public void setClientReportId(String clientReportId) {
    this.clientReportId = clientReportId;
  }


  public AssetReportCreateRequestOptions webhook(String webhook) {
    
    this.webhook = webhook;
    return this;
  }

   /**
   * URL to which Plaid will send Assets webhooks, for example when the requested Asset Report is ready.
   * @return webhook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL to which Plaid will send Assets webhooks, for example when the requested Asset Report is ready.")

  public String getWebhook() {
    return webhook;
  }


  public void setWebhook(String webhook) {
    this.webhook = webhook;
  }


  public AssetReportCreateRequestOptions includeFastReport(Boolean includeFastReport) {
    
    this.includeFastReport = includeFastReport;
    return this;
  }

   /**
   * true to return balance and identity earlier as a fast report. Defaults to false if omitted.
   * @return includeFastReport
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "true to return balance and identity earlier as a fast report. Defaults to false if omitted.")

  public Boolean getIncludeFastReport() {
    return includeFastReport;
  }


  public void setIncludeFastReport(Boolean includeFastReport) {
    this.includeFastReport = includeFastReport;
  }


  public AssetReportCreateRequestOptions products(List<String> products) {
    
    this.products = products;
    return this;
  }

  public AssetReportCreateRequestOptions addProductsItem(String productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<>();
    }
    this.products.add(productsItem);
    return this;
  }

   /**
   * Additional information that can be included in the asset report. Possible values: &#x60;\&quot;investments\&quot;&#x60;
   * @return products
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional information that can be included in the asset report. Possible values: `\"investments\"`")

  public List<String> getProducts() {
    return products;
  }


  public void setProducts(List<String> products) {
    this.products = products;
  }


  public AssetReportCreateRequestOptions addOns(List<AssetReportAddOns> addOns) {
    
    this.addOns = addOns;
    return this;
  }

  public AssetReportCreateRequestOptions addAddOnsItem(AssetReportAddOns addOnsItem) {
    if (this.addOns == null) {
      this.addOns = new ArrayList<>();
    }
    this.addOns.add(addOnsItem);
    return this;
  }

   /**
   * Use this field to request a &#x60;fast_asset&#x60; report. When Fast Assets is requested, Plaid will create two versions of the Asset Report: first, the Fast Asset Report, which will contain only current identity and balance information, and later, the Full Asset Report, which will also contain historical balance information and transaction data. A &#x60;PRODUCT_READY&#x60; webhook will be fired for each Asset Report when it is ready, and the &#x60;report_type&#x60; field will indicate whether the webhook is firing for the &#x60;full&#x60; or &#x60;fast&#x60; Asset Report. To retrieve the Fast Asset Report, call &#x60;/asset_report/get&#x60; with &#x60;fast_report&#x60; set to &#x60;true&#x60;. There is no additional charge for using Fast Assets.
   * @return addOns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Use this field to request a `fast_asset` report. When Fast Assets is requested, Plaid will create two versions of the Asset Report: first, the Fast Asset Report, which will contain only current identity and balance information, and later, the Full Asset Report, which will also contain historical balance information and transaction data. A `PRODUCT_READY` webhook will be fired for each Asset Report when it is ready, and the `report_type` field will indicate whether the webhook is firing for the `full` or `fast` Asset Report. To retrieve the Fast Asset Report, call `/asset_report/get` with `fast_report` set to `true`. There is no additional charge for using Fast Assets.")

  public List<AssetReportAddOns> getAddOns() {
    return addOns;
  }


  public void setAddOns(List<AssetReportAddOns> addOns) {
    this.addOns = addOns;
  }


  public AssetReportCreateRequestOptions user(AssetReportUser user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AssetReportUser getUser() {
    return user;
  }


  public void setUser(AssetReportUser user) {
    this.user = user;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetReportCreateRequestOptions assetReportCreateRequestOptions = (AssetReportCreateRequestOptions) o;
    return Objects.equals(this.clientReportId, assetReportCreateRequestOptions.clientReportId) &&
        Objects.equals(this.webhook, assetReportCreateRequestOptions.webhook) &&
        Objects.equals(this.includeFastReport, assetReportCreateRequestOptions.includeFastReport) &&
        Objects.equals(this.products, assetReportCreateRequestOptions.products) &&
        Objects.equals(this.addOns, assetReportCreateRequestOptions.addOns) &&
        Objects.equals(this.user, assetReportCreateRequestOptions.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientReportId, webhook, includeFastReport, products, addOns, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReportCreateRequestOptions {\n");
    sb.append("    clientReportId: ").append(toIndentedString(clientReportId)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
    sb.append("    includeFastReport: ").append(toIndentedString(includeFastReport)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    addOns: ").append(toIndentedString(addOns)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

