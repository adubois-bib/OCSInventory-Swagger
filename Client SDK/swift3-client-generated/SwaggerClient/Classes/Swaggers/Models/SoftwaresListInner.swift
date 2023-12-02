//
// SoftwaresListInner.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class SoftwaresListInner: JSONEncodable {
    public var NAME: String?
    public var PUBLISHER: String?
    public var VERSION: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["NAME"] = self.NAME
        nillableDictionary["PUBLISHER"] = self.PUBLISHER
        nillableDictionary["VERSION"] = self.VERSION

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}