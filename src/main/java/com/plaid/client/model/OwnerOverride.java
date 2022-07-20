/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.146.0
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
import com.plaid.client.model.Address;
import com.plaid.client.model.Email;
import com.plaid.client.model.PhoneNumber;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Data about the owner or owners of an account. Any fields not specified will be filled in with default Sandbox information.
 */
@ApiModel(description = "Data about the owner or owners of an account. Any fields not specified will be filled in with default Sandbox information.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-19T23:07:20.107473Z[Etc/UTC]")
public class OwnerOverride {
  public static final String SERIALIZED_NAME_NAMES = "names";
  @SerializedName(SERIALIZED_NAME_NAMES)
  private List<String> names = new ArrayList<>();

  public static final String SERIALIZED_NAME_PHONE_NUMBERS = "phone_numbers";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBERS)
  private List<PhoneNumber> phoneNumbers = new ArrayList<>();

  public static final String SERIALIZED_NAME_EMAILS = "emails";
  @SerializedName(SERIALIZED_NAME_EMAILS)
  private List<Email> emails = new ArrayList<>();

  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<Address> addresses = new ArrayList<>();


  public OwnerOverride names(List<String> names) {
    
    this.names = names;
    return this;
  }

  public OwnerOverride addNamesItem(String namesItem) {
    this.names.add(namesItem);
    return this;
  }

   /**
   * A list of names associated with the account by the financial institution. These should always be the names of individuals, even for business accounts. Note that the same name data will be used for all accounts associated with an Item.
   * @return names
  **/
  @ApiModelProperty(required = true, value = "A list of names associated with the account by the financial institution. These should always be the names of individuals, even for business accounts. Note that the same name data will be used for all accounts associated with an Item.")

  public List<String> getNames() {
    return names;
  }


  public void setNames(List<String> names) {
    this.names = names;
  }


  public OwnerOverride phoneNumbers(List<PhoneNumber> phoneNumbers) {
    
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public OwnerOverride addPhoneNumbersItem(PhoneNumber phoneNumbersItem) {
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * A list of phone numbers associated with the account.
   * @return phoneNumbers
  **/
  @ApiModelProperty(required = true, value = "A list of phone numbers associated with the account.")

  public List<PhoneNumber> getPhoneNumbers() {
    return phoneNumbers;
  }


  public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }


  public OwnerOverride emails(List<Email> emails) {
    
    this.emails = emails;
    return this;
  }

  public OwnerOverride addEmailsItem(Email emailsItem) {
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * A list of email addresses associated with the account.
   * @return emails
  **/
  @ApiModelProperty(required = true, value = "A list of email addresses associated with the account.")

  public List<Email> getEmails() {
    return emails;
  }


  public void setEmails(List<Email> emails) {
    this.emails = emails;
  }


  public OwnerOverride addresses(List<Address> addresses) {
    
    this.addresses = addresses;
    return this;
  }

  public OwnerOverride addAddressesItem(Address addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Data about the various addresses associated with the account.
   * @return addresses
  **/
  @ApiModelProperty(required = true, value = "Data about the various addresses associated with the account.")

  public List<Address> getAddresses() {
    return addresses;
  }


  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OwnerOverride ownerOverride = (OwnerOverride) o;
    return Objects.equals(this.names, ownerOverride.names) &&
        Objects.equals(this.phoneNumbers, ownerOverride.phoneNumbers) &&
        Objects.equals(this.emails, ownerOverride.emails) &&
        Objects.equals(this.addresses, ownerOverride.addresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(names, phoneNumbers, emails, addresses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OwnerOverride {\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
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

