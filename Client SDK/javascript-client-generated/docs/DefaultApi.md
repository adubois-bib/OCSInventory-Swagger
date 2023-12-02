# OcsInventoryRestApi.DefaultApi

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
```javascript
import {OcsInventoryRestApi} from 'ocs_inventory_rest_api';
let defaultClient = OcsInventoryRestApi.ApiClient.instance;
// Configure HTTP basic authorization: basicAuth
let basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

let apiInstance = new OcsInventoryRestApi.DefaultApi();
let id = 56; // Number | ID of the computer in OCS database

apiInstance.computerIdGet(id, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Number**| ID of the computer in OCS database | 

### Return type

[**ComputersList**](ComputersList.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="computerIdSectionsGet"></a>
# **computerIdSectionsGet**
> ComputerDetail computerIdSectionsGet(id, sections, opts)

Get sections informations of a specific computer

### Example
```javascript
import {OcsInventoryRestApi} from 'ocs_inventory_rest_api';
let defaultClient = OcsInventoryRestApi.ApiClient.instance;
// Configure HTTP basic authorization: basicAuth
let basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

let apiInstance = new OcsInventoryRestApi.DefaultApi();
let id = 56; // Number | ID of the computer in OCS database
let sections = "sections_example"; // String | Name of the requested section (i.e -> bios, software, etc..)
let opts = { 
  'where': "where_example", // String | Search on a specific column of the specific section.
  'operator': "operator_example" // String | Search operator (like, not like, =, !=, <, >, <=, >=). Mandatory if where parameter is set.
};
apiInstance.computerIdSectionsGet(id, sections, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Number**| ID of the computer in OCS database | 
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
> [ComputersList] computersGet(opts)

Get a list of computers with its detail

### Example
```javascript
import {OcsInventoryRestApi} from 'ocs_inventory_rest_api';
let defaultClient = OcsInventoryRestApi.ApiClient.instance;
// Configure HTTP basic authorization: basicAuth
let basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

let apiInstance = new OcsInventoryRestApi.DefaultApi();
let opts = { 
  'start': 56, // Number | Start offset of the query
  'limit': 56 // Number | Limit offset of the query
};
apiInstance.computersGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Number**| Start offset of the query | [optional] 
 **limit** | **Number**| Limit offset of the query | [optional] 

### Return type

[**[ComputersList]**](ComputersList.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="computersLastupdateTimestampGet"></a>
# **computersLastupdateTimestampGet**
> [ListOfID] computersLastupdateTimestampGet(timestamp)

Get a ID list of computers update during the provided timestamp

### Example
```javascript
import {OcsInventoryRestApi} from 'ocs_inventory_rest_api';
let defaultClient = OcsInventoryRestApi.ApiClient.instance;
// Configure HTTP basic authorization: basicAuth
let basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

let apiInstance = new OcsInventoryRestApi.DefaultApi();
let timestamp = 56; // Number | Timestamp of the number of days to count down from the current date. Optional.

apiInstance.computersLastupdateTimestampGet(timestamp, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timestamp** | **Number**| Timestamp of the number of days to count down from the current date. Optional. | 

### Return type

[**[ListOfID]**](ListOfID.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="computersListIDGet"></a>
# **computersListIDGet**
> [ListOfID] computersListIDGet(opts)

Get a ID list of all computers in the OCS database

### Example
```javascript
import {OcsInventoryRestApi} from 'ocs_inventory_rest_api';
let defaultClient = OcsInventoryRestApi.ApiClient.instance;
// Configure HTTP basic authorization: basicAuth
let basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

let apiInstance = new OcsInventoryRestApi.DefaultApi();
let opts = { 
  'start': 56, // Number | Start offset of the query
  'limit': 56 // Number | Limit offset of the query
};
apiInstance.computersListIDGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Number**| Start offset of the query | [optional] 
 **limit** | **Number**| Limit offset of the query | [optional] 

### Return type

[**[ListOfID]**](ListOfID.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ipdiscoverGet"></a>
# **ipdiscoverGet**
> IpdiscoverList ipdiscoverGet(opts)

List IPDiscover network list

### Example
```javascript
import {OcsInventoryRestApi} from 'ocs_inventory_rest_api';
let defaultClient = OcsInventoryRestApi.ApiClient.instance;
// Configure HTTP basic authorization: basicAuth
let basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

let apiInstance = new OcsInventoryRestApi.DefaultApi();
let opts = { 
  'start': 56, // Number | Start offset of the query
  'limit': 56 // Number | Limit offset of the query
};
apiInstance.ipdiscoverGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Number**| Start offset of the query | [optional] 
 **limit** | **Number**| Limit offset of the query | [optional] 

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
```javascript
import {OcsInventoryRestApi} from 'ocs_inventory_rest_api';
let defaultClient = OcsInventoryRestApi.ApiClient.instance;
// Configure HTTP basic authorization: basicAuth
let basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

let apiInstance = new OcsInventoryRestApi.DefaultApi();
let netid = 56; // Number | Start offset of the query

apiInstance.ipdiscoverNetworkNetidGet(netid, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **netid** | **Number**| Start offset of the query | 

### Return type

[**IpdiscoverNetdevices**](IpdiscoverNetdevices.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="snmpSnmpTypeGet"></a>
# **snmpSnmpTypeGet**
> SNMPDetail snmpSnmpTypeGet(snmpType, opts)

Get snmp device list of a specific snmp type

### Example
```javascript
import {OcsInventoryRestApi} from 'ocs_inventory_rest_api';
let defaultClient = OcsInventoryRestApi.ApiClient.instance;
// Configure HTTP basic authorization: basicAuth
let basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

let apiInstance = new OcsInventoryRestApi.DefaultApi();
let snmpType = "snmpType_example"; // String | Name of the snmp type you want to list
let opts = { 
  'start': 56, // Number | Start offset of the query
  'limit': 56 // Number | Limit offset of the query
};
apiInstance.snmpSnmpTypeGet(snmpType, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snmpType** | **String**| Name of the snmp type you want to list | 
 **start** | **Number**| Start offset of the query | [optional] 
 **limit** | **Number**| Limit offset of the query | [optional] 

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
```javascript
import {OcsInventoryRestApi} from 'ocs_inventory_rest_api';
let defaultClient = OcsInventoryRestApi.ApiClient.instance;
// Configure HTTP basic authorization: basicAuth
let basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

let apiInstance = new OcsInventoryRestApi.DefaultApi();
let snmpType = "snmpType_example"; // String | Name of the snmp type you want to list
let id = 56; // Number | Identifiant en base de données de l'équipement

apiInstance.snmpSnmpTypeIdGet(snmpType, id, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snmpType** | **String**| Name of the snmp type you want to list | 
 **id** | **Number**| Identifiant en base de données de l&#x27;équipement | 

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
```javascript
import {OcsInventoryRestApi} from 'ocs_inventory_rest_api';
let defaultClient = OcsInventoryRestApi.ApiClient.instance;
// Configure HTTP basic authorization: basicAuth
let basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

let apiInstance = new OcsInventoryRestApi.DefaultApi();
apiInstance.snmpsTypeListGet((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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
> SoftwaresList softwaresGet(opts)

Get software list from database

### Example
```javascript
import {OcsInventoryRestApi} from 'ocs_inventory_rest_api';
let defaultClient = OcsInventoryRestApi.ApiClient.instance;
// Configure HTTP basic authorization: basicAuth
let basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

let apiInstance = new OcsInventoryRestApi.DefaultApi();
let opts = { 
  'start': 56, // Number | Start offset of the query
  'limit': 56, // Number | Limit offset of the query
  'soft': "soft_example" // String | Name of the software you want to search (optional)
};
apiInstance.softwaresGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Number**| Start offset of the query | [optional] 
 **limit** | **Number**| Limit offset of the query | [optional] 
 **soft** | **String**| Name of the software you want to search (optional) | [optional] 

### Return type

[**SoftwaresList**](SoftwaresList.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

