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
package io.swagger.client.models


/**
 * 
 * @param defaultAddressIP 
 * @param defaultDescription 
 * @param defaultGateway 
 * @param defaultLocation 
 * @param defaultMacAddress 
 * @param defaultName 
 * @param defaultUptime 
 * @param iD 
 * @param lASTDATE 
 */
data class SNMPDetailInner (

    val defaultAddressIP: kotlin.String? = null,
    val defaultDescription: kotlin.String? = null,
    val defaultGateway: kotlin.String? = null,
    val defaultLocation: kotlin.String? = null,
    val defaultMacAddress: kotlin.String? = null,
    val defaultName: kotlin.String? = null,
    val defaultUptime: kotlin.String? = null,
    val iD: kotlin.Int? = null,
    val lASTDATE: java.time.LocalDateTime? = null
) {
}