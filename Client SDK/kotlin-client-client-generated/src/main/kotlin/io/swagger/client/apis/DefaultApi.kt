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
package io.swagger.client.apis

import io.swagger.client.models.ComputerDetail
import io.swagger.client.models.ComputersList
import io.swagger.client.models.IpdiscoverList
import io.swagger.client.models.IpdiscoverNetdevices
import io.swagger.client.models.ListOfID
import io.swagger.client.models.SNMPDetail
import io.swagger.client.models.SNMPType
import io.swagger.client.models.SoftwaresList

import io.swagger.client.infrastructure.*

class DefaultApi(basePath: kotlin.String = "https://api.ocsinventory-ng.tld/ocsapi/v1") : ApiClient(basePath) {

    /**
     * Get a computer by its ID
     * 
     * @param id ID of the computer in OCS database 
     * @return ComputersList
     */
    @Suppress("UNCHECKED_CAST")
    fun computerIdGet(id: kotlin.Int): ComputersList {
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/computer/{id}".replace("{" + "id" + "}", "$id")
        )
        val response = request<ComputersList>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as ComputersList
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Get sections informations of a specific computer
     * 
     * @param id ID of the computer in OCS database 
     * @param sections Name of the requested section (i.e -&gt; bios, software, etc..) 
     * @param where Search on a specific column of the specific section. (optional)
     * @param &#x60;operator&#x60; Search operator (like, not like, &#x3D;, !&#x3D;, &lt;, &gt;, &lt;&#x3D;, &gt;&#x3D;). Mandatory if where parameter is set. (optional)
     * @return ComputerDetail
     */
    @Suppress("UNCHECKED_CAST")
    fun computerIdSectionsGet(id: kotlin.Int, sections: kotlin.String, where: kotlin.String? = null, &#x60;operator&#x60;: kotlin.String? = null): ComputerDetail {
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>().apply {
            if (where != null) {
                put("where", listOf(where.toString()))
            }
            if (`operator` != null) {
                put("operator", listOf(`operator`.toString()))
            }
        }
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/computer/{id}/{sections}".replace("{" + "id" + "}", "$id").replace("{" + "sections" + "}", "$sections"), query = localVariableQuery
        )
        val response = request<ComputerDetail>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as ComputerDetail
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Get a list of computers with its detail
     * 
     * @param start Start offset of the query (optional)
     * @param limit Limit offset of the query (optional)
     * @return kotlin.Array<ComputersList>
     */
    @Suppress("UNCHECKED_CAST")
    fun computersGet(start: kotlin.Int? = null, limit: kotlin.Int? = null): kotlin.Array<ComputersList> {
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>().apply {
            if (start != null) {
                put("start", listOf(start.toString()))
            }
            if (limit != null) {
                put("limit", listOf(limit.toString()))
            }
        }
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/computers", query = localVariableQuery
        )
        val response = request<kotlin.Array<ComputersList>>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<ComputersList>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Get a ID list of computers update during the provided timestamp
     * 
     * @param timestamp Timestamp of the number of days to count down from the current date. Optional. 
     * @return kotlin.Array<ListOfID>
     */
    @Suppress("UNCHECKED_CAST")
    fun computersLastupdateTimestampGet(timestamp: kotlin.Int): kotlin.Array<ListOfID> {
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/computers/lastupdate/{timestamp}".replace("{" + "timestamp" + "}", "$timestamp")
        )
        val response = request<kotlin.Array<ListOfID>>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<ListOfID>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Get a ID list of all computers in the OCS database
     * 
     * @param start Start offset of the query (optional)
     * @param limit Limit offset of the query (optional)
     * @return kotlin.Array<ListOfID>
     */
    @Suppress("UNCHECKED_CAST")
    fun computersListIDGet(start: kotlin.Int? = null, limit: kotlin.Int? = null): kotlin.Array<ListOfID> {
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>().apply {
            if (start != null) {
                put("start", listOf(start.toString()))
            }
            if (limit != null) {
                put("limit", listOf(limit.toString()))
            }
        }
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/computers/listID", query = localVariableQuery
        )
        val response = request<kotlin.Array<ListOfID>>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<ListOfID>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * List IPDiscover network list
     * 
     * @param start Start offset of the query (optional)
     * @param limit Limit offset of the query (optional)
     * @return IpdiscoverList
     */
    @Suppress("UNCHECKED_CAST")
    fun ipdiscoverGet(start: kotlin.Int? = null, limit: kotlin.Int? = null): IpdiscoverList {
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>().apply {
            if (start != null) {
                put("start", listOf(start.toString()))
            }
            if (limit != null) {
                put("limit", listOf(limit.toString()))
            }
        }
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/ipdiscover", query = localVariableQuery
        )
        val response = request<IpdiscoverList>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as IpdiscoverList
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Get list of network devices scanned on one network
     * 
     * @param netid Start offset of the query 
     * @return IpdiscoverNetdevices
     */
    @Suppress("UNCHECKED_CAST")
    fun ipdiscoverNetworkNetidGet(netid: kotlin.Int): IpdiscoverNetdevices {
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/ipdiscover/network/{netid}".replace("{" + "netid" + "}", "$netid")
        )
        val response = request<IpdiscoverNetdevices>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as IpdiscoverNetdevices
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Get snmp device list of a specific snmp type
     * 
     * @param snmpType Name of the snmp type you want to list 
     * @param start Start offset of the query (optional)
     * @param limit Limit offset of the query (optional)
     * @return SNMPDetail
     */
    @Suppress("UNCHECKED_CAST")
    fun snmpSnmpTypeGet(snmpType: kotlin.String, start: kotlin.Int? = null, limit: kotlin.Int? = null): SNMPDetail {
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>().apply {
            if (start != null) {
                put("start", listOf(start.toString()))
            }
            if (limit != null) {
                put("limit", listOf(limit.toString()))
            }
        }
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/snmp/{snmp_type}".replace("{" + "snmp_type" + "}", "$snmpType"), query = localVariableQuery
        )
        val response = request<SNMPDetail>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as SNMPDetail
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Get a device from a snmp type with its ID
     * 
     * @param snmpType Name of the snmp type you want to list 
     * @param id Identifiant en base de données de l&#x27;équipement 
     * @return SNMPDetail
     */
    @Suppress("UNCHECKED_CAST")
    fun snmpSnmpTypeIdGet(snmpType: kotlin.String, id: kotlin.Int): SNMPDetail {
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/snmp/{snmp_type}/{id}".replace("{" + "snmp_type" + "}", "$snmpType").replace("{" + "id" + "}", "$id")
        )
        val response = request<SNMPDetail>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as SNMPDetail
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Get a SNMP type list
     * 
     * @return SNMPType
     */
    @Suppress("UNCHECKED_CAST")
    fun snmpsTypeListGet(): SNMPType {
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/snmps/typeList"
        )
        val response = request<SNMPType>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as SNMPType
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Get software list from database
     * 
     * @param start Start offset of the query (optional)
     * @param limit Limit offset of the query (optional)
     * @param soft Name of the software you want to search (optional) (optional)
     * @return SoftwaresList
     */
    @Suppress("UNCHECKED_CAST")
    fun softwaresGet(start: kotlin.Int? = null, limit: kotlin.Int? = null, soft: kotlin.String? = null): SoftwaresList {
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>().apply {
            if (start != null) {
                put("start", listOf(start.toString()))
            }
            if (limit != null) {
                put("limit", listOf(limit.toString()))
            }
            if (soft != null) {
                put("soft", listOf(soft.toString()))
            }
        }
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/softwares", query = localVariableQuery
        )
        val response = request<SoftwaresList>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as SoftwaresList
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
}
