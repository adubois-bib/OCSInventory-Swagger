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
 * @param dATE 
 * @param hARDWAREID 
 * @param iP 
 * @param mAC 
 * @param mASK 
 * @param nAME 
 * @param nETID 
 * @param tAG 
 */
data class IpdiscoverNetdevicesInner (

    val dATE: java.time.LocalDateTime? = null,
    val hARDWAREID: kotlin.Int? = null,
    val iP: kotlin.String? = null,
    val mAC: kotlin.String? = null,
    val mASK: kotlin.String? = null,
    val nAME: kotlin.String? = null,
    val nETID: kotlin.String? = null,
    val tAG: kotlin.String? = null
) {
}