# {{classname}}

All URIs are relative to *https://api.ocsinventory-ng.tld/ocsapi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ComputerIdGet**](DefaultApi.md#ComputerIdGet) | **Get** /computer/{id} | Get a computer by its ID
[**ComputerIdSectionsGet**](DefaultApi.md#ComputerIdSectionsGet) | **Get** /computer/{id}/{sections} | Get sections informations of a specific computer
[**ComputersGet**](DefaultApi.md#ComputersGet) | **Get** /computers | Get a list of computers with its detail
[**ComputersLastupdateTimestampGet**](DefaultApi.md#ComputersLastupdateTimestampGet) | **Get** /computers/lastupdate/{timestamp} | Get a ID list of computers update during the provided timestamp
[**ComputersListIDGet**](DefaultApi.md#ComputersListIDGet) | **Get** /computers/listID | Get a ID list of all computers in the OCS database
[**IpdiscoverGet**](DefaultApi.md#IpdiscoverGet) | **Get** /ipdiscover | List IPDiscover network list
[**IpdiscoverNetworkNetidGet**](DefaultApi.md#IpdiscoverNetworkNetidGet) | **Get** /ipdiscover/network/{netid} | Get list of network devices scanned on one network
[**SnmpSnmpTypeGet**](DefaultApi.md#SnmpSnmpTypeGet) | **Get** /snmp/{snmp_type} | Get snmp device list of a specific snmp type
[**SnmpSnmpTypeIdGet**](DefaultApi.md#SnmpSnmpTypeIdGet) | **Get** /snmp/{snmp_type}/{id} | Get a device from a snmp type with its ID
[**SnmpsTypeListGet**](DefaultApi.md#SnmpsTypeListGet) | **Get** /snmps/typeList | Get a SNMP type list
[**SoftwaresGet**](DefaultApi.md#SoftwaresGet) | **Get** /softwares | Get software list from database

# **ComputerIdGet**
> ComputersList ComputerIdGet(ctx, id)
Get a computer by its ID

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **int32**| ID of the computer in OCS database | 

### Return type

[**ComputersList**](computersList.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ComputerIdSectionsGet**
> ComputerDetail ComputerIdSectionsGet(ctx, id, sections, optional)
Get sections informations of a specific computer

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **int32**| ID of the computer in OCS database | 
  **sections** | **string**| Name of the requested section (i.e -&gt; bios, software, etc..) | 
 **optional** | ***DefaultApiComputerIdSectionsGetOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DefaultApiComputerIdSectionsGetOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **where** | **optional.String**| Search on a specific column of the specific section. | 
 **operator** | **optional.String**| Search operator (like, not like, &#x3D;, !&#x3D;, &lt;, &gt;, &lt;&#x3D;, &gt;&#x3D;). Mandatory if where parameter is set. | 

### Return type

[**ComputerDetail**](computerDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ComputersGet**
> []ComputersList ComputersGet(ctx, optional)
Get a list of computers with its detail

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***DefaultApiComputersGetOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DefaultApiComputersGetOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **optional.Int32**| Start offset of the query | 
 **limit** | **optional.Int32**| Limit offset of the query | 

### Return type

[**[]ComputersList**](computersList.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ComputersLastupdateTimestampGet**
> []ListOfId ComputersLastupdateTimestampGet(ctx, timestamp)
Get a ID list of computers update during the provided timestamp

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **timestamp** | **int32**| Timestamp of the number of days to count down from the current date. Optional. | 

### Return type

[**[]ListOfId**](listOfID.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ComputersListIDGet**
> []ListOfId ComputersListIDGet(ctx, optional)
Get a ID list of all computers in the OCS database

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***DefaultApiComputersListIDGetOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DefaultApiComputersListIDGetOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **optional.Int32**| Start offset of the query | 
 **limit** | **optional.Int32**| Limit offset of the query | 

### Return type

[**[]ListOfId**](listOfID.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **IpdiscoverGet**
> []IpdiscoverListInner IpdiscoverGet(ctx, optional)
List IPDiscover network list

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***DefaultApiIpdiscoverGetOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DefaultApiIpdiscoverGetOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **optional.Int32**| Start offset of the query | 
 **limit** | **optional.Int32**| Limit offset of the query | 

### Return type

[**[]IpdiscoverListInner**](array.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **IpdiscoverNetworkNetidGet**
> []IpdiscoverNetdevicesInner IpdiscoverNetworkNetidGet(ctx, netid)
Get list of network devices scanned on one network

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **netid** | **int32**| Start offset of the query | 

### Return type

[**[]IpdiscoverNetdevicesInner**](array.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SnmpSnmpTypeGet**
> []SnmpDetailInner SnmpSnmpTypeGet(ctx, snmpType, optional)
Get snmp device list of a specific snmp type

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **snmpType** | **string**| Name of the snmp type you want to list | 
 **optional** | ***DefaultApiSnmpSnmpTypeGetOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DefaultApiSnmpSnmpTypeGetOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **start** | **optional.Int32**| Start offset of the query | 
 **limit** | **optional.Int32**| Limit offset of the query | 

### Return type

[**[]SnmpDetailInner**](array.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SnmpSnmpTypeIdGet**
> []SnmpDetailInner SnmpSnmpTypeIdGet(ctx, snmpType, id)
Get a device from a snmp type with its ID

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **snmpType** | **string**| Name of the snmp type you want to list | 
  **id** | **int32**| Identifiant en base de données de l&#x27;équipement | 

### Return type

[**[]SnmpDetailInner**](array.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SnmpsTypeListGet**
> []SnmpTypeInner SnmpsTypeListGet(ctx, )
Get a SNMP type list

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**[]SnmpTypeInner**](array.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SoftwaresGet**
> []SoftwaresListInner SoftwaresGet(ctx, optional)
Get software list from database

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***DefaultApiSoftwaresGetOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DefaultApiSoftwaresGetOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **optional.Int32**| Start offset of the query | 
 **limit** | **optional.Int32**| Limit offset of the query | 
 **soft** | **optional.String**| Name of the software you want to search (optional) | 

### Return type

[**[]SoftwaresListInner**](array.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

