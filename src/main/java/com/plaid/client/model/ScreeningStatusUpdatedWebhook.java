/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.121.0
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
 * Fired when an individual screening status has changed, which can occur manually via the dashboard or during ongoing monitoring.
 */
@ApiModel(description = "Fired when an individual screening status has changed, which can occur manually via the dashboard or during ongoing monitoring.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-31T23:42:52.209921Z[Etc/UTC]")
public class ScreeningStatusUpdatedWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_SCREENING_ID = "screening_id";
  @SerializedName(SERIALIZED_NAME_SCREENING_ID)
  private Object screeningId = null;


  public ScreeningStatusUpdatedWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;SCREENING&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`SCREENING`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public ScreeningStatusUpdatedWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;STATUS_UPDATED&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`STATUS_UPDATED`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public ScreeningStatusUpdatedWebhook screeningId(Object screeningId) {
    
    this.screeningId = screeningId;
    return this;
  }

   /**
   * The ID of the associated screening.
   * @return screeningId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The ID of the associated screening.")

  public Object getScreeningId() {
    return screeningId;
  }


  public void setScreeningId(Object screeningId) {
    this.screeningId = screeningId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreeningStatusUpdatedWebhook screeningStatusUpdatedWebhook = (ScreeningStatusUpdatedWebhook) o;
    return Objects.equals(this.webhookType, screeningStatusUpdatedWebhook.webhookType) &&
        Objects.equals(this.webhookCode, screeningStatusUpdatedWebhook.webhookCode) &&
        Objects.equals(this.screeningId, screeningStatusUpdatedWebhook.screeningId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, screeningId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreeningStatusUpdatedWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    screeningId: ").append(toIndentedString(screeningId)).append("\n");
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

