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
import com.plaid.client.model.RiskCheckEmailDomainIsCustom;
import com.plaid.client.model.RiskCheckEmailDomainIsDisposable;
import com.plaid.client.model.RiskCheckEmailDomainIsFreeProvider;
import com.plaid.client.model.RiskCheckEmailIsDeliverableStatus;
import com.plaid.client.model.RiskCheckEmailTopLevelDomainIsSuspicious;
import com.plaid.client.model.RiskCheckLinkedService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Result summary object specifying values for &#x60;email&#x60; attributes of risk check.
 */
@ApiModel(description = "Result summary object specifying values for `email` attributes of risk check.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-28T17:05:32.818783Z[Etc/UTC]")
public class RiskCheckEmail {
  public static final String SERIALIZED_NAME_IS_DELIVERABLE = "is_deliverable";
  @SerializedName(SERIALIZED_NAME_IS_DELIVERABLE)
  private RiskCheckEmailIsDeliverableStatus isDeliverable;

  public static final String SERIALIZED_NAME_BREACH_COUNT = "breach_count";
  @SerializedName(SERIALIZED_NAME_BREACH_COUNT)
  private Integer breachCount;

  public static final String SERIALIZED_NAME_FIRST_BREACHED_AT = "first_breached_at";
  @SerializedName(SERIALIZED_NAME_FIRST_BREACHED_AT)
  private LocalDate firstBreachedAt;

  public static final String SERIALIZED_NAME_LAST_BREACHED_AT = "last_breached_at";
  @SerializedName(SERIALIZED_NAME_LAST_BREACHED_AT)
  private LocalDate lastBreachedAt;

  public static final String SERIALIZED_NAME_DOMAIN_REGISTERED_AT = "domain_registered_at";
  @SerializedName(SERIALIZED_NAME_DOMAIN_REGISTERED_AT)
  private LocalDate domainRegisteredAt;

  public static final String SERIALIZED_NAME_DOMAIN_IS_FREE_PROVIDER = "domain_is_free_provider";
  @SerializedName(SERIALIZED_NAME_DOMAIN_IS_FREE_PROVIDER)
  private RiskCheckEmailDomainIsFreeProvider domainIsFreeProvider;

  public static final String SERIALIZED_NAME_DOMAIN_IS_CUSTOM = "domain_is_custom";
  @SerializedName(SERIALIZED_NAME_DOMAIN_IS_CUSTOM)
  private RiskCheckEmailDomainIsCustom domainIsCustom;

  public static final String SERIALIZED_NAME_DOMAIN_IS_DISPOSABLE = "domain_is_disposable";
  @SerializedName(SERIALIZED_NAME_DOMAIN_IS_DISPOSABLE)
  private RiskCheckEmailDomainIsDisposable domainIsDisposable;

  public static final String SERIALIZED_NAME_TOP_LEVEL_DOMAIN_IS_SUSPICIOUS = "top_level_domain_is_suspicious";
  @SerializedName(SERIALIZED_NAME_TOP_LEVEL_DOMAIN_IS_SUSPICIOUS)
  private RiskCheckEmailTopLevelDomainIsSuspicious topLevelDomainIsSuspicious;

  public static final String SERIALIZED_NAME_LINKED_SERVICES = "linked_services";
  @SerializedName(SERIALIZED_NAME_LINKED_SERVICES)
  private Set<RiskCheckLinkedService> linkedServices = new LinkedHashSet<>();


  public RiskCheckEmail isDeliverable(RiskCheckEmailIsDeliverableStatus isDeliverable) {
    
    this.isDeliverable = isDeliverable;
    return this;
  }

   /**
   * Get isDeliverable
   * @return isDeliverable
  **/
  @ApiModelProperty(required = true, value = "")

  public RiskCheckEmailIsDeliverableStatus getIsDeliverable() {
    return isDeliverable;
  }


  public void setIsDeliverable(RiskCheckEmailIsDeliverableStatus isDeliverable) {
    this.isDeliverable = isDeliverable;
  }


  public RiskCheckEmail breachCount(Integer breachCount) {
    
    this.breachCount = breachCount;
    return this;
  }

