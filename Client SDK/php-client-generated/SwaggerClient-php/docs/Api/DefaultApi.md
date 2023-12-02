# Swagger\Client\DefaultApi

All URIs are relative to *https://api.ocsinventory-ng.tld/ocsapi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**computerIdGet**](DefaultApi.md#computeridget) | **GET** /computer/{id} | Get a computer by its ID
[**computerIdSectionsGet**](DefaultApi.md#computeridsectionsget) | **GET** /computer/{id}/{sections} | Get sections informations of a specific computer
[**computersGet**](DefaultApi.md#computersget) | **GET** /computers | Get a list of computers with its detail
[**computersLastupdateTimestampGet**](DefaultApi.md#computerslastupdatetimestampget) | **GET** /computers/lastupdate/{timestamp} | Get a ID list of computers update during the provided timestamp
[**computersListIDGet**](DefaultApi.md#computerslistidget) | **GET** /computers/listID | Get a ID list of all computers in the OCS database
[**ipdiscoverGet**](DefaultApi.md#ipdiscoverget) | **GET** /ipdiscover | List IPDiscover network list
[**ipdiscoverNetworkNetidGet**](DefaultApi.md#ipdiscovernetworknetidget) | **GET** /ipdiscover/network/{netid} | Get list of network devices scanned on one network
[**snmpSnmpTypeGet**](DefaultApi.md#snmpsnmptypeget) | **GET** /snmp/{snmp_type} | Get snmp device list of a specific snmp type
[**snmpSnmpTypeIdGet**](DefaultApi.md#snmpsnmptypeidget) | **GET** /snmp/{snmp_type}/{id} | Get a device from a snmp type with its ID
[**snmpsTypeListGet**](DefaultApi.md#snmpstypelistget) | **GET** /snmps/typeList | Get a SNMP type list
[**softwaresGet**](DefaultApi.md#softwaresget) | **GET** /softwares | Get software list from database

# **computerIdGet**
> \Swagger\Client\Model\ComputersList computerIdGet($id)

Get a computer by its ID

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure HTTP basic authorization: basicAuth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\DefaultApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$id = 56; // int | ID of the computer in OCS database

try {
    $result = $apiInstance->computerIdGet($id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DefaultApi->computerIdGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| ID of the computer in OCS database |

### Return type

[**\Swagger\Client\Model\ComputersList**](../Model/ComputersList.md)

### Authorization

[basicAuth](../../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **computerIdSectionsGet**
> \Swagger\Client\Model\ComputerDetail computerIdSectionsGet($id, $sections, $where, $operator)

Get sections informations of a specific computer

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure HTTP basic authorization: basicAuth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\DefaultApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$id = 56; // int | ID of the computer in OCS database
$sections = "sections_example"; // string | Name of the requested section (i.e -> bios, software, etc..)
$where = "where_example"; // string | Search on a specific column of the specific section.
$operator = "operator_example"; // string | Search operator (like, not like, =, !=, <, >, <=, >=). Mandatory if where parameter is set.

try {
    $result = $apiInstance->computerIdSectionsGet($id, $sections, $where, $operator);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DefaultApi->computerIdSectionsGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| ID of the computer in OCS database |
 **sections** | **string**| Name of the requested section (i.e -&gt; bios, software, etc..) |
 **where** | **string**| Search on a specific column of the specific section. | [optional]
 **operator** | **string**| Search operator (like, not like, &#x3D;, !&#x3D;, &lt;, &gt;, &lt;&#x3D;, &gt;&#x3D;). Mandatory if where parameter is set. | [optional]

### Return type

[**\Swagger\Client\Model\ComputerDetail**](../Model/ComputerDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **computersGet**
> \Swagger\Client\Model\ComputersList[] computersGet($start, $limit)

Get a list of computers with its detail

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure HTTP basic authorization: basicAuth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\DefaultApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$start = 56; // int | Start offset of the query
$limit = 56; // int | Limit offset of the query

try {
    $result = $apiInstance->computersGet($start, $limit);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DefaultApi->computersGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **int**| Start offset of the query | [optional]
 **limit** | **int**| Limit offset of the query | [optional]

### Return type

[**\Swagger\Client\Model\ComputersList[]**](../Model/ComputersList.md)

### Authorization

[basicAuth](../../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **computersLastupdateTimestampGet**
> \Swagger\Client\Model\ListOfID[] computersLastupdateTimestampGet($timestamp)

Get a ID list of computers update during the provided timestamp

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure HTTP basic authorization: basicAuth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\DefaultApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$timestamp = 56; // int | Timestamp of the number of days to count down from the current date. Optional.

try {
    $result = $apiInstance->computersLastupdateTimestampGet($timestamp);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DefaultApi->computersLastupdateTimestampGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timestamp** | **int**| Timestamp of the number of days to count down from the current date. Optional. |

### Return type

[**\Swagger\Client\Model\ListOfID[]**](../Model/ListOfID.md)

### Authorization

[basicAuth](../../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **computersListIDGet**
> \Swagger\Client\Model\ListOfID[] computersListIDGet($start, $limit)

Get a ID list of all computers in the OCS database

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure HTTP basic authorization: basicAuth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\DefaultApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$start = 56; // int | Start offset of the query
$limit = 56; // int | Limit offset of the query

try {
    $result = $apiInstance->computersListIDGet($start, $limit);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DefaultApi->computersListIDGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **int**| Start offset of the query | [optional]
 **limit** | **int**| Limit offset of the query | [optional]

### Return type

[**\Swagger\Client\Model\ListOfID[]**](../Model/ListOfID.md)

### Authorization

[basicAuth](../../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **ipdiscoverGet**
> \Swagger\Client\Model\IpdiscoverList ipdiscoverGet($start, $limit)

List IPDiscover network list

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure HTTP basic authorization: basicAuth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\DefaultApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$start = 56; // int | Start offset of the query
$limit = 56; // int | Limit offset of the query

try {
    $result = $apiInstance->ipdiscoverGet($start, $limit);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DefaultApi->ipdiscoverGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **int**| Start offset of the query | [optional]
 **limit** | **int**| Limit offset of the query | [optional]

### Return type

[**\Swagger\Client\Model\IpdiscoverList**](../Model/IpdiscoverList.md)

### Authorization

[basicAuth](../../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **ipdiscoverNetworkNetidGet**
> \Swagger\Client\Model\IpdiscoverNetdevices ipdiscoverNetworkNetidGet($netid)

Get list of network devices scanned on one network

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure HTTP basic authorization: basicAuth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\DefaultApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$netid = 56; // int | Start offset of the query

try {
    $result = $apiInstance->ipdiscoverNetworkNetidGet($netid);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DefaultApi->ipdiscoverNetworkNetidGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **netid** | **int**| Start offset of the query |

### Return type

[**\Swagger\Client\Model\IpdiscoverNetdevices**](../Model/IpdiscoverNetdevices.md)

### Authorization

[basicAuth](../../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **snmpSnmpTypeGet**
> \Swagger\Client\Model\SNMPDetail snmpSnmpTypeGet($snmp_type, $start, $limit)

Get snmp device list of a specific snmp type

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure HTTP basic authorization: basicAuth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\DefaultApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$snmp_type = "snmp_type_example"; // string | Name of the snmp type you want to list
$start = 56; // int | Start offset of the query
$limit = 56; // int | Limit offset of the query

try {
    $result = $apiInstance->snmpSnmpTypeGet($snmp_type, $start, $limit);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DefaultApi->snmpSnmpTypeGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snmp_type** | **string**| Name of the snmp type you want to list |
 **start** | **int**| Start offset of the query | [optional]
 **limit** | **int**| Limit offset of the query | [optional]

### Return type

[**\Swagger\Client\Model\SNMPDetail**](../Model/SNMPDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **snmpSnmpTypeIdGet**
> \Swagger\Client\Model\SNMPDetail snmpSnmpTypeIdGet($snmp_type, $id)

Get a device from a snmp type with its ID

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure HTTP basic authorization: basicAuth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\DefaultApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$snmp_type = "snmp_type_example"; // string | Name of the snmp type you want to list
$id = 56; // int | Identifiant en base de données de l'équipement

try {
    $result = $apiInstance->snmpSnmpTypeIdGet($snmp_type, $id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DefaultApi->snmpSnmpTypeIdGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snmp_type** | **string**| Name of the snmp type you want to list |
 **id** | **int**| Identifiant en base de données de l&#x27;équipement |

### Return type

[**\Swagger\Client\Model\SNMPDetail**](../Model/SNMPDetail.md)

### Authorization

[basicAuth](../../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **snmpsTypeListGet**
> \Swagger\Client\Model\SNMPType snmpsTypeListGet()

Get a SNMP type list

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure HTTP basic authorization: basicAuth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\DefaultApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

try {
    $result = $apiInstance->snmpsTypeListGet();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DefaultApi->snmpsTypeListGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\Swagger\Client\Model\SNMPType**](../Model/SNMPType.md)

### Authorization

[basicAuth](../../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **softwaresGet**
> \Swagger\Client\Model\SoftwaresList softwaresGet($start, $limit, $soft)

Get software list from database

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure HTTP basic authorization: basicAuth
$config = Swagger\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Swagger\Client\Api\DefaultApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$start = 56; // int | Start offset of the query
$limit = 56; // int | Limit offset of the query
$soft = "soft_example"; // string | Name of the software you want to search (optional)

try {
    $result = $apiInstance->softwaresGet($start, $limit, $soft);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DefaultApi->softwaresGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **int**| Start offset of the query | [optional]
 **limit** | **int**| Limit offset of the query | [optional]
 **soft** | **string**| Name of the software you want to search (optional) | [optional]

### Return type

[**\Swagger\Client\Model\SoftwaresList**](../Model/SoftwaresList.md)

### Authorization

[basicAuth](../../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

