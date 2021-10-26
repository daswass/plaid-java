/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.40.3
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
 * IncomeVerificationPrecheckMilitaryInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-26T21:49:31.513Z[GMT]")
public class IncomeVerificationPrecheckMilitaryInfo {
  public static final String SERIALIZED_NAME_IS_ACTIVE_DUTY = "is_active_duty";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE_DUTY)
  private Boolean isActiveDuty;

  /**
   * If the user is currently serving in the US military, the branch of the military they are serving in
   */
  @JsonAdapter(BranchEnum.Adapter.class)
  public enum BranchEnum {
    AIR_FORCE("AIR FORCE"),
    
    ARMY("ARMY"),
    
    COAST_GUARD("COAST GUARD"),
    
    MARINES("MARINES"),
    
    NAVY("NAVY");

    private String value;

    BranchEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BranchEnum fromValue(String value) {
      for (BranchEnum b : BranchEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<BranchEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BranchEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BranchEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BranchEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BRANCH = "branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  private BranchEnum branch;


  public IncomeVerificationPrecheckMilitaryInfo isActiveDuty(Boolean isActiveDuty) {
    
    this.isActiveDuty = isActiveDuty;
    return this;
  }

   /**
   * Is the user currently active duty in the US military
   * @return isActiveDuty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Is the user currently active duty in the US military")

  public Boolean getIsActiveDuty() {
    return isActiveDuty;
  }


  public void setIsActiveDuty(Boolean isActiveDuty) {
    this.isActiveDuty = isActiveDuty;
  }


  public IncomeVerificationPrecheckMilitaryInfo branch(BranchEnum branch) {
    
    this.branch = branch;
    return this;
  }

   /**
   * If the user is currently serving in the US military, the branch of the military they are serving in
   * @return branch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the user is currently serving in the US military, the branch of the military they are serving in")

  public BranchEnum getBranch() {
    return branch;
  }


  public void setBranch(BranchEnum branch) {
    this.branch = branch;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeVerificationPrecheckMilitaryInfo incomeVerificationPrecheckMilitaryInfo = (IncomeVerificationPrecheckMilitaryInfo) o;
    return Objects.equals(this.isActiveDuty, incomeVerificationPrecheckMilitaryInfo.isActiveDuty) &&
        Objects.equals(this.branch, incomeVerificationPrecheckMilitaryInfo.branch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isActiveDuty, branch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeVerificationPrecheckMilitaryInfo {\n");
    sb.append("    isActiveDuty: ").append(toIndentedString(isActiveDuty)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
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