   /**
   * Count of all known breaches of this email address if known.
   * @return breachCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", required = true, value = "Count of all known breaches of this email address if known.")

  public Integer getBreachCount() {
    return breachCount;
  }


  public void setBreachCount(Integer breachCount) {
    this.breachCount = breachCount;
  }


  public RiskCheckEmail firstBreachedAt(LocalDate firstBreachedAt) {
    
    this.firstBreachedAt = firstBreachedAt;
    return this;
  }

   /**
   * A date in the format YYYY-MM-DD (RFC 3339 Section 5.6).
   * @return firstBreachedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Tue May 29 00:00:00 UTC 1990", required = true, value = "A date in the format YYYY-MM-DD (RFC 3339 Section 5.6).")

  public LocalDate getFirstBreachedAt() {
    return firstBreachedAt;
  }


  public void setFirstBreachedAt(LocalDate firstBreachedAt) {
    this.firstBreachedAt = firstBreachedAt;
  }


  public RiskCheckEmail lastBreachedAt(LocalDate lastBreachedAt) {
    
    this.lastBreachedAt = lastBreachedAt;
    return this;
  }

   /**
   * A date in the format YYYY-MM-DD (RFC 3339 Section 5.6).
   * @return lastBreachedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Tue May 29 00:00:00 UTC 1990", required = true, value = "A date in the format YYYY-MM-DD (RFC 3339 Section 5.6).")

  public LocalDate getLastBreachedAt() {
    return lastBreachedAt;
  }


  public void setLastBreachedAt(LocalDate lastBreachedAt) {
    this.lastBreachedAt = lastBreachedAt;
  }


  public RiskCheckEmail domainRegisteredAt(LocalDate domainRegisteredAt) {
    
    this.domainRegisteredAt = domainRegisteredAt;
    return this;
  }

   /**
   * A date in the format YYYY-MM-DD (RFC 3339 Section 5.6).
   * @return domainRegisteredAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Tue May 29 00:00:00 UTC 1990", required = true, value = "A date in the format YYYY-MM-DD (RFC 3339 Section 5.6).")

  public LocalDate getDomainRegisteredAt() {
    return domainRegisteredAt;
  }


  public void setDomainRegisteredAt(LocalDate domainRegisteredAt) {
    this.domainRegisteredAt = domainRegisteredAt;
  }


  public RiskCheckEmail domainIsFreeProvider(RiskCheckEmailDomainIsFreeProvider domainIsFreeProvider) {
    
    this.domainIsFreeProvider = domainIsFreeProvider;
    return this;
  }

   /**
   * Get domainIsFreeProvider
   * @return domainIsFreeProvider
  **/
  @ApiModelProperty(required = true, value = "")

  public RiskCheckEmailDomainIsFreeProvider getDomainIsFreeProvider() {
    return domainIsFreeProvider;
  }


  public void setDomainIsFreeProvider(RiskCheckEmailDomainIsFreeProvider domainIsFreeProvider) {
    this.domainIsFreeProvider = domainIsFreeProvider;
  }


  public RiskCheckEmail domainIsCustom(RiskCheckEmailDomainIsCustom domainIsCustom) {
    
    this.domainIsCustom = domainIsCustom;
    return this;
  }

   /**
   * Get domainIsCustom
   * @return domainIsCustom
  **/
  @ApiModelProperty(required = true, value = "")

  public RiskCheckEmailDomainIsCustom getDomainIsCustom() {
    return domainIsCustom;
  }


  public void setDomainIsCustom(RiskCheckEmailDomainIsCustom domainIsCustom) {
    this.domainIsCustom = domainIsCustom;
  }


  public RiskCheckEmail domainIsDisposable(RiskCheckEmailDomainIsDisposable domainIsDisposable) {
    
    this.domainIsDisposable = domainIsDisposable;
    return this;
  }

   /**
   * Get domainIsDisposable
   * @return domainIsDisposable
  **/
  @ApiModelProperty(required = true, value = "")

  public RiskCheckEmailDomainIsDisposable getDomainIsDisposable() {
    return domainIsDisposable;
  }


  public void setDomainIsDisposable(RiskCheckEmailDomainIsDisposable domainIsDisposable) {
    this.domainIsDisposable = domainIsDisposable;
  }


