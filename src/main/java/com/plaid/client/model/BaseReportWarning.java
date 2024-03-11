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
import com.plaid.client.model.BaseReportWarningCode;
import com.plaid.client.model.Cause;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * It is possible for an Base Report to be returned with missing account owner information. In such cases, the Base Report will contain warning data in the response, indicating why obtaining the owner information failed.
 */
@ApiModel(description = "It is possible for an Base Report to be returned with missing account owner information. In such cases, the Base Report will contain warning data in the response, indicating why obtaining the owner information failed.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-11T17:45:40.635640Z[Etc/UTC]")
public class BaseReportWarning {
  public static final String SERIALIZED_NAME_WARNING_TYPE = "warning_type";
  @SerializedName(SERIALIZED_NAME_WARNING_TYPE)
  private String warningType;

  public static final String SERIALIZED_NAME_WARNING_CODE = "warning_code";
  @SerializedName(SERIALIZED_NAME_WARNING_CODE)
  private BaseReportWarningCode warningCode;

  public static final String SERIALIZED_NAME_CAUSE = "cause";
  @SerializedName(SERIALIZED_NAME_CAUSE)
  private Cause cause;


  public BaseReportWarning warningType(String warningType) {
    
    this.warningType = warningType;
    return this;
  }

   /**
   * The warning type, which will always be &#x60;BASE_REPORT_WARNING&#x60;
   * @return warningType
  **/
  @ApiModelProperty(required = true, value = "The warning type, which will always be `BASE_REPORT_WARNING`")

  public String getWarningType() {
    return warningType;
  }


  public void setWarningType(String warningType) {
    this.warningType = warningType;
  }


  public BaseReportWarning warningCode(BaseReportWarningCode warningCode) {
    
    this.warningCode = warningCode;
    return this;
  }

   /**
   * Get warningCode
   * @return warningCode
  **/
  @ApiModelProperty(required = true, value = "")

  public BaseReportWarningCode getWarningCode() {
    return warningCode;
  }


  public void setWarningCode(BaseReportWarningCode warningCode) {
    this.warningCode = warningCode;
  }


  public BaseReportWarning cause(Cause cause) {
    
    this.cause = cause;
    return this;
  }

   /**
   * Get cause
   * @return cause
  **/
  @ApiModelProperty(required = true, value = "")

  public Cause getCause() {
    return cause;
  }


  public void setCause(Cause cause) {
    this.cause = cause;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseReportWarning baseReportWarning = (BaseReportWarning) o;
    return Objects.equals(this.warningType, baseReportWarning.warningType) &&
        Objects.equals(this.warningCode, baseReportWarning.warningCode) &&
        Objects.equals(this.cause, baseReportWarning.cause);
  }

  @Override
  public int hashCode() {
    return Objects.hash(warningType, warningCode, cause);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseReportWarning {\n");
    sb.append("    warningType: ").append(toIndentedString(warningType)).append("\n");
    sb.append("    warningCode: ").append(toIndentedString(warningCode)).append("\n");
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
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

