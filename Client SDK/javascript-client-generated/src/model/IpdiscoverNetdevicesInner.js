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

/**
 * The IpdiscoverNetdevicesInner model module.
 * @module model/IpdiscoverNetdevicesInner
 * @version 1.0
 */
export class IpdiscoverNetdevicesInner {
  /**
   * Constructs a new <code>IpdiscoverNetdevicesInner</code>.
   * @alias module:model/IpdiscoverNetdevicesInner
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>IpdiscoverNetdevicesInner</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/IpdiscoverNetdevicesInner} obj Optional instance to populate.
   * @return {module:model/IpdiscoverNetdevicesInner} The populated <code>IpdiscoverNetdevicesInner</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new IpdiscoverNetdevicesInner();
      if (data.hasOwnProperty('DATE'))
        obj.DATE = ApiClient.convertToType(data['DATE'], 'Date');
      if (data.hasOwnProperty('HARDWARE_ID'))
        obj.HARDWARE_ID = ApiClient.convertToType(data['HARDWARE_ID'], 'Number');
      if (data.hasOwnProperty('IP'))
        obj.IP = ApiClient.convertToType(data['IP'], 'String');
      if (data.hasOwnProperty('MAC'))
        obj.MAC = ApiClient.convertToType(data['MAC'], 'String');
      if (data.hasOwnProperty('MASK'))
        obj.MASK = ApiClient.convertToType(data['MASK'], 'String');
      if (data.hasOwnProperty('NAME'))
        obj.NAME = ApiClient.convertToType(data['NAME'], 'String');
      if (data.hasOwnProperty('NETID'))
        obj.NETID = ApiClient.convertToType(data['NETID'], 'String');
      if (data.hasOwnProperty('TAG'))
        obj.TAG = ApiClient.convertToType(data['TAG'], 'String');
    }
    return obj;
  }
}

/**
 * @member {Date} DATE
 */
IpdiscoverNetdevicesInner.prototype.DATE = undefined;

/**
 * @member {Number} HARDWARE_ID
 */
IpdiscoverNetdevicesInner.prototype.HARDWARE_ID = undefined;

/**
 * @member {String} IP
 */
IpdiscoverNetdevicesInner.prototype.IP = undefined;

/**
 * @member {String} MAC
 */
IpdiscoverNetdevicesInner.prototype.MAC = undefined;

/**
 * @member {String} MASK
 */
IpdiscoverNetdevicesInner.prototype.MASK = undefined;

/**
 * @member {String} NAME
 */
IpdiscoverNetdevicesInner.prototype.NAME = undefined;

/**
 * @member {String} NETID
 */
IpdiscoverNetdevicesInner.prototype.NETID = undefined;

/**
 * @member {String} TAG
 */
IpdiscoverNetdevicesInner.prototype.TAG = undefined;

