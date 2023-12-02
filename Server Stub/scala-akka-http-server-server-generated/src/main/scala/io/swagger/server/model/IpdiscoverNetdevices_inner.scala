package io.swagger.server.model

import java.util.Date

/**
 * @param DATE  for example: ''2023-06-08T12:15:08Z''
 * @param HARDWARE_ID  for example: ''16''
 * @param IP  for example: ''172.18.25.254''
 * @param MAC  for example: ''00:0d:b9:51:fc:aa''
 * @param MASK  for example: ''255.255.255.0''
 * @param NAME  for example: ''-''
 * @param NETID  for example: ''172.18.25.0''
 * @param TAG  for example: ''DEV-MACHINE''
 */
case class IpdiscoverNetdevices_inner (
  DATE: Option[Date],
  HARDWARE_ID: Option[Int],
  IP: Option[String],
  MAC: Option[String],
  MASK: Option[String],
  NAME: Option[String],
  NETID: Option[String],
  TAG: Option[String]
)

