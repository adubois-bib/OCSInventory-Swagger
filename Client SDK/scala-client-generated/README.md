# NAME

OCS Inventory Rest API

No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)

# VERSION

Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) project:

- API version: 1.0
- Package version: 
- Build package: io.swagger.codegen.v3.generators.scala.ScalaClientCodegen

# Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-scala-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-scala-client:1.0.0"
```

### SBT users

```scala
libraryDependencies += "io.swagger" % "swagger-scala-client" % "1.0.0"
```

## Documentation for API Endpoints

All URIs are relative to *https://api.ocsinventory-ng.tld/ocsapi/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**computerIdGet**](DefaultApi.md#computerIdGet) | **GET** /computer/{id} | Get a computer by its ID
*DefaultApi* | [**computerIdSectionsGet**](DefaultApi.md#computerIdSectionsGet) | **GET** /computer/{id}/{sections} | Get sections informations of a specific computer
*DefaultApi* | [**computersGet**](DefaultApi.md#computersGet) | **GET** /computers | Get a list of computers with its detail
*DefaultApi* | [**computersLastupdateTimestampGet**](DefaultApi.md#computersLastupdateTimestampGet) | **GET** /computers/lastupdate/{timestamp} | Get a ID list of computers update during the provided timestamp
*DefaultApi* | [**computersListIDGet**](DefaultApi.md#computersListIDGet) | **GET** /computers/listID | Get a ID list of all computers in the OCS database
*DefaultApi* | [**ipdiscoverGet**](DefaultApi.md#ipdiscoverGet) | **GET** /ipdiscover | List IPDiscover network list
*DefaultApi* | [**ipdiscoverNetworkNetidGet**](DefaultApi.md#ipdiscoverNetworkNetidGet) | **GET** /ipdiscover/network/{netid} | Get list of network devices scanned on one network
*DefaultApi* | [**snmpSnmpTypeGet**](DefaultApi.md#snmpSnmpTypeGet) | **GET** /snmp/{snmp_type} | Get snmp device list of a specific snmp type
*DefaultApi* | [**snmpSnmpTypeIdGet**](DefaultApi.md#snmpSnmpTypeIdGet) | **GET** /snmp/{snmp_type}/{id} | Get a device from a snmp type with its ID
*DefaultApi* | [**snmpsTypeListGet**](DefaultApi.md#snmpsTypeListGet) | **GET** /snmps/typeList | Get a SNMP type list
*DefaultApi* | [**softwaresGet**](DefaultApi.md#softwaresGet) | **GET** /softwares | Get software list from database

## Documentation for Models

 - [ComputerDetail](ComputerDetail.md)
 - [ComputerDetailComputerId](ComputerDetailComputerId.md)
 - [ComputersList](ComputersList.md)
 - [ComputersListComputerId](ComputersListComputerId.md)
 - [ComputersListComputerIdAccountinfo](ComputersListComputerIdAccountinfo.md)
 - [ComputersListComputerIdBios](ComputersListComputerIdBios.md)
 - [IpdiscoverList](IpdiscoverList.md)
 - [IpdiscoverListInner](IpdiscoverListInner.md)
 - [IpdiscoverNetdevices](IpdiscoverNetdevices.md)
 - [IpdiscoverNetdevicesInner](IpdiscoverNetdevicesInner.md)
 - [ListOfID](ListOfID.md)
 - [SNMPDetail](SNMPDetail.md)
 - [SNMPDetailInner](SNMPDetailInner.md)
 - [SNMPType](SNMPType.md)
 - [SNMPTypeInner](SNMPTypeInner.md)
 - [SoftwaresList](SoftwaresList.md)
 - [SoftwaresListInner](SoftwaresListInner.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### basicAuth

- **Type**: HTTP basic authentication



# BUILDING YOUR LIBRARY

See the homepage `https://github.com/swagger-api/swagger-codegen` for full details.
But briefly, clone the git repository, build the codegen codebase, set up your build
config file, then run the API build script. You will need git, Java 7 or 8 and Apache
maven 3.0.3 or better already installed.

Your library files will be built under `WWW::MyProjectName`.

          $ git clone https://github.com/swagger-api/swagger-codegen.git
          $ cd swagger-codegen
          $ mvn package
          $ java -jar modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate \
    -i [URL or file path to JSON swagger API spec] \
    -l akka-scala \
    -c /path/to/config/file.json \
    -o /path/to/output/folder

Bang, all done. Run the `autodoc` script in the `bin` directory to see the API
you just built.

## Author

