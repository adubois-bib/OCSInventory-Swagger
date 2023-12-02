package io.swagger.server.model

import java.util.Date

/**
 * @param DefaultAddressIP  for example: ''127.0.0.1''
 * @param DefaultDescription  for example: ''This is a description''
 * @param DefaultGateway  for example: ''172.18.25.254''
 * @param DefaultLocation  for example: ''Here''
 * @param DefaultMacAddress 
 * @param DefaultName  for example: ''My Equipment''
 * @param DefaultUptime 
 * @param ID  for example: ''1''
 * @param LASTDATE  for example: ''2023-06-08T12:22:18Z''
 */
case class SNMPDetail_inner (
  DefaultAddressIP: Option[String],
  DefaultDescription: Option[String],
  DefaultGateway: Option[String],
  DefaultLocation: Option[String],
  DefaultMacAddress: Option[String],
  DefaultName: Option[String],
  DefaultUptime: Option[String],
  ID: Option[Int],
  LASTDATE: Option[Date]
)

