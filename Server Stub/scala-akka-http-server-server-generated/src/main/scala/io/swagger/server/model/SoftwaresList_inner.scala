package io.swagger.server.model


/**
 * @param NAME  for example: ''7-Zip 16.02''
 * @param PUBLISHER  for example: ''Igor Pavlov''
 * @param VERSION  for example: ''16.02''
 */
case class SoftwaresList_inner (
  NAME: Option[String],
  PUBLISHER: Option[String],
  VERSION: Option[String]
)

