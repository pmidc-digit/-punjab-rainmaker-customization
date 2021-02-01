/*
 * eGov Property Registry System.
 * APIs for Property Registry module. This provide APIs for create new property, update existing property, search existing property. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: contact@egovernments.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

/**
 * constructionDetail details can be created from different channels Eg. System (properties created by ULB officials), CFC Counter (From citizen faciliation counters) etc. Here we are defining some known channels, there can be more client to client.
 */
 
public enum Channel {
  SYSTEM("SYSTEM"),
  CFC_COUNTER("CFC_COUNTER"),
  CITIZEN("CITIZEN"),
  DATA_ENTRY("DATA_ENTRY"),
  MIGRATION("MIGRATION");

  private String value;

  Channel(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Channel fromValue(String text) {
    for (Channel b : Channel.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  
}
