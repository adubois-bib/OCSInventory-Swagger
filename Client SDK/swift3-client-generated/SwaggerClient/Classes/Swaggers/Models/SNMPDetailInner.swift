//
// SNMPDetailInner.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class SNMPDetailInner: JSONEncodable {
    public var defaultAddressIP: String?
    public var defaultDescription: String?
    public var defaultGateway: String?
    public var defaultLocation: String?
    public var defaultMacAddress: String?
    public var defaultName: String?
    public var defaultUptime: String?
    public var ID: Int32?
    public var LASTDATE: Date?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["DefaultAddressIP"] = self.defaultAddressIP
        nillableDictionary["DefaultDescription"] = self.defaultDescription
        nillableDictionary["DefaultGateway"] = self.defaultGateway
        nillableDictionary["DefaultLocation"] = self.defaultLocation
        nillableDictionary["DefaultMacAddress"] = self.defaultMacAddress
        nillableDictionary["DefaultName"] = self.defaultName
        nillableDictionary["DefaultUptime"] = self.defaultUptime
        nillableDictionary["ID"] = self.ID?.encodeToJSON()
        nillableDictionary["LASTDATE"] = self.LASTDATE?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
