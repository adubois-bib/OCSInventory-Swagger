/*
 * OCS Inventory Rest API
 *
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * API version: 1.0
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger

type ComputersListComputerIdBios struct {
	ASSETTAG string `json:"ASSETTAG,omitempty"`
	BDATE string `json:"BDATE,omitempty"`
	BMANUFACTURER string `json:"BMANUFACTURER,omitempty"`
	BVERSION string `json:"BVERSION,omitempty"`
	HARDWARE_ID int32 `json:"HARDWARE_ID,omitempty"`
	MMANUFACTURER string `json:"MMANUFACTURER,omitempty"`
	MMODEL string `json:"MMODEL,omitempty"`
	MSN string `json:"MSN,omitempty"`
	SMANUFACTURER string `json:"SMANUFACTURER,omitempty"`
	SMODEL string `json:"SMODEL,omitempty"`
	SSN string `json:"SSN,omitempty"`
	TYPE string `json:"TYPE,omitempty"`
}