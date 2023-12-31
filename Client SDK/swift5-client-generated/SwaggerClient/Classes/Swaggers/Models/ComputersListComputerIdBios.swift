//
// ComputersListComputerIdBios.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct ComputersListComputerIdBios: Codable {

    public var ASSETTAG: String?
    public var BDATE: String?
    public var BMANUFACTURER: String?
    public var BVERSION: String?
    public var HARDWARE_ID: Int?
    public var MMANUFACTURER: String?
    public var MMODEL: String?
    public var MSN: String?
    public var SMANUFACTURER: String?
    public var SMODEL: String?
    public var SSN: String?
    public var TYPE: String?

    public init(ASSETTAG: String? = nil, BDATE: String? = nil, BMANUFACTURER: String? = nil, BVERSION: String? = nil, HARDWARE_ID: Int? = nil, MMANUFACTURER: String? = nil, MMODEL: String? = nil, MSN: String? = nil, SMANUFACTURER: String? = nil, SMODEL: String? = nil, SSN: String? = nil, TYPE: String? = nil) {
        self.ASSETTAG = ASSETTAG
        self.BDATE = BDATE
        self.BMANUFACTURER = BMANUFACTURER
        self.BVERSION = BVERSION
        self.HARDWARE_ID = HARDWARE_ID
        self.MMANUFACTURER = MMANUFACTURER
        self.MMODEL = MMODEL
        self.MSN = MSN
        self.SMANUFACTURER = SMANUFACTURER
        self.SMODEL = SMODEL
        self.SSN = SSN
        self.TYPE = TYPE
    }


}
