/*
 * OCS Inventory Rest API
 *
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * API version: 1.0
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger
import (
	"time"
)

type IpdiscoverNetdevicesInner struct {

	DATE time.Time `json:"DATE,omitempty"`

	HARDWARE_ID int32 `json:"HARDWARE_ID,omitempty"`

	IP string `json:"IP,omitempty"`

	MAC string `json:"MAC,omitempty"`

	MASK string `json:"MASK,omitempty"`

	NAME string `json:"NAME,omitempty"`

	NETID string `json:"NETID,omitempty"`

	TAG string `json:"TAG,omitempty"`
}
