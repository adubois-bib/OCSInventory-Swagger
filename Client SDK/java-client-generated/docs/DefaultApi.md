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
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
Integer id = 56; // Integer | ID of the computer in OCS database
try {
    ComputersList result = apiInstance.computerIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#computerIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| ID of the computer in OCS database |

### Return type

[**ComputersList**](ComputersList.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="computerIdSectionsGet"></a>
# **computerIdSectionsGet**
> ComputerDetail computerIdSectionsGet(id, sections, where, operator)

Get sections informations of a specific computer

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
Integer id = 56; // Integer | ID of the computer in OCS database
String sections = "sections_example"; // String | Name of the requested section (i.e -> bios, software, etc..)
String where = "where_example"; // String | Search on a specific column of the specific section.
String operator = "operator_example"; // String | Search operator (like, not like, =, !=, <, >, <=, >=). Mandatory if where parameter is set.
try {
    ComputerDetail result = apiInstance.computerIdSectionsGet(id, sections, where, operator);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#computerIdSectionsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| ID of the computer in OCS database |
 **sections** | **String**| Name of the requested section (i.e -&gt; bios, software, etc..) |
 **where** | **String**| Search on a specific column of the specific section. | [optional]
 **operator** | **String**| Search operator (like, not like, &#x3D;, !&#x3D;, &lt;, &gt;, &lt;&#x3D;, &gt;&#x3D;). Mandatory if where parameter is set. | [optional]

### Return type

[**ComputerDetail**](ComputerDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="computersGet"></a>
# **computersGet**
> List&lt;ComputersList&gt; computersGet(start, limit)

Get a list of computers with its detail

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
Integer start = 56; // Integer | Start offset of the query
Integer limit = 56; // Integer | Limit offset of the query
try {
    List<ComputersList> result = apiInstance.computersGet(start, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#computersGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Integer**| Start offset of the query | [optional]
 **limit** | **Integer**| Limit offset of the query | [optional]

### Return type

[**List&lt;ComputersList&gt;**](ComputersList.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="computersLastupdateTimestampGet"></a>
# **computersLastupdateTimestampGet**
> List&lt;ListOfID&gt; computersLastupdateTimestampGet(timestamp)

Get a ID list of computers update during the provided timestamp

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
Integer timestamp = 56; // Integer | Timestamp of the number of days to count down from the current date. Optional.
try {
    List<ListOfID> result = apiInstance.computersLastupdateTimestampGet(timestamp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#computersLastupdateTimestampGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timestamp** | **Integer**| Timestamp of the number of days to count down from the current date. Optional. |

### Return type

[**List&lt;ListOfID&gt;**](ListOfID.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="computersListIDGet"></a>
# **computersListIDGet**
> List&lt;ListOfID&gt; computersListIDGet(start, limit)

Get a ID list of all computers in the OCS database

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
Integer start = 56; // Integer | Start offset of the query
Integer limit = 56; // Integer | Limit offset of the query
try {
    List<ListOfID> result = apiInstance.computersListIDGet(start, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#computersListIDGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Integer**| Start offset of the query | [optional]
 **limit** | **Integer**| Limit offset of the query | [optional]

### Return type

[**List&lt;ListOfID&gt;**](ListOfID.md)

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
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
Integer start = 56; // Integer | Start offset of the query
Integer limit = 56; // Integer | Limit offset of the query
try {
    IpdiscoverList result = apiInstance.ipdiscoverGet(start, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ipdiscoverGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Integer**| Start offset of the query | [optional]
 **limit** | **Integer**| Limit offset of the query | [optional]

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
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
Integer netid = 56; // Integer | Start offset of the query
try {
    IpdiscoverNetdevices result = apiInstance.ipdiscoverNetworkNetidGet(netid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ipdiscoverNetworkNetidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **netid** | **Integer**| Start offset of the query |

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
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String snmpType = "snmpType_example"; // String | Name of the snmp type you want to list
Integer start = 56; // Integer | Start offset of the query
Integer limit = 56; // Integer | Limit offset of the query
try {
    SNMPDetail result = apiInstance.snmpSnmpTypeGet(snmpType, start, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#snmpSnmpTypeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snmpType** | **String**| Name of the snmp type you want to list |
 **start** | **Integer**| Start offset of the query | [optional]
 **limit** | **Integer**| Limit offset of the query | [optional]

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
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String snmpType = "snmpType_example"; // String | Name of the snmp type you want to list
Integer id = 56; // Integer | Identifiant en base de données de l'équipement
try {
    SNMPDetail result = apiInstance.snmpSnmpTypeIdGet(snmpType, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#snmpSnmpTypeIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snmpType** | **String**| Name of the snmp type you want to list |
 **id** | **Integer**| Identifiant en base de données de l&#x27;équipement |

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
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
try {
    SNMPType result = apiInstance.snmpsTypeListGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#snmpsTypeListGet");
    e.printStackTrace();
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
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
Integer start = 56; // Integer | Start offset of the query
Integer limit = 56; // Integer | Limit offset of the query
String soft = "soft_example"; // String | Name of the software you want to search (optional)
try {
    SoftwaresList result = apiInstance.softwaresGet(start, limit, soft);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#softwaresGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Integer**| Start offset of the query | [optional]
 **limit** | **Integer**| Limit offset of the query | [optional]
 **soft** | **String**| Name of the software you want to search (optional) | [optional]

### Return type

[**SoftwaresList**](SoftwaresList.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

