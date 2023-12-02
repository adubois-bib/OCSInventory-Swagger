# io.swagger.client - Kotlin client library for OCS Inventory Rest API

## Requires

* Kotlin 1.4.30
* Gradle 5.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in Swagger definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://api.ocsinventory-ng.tld/ocsapi/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**computerIdGet**](docs/DefaultApi.md#computeridget) | **GET** /computer/{id} | Get a computer by its ID
*DefaultApi* | [**computerIdSectionsGet**](docs/DefaultApi.md#computeridsectionsget) | **GET** /computer/{id}/{sections} | Get sections informations of a specific computer
*DefaultApi* | [**computersGet**](docs/DefaultApi.md#computersget) | **GET** /computers | Get a list of computers with its detail
*DefaultApi* | [**computersLastupdateTimestampGet**](docs/DefaultApi.md#computerslastupdatetimestampget) | **GET** /computers/lastupdate/{timestamp} | Get a ID list of computers update during the provided timestamp
*DefaultApi* | [**computersListIDGet**](docs/DefaultApi.md#computerslistidget) | **GET** /computers/listID | Get a ID list of all computers in the OCS database
*DefaultApi* | [**ipdiscoverGet**](docs/DefaultApi.md#ipdiscoverget) | **GET** /ipdiscover | List IPDiscover network list
*DefaultApi* | [**ipdiscoverNetworkNetidGet**](docs/DefaultApi.md#ipdiscovernetworknetidget) | **GET** /ipdiscover/network/{netid} | Get list of network devices scanned on one network
*DefaultApi* | [**snmpSnmpTypeGet**](docs/DefaultApi.md#snmpsnmptypeget) | **GET** /snmp/{snmp_type} | Get snmp device list of a specific snmp type
*DefaultApi* | [**snmpSnmpTypeIdGet**](docs/DefaultApi.md#snmpsnmptypeidget) | **GET** /snmp/{snmp_type}/{id} | Get a device from a snmp type with its ID
*DefaultApi* | [**snmpsTypeListGet**](docs/DefaultApi.md#snmpstypelistget) | **GET** /snmps/typeList | Get a SNMP type list
*DefaultApi* | [**softwaresGet**](docs/DefaultApi.md#softwaresget) | **GET** /softwares | Get software list from database

<a name="documentation-for-models"></a>
## Documentation for Models

 - [io.swagger.client.models.ComputerDetail](docs/ComputerDetail.md)
 - [io.swagger.client.models.ComputerDetailComputerId](docs/ComputerDetailComputerId.md)
 - [io.swagger.client.models.ComputersList](docs/ComputersList.md)
 - [io.swagger.client.models.ComputersListComputerId](docs/ComputersListComputerId.md)
 - [io.swagger.client.models.ComputersListComputerIdAccountinfo](docs/ComputersListComputerIdAccountinfo.md)
 - [io.swagger.client.models.ComputersListComputerIdBios](docs/ComputersListComputerIdBios.md)
 - [io.swagger.client.models.IpdiscoverList](docs/IpdiscoverList.md)
 - [io.swagger.client.models.IpdiscoverListInner](docs/IpdiscoverListInner.md)
 - [io.swagger.client.models.IpdiscoverNetdevices](docs/IpdiscoverNetdevices.md)
 - [io.swagger.client.models.IpdiscoverNetdevicesInner](docs/IpdiscoverNetdevicesInner.md)
 - [io.swagger.client.models.ListOfID](docs/ListOfID.md)
 - [io.swagger.client.models.SNMPDetail](docs/SNMPDetail.md)
 - [io.swagger.client.models.SNMPDetailInner](docs/SNMPDetailInner.md)
 - [io.swagger.client.models.SNMPType](docs/SNMPType.md)
 - [io.swagger.client.models.SNMPTypeInner](docs/SNMPTypeInner.md)
 - [io.swagger.client.models.SoftwaresList](docs/SoftwaresList.md)
 - [io.swagger.client.models.SoftwaresListInner](docs/SoftwaresListInner.md)

<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="basicAuth"></a>
### basicAuth

- **Type**: HTTP basic authentication

