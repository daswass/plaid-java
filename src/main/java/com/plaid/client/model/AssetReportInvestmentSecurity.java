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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Investment security associated with the account.
 */
@ApiModel(description = "Investment security associated with the account.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-11T17:45:40.635640Z[Etc/UTC]")
public class AssetReportInvestmentSecurity {
  public static final String SERIALIZED_NAME_SECURITY_ID = "security_id";
  @SerializedName(SERIALIZED_NAME_SECURITY_ID)
  private String securityId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TICKER_SYMBOL = "ticker_symbol";
  @SerializedName(SERIALIZED_NAME_TICKER_SYMBOL)
  private String tickerSymbol;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public AssetReportInvestmentSecurity securityId(String securityId) {
    
    this.securityId = securityId;
    return this;
  }

   /**
   * A unique, Plaid-specific identifier for the security, used to associate securities with holdings. Like all Plaid identifiers, the &#x60;security_id&#x60; is case sensitive. The &#x60;security_id&#x60; may change if inherent details of the security change due to a corporate action, for example, in the event of a ticker symbol change or CUSIP change.
   * @return securityId
  **/
  @ApiModelProperty(required = true, value = "A unique, Plaid-specific identifier for the security, used to associate securities with holdings. Like all Plaid identifiers, the `security_id` is case sensitive. The `security_id` may change if inherent details of the security change due to a corporate action, for example, in the event of a ticker symbol change or CUSIP change.")

  public String getSecurityId() {
    return securityId;
  }


  public void setSecurityId(String securityId) {
    this.securityId = securityId;
  }


  public AssetReportInvestmentSecurity name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A descriptive name for the security, suitable for display.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A descriptive name for the security, suitable for display.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AssetReportInvestmentSecurity tickerSymbol(String tickerSymbol) {
    
    this.tickerSymbol = tickerSymbol;
    return this;
  }

   /**
   * The security’s trading symbol for publicly traded securities, and otherwise a short identifier if available.
   * @return tickerSymbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The security’s trading symbol for publicly traded securities, and otherwise a short identifier if available.")

  public String getTickerSymbol() {
    return tickerSymbol;
  }


  public void setTickerSymbol(String tickerSymbol) {
    this.tickerSymbol = tickerSymbol;
  }


  public AssetReportInvestmentSecurity type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The security type of the holding. Valid security types are:  &#x60;cash&#x60;: Cash, currency, and money market funds  &#x60;cryptocurrency&#x60;: Digital or virtual currencies  &#x60;derivative&#x60;: Options, warrants, and other derivative instruments  &#x60;equity&#x60;: Domestic and foreign equities  &#x60;etf&#x60;: Multi-asset exchange-traded investment funds  &#x60;fixed income&#x60;: Bonds and certificates of deposit (CDs)  &#x60;loan&#x60;: Loans and loan receivables  &#x60;mutual fund&#x60;: Open- and closed-end vehicles pooling funds of multiple investors  &#x60;other&#x60;: Unknown or other investment types
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The security type of the holding. Valid security types are:  `cash`: Cash, currency, and money market funds  `cryptocurrency`: Digital or virtual currencies  `derivative`: Options, warrants, and other derivative instruments  `equity`: Domestic and foreign equities  `etf`: Multi-asset exchange-traded investment funds  `fixed income`: Bonds and certificates of deposit (CDs)  `loan`: Loans and loan receivables  `mutual fund`: Open- and closed-end vehicles pooling funds of multiple investors  `other`: Unknown or other investment types")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetReportInvestmentSecurity assetReportInvestmentSecurity = (AssetReportInvestmentSecurity) o;
    return Objects.equals(this.securityId, assetReportInvestmentSecurity.securityId) &&
        Objects.equals(this.name, assetReportInvestmentSecurity.name) &&
        Objects.equals(this.tickerSymbol, assetReportInvestmentSecurity.tickerSymbol) &&
        Objects.equals(this.type, assetReportInvestmentSecurity.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securityId, name, tickerSymbol, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReportInvestmentSecurity {\n");
    sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tickerSymbol: ").append(toIndentedString(tickerSymbol)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

