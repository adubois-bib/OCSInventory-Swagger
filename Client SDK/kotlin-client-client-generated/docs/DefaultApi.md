# DefaultApi

All URIs are relative to *https://api.ocsinventory-ng.tld/ocsapi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**computerIdGet**](DefaultApi.md#computerIdGet) | **GET** /computer/{id} | Get a computer by its ID
[**computerIdSectionsGet**](DefaultApi.md#computerIdSectionsGet) | **GET** /computer/{id}/{sections} | Get sections informations of a specific computer
[**computersGet**](DefaultApi.md#computersGet) | **GET** /computers | Get a list of computers with its detail
[**computersLastupdateTimestampGet**](DefaultApi.md#computersLastupdateTimestampGet) | **GET** /computers/lastupdate/{timestamp} | Get a ID list of computers update during the provided timestamp
[**computersListIDGet**](DefaultApi.md#computersListIDGet) | **GET** /computers/listID | Get a ID list of all computers in the OCS database
[**ipdiscoverGet**](DefaultApi.md#ipdiscoverGet) | **GET** /ipdiscover | List IPDiscover network list
[**ipdiscoverNetworkNetidGet**](DefaultApi.md#ipdiscoverNetworkNetidGet) | **GET** /ipdiscover/network/{netid} | Get list of network devices scanned on one network
[**snmpSnmpTypeGet**](DefaultApi.md#snmpSnmpTypeGet) | **GET** /snmp/{snmp_type} | Get snmp device list of a specific snmp type
[**snmpSnmpTypeIdGet**](DefaultApi.md#snmpSnmpTypeIdGet) | **GET** /snmp/{snmp_type}/{id} | Get a device from a snmp type with its ID
[**snmpsTypeListGet**](DefaultApi.md#snmpsTypeListGet) | **GET** /snmps/typeList | Get a SNMP type list
[**softwaresGet**](DefaultApi.md#softwaresGet) | **GET** /softwares | Get software list from database

<a name="computerIdGet"></a>
# **computerIdGet**
> ComputersList computerIdGet(id)

Get a computer by its ID

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val id : kotlin.Int = 56 // kotlin.Int | ID of the computer in OCS database
try {
    val result : ComputersList = apiInstance.computerIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#computerIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#computerIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| ID of the computer in OCS database |

### Return type

[**ComputersList**](ComputersList.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="computerIdSectionsGet"></a>
# **computerIdSectionsGet**
> ComputerDetail computerIdSectionsGet(id, sections, where, `operator`)

Get sections informations of a specific computer

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val id : kotlin.Int = 56 // kotlin.Int | ID of the computer in OCS database
val sections : kotlin.String = sections_example // kotlin.String | Name of the requested section (i.e -> bios, software, etc..)
val where : kotlin.String = where_example // kotlin.String | Search on a specific column of the specific section.
val `operator` : kotlin.String = `operator`_example // kotlin.String | Search operator (like, not like, =, !=, <, >, <=, >=). Mandatory if where parameter is set.
try {
    val result : ComputerDetail = apiInstance.computerIdSectionsGet(id, sections, where, `operator`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#computerIdSectionsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#computerIdSectionsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| ID of the computer in OCS database |
 **sections** | **kotlin.String**| Name of the requested section (i.e -&gt; bios, software, etc..) |
 **where** | **kotlin.String**| Search on a specific column of the specific section. | [optional]
 **&#x60;operator&#x60;** | **kotlin.String**| Search operator (like, not like, &#x3D;, !&#x3D;, &lt;, &gt;, &lt;&#x3D;, &gt;&#x3D;). Mandatory if where parameter is set. | [optional]

### Return type

[**ComputerDetail**](ComputerDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="computersGet"></a>
# **computersGet**
> kotlin.Array&lt;ComputersList&gt; computersGet(start, limit)

Get a list of computers with its detail

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val start : kotlin.Int = 56 // kotlin.Int | Start offset of the query
val limit : kotlin.Int = 56 // kotlin.Int | Limit offset of the query
try {
    val result : kotlin.Array<ComputersList> = apiInstance.computersGet(start, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#computersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#computersGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **kotlin.Int**| Start offset of the query | [optional]
 **limit** | **kotlin.Int**| Limit offset of the query | [optional]

### Return type

[**kotlin.Array&lt;ComputersList&gt;**](ComputersList.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="computersLastupdateTimestampGet"></a>
# **computersLastupdateTimestampGet**
> kotlin.Array&lt;ListOfID&gt; computersLastupdateTimestampGet(timestamp)

Get a ID list of computers update during the provided timestamp

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val timestamp : kotlin.Int = 56 // kotlin.Int | Timestamp of the number of days to count down from the current date. Optional.
try {
    val result : kotlin.Array<ListOfID> = apiInstance.computersLastupdateTimestampGet(timestamp)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#computersLastupdateTimestampGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#computersLastupdateTimestampGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timestamp** | **kotlin.Int**| Timestamp of the number of days to count down from the current date. Optional. |

### Return type

[**kotlin.Array&lt;ListOfID&gt;**](ListOfID.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="computersListIDGet"></a>
# **computersListIDGet**
> kotlin.Array&lt;ListOfID&gt; computersListIDGet(start, limit)

Get a ID list of all computers in the OCS database

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val start : kotlin.Int = 56 // kotlin.Int | Start offset of the query
val limit : kotlin.Int = 56 // kotlin.Int | Limit offset of the query
try {
    val result : kotlin.Array<ListOfID> = apiInstance.computersListIDGet(start, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#computersListIDGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#computersListIDGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **kotlin.Int**| Start offset of the query | [optional]
 **limit** | **kotlin.Int**| Limit offset of the query | [optional]

### Return type

[**kotlin.Array&lt;ListOfID&gt;**](ListOfID.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ipdiscoverGet"></a>
# **ipdiscoverGet**
> IpdiscoverList ipdiscoverGet(start, limit)

List IPDiscover network list

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val start : kotlin.Int = 56 // kotlin.Int | Start offset of the query
val limit : kotlin.Int = 56 // kotlin.Int | Limit offset of the query
try {
    val result : IpdiscoverList = apiInstance.ipdiscoverGet(start, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#ipdiscoverGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#ipdiscoverGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **kotlin.Int**| Start offset of the query | [optional]
 **limit** | **kotlin.Int**| Limit offset of the query | [optional]

### Return type

[**IpdiscoverList**](IpdiscoverList.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ipdiscoverNetworkNetidGet"></a>
# **ipdiscoverNetworkNetidGet**
> IpdiscoverNetdevices ipdiscoverNetworkNetidGet(netid)

Get list of network devices scanned on one network

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val netid : kotlin.Int = 56 // kotlin.Int | Start offset of the query
try {
    val result : IpdiscoverNetdevices = apiInstance.ipdiscoverNetworkNetidGet(netid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#ipdiscoverNetworkNetidGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#ipdiscoverNetworkNetidGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **netid** | **kotlin.Int**| Start offset of the query |

### Return type

[**IpdiscoverNetdevices**](IpdiscoverNetdevices.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="snmpSnmpTypeGet"></a>
# **snmpSnmpTypeGet**
> SNMPDetail snmpSnmpTypeGet(snmpType, start, limit)

Get snmp device list of a specific snmp type

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val snmpType : kotlin.String = snmpType_example // kotlin.String | Name of the snmp type you want to list
val start : kotlin.Int = 56 // kotlin.Int | Start offset of the query
val limit : kotlin.Int = 56 // kotlin.Int | Limit offset of the query
try {
    val result : SNMPDetail = apiInstance.snmpSnmpTypeGet(snmpType, start, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#snmpSnmpTypeGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#snmpSnmpTypeGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snmpType** | **kotlin.String**| Name of the snmp type you want to list |
 **start** | **kotlin.Int**| Start offset of the query | [optional]
 **limit** | **kotlin.Int**| Limit offset of the query | [optional]

### Return type

[**SNMPDetail**](SNMPDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="snmpSnmpTypeIdGet"></a>
# **snmpSnmpTypeIdGet**
> SNMPDetail snmpSnmpTypeIdGet(snmpType, id)

Get a device from a snmp type with its ID

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val snmpType : kotlin.String = snmpType_example // kotlin.String | Name of the snmp type you want to list
val id : kotlin.Int = 56 // kotlin.Int | Identifiant en base de données de l'équipement
try {
    val result : SNMPDetail = apiInstance.snmpSnmpTypeIdGet(snmpType, id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#snmpSnmpTypeIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#snmpSnmpTypeIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snmpType** | **kotlin.String**| Name of the snmp type you want to list |
 **id** | **kotlin.Int**| Identifiant en base de données de l&#x27;équipement |

### Return type

[**SNMPDetail**](SNMPDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="snmpsTypeListGet"></a>
# **snmpsTypeListGet**
> SNMPType snmpsTypeListGet()

Get a SNMP type list

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
try {
    val result : SNMPType = apiInstance.snmpsTypeListGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#snmpsTypeListGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#snmpsTypeListGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SNMPType**](SNMPType.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="softwaresGet"></a>
# **softwaresGet**
> SoftwaresList softwaresGet(start, limit, soft)

Get software list from database

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val start : kotlin.Int = 56 // kotlin.Int | Start offset of the query
val limit : kotlin.Int = 56 // kotlin.Int | Limit offset of the query
val soft : kotlin.String = soft_example // kotlin.String | Name of the software you want to search (optional)
try {
    val result : SoftwaresList = apiInstance.softwaresGet(start, limit, soft)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#softwaresGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#softwaresGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **kotlin.Int**| Start offset of the query | [optional]
 **limit** | **kotlin.Int**| Limit offset of the query | [optional]
 **soft** | **kotlin.String**| Name of the software you want to search (optional) | [optional]

### Return type

[**SoftwaresList**](SoftwaresList.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

