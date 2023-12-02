# IO.Swagger.Api.DefaultApi

All URIs are relative to *https://api.ocsinventory-ng.tld/ocsapi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ComputerIdGet**](DefaultApi.md#computeridget) | **GET** /computer/{id} | Get a computer by its ID
[**ComputerIdSectionsGet**](DefaultApi.md#computeridsectionsget) | **GET** /computer/{id}/{sections} | Get sections informations of a specific computer
[**ComputersGet**](DefaultApi.md#computersget) | **GET** /computers | Get a list of computers with its detail
[**ComputersLastupdateTimestampGet**](DefaultApi.md#computerslastupdatetimestampget) | **GET** /computers/lastupdate/{timestamp} | Get a ID list of computers update during the provided timestamp
[**ComputersListIDGet**](DefaultApi.md#computerslistidget) | **GET** /computers/listID | Get a ID list of all computers in the OCS database
[**IpdiscoverGet**](DefaultApi.md#ipdiscoverget) | **GET** /ipdiscover | List IPDiscover network list
[**IpdiscoverNetworkNetidGet**](DefaultApi.md#ipdiscovernetworknetidget) | **GET** /ipdiscover/network/{netid} | Get list of network devices scanned on one network
[**SnmpSnmpTypeGet**](DefaultApi.md#snmpsnmptypeget) | **GET** /snmp/{snmp_type} | Get snmp device list of a specific snmp type
[**SnmpSnmpTypeIdGet**](DefaultApi.md#snmpsnmptypeidget) | **GET** /snmp/{snmp_type}/{id} | Get a device from a snmp type with its ID
[**SnmpsTypeListGet**](DefaultApi.md#snmpstypelistget) | **GET** /snmps/typeList | Get a SNMP type list
[**SoftwaresGet**](DefaultApi.md#softwaresget) | **GET** /softwares | Get software list from database

<a name="computeridget"></a>
# **ComputerIdGet**
> ComputersList ComputerIdGet (int? id)

Get a computer by its ID

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ComputerIdGetExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: basicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new DefaultApi();
            var id = 56;  // int? | ID of the computer in OCS database

            try
            {
                // Get a computer by its ID
                ComputersList result = apiInstance.ComputerIdGet(id);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.ComputerIdGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int?**| ID of the computer in OCS database | 

### Return type

[**ComputersList**](ComputersList.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="computeridsectionsget"></a>
# **ComputerIdSectionsGet**
> ComputerDetail ComputerIdSectionsGet (int? id, string sections, string where = null, string _operator = null)

Get sections informations of a specific computer

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ComputerIdSectionsGetExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: basicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new DefaultApi();
            var id = 56;  // int? | ID of the computer in OCS database
            var sections = sections_example;  // string | Name of the requested section (i.e -> bios, software, etc..)
            var where = where_example;  // string | Search on a specific column of the specific section. (optional) 
            var _operator = _operator_example;  // string | Search operator (like, not like, =, !=, <, >, <=, >=). Mandatory if where parameter is set. (optional) 

            try
            {
                // Get sections informations of a specific computer
                ComputerDetail result = apiInstance.ComputerIdSectionsGet(id, sections, where, _operator);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.ComputerIdSectionsGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int?**| ID of the computer in OCS database | 
 **sections** | **string**| Name of the requested section (i.e -&gt; bios, software, etc..) | 
 **where** | **string**| Search on a specific column of the specific section. | [optional] 
 **_operator** | **string**| Search operator (like, not like, &#x3D;, !&#x3D;, &lt;, &gt;, &lt;&#x3D;, &gt;&#x3D;). Mandatory if where parameter is set. | [optional] 

### Return type

[**ComputerDetail**](ComputerDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="computersget"></a>
# **ComputersGet**
> List<ComputersList> ComputersGet (int? start = null, int? limit = null)

Get a list of computers with its detail

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ComputersGetExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: basicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new DefaultApi();
            var start = 56;  // int? | Start offset of the query (optional) 
            var limit = 56;  // int? | Limit offset of the query (optional) 

            try
            {
                // Get a list of computers with its detail
                List&lt;ComputersList&gt; result = apiInstance.ComputersGet(start, limit);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.ComputersGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **int?**| Start offset of the query | [optional] 
 **limit** | **int?**| Limit offset of the query | [optional] 

### Return type

[**List<ComputersList>**](ComputersList.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="computerslastupdatetimestampget"></a>
# **ComputersLastupdateTimestampGet**
> List<ListOfID> ComputersLastupdateTimestampGet (int? timestamp)

Get a ID list of computers update during the provided timestamp

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ComputersLastupdateTimestampGetExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: basicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new DefaultApi();
            var timestamp = 56;  // int? | Timestamp of the number of days to count down from the current date. Optional.

            try
            {
                // Get a ID list of computers update during the provided timestamp
                List&lt;ListOfID&gt; result = apiInstance.ComputersLastupdateTimestampGet(timestamp);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.ComputersLastupdateTimestampGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timestamp** | **int?**| Timestamp of the number of days to count down from the current date. Optional. | 

### Return type

[**List<ListOfID>**](ListOfID.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="computerslistidget"></a>
# **ComputersListIDGet**
> List<ListOfID> ComputersListIDGet (int? start = null, int? limit = null)

Get a ID list of all computers in the OCS database

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ComputersListIDGetExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: basicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new DefaultApi();
            var start = 56;  // int? | Start offset of the query (optional) 
            var limit = 56;  // int? | Limit offset of the query (optional) 

            try
            {
                // Get a ID list of all computers in the OCS database
                List&lt;ListOfID&gt; result = apiInstance.ComputersListIDGet(start, limit);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.ComputersListIDGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **int?**| Start offset of the query | [optional] 
 **limit** | **int?**| Limit offset of the query | [optional] 

### Return type

[**List<ListOfID>**](ListOfID.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="ipdiscoverget"></a>
# **IpdiscoverGet**
> IpdiscoverList IpdiscoverGet (int? start = null, int? limit = null)

List IPDiscover network list

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class IpdiscoverGetExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: basicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new DefaultApi();
            var start = 56;  // int? | Start offset of the query (optional) 
            var limit = 56;  // int? | Limit offset of the query (optional) 

            try
            {
                // List IPDiscover network list
                IpdiscoverList result = apiInstance.IpdiscoverGet(start, limit);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.IpdiscoverGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **int?**| Start offset of the query | [optional] 
 **limit** | **int?**| Limit offset of the query | [optional] 

### Return type

[**IpdiscoverList**](IpdiscoverList.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="ipdiscovernetworknetidget"></a>
# **IpdiscoverNetworkNetidGet**
> IpdiscoverNetdevices IpdiscoverNetworkNetidGet (int? netid)

Get list of network devices scanned on one network

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class IpdiscoverNetworkNetidGetExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: basicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new DefaultApi();
            var netid = 56;  // int? | Start offset of the query

            try
            {
                // Get list of network devices scanned on one network
                IpdiscoverNetdevices result = apiInstance.IpdiscoverNetworkNetidGet(netid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.IpdiscoverNetworkNetidGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **netid** | **int?**| Start offset of the query | 

### Return type

[**IpdiscoverNetdevices**](IpdiscoverNetdevices.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="snmpsnmptypeget"></a>
# **SnmpSnmpTypeGet**
> SNMPDetail SnmpSnmpTypeGet (string snmpType, int? start = null, int? limit = null)

Get snmp device list of a specific snmp type

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class SnmpSnmpTypeGetExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: basicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new DefaultApi();
            var snmpType = snmpType_example;  // string | Name of the snmp type you want to list
            var start = 56;  // int? | Start offset of the query (optional) 
            var limit = 56;  // int? | Limit offset of the query (optional) 

            try
            {
                // Get snmp device list of a specific snmp type
                SNMPDetail result = apiInstance.SnmpSnmpTypeGet(snmpType, start, limit);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.SnmpSnmpTypeGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snmpType** | **string**| Name of the snmp type you want to list | 
 **start** | **int?**| Start offset of the query | [optional] 
 **limit** | **int?**| Limit offset of the query | [optional] 

### Return type

[**SNMPDetail**](SNMPDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="snmpsnmptypeidget"></a>
# **SnmpSnmpTypeIdGet**
> SNMPDetail SnmpSnmpTypeIdGet (string snmpType, int? id)

Get a device from a snmp type with its ID

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class SnmpSnmpTypeIdGetExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: basicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new DefaultApi();
            var snmpType = snmpType_example;  // string | Name of the snmp type you want to list
            var id = 56;  // int? | Identifiant en base de données de l'équipement

            try
            {
                // Get a device from a snmp type with its ID
                SNMPDetail result = apiInstance.SnmpSnmpTypeIdGet(snmpType, id);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.SnmpSnmpTypeIdGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snmpType** | **string**| Name of the snmp type you want to list | 
 **id** | **int?**| Identifiant en base de données de l&#x27;équipement | 

### Return type

[**SNMPDetail**](SNMPDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="snmpstypelistget"></a>
# **SnmpsTypeListGet**
> SNMPType SnmpsTypeListGet ()

Get a SNMP type list

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class SnmpsTypeListGetExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: basicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new DefaultApi();

            try
            {
                // Get a SNMP type list
                SNMPType result = apiInstance.SnmpsTypeListGet();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.SnmpsTypeListGet: " + e.Message );
            }
        }
    }
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="softwaresget"></a>
# **SoftwaresGet**
> SoftwaresList SoftwaresGet (int? start = null, int? limit = null, string soft = null)

Get software list from database

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class SoftwaresGetExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: basicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new DefaultApi();
            var start = 56;  // int? | Start offset of the query (optional) 
            var limit = 56;  // int? | Limit offset of the query (optional) 
            var soft = soft_example;  // string | Name of the software you want to search (optional) (optional) 

            try
            {
                // Get software list from database
                SoftwaresList result = apiInstance.SoftwaresGet(start, limit, soft);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.SoftwaresGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **int?**| Start offset of the query | [optional] 
 **limit** | **int?**| Limit offset of the query | [optional] 
 **soft** | **string**| Name of the software you want to search (optional) | [optional] 

### Return type

[**SoftwaresList**](SoftwaresList.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
