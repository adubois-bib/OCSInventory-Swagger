package io.swagger.server.model


/**
 * @param ID  for example: ''13''
 * @param TABLE_TYPE_NAME  for example: ''snmp_default''
 * @param TYPE_NAME  for example: ''Default''
 */
case class SNMPType_inner (
  ID: Option[Int],
  TABLE_TYPE_NAME: Option[String],
  TYPE_NAME: Option[String]
)

