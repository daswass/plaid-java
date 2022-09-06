/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.164.8
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
import com.plaid.client.model.RoleDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ANo documentation available
 */
@ApiModel(description = "ANo documentation available")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-06T16:58:21.384791Z[Etc/UTC]")
public class Role {
  public static final String SERIALIZED_NAME_R_O_L_E_D_E_T_A_I_L = "ROLE_DETAIL";
  @SerializedName(SERIALIZED_NAME_R_O_L_E_D_E_T_A_I_L)
  private RoleDetail ROLE_DETAIL;


  public Role ROLE_DETAIL(RoleDetail ROLE_DETAIL) {
    
    this.ROLE_DETAIL = ROLE_DETAIL;
    return this;
  }

   /**
   * Get ROLE_DETAIL
   * @return ROLE_DETAIL
  **/
  @ApiModelProperty(required = true, value = "")

  public RoleDetail getROLEDETAIL() {
    return ROLE_DETAIL;
  }


  public void setROLEDETAIL(RoleDetail ROLE_DETAIL) {
    this.ROLE_DETAIL = ROLE_DETAIL;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Role role = (Role) o;
    return Objects.equals(this.ROLE_DETAIL, role.ROLE_DETAIL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ROLE_DETAIL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Role {\n");
    sb.append("    ROLE_DETAIL: ").append(toIndentedString(ROLE_DETAIL)).append("\n");
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
