/*
 * OCS Inventory Rest API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 3.0.50
 *
 * Do not edit the class manually.
 *
 */
import {ApiClient} from '../ApiClient';
import {ComputersListComputerIdAccountinfo} from './ComputersListComputerIdAccountinfo';
import {ComputersListComputerIdBios} from './ComputersListComputerIdBios';

/**
 * The ComputersListComputerId model module.
 * @module model/ComputersListComputerId
 * @version 1.0
 */
export class ComputersListComputerId {
  /**
   * Constructs a new <code>ComputersListComputerId</code>.
   * @alias module:model/ComputersListComputerId
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>ComputersListComputerId</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ComputersListComputerId} obj Optional instance to populate.
   * @return {module:model/ComputersListComputerId} The populated <code>ComputersListComputerId</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new ComputersListComputerId();
      if (data.hasOwnProperty('accountinfo'))
        obj.accountinfo = ApiClient.convertToType(data['accountinfo'], [ComputersListComputerIdAccountinfo]);
      if (data.hasOwnProperty('batteries'))
        obj.batteries = ApiClient.convertToType(data['batteries'], ['String']);
      if (data.hasOwnProperty('bios'))
        obj.bios = ApiClient.convertToType(data['bios'], [ComputersListComputerIdBios]);
    }
    return obj;
  }
}

/**
 * @member {Array.<module:model/ComputersListComputerIdAccountinfo>} accountinfo
 */
ComputersListComputerId.prototype.accountinfo = undefined;

/**
 * @member {Array.<String>} batteries
 */
ComputersListComputerId.prototype.batteries = undefined;

/**
 * @member {Array.<module:model/ComputersListComputerIdBios>} bios
 */
ComputersListComputerId.prototype.bios = undefined;

