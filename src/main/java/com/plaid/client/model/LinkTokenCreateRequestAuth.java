/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.345.1
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
 * Specifies options for initializing Link for use with the Auth product. This field can be used to enable or disable extended Auth flows for the resulting Link session. Omitting any field will result in a default that can be configured by your account manager.
 */
@ApiModel(description = "Specifies options for initializing Link for use with the Auth product. This field can be used to enable or disable extended Auth flows for the resulting Link session. Omitting any field will result in a default that can be configured by your account manager.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-17T21:11:54.856293Z[Etc/UTC]")
public class LinkTokenCreateRequestAuth {
  public static final String SERIALIZED_NAME_AUTH_TYPE_SELECT_ENABLED = "auth_type_select_enabled";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE_SELECT_ENABLED)
  private Boolean authTypeSelectEnabled = false;

  public static final String SERIALIZED_NAME_AUTOMATED_MICRODEPOSITS_ENABLED = "automated_microdeposits_enabled";
  @SerializedName(SERIALIZED_NAME_AUTOMATED_MICRODEPOSITS_ENABLED)
  private Boolean automatedMicrodepositsEnabled;

  public static final String SERIALIZED_NAME_INSTANT_MATCH_ENABLED = "instant_match_enabled";
  @SerializedName(SERIALIZED_NAME_INSTANT_MATCH_ENABLED)
  private Boolean instantMatchEnabled;

  public static final String SERIALIZED_NAME_SAME_DAY_MICRODEPOSITS_ENABLED = "same_day_microdeposits_enabled";
  @SerializedName(SERIALIZED_NAME_SAME_DAY_MICRODEPOSITS_ENABLED)
  private Boolean sameDayMicrodepositsEnabled;

  /**
   * This field has been deprecated in favor of &#x60;auth_type_select_enabled&#x60;.
   */
  @JsonAdapter(FlowTypeEnum.Adapter.class)
  public enum FlowTypeEnum {
    FLEXIBLE_AUTH("FLEXIBLE_AUTH");

    private String value;

    FlowTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FlowTypeEnum fromValue(String value) {
      for (FlowTypeEnum b : FlowTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FlowTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FlowTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FlowTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FlowTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FLOW_TYPE = "flow_type";
  @SerializedName(SERIALIZED_NAME_FLOW_TYPE)
  private FlowTypeEnum flowType;


  public LinkTokenCreateRequestAuth authTypeSelectEnabled(Boolean authTypeSelectEnabled) {
    
    this.authTypeSelectEnabled = authTypeSelectEnabled;
    return this;
  }

   /**
   * Specifies whether Auth Type Select is enabled for the Link session, allowing the end user to choose between linking instantly or manually prior to selecting their financial institution. Note that this can only be true if &#x60;same_day_microdeposits_enabled&#x60; is set to true.
   * @return authTypeSelectEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies whether Auth Type Select is enabled for the Link session, allowing the end user to choose between linking instantly or manually prior to selecting their financial institution. Note that this can only be true if `same_day_microdeposits_enabled` is set to true.")

  public Boolean getAuthTypeSelectEnabled() {
    return authTypeSelectEnabled;
  }


  public void setAuthTypeSelectEnabled(Boolean authTypeSelectEnabled) {
    this.authTypeSelectEnabled = authTypeSelectEnabled;
  }


  public LinkTokenCreateRequestAuth automatedMicrodepositsEnabled(Boolean automatedMicrodepositsEnabled) {
    
    this.automatedMicrodepositsEnabled = automatedMicrodepositsEnabled;
    return this;
  }

   /**
   * Specifies whether the Link session is enabled for the Automated Micro-deposits flow.
   * @return automatedMicrodepositsEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies whether the Link session is enabled for the Automated Micro-deposits flow.")

  public Boolean getAutomatedMicrodepositsEnabled() {
    return automatedMicrodepositsEnabled;
  }


  public void setAutomatedMicrodepositsEnabled(Boolean automatedMicrodepositsEnabled) {
    this.automatedMicrodepositsEnabled = automatedMicrodepositsEnabled;
  }


  public LinkTokenCreateRequestAuth instantMatchEnabled(Boolean instantMatchEnabled) {
    
    this.instantMatchEnabled = instantMatchEnabled;
    return this;
  }

   /**
   * Specifies whether the Link session is enabled for the Instant Match flow. As of November 2022, Instant Match will be enabled by default. Instant Match can be disabled by setting this field to &#x60;false&#x60;.
   * @return instantMatchEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies whether the Link session is enabled for the Instant Match flow. As of November 2022, Instant Match will be enabled by default. Instant Match can be disabled by setting this field to `false`.")

  public Boolean getInstantMatchEnabled() {
    return instantMatchEnabled;
  }


  public void setInstantMatchEnabled(Boolean instantMatchEnabled) {
    this.instantMatchEnabled = instantMatchEnabled;
  }


  public LinkTokenCreateRequestAuth sameDayMicrodepositsEnabled(Boolean sameDayMicrodepositsEnabled) {
    
    this.sameDayMicrodepositsEnabled = sameDayMicrodepositsEnabled;
    return this;
  }

   /**
   * Specifies whether the Link session is enabled for the Same Day Micro-deposits flow.
   * @return sameDayMicrodepositsEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies whether the Link session is enabled for the Same Day Micro-deposits flow.")

  public Boolean getSameDayMicrodepositsEnabled() {
    return sameDayMicrodepositsEnabled;
  }


  public void setSameDayMicrodepositsEnabled(Boolean sameDayMicrodepositsEnabled) {
    this.sameDayMicrodepositsEnabled = sameDayMicrodepositsEnabled;
  }


  public LinkTokenCreateRequestAuth flowType(FlowTypeEnum flowType) {
    
    this.flowType = flowType;
    return this;
  }

   /**
   * This field has been deprecated in favor of &#x60;auth_type_select_enabled&#x60;.
   * @return flowType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has been deprecated in favor of `auth_type_select_enabled`.")

  public FlowTypeEnum getFlowType() {
    return flowType;
  }


  public void setFlowType(FlowTypeEnum flowType) {
    this.flowType = flowType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkTokenCreateRequestAuth linkTokenCreateRequestAuth = (LinkTokenCreateRequestAuth) o;
    return Objects.equals(this.authTypeSelectEnabled, linkTokenCreateRequestAuth.authTypeSelectEnabled) &&
        Objects.equals(this.automatedMicrodepositsEnabled, linkTokenCreateRequestAuth.automatedMicrodepositsEnabled) &&
        Objects.equals(this.instantMatchEnabled, linkTokenCreateRequestAuth.instantMatchEnabled) &&
        Objects.equals(this.sameDayMicrodepositsEnabled, linkTokenCreateRequestAuth.sameDayMicrodepositsEnabled) &&
        Objects.equals(this.flowType, linkTokenCreateRequestAuth.flowType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authTypeSelectEnabled, automatedMicrodepositsEnabled, instantMatchEnabled, sameDayMicrodepositsEnabled, flowType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkTokenCreateRequestAuth {\n");
    sb.append("    authTypeSelectEnabled: ").append(toIndentedString(authTypeSelectEnabled)).append("\n");
    sb.append("    automatedMicrodepositsEnabled: ").append(toIndentedString(automatedMicrodepositsEnabled)).append("\n");
    sb.append("    instantMatchEnabled: ").append(toIndentedString(instantMatchEnabled)).append("\n");
    sb.append("    sameDayMicrodepositsEnabled: ").append(toIndentedString(sameDayMicrodepositsEnabled)).append("\n");
    sb.append("    flowType: ").append(toIndentedString(flowType)).append("\n");
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

