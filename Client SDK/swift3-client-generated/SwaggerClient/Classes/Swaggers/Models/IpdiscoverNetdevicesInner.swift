//
// IpdiscoverNetdevicesInner.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class IpdiscoverNetdevicesInner: JSONEncodable {
    public var DATE: Date?
    public var HARDWARE_ID: Int32?
    public var IP: String?
    public var MAC: String?
    public var MASK: String?
    public var NAME: String?
    public var NETID: String?
    public var TAG: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["DATE"] = self.DATE?.encodeToJSON()
        nillableDictionary["HARDWARE_ID"] = self.HARDWARE_ID?.encodeToJSON()
        nillableDictionary["IP"] = self.IP
        nillableDictionary["MAC"] = self.MAC
        nillableDictionary["MASK"] = self.MASK
        nillableDictionary["NAME"] = self.NAME
        nillableDictionary["NETID"] = self.NETID
        nillableDictionary["TAG"] = self.TAG

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
