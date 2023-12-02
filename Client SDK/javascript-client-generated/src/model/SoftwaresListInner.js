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
 * The SoftwaresListInner model module.
 * @module model/SoftwaresListInner
 * @version 1.0
 */
export class SoftwaresListInner {
  /**
   * Constructs a new <code>SoftwaresListInner</code>.
   * @alias module:model/SoftwaresListInner
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>SoftwaresListInner</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SoftwaresListInner} obj Optional instance to populate.
   * @return {module:model/SoftwaresListInner} The populated <code>SoftwaresListInner</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SoftwaresListInner();
      if (data.hasOwnProperty('NAME'))
        obj.NAME = ApiClient.convertToType(data['NAME'], 'String');
      if (data.hasOwnProperty('PUBLISHER'))
        obj.PUBLISHER = ApiClient.convertToType(data['PUBLISHER'], 'String');
      if (data.hasOwnProperty('VERSION'))
        obj.VERSION = ApiClient.convertToType(data['VERSION'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} NAME
 */
SoftwaresListInner.prototype.NAME = undefined;

/**
 * @member {String} PUBLISHER
 */
SoftwaresListInner.prototype.PUBLISHER = undefined;

/**
 * @member {String} VERSION
 */
SoftwaresListInner.prototype.VERSION = undefined;
