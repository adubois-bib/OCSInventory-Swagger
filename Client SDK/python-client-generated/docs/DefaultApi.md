# swagger_client.DefaultApi

All URIs are relative to *https://api.ocsinventory-ng.tld/ocsapi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**computer_id_get**](DefaultApi.md#computer_id_get) | **GET** /computer/{id} | Get a computer by its ID
[**computer_id_sections_get**](DefaultApi.md#computer_id_sections_get) | **GET** /computer/{id}/{sections} | Get sections informations of a specific computer
[**computers_get**](DefaultApi.md#computers_get) | **GET** /computers | Get a list of computers with its detail
[**computers_lastupdate_timestamp_get**](DefaultApi.md#computers_lastupdate_timestamp_get) | **GET** /computers/lastupdate/{timestamp} | Get a ID list of computers update during the provided timestamp
[**computers_list_id_get**](DefaultApi.md#computers_list_id_get) | **GET** /computers/listID | Get a ID list of all computers in the OCS database
[**ipdiscover_get**](DefaultApi.md#ipdiscover_get) | **GET** /ipdiscover | List IPDiscover network list
[**ipdiscover_network_netid_get**](DefaultApi.md#ipdiscover_network_netid_get) | **GET** /ipdiscover/network/{netid} | Get list of network devices scanned on one network
[**snmp_snmp_type_get**](DefaultApi.md#snmp_snmp_type_get) | **GET** /snmp/{snmp_type} | Get snmp device list of a specific snmp type
[**snmp_snmp_type_id_get**](DefaultApi.md#snmp_snmp_type_id_get) | **GET** /snmp/{snmp_type}/{id} | Get a device from a snmp type with its ID
[**snmps_type_list_get**](DefaultApi.md#snmps_type_list_get) | **GET** /snmps/typeList | Get a SNMP type list
[**softwares_get**](DefaultApi.md#softwares_get) | **GET** /softwares | Get software list from database

# **computer_id_get**
> ComputersList computer_id_get(id)

Get a computer by its ID

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint
# Configure HTTP basic authorization: basicAuth
configuration = swagger_client.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
id = 56 # int | ID of the computer in OCS database

try:
    # Get a computer by its ID
    api_response = api_instance.computer_id_get(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->computer_id_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| ID of the computer in OCS database | 

### Return type

[**ComputersList**](ComputersList.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **computer_id_sections_get**
> ComputerDetail computer_id_sections_get(id, sections, where=where, operator=operator)

Get sections informations of a specific computer

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint
# Configure HTTP basic authorization: basicAuth
configuration = swagger_client.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
id = 56 # int | ID of the computer in OCS database
sections = 'sections_example' # str | Name of the requested section (i.e -> bios, software, etc..)
where = 'where_example' # str | Search on a specific column of the specific section. (optional)
operator = 'operator_example' # str | Search operator (like, not like, =, !=, <, >, <=, >=). Mandatory if where parameter is set. (optional)

try:
    # Get sections informations of a specific computer
    api_response = api_instance.computer_id_sections_get(id, sections, where=where, operator=operator)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->computer_id_sections_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| ID of the computer in OCS database | 
 **sections** | **str**| Name of the requested section (i.e -&gt; bios, software, etc..) | 
 **where** | **str**| Search on a specific column of the specific section. | [optional] 
 **operator** | **str**| Search operator (like, not like, &#x3D;, !&#x3D;, &lt;, &gt;, &lt;&#x3D;, &gt;&#x3D;). Mandatory if where parameter is set. | [optional] 

### Return type

[**ComputerDetail**](ComputerDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **computers_get**
> list[ComputersList] computers_get(start=start, limit=limit)

Get a list of computers with its detail

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint
# Configure HTTP basic authorization: basicAuth
configuration = swagger_client.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
start = 56 # int | Start offset of the query (optional)
limit = 56 # int | Limit offset of the query (optional)

try:
    # Get a list of computers with its detail
    api_response = api_instance.computers_get(start=start, limit=limit)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->computers_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **int**| Start offset of the query | [optional] 
 **limit** | **int**| Limit offset of the query | [optional] 

### Return type

[**list[ComputersList]**](ComputersList.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **computers_lastupdate_timestamp_get**
> list[ListOfID] computers_lastupdate_timestamp_get(timestamp)

Get a ID list of computers update during the provided timestamp

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint
# Configure HTTP basic authorization: basicAuth
configuration = swagger_client.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
timestamp = 56 # int | Timestamp of the number of days to count down from the current date. Optional.

try:
    # Get a ID list of computers update during the provided timestamp
    api_response = api_instance.computers_lastupdate_timestamp_get(timestamp)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->computers_lastupdate_timestamp_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timestamp** | **int**| Timestamp of the number of days to count down from the current date. Optional. | 

### Return type

[**list[ListOfID]**](ListOfID.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **computers_list_id_get**
> list[ListOfID] computers_list_id_get(start=start, limit=limit)

Get a ID list of all computers in the OCS database

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint
# Configure HTTP basic authorization: basicAuth
configuration = swagger_client.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
start = 56 # int | Start offset of the query (optional)
limit = 56 # int | Limit offset of the query (optional)

try:
    # Get a ID list of all computers in the OCS database
    api_response = api_instance.computers_list_id_get(start=start, limit=limit)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->computers_list_id_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **int**| Start offset of the query | [optional] 
 **limit** | **int**| Limit offset of the query | [optional] 

### Return type

[**list[ListOfID]**](ListOfID.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ipdiscover_get**
> IpdiscoverList ipdiscover_get(start=start, limit=limit)

List IPDiscover network list

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint
# Configure HTTP basic authorization: basicAuth
configuration = swagger_client.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
start = 56 # int | Start offset of the query (optional)
limit = 56 # int | Limit offset of the query (optional)

try:
    # List IPDiscover network list
    api_response = api_instance.ipdiscover_get(start=start, limit=limit)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->ipdiscover_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **int**| Start offset of the query | [optional] 
 **limit** | **int**| Limit offset of the query | [optional] 

### Return type

[**IpdiscoverList**](IpdiscoverList.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ipdiscover_network_netid_get**
> IpdiscoverNetdevices ipdiscover_network_netid_get(netid)

Get list of network devices scanned on one network

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint
# Configure HTTP basic authorization: basicAuth
configuration = swagger_client.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
netid = 56 # int | Start offset of the query

try:
    # Get list of network devices scanned on one network
    api_response = api_instance.ipdiscover_network_netid_get(netid)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->ipdiscover_network_netid_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **netid** | **int**| Start offset of the query | 

### Return type

[**IpdiscoverNetdevices**](IpdiscoverNetdevices.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **snmp_snmp_type_get**
> SNMPDetail snmp_snmp_type_get(snmp_type, start=start, limit=limit)

Get snmp device list of a specific snmp type

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint
# Configure HTTP basic authorization: basicAuth
configuration = swagger_client.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
snmp_type = 'snmp_type_example' # str | Name of the snmp type you want to list
start = 56 # int | Start offset of the query (optional)
limit = 56 # int | Limit offset of the query (optional)

try:
    # Get snmp device list of a specific snmp type
    api_response = api_instance.snmp_snmp_type_get(snmp_type, start=start, limit=limit)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->snmp_snmp_type_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snmp_type** | **str**| Name of the snmp type you want to list | 
 **start** | **int**| Start offset of the query | [optional] 
 **limit** | **int**| Limit offset of the query | [optional] 

### Return type

[**SNMPDetail**](SNMPDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **snmp_snmp_type_id_get**
> SNMPDetail snmp_snmp_type_id_get(snmp_type, id)

Get a device from a snmp type with its ID

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint
# Configure HTTP basic authorization: basicAuth
configuration = swagger_client.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
snmp_type = 'snmp_type_example' # str | Name of the snmp type you want to list
id = 56 # int | Identifiant en base de données de l'équipement

try:
    # Get a device from a snmp type with its ID
    api_response = api_instance.snmp_snmp_type_id_get(snmp_type, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->snmp_snmp_type_id_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snmp_type** | **str**| Name of the snmp type you want to list | 
 **id** | **int**| Identifiant en base de données de l&#x27;équipement | 

### Return type

[**SNMPDetail**](SNMPDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **snmps_type_list_get**
> SNMPType snmps_type_list_get()

Get a SNMP type list

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint
# Configure HTTP basic authorization: basicAuth
configuration = swagger_client.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))

try:
    # Get a SNMP type list
    api_response = api_instance.snmps_type_list_get()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->snmps_type_list_get: %s\n" % e)
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **softwares_get**
> SoftwaresList softwares_get(start=start, limit=limit, soft=soft)

Get software list from database

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint
# Configure HTTP basic authorization: basicAuth
configuration = swagger_client.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
start = 56 # int | Start offset of the query (optional)
limit = 56 # int | Limit offset of the query (optional)
soft = 'soft_example' # str | Name of the software you want to search (optional) (optional)

try:
    # Get software list from database
    api_response = api_instance.softwares_get(start=start, limit=limit, soft=soft)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->softwares_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **int**| Start offset of the query | [optional] 
 **limit** | **int**| Limit offset of the query | [optional] 
 **soft** | **str**| Name of the software you want to search (optional) | [optional] 

### Return type

[**SoftwaresList**](SoftwaresList.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

