//
// ComputersList.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation

/** In this case batteries and bios are inventory sections defined in Map.pm file */
public struct ComputersList: Codable {


    public var computerId: ComputersListComputerId?
    public init(computerId: ComputersListComputerId? = nil) { 
        self.computerId = computerId
    }
    public enum CodingKeys: String, CodingKey { 
        case computerId = "{computer_id}"
    }

}