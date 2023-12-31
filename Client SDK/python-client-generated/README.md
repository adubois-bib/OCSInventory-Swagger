# swagger-client
No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)

This Python package is automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) project:

- API version: 1.0
- Package version: 1.0.0
- Build package: io.swagger.codegen.v3.generators.python.PythonClientCodegen

## Requirements.

Python 2.7 and 3.4+

## Installation & Usage
### pip install

If the python package is hosted on Github, you can install directly from Github

```sh
pip install git+https://github.com/GIT_USER_ID/GIT_REPO_ID.git
```
(you may need to run `pip` with root permission: `sudo pip install git+https://github.com/GIT_USER_ID/GIT_REPO_ID.git`)

Then import the package:
```python
import swagger_client 
```

### Setuptools

Install via [Setuptools](http://pypi.python.org/pypi/setuptools).

```sh
python setup.py install --user
```
(or `sudo python setup.py install` to install the package for all users)

Then import the package:
```python
import swagger_client
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

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

## Documentation for API Endpoints

All URIs are relative to *https://api.ocsinventory-ng.tld/ocsapi/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**computer_id_get**](docs/DefaultApi.md#computer_id_get) | **GET** /computer/{id} | Get a computer by its ID
*DefaultApi* | [**computer_id_sections_get**](docs/DefaultApi.md#computer_id_sections_get) | **GET** /computer/{id}/{sections} | Get sections informations of a specific computer
*DefaultApi* | [**computers_get**](docs/DefaultApi.md#computers_get) | **GET** /computers | Get a list of computers with its detail
*DefaultApi* | [**computers_lastupdate_timestamp_get**](docs/DefaultApi.md#computers_lastupdate_timestamp_get) | **GET** /computers/lastupdate/{timestamp} | Get a ID list of computers update during the provided timestamp
*DefaultApi* | [**computers_list_id_get**](docs/DefaultApi.md#computers_list_id_get) | **GET** /computers/listID | Get a ID list of all computers in the OCS database
*DefaultApi* | [**ipdiscover_get**](docs/DefaultApi.md#ipdiscover_get) | **GET** /ipdiscover | List IPDiscover network list
*DefaultApi* | [**ipdiscover_network_netid_get**](docs/DefaultApi.md#ipdiscover_network_netid_get) | **GET** /ipdiscover/network/{netid} | Get list of network devices scanned on one network
*DefaultApi* | [**snmp_snmp_type_get**](docs/DefaultApi.md#snmp_snmp_type_get) | **GET** /snmp/{snmp_type} | Get snmp device list of a specific snmp type
*DefaultApi* | [**snmp_snmp_type_id_get**](docs/DefaultApi.md#snmp_snmp_type_id_get) | **GET** /snmp/{snmp_type}/{id} | Get a device from a snmp type with its ID
*DefaultApi* | [**snmps_type_list_get**](docs/DefaultApi.md#snmps_type_list_get) | **GET** /snmps/typeList | Get a SNMP type list
*DefaultApi* | [**softwares_get**](docs/DefaultApi.md#softwares_get) | **GET** /softwares | Get software list from database

## Documentation For Models

 - [ComputerDetail](docs/ComputerDetail.md)
 - [ComputerDetailComputerId](docs/ComputerDetailComputerId.md)
 - [ComputersList](docs/ComputersList.md)
 - [ComputersListComputerId](docs/ComputersListComputerId.md)
 - [ComputersListComputerIdAccountinfo](docs/ComputersListComputerIdAccountinfo.md)
 - [ComputersListComputerIdBios](docs/ComputersListComputerIdBios.md)
 - [IpdiscoverList](docs/IpdiscoverList.md)
 - [IpdiscoverListInner](docs/IpdiscoverListInner.md)
 - [IpdiscoverNetdevices](docs/IpdiscoverNetdevices.md)
 - [IpdiscoverNetdevicesInner](docs/IpdiscoverNetdevicesInner.md)
 - [ListOfID](docs/ListOfID.md)
 - [SNMPDetail](docs/SNMPDetail.md)
 - [SNMPDetailInner](docs/SNMPDetailInner.md)
 - [SNMPType](docs/SNMPType.md)
 - [SNMPTypeInner](docs/SNMPTypeInner.md)
 - [SoftwaresList](docs/SoftwaresList.md)
 - [SoftwaresListInner](docs/SoftwaresListInner.md)

## Documentation For Authorization


## basicAuth

- **Type**: HTTP basic authentication


## Author


