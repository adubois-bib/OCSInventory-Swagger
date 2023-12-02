//
// DefaultAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire


open class DefaultAPI: APIBase {
    /**
     Get a computer by its ID
     - parameter id: (path) ID of the computer in OCS database 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func computerIdGet(id: Int32, completion: @escaping ((_ data: ComputersList?, _ error: ErrorResponse?) -> Void)) {
        computerIdGetWithRequestBuilder(id: id).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get a computer by its ID
     - GET /computer/{id}
     - BASIC:
       - type: http
       - name: basicAuth
     - examples: [{contentType=application/json, example={
  "{computer_id}" : {
    "accountinfo" : [ {
      "HARDWARE_ID" : 16,
      "TAG" : "DEV-MACHINE"
    }, {
      "HARDWARE_ID" : 16,
      "TAG" : "DEV-MACHINE"
    } ],
    "batteries" : [ "batteries", "batteries" ],
    "bios" : [ {
      "BDATE" : "04/16/2021",
      "HARDWARE_ID" : 16,
      "SMODEL" : "PowerEdge R340",
      "BMANUFACTURER" : "Dell Inc.",
      "BVERSION" : "2.5.1",
      "MMANUFACTURER" : "Dell Inc.",
      "MSN" : "",
      "MMODEL" : "045M96",
      "SMANUFACTURER" : "",
      "ASSETTAG" : "",
      "TYPE" : "Rack Mount Chassis",
      "SSN" : ""
    }, {
      "BDATE" : "04/16/2021",
      "HARDWARE_ID" : 16,
      "SMODEL" : "PowerEdge R340",
      "BMANUFACTURER" : "Dell Inc.",
      "BVERSION" : "2.5.1",
      "MMANUFACTURER" : "Dell Inc.",
      "MSN" : "",
      "MMODEL" : "045M96",
      "SMANUFACTURER" : "",
      "ASSETTAG" : "",
      "TYPE" : "Rack Mount Chassis",
      "SSN" : ""
    } ]
  }
}}]
     - parameter id: (path) ID of the computer in OCS database 
     - returns: RequestBuilder<ComputersList> 
     */
    open class func computerIdGetWithRequestBuilder(id: Int32) -> RequestBuilder<ComputersList> {
        var path = "/computer/{id}"
        let idPreEscape = "\(id)"
        let idPostEscape = idPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{id}", with: idPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<ComputersList>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Get sections informations of a specific computer
     - parameter id: (path) ID of the computer in OCS database 
     - parameter sections: (path) Name of the requested section (i.e -&gt; bios, software, etc..) 
     - parameter _where: (query) Search on a specific column of the specific section. (optional)
     - parameter _operator: (query) Search operator (like, not like, &#x3D;, !&#x3D;, &lt;, &gt;, &lt;&#x3D;, &gt;&#x3D;). Mandatory if where parameter is set. (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func computerIdSectionsGet(id: Int32, sections: String, _where: String? = nil, _operator: String? = nil, completion: @escaping ((_ data: ComputerDetail?, _ error: ErrorResponse?) -> Void)) {
        computerIdSectionsGetWithRequestBuilder(id: id, sections: sections, _where: _where, _operator: _operator).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get sections informations of a specific computer
     - GET /computer/{id}/{sections}
     - BASIC:
       - type: http
       - name: basicAuth
     - examples: [{contentType=application/json, example={
  "{computer_id}" : {
    "bios" : [ {
      "BDATE" : "04/16/2021",
      "HARDWARE_ID" : 16,
      "SMODEL" : "PowerEdge R340",
      "BMANUFACTURER" : "Dell Inc.",
      "BVERSION" : "2.5.1",
      "MMANUFACTURER" : "Dell Inc.",
      "MSN" : "",
      "MMODEL" : "045M96",
      "SMANUFACTURER" : "",
      "ASSETTAG" : "",
      "TYPE" : "Rack Mount Chassis",
      "SSN" : ""
    }, {
      "BDATE" : "04/16/2021",
      "HARDWARE_ID" : 16,
      "SMODEL" : "PowerEdge R340",
      "BMANUFACTURER" : "Dell Inc.",
      "BVERSION" : "2.5.1",
      "MMANUFACTURER" : "Dell Inc.",
      "MSN" : "",
      "MMODEL" : "045M96",
      "SMANUFACTURER" : "",
      "ASSETTAG" : "",
      "TYPE" : "Rack Mount Chassis",
      "SSN" : ""
    } ]
  }
}}]
     - parameter id: (path) ID of the computer in OCS database 
     - parameter sections: (path) Name of the requested section (i.e -&gt; bios, software, etc..) 
     - parameter _where: (query) Search on a specific column of the specific section. (optional)
     - parameter _operator: (query) Search operator (like, not like, &#x3D;, !&#x3D;, &lt;, &gt;, &lt;&#x3D;, &gt;&#x3D;). Mandatory if where parameter is set. (optional)
     - returns: RequestBuilder<ComputerDetail> 
     */
    open class func computerIdSectionsGetWithRequestBuilder(id: Int32, sections: String, _where: String? = nil, _operator: String? = nil) -> RequestBuilder<ComputerDetail> {
        var path = "/computer/{id}/{sections}"
        let idPreEscape = "\(id)"
        let idPostEscape = idPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{id}", with: idPostEscape, options: .literal, range: nil)
        let sectionsPreEscape = "\(sections)"
        let sectionsPostEscape = sectionsPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{sections}", with: sectionsPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems(values:[
                        "where": _where,
                        "operator": _operator
        ])

        let requestBuilder: RequestBuilder<ComputerDetail>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Get a list of computers with its detail
     - parameter start: (query) Start offset of the query (optional)
     - parameter limit: (query) Limit offset of the query (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func computersGet(start: Int32? = nil, limit: Int32? = nil, completion: @escaping ((_ data: [ComputersList]?, _ error: ErrorResponse?) -> Void)) {
        computersGetWithRequestBuilder(start: start, limit: limit).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get a list of computers with its detail
     - GET /computers
     - BASIC:
       - type: http
       - name: basicAuth
     - examples: [{contentType=application/json, example=[ {
  "{computer_id}" : {
    "accountinfo" : [ {
      "HARDWARE_ID" : 16,
      "TAG" : "DEV-MACHINE"
    }, {
      "HARDWARE_ID" : 16,
      "TAG" : "DEV-MACHINE"
    } ],
    "batteries" : [ "batteries", "batteries" ],
    "bios" : [ {
      "BDATE" : "04/16/2021",
      "HARDWARE_ID" : 16,
      "SMODEL" : "PowerEdge R340",
      "BMANUFACTURER" : "Dell Inc.",
      "BVERSION" : "2.5.1",
      "MMANUFACTURER" : "Dell Inc.",
      "MSN" : "",
      "MMODEL" : "045M96",
      "SMANUFACTURER" : "",
      "ASSETTAG" : "",
      "TYPE" : "Rack Mount Chassis",
      "SSN" : ""
    }, {
      "BDATE" : "04/16/2021",
      "HARDWARE_ID" : 16,
      "SMODEL" : "PowerEdge R340",
      "BMANUFACTURER" : "Dell Inc.",
      "BVERSION" : "2.5.1",
      "MMANUFACTURER" : "Dell Inc.",
      "MSN" : "",
      "MMODEL" : "045M96",
      "SMANUFACTURER" : "",
      "ASSETTAG" : "",
      "TYPE" : "Rack Mount Chassis",
      "SSN" : ""
    } ]
  }
}, {
  "{computer_id}" : {
    "accountinfo" : [ {
      "HARDWARE_ID" : 16,
      "TAG" : "DEV-MACHINE"
    }, {
      "HARDWARE_ID" : 16,
      "TAG" : "DEV-MACHINE"
    } ],
    "batteries" : [ "batteries", "batteries" ],
    "bios" : [ {
      "BDATE" : "04/16/2021",
      "HARDWARE_ID" : 16,
      "SMODEL" : "PowerEdge R340",
      "BMANUFACTURER" : "Dell Inc.",
      "BVERSION" : "2.5.1",
      "MMANUFACTURER" : "Dell Inc.",
      "MSN" : "",
      "MMODEL" : "045M96",
      "SMANUFACTURER" : "",
      "ASSETTAG" : "",
      "TYPE" : "Rack Mount Chassis",
      "SSN" : ""
    }, {
      "BDATE" : "04/16/2021",
      "HARDWARE_ID" : 16,
      "SMODEL" : "PowerEdge R340",
      "BMANUFACTURER" : "Dell Inc.",
      "BVERSION" : "2.5.1",
      "MMANUFACTURER" : "Dell Inc.",
      "MSN" : "",
      "MMODEL" : "045M96",
      "SMANUFACTURER" : "",
      "ASSETTAG" : "",
      "TYPE" : "Rack Mount Chassis",
      "SSN" : ""
    } ]
  }
} ]}]
     - parameter start: (query) Start offset of the query (optional)
     - parameter limit: (query) Limit offset of the query (optional)
     - returns: RequestBuilder<[ComputersList]> 
     */
    open class func computersGetWithRequestBuilder(start: Int32? = nil, limit: Int32? = nil) -> RequestBuilder<[ComputersList]> {
        let path = "/computers"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems(values:[
                        "start": start?.encodeToJSON(),
                        "limit": limit?.encodeToJSON()
        ])

        let requestBuilder: RequestBuilder<[ComputersList]>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Get a ID list of computers update during the provided timestamp
     - parameter timestamp: (path) Timestamp of the number of days to count down from the current date. Optional. 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func computersLastupdateTimestampGet(timestamp: Int32, completion: @escaping ((_ data: [ListOfID]?, _ error: ErrorResponse?) -> Void)) {
        computersLastupdateTimestampGetWithRequestBuilder(timestamp: timestamp).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get a ID list of computers update during the provided timestamp
     - GET /computers/lastupdate/{timestamp}
     - BASIC:
       - type: http
       - name: basicAuth
     - examples: [{contentType=application/json, example=[ {
  "ID" : 1942
}, {
  "ID" : 1942
} ]}]
     - parameter timestamp: (path) Timestamp of the number of days to count down from the current date. Optional. 
     - returns: RequestBuilder<[ListOfID]> 
     */
    open class func computersLastupdateTimestampGetWithRequestBuilder(timestamp: Int32) -> RequestBuilder<[ListOfID]> {
        var path = "/computers/lastupdate/{timestamp}"
        let timestampPreEscape = "\(timestamp)"
        let timestampPostEscape = timestampPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{timestamp}", with: timestampPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<[ListOfID]>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Get a ID list of all computers in the OCS database
     - parameter start: (query) Start offset of the query (optional)
     - parameter limit: (query) Limit offset of the query (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func computersListIDGet(start: Int32? = nil, limit: Int32? = nil, completion: @escaping ((_ data: [ListOfID]?, _ error: ErrorResponse?) -> Void)) {
        computersListIDGetWithRequestBuilder(start: start, limit: limit).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get a ID list of all computers in the OCS database
     - GET /computers/listID
     - BASIC:
       - type: http
       - name: basicAuth
     - examples: [{contentType=application/json, example=[ {
  "ID" : 1942
}, {
  "ID" : 1942
} ]}]
     - parameter start: (query) Start offset of the query (optional)
     - parameter limit: (query) Limit offset of the query (optional)
     - returns: RequestBuilder<[ListOfID]> 
     */
    open class func computersListIDGetWithRequestBuilder(start: Int32? = nil, limit: Int32? = nil) -> RequestBuilder<[ListOfID]> {
        let path = "/computers/listID"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems(values:[
                        "start": start?.encodeToJSON(),
                        "limit": limit?.encodeToJSON()
        ])

        let requestBuilder: RequestBuilder<[ListOfID]>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     List IPDiscover network list
     - parameter start: (query) Start offset of the query (optional)
     - parameter limit: (query) Limit offset of the query (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func ipdiscoverGet(start: Int32? = nil, limit: Int32? = nil, completion: @escaping ((_ data: IpdiscoverList?, _ error: ErrorResponse?) -> Void)) {
        ipdiscoverGetWithRequestBuilder(start: start, limit: limit).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     List IPDiscover network list
     - GET /ipdiscover
     - BASIC:
       - type: http
       - name: basicAuth
     - examples: [{contentType=application/json, example=[ {
  "NETID" : "172.18.25.0"
}, {
  "NETID" : "172.18.25.0"
} ]}]
     - parameter start: (query) Start offset of the query (optional)
     - parameter limit: (query) Limit offset of the query (optional)
     - returns: RequestBuilder<IpdiscoverList> 
     */
    open class func ipdiscoverGetWithRequestBuilder(start: Int32? = nil, limit: Int32? = nil) -> RequestBuilder<IpdiscoverList> {
        let path = "/ipdiscover"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems(values:[
                        "start": start?.encodeToJSON(),
                        "limit": limit?.encodeToJSON()
        ])

        let requestBuilder: RequestBuilder<IpdiscoverList>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Get list of network devices scanned on one network
     - parameter netid: (path) Start offset of the query 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func ipdiscoverNetworkNetidGet(netid: Int32, completion: @escaping ((_ data: IpdiscoverNetdevices?, _ error: ErrorResponse?) -> Void)) {
        ipdiscoverNetworkNetidGetWithRequestBuilder(netid: netid).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get list of network devices scanned on one network
     - GET /ipdiscover/network/{netid}
     - BASIC:
       - type: http
       - name: basicAuth
     - examples: [{contentType=application/json, example=[ {
  "DATE" : "2023-06-08T12:15:08Z",
  "HARDWARE_ID" : 16,
  "NETID" : "172.18.25.0",
  "IP" : "172.18.25.254",
  "TAG" : "DEV-MACHINE",
  "MAC" : "00:0d:b9:51:fc:aa",
  "MASK" : "255.255.255.0",
  "NAME" : "-"
}, {
  "DATE" : "2023-06-08T12:15:08Z",
  "HARDWARE_ID" : 16,
  "NETID" : "172.18.25.0",
  "IP" : "172.18.25.254",
  "TAG" : "DEV-MACHINE",
  "MAC" : "00:0d:b9:51:fc:aa",
  "MASK" : "255.255.255.0",
  "NAME" : "-"
} ]}]
     - parameter netid: (path) Start offset of the query 
     - returns: RequestBuilder<IpdiscoverNetdevices> 
     */
    open class func ipdiscoverNetworkNetidGetWithRequestBuilder(netid: Int32) -> RequestBuilder<IpdiscoverNetdevices> {
        var path = "/ipdiscover/network/{netid}"
        let netidPreEscape = "\(netid)"
        let netidPostEscape = netidPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{netid}", with: netidPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<IpdiscoverNetdevices>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Get snmp device list of a specific snmp type
     - parameter snmpType: (path) Name of the snmp type you want to list 
     - parameter start: (query) Start offset of the query (optional)
     - parameter limit: (query) Limit offset of the query (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func snmpSnmpTypeGet(snmpType: String, start: Int32? = nil, limit: Int32? = nil, completion: @escaping ((_ data: SNMPDetail?, _ error: ErrorResponse?) -> Void)) {
        snmpSnmpTypeGetWithRequestBuilder(snmpType: snmpType, start: start, limit: limit).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get snmp device list of a specific snmp type
     - GET /snmp/{snmp_type}
     - BASIC:
       - type: http
       - name: basicAuth
     - examples: [{contentType=application/json, example=[ {
  "DefaultAddressIP" : "127.0.0.1",
  "DefaultDescription" : "This is a description",
  "LASTDATE" : "2023-06-08T12:22:18Z",
  "DefaultUptime" : "DefaultUptime",
  "DefaultGateway" : "172.18.25.254",
  "DefaultName" : "My Equipment",
  "DefaultMacAddress" : "DefaultMacAddress",
  "ID" : 1,
  "DefaultLocation" : "Here"
}, {
  "DefaultAddressIP" : "127.0.0.1",
  "DefaultDescription" : "This is a description",
  "LASTDATE" : "2023-06-08T12:22:18Z",
  "DefaultUptime" : "DefaultUptime",
  "DefaultGateway" : "172.18.25.254",
  "DefaultName" : "My Equipment",
  "DefaultMacAddress" : "DefaultMacAddress",
  "ID" : 1,
  "DefaultLocation" : "Here"
} ]}]
     - parameter snmpType: (path) Name of the snmp type you want to list 
     - parameter start: (query) Start offset of the query (optional)
     - parameter limit: (query) Limit offset of the query (optional)
     - returns: RequestBuilder<SNMPDetail> 
     */
    open class func snmpSnmpTypeGetWithRequestBuilder(snmpType: String, start: Int32? = nil, limit: Int32? = nil) -> RequestBuilder<SNMPDetail> {
        var path = "/snmp/{snmp_type}"
        let snmpTypePreEscape = "\(snmpType)"
        let snmpTypePostEscape = snmpTypePreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{snmp_type}", with: snmpTypePostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems(values:[
                        "start": start?.encodeToJSON(),
                        "limit": limit?.encodeToJSON()
        ])

        let requestBuilder: RequestBuilder<SNMPDetail>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Get a device from a snmp type with its ID
     - parameter snmpType: (path) Name of the snmp type you want to list 
     - parameter id: (path) Identifiant en base de données de l&#x27;équipement 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func snmpSnmpTypeIdGet(snmpType: String, id: Int32, completion: @escaping ((_ data: SNMPDetail?, _ error: ErrorResponse?) -> Void)) {
        snmpSnmpTypeIdGetWithRequestBuilder(snmpType: snmpType, id: id).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get a device from a snmp type with its ID
     - GET /snmp/{snmp_type}/{id}
     - BASIC:
       - type: http
       - name: basicAuth
     - examples: [{contentType=application/json, example=[ {
  "DefaultAddressIP" : "127.0.0.1",
  "DefaultDescription" : "This is a description",
  "LASTDATE" : "2023-06-08T12:22:18Z",
  "DefaultUptime" : "DefaultUptime",
  "DefaultGateway" : "172.18.25.254",
  "DefaultName" : "My Equipment",
  "DefaultMacAddress" : "DefaultMacAddress",
  "ID" : 1,
  "DefaultLocation" : "Here"
}, {
  "DefaultAddressIP" : "127.0.0.1",
  "DefaultDescription" : "This is a description",
  "LASTDATE" : "2023-06-08T12:22:18Z",
  "DefaultUptime" : "DefaultUptime",
  "DefaultGateway" : "172.18.25.254",
  "DefaultName" : "My Equipment",
  "DefaultMacAddress" : "DefaultMacAddress",
  "ID" : 1,
  "DefaultLocation" : "Here"
} ]}]
     - parameter snmpType: (path) Name of the snmp type you want to list 
     - parameter id: (path) Identifiant en base de données de l&#x27;équipement 
     - returns: RequestBuilder<SNMPDetail> 
     */
    open class func snmpSnmpTypeIdGetWithRequestBuilder(snmpType: String, id: Int32) -> RequestBuilder<SNMPDetail> {
        var path = "/snmp/{snmp_type}/{id}"
        let snmpTypePreEscape = "\(snmpType)"
        let snmpTypePostEscape = snmpTypePreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{snmp_type}", with: snmpTypePostEscape, options: .literal, range: nil)
        let idPreEscape = "\(id)"
        let idPostEscape = idPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{id}", with: idPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<SNMPDetail>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Get a SNMP type list
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func snmpsTypeListGet(completion: @escaping ((_ data: SNMPType?, _ error: ErrorResponse?) -> Void)) {
        snmpsTypeListGetWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get a SNMP type list
     - GET /snmps/typeList
     - BASIC:
       - type: http
       - name: basicAuth
     - examples: [{contentType=application/json, example=[ {
  "TABLE_TYPE_NAME" : "snmp_default",
  "ID" : 13,
  "TYPE_NAME" : "Default"
}, {
  "TABLE_TYPE_NAME" : "snmp_default",
  "ID" : 13,
  "TYPE_NAME" : "Default"
} ]}]
     - returns: RequestBuilder<SNMPType> 
     */
    open class func snmpsTypeListGetWithRequestBuilder() -> RequestBuilder<SNMPType> {
        let path = "/snmps/typeList"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<SNMPType>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Get software list from database
     - parameter start: (query) Start offset of the query (optional)
     - parameter limit: (query) Limit offset of the query (optional)
     - parameter soft: (query) Name of the software you want to search (optional) (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func softwaresGet(start: Int32? = nil, limit: Int32? = nil, soft: String? = nil, completion: @escaping ((_ data: SoftwaresList?, _ error: ErrorResponse?) -> Void)) {
        softwaresGetWithRequestBuilder(start: start, limit: limit, soft: soft).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get software list from database
     - GET /softwares
     - BASIC:
       - type: http
       - name: basicAuth
     - examples: [{contentType=application/json, example=[ {
  "PUBLISHER" : "Igor Pavlov",
  "VERSION" : "16.02",
  "NAME" : "7-Zip 16.02"
}, {
  "PUBLISHER" : "Igor Pavlov",
  "VERSION" : "16.02",
  "NAME" : "7-Zip 16.02"
} ]}]
     - parameter start: (query) Start offset of the query (optional)
     - parameter limit: (query) Limit offset of the query (optional)
     - parameter soft: (query) Name of the software you want to search (optional) (optional)
     - returns: RequestBuilder<SoftwaresList> 
     */
    open class func softwaresGetWithRequestBuilder(start: Int32? = nil, limit: Int32? = nil, soft: String? = nil) -> RequestBuilder<SoftwaresList> {
        let path = "/softwares"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems(values:[
                        "start": start?.encodeToJSON(),
                        "limit": limit?.encodeToJSON(),
                        "soft": soft
        ])

        let requestBuilder: RequestBuilder<SoftwaresList>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

}