  public RiskCheckEmail topLevelDomainIsSuspicious(RiskCheckEmailTopLevelDomainIsSuspicious topLevelDomainIsSuspicious) {
    
    this.topLevelDomainIsSuspicious = topLevelDomainIsSuspicious;
    return this;
  }

   /**
   * Get topLevelDomainIsSuspicious
   * @return topLevelDomainIsSuspicious
  **/
  @ApiModelProperty(required = true, value = "")

  public RiskCheckEmailTopLevelDomainIsSuspicious getTopLevelDomainIsSuspicious() {
    return topLevelDomainIsSuspicious;
  }


  public void setTopLevelDomainIsSuspicious(RiskCheckEmailTopLevelDomainIsSuspicious topLevelDomainIsSuspicious) {
    this.topLevelDomainIsSuspicious = topLevelDomainIsSuspicious;
  }


  public RiskCheckEmail linkedServices(Set<RiskCheckLinkedService> linkedServices) {
    
    this.linkedServices = linkedServices;
    return this;
  }

  public RiskCheckEmail addLinkedServicesItem(RiskCheckLinkedService linkedServicesItem) {
    this.linkedServices.add(linkedServicesItem);
    return this;
  }

   /**
   * A list of online services where this email address has been detected to have accounts or other activity.
   * @return linkedServices
  **/
  @ApiModelProperty(example = "[\"facebook\"]", required = true, value = "A list of online services where this email address has been detected to have accounts or other activity.")

  public Set<RiskCheckLinkedService> getLinkedServices() {
    return linkedServices;
  }


  public void setLinkedServices(Set<RiskCheckLinkedService> linkedServices) {
    this.linkedServices = linkedServices;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskCheckEmail riskCheckEmail = (RiskCheckEmail) o;
    return Objects.equals(this.isDeliverable, riskCheckEmail.isDeliverable) &&
        Objects.equals(this.breachCount, riskCheckEmail.breachCount) &&
        Objects.equals(this.firstBreachedAt, riskCheckEmail.firstBreachedAt) &&
        Objects.equals(this.lastBreachedAt, riskCheckEmail.lastBreachedAt) &&
        Objects.equals(this.domainRegisteredAt, riskCheckEmail.domainRegisteredAt) &&
        Objects.equals(this.domainIsFreeProvider, riskCheckEmail.domainIsFreeProvider) &&
        Objects.equals(this.domainIsCustom, riskCheckEmail.domainIsCustom) &&
        Objects.equals(this.domainIsDisposable, riskCheckEmail.domainIsDisposable) &&
        Objects.equals(this.topLevelDomainIsSuspicious, riskCheckEmail.topLevelDomainIsSuspicious) &&
        Objects.equals(this.linkedServices, riskCheckEmail.linkedServices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isDeliverable, breachCount, firstBreachedAt, lastBreachedAt, domainRegisteredAt, domainIsFreeProvider, domainIsCustom, domainIsDisposable, topLevelDomainIsSuspicious, linkedServices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskCheckEmail {\n");
    sb.append("    isDeliverable: ").append(toIndentedString(isDeliverable)).append("\n");
    sb.append("    breachCount: ").append(toIndentedString(breachCount)).append("\n");
    sb.append("    firstBreachedAt: ").append(toIndentedString(firstBreachedAt)).append("\n");
    sb.append("    lastBreachedAt: ").append(toIndentedString(lastBreachedAt)).append("\n");
    sb.append("    domainRegisteredAt: ").append(toIndentedString(domainRegisteredAt)).append("\n");
    sb.append("    domainIsFreeProvider: ").append(toIndentedString(domainIsFreeProvider)).append("\n");
    sb.append("    domainIsCustom: ").append(toIndentedString(domainIsCustom)).append("\n");
    sb.append("    domainIsDisposable: ").append(toIndentedString(domainIsDisposable)).append("\n");
    sb.append("    topLevelDomainIsSuspicious: ").append(toIndentedString(topLevelDomainIsSuspicious)).append("\n");
    sb.append("    linkedServices: ").append(toIndentedString(linkedServices)).append("\n");
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

