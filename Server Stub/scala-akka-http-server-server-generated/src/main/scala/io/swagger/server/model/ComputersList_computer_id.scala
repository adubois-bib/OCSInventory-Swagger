package io.swagger.server.model


/**
 * @param accountinfo 
 * @param batteries 
 * @param bios 
 */
case class ComputersList_computer_id (
  accountinfo: Option[List[computersList_computer_id_accountinfo]],
  batteries: Option[List[String]],
  bios: Option[List[computersList_computer_id_bios]]
)

