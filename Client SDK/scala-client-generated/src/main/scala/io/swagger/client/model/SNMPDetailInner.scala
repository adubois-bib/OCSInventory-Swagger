/**
 * OCS Inventory Rest API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.model

import java.util.Date

/**
 * @param defaultAddressIP  for example: '''127.0.0.1'''
 * @param defaultDescription  for example: '''This is a description'''
 * @param defaultGateway  for example: '''172.18.25.254'''
 * @param defaultLocation  for example: '''Here'''
 * @param defaultMacAddress 
 * @param defaultName  for example: '''My Equipment'''
 * @param defaultUptime 
 * @param ID  for example: '''1'''
 * @param LASTDATE  for example: '''2023-06-08T12:22:18Z'''
 */
case class SNMPDetailInner (
  defaultAddressIP: Option[String] = None,
  defaultDescription: Option[String] = None,
  defaultGateway: Option[String] = None,
  defaultLocation: Option[String] = None,
  defaultMacAddress: Option[String] = None,
  defaultName: Option[String] = None,
  defaultUptime: Option[String] = None,
  ID: Option[Integer] = None,
  LASTDATE: Option[Date] = None
)
