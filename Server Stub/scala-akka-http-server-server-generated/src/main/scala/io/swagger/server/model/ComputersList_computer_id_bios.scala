package io.swagger.server.model


/**
 * @param ASSETTAG 
 * @param BDATE  for example: ''04/16/2021''
 * @param BMANUFACTURER  for example: ''Dell Inc.''
 * @param BVERSION  for example: ''2.5.1''
 * @param HARDWARE_ID  for example: ''16''
 * @param MMANUFACTURER  for example: ''Dell Inc.''
 * @param MMODEL  for example: ''045M96''
 * @param MSN 
 * @param SMANUFACTURER 
 * @param SMODEL  for example: ''PowerEdge R340''
 * @param SSN 
 * @param TYPE  for example: ''Rack Mount Chassis''
 */
case class ComputersList_computer_id_bios (
  ASSETTAG: Option[String],
  BDATE: Option[String],
  BMANUFACTURER: Option[String],
  BVERSION: Option[String],
  HARDWARE_ID: Option[Int],
  MMANUFACTURER: Option[String],
  MMODEL: Option[String],
  MSN: Option[String],
  SMANUFACTURER: Option[String],
  SMODEL: Option[String],
  SSN: Option[String],
  TYPE: Option[String]
)

