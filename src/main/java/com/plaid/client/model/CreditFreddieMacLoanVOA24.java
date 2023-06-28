/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.385.1
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
import com.plaid.client.model.CreditFreddieMacLoanIdentifiersVOA24;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Information specific to a mortgage loan agreement between one or more borrowers and a mortgage lender.
 */
@ApiModel(description = "Information specific to a mortgage loan agreement between one or more borrowers and a mortgage lender.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-28T17:05:32.818783Z[Etc/UTC]")
public class CreditFreddieMacLoanVOA24 {
  public static final String SERIALIZED_NAME_L_O_A_N_I_D_E_N_T_I_F_I_E_R_S = "LOAN_IDENTIFIERS";
  @SerializedName(SERIALIZED_NAME_L_O_A_N_I_D_E_N_T_I_F_I_E_R_S)
  private CreditFreddieMacLoanIdentifiersVOA24 LOAN_IDENTIFIERS;

  public static final String SERIALIZED_NAME_LOAN_ROLE_TYPE = "LoanRoleType";
  @SerializedName(SERIALIZED_NAME_LOAN_ROLE_TYPE)
  private String loanRoleType;


  public CreditFreddieMacLoanVOA24 LOAN_IDENTIFIERS(CreditFreddieMacLoanIdentifiersVOA24 LOAN_IDENTIFIERS) {
    
    this.LOAN_IDENTIFIERS = LOAN_IDENTIFIERS;
    return this;
  }

   /**
   * Get LOAN_IDENTIFIERS
   * @return LOAN_IDENTIFIERS
  **/
  @ApiModelProperty(required = true, value = "")

  public CreditFreddieMacLoanIdentifiersVOA24 getLOANIDENTIFIERS() {
    return LOAN_IDENTIFIERS;
  }


  public void setLOANIDENTIFIERS(CreditFreddieMacLoanIdentifiersVOA24 LOAN_IDENTIFIERS) {
    this.LOAN_IDENTIFIERS = LOAN_IDENTIFIERS;
  }


  public CreditFreddieMacLoanVOA24 loanRoleType(String loanRoleType) {
    
    this.loanRoleType = loanRoleType;
    return this;
  }

   /**
   * Type of loan. The value can only be \&quot;SubjectLoan\&quot;
   * @return loanRoleType
  **/
  @ApiModelProperty(required = true, value = "Type of loan. The value can only be \"SubjectLoan\"")

  public String getLoanRoleType() {
    return loanRoleType;
  }


  public void setLoanRoleType(String loanRoleType) {
    this.loanRoleType = loanRoleType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditFreddieMacLoanVOA24 creditFreddieMacLoanVOA24 = (CreditFreddieMacLoanVOA24) o;
    return Objects.equals(this.LOAN_IDENTIFIERS, creditFreddieMacLoanVOA24.LOAN_IDENTIFIERS) &&
        Objects.equals(this.loanRoleType, creditFreddieMacLoanVOA24.loanRoleType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(LOAN_IDENTIFIERS, loanRoleType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditFreddieMacLoanVOA24 {\n");
    sb.append("    LOAN_IDENTIFIERS: ").append(toIndentedString(LOAN_IDENTIFIERS)).append("\n");
    sb.append("    loanRoleType: ").append(toIndentedString(loanRoleType)).append("\n");
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

