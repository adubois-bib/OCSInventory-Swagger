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
import {ApiClient} from './ApiClient';
import {ComputerDetail} from './model/ComputerDetail';
import {ComputerDetailComputerId} from './model/ComputerDetailComputerId';
import {ComputersList} from './model/ComputersList';
import {ComputersListComputerId} from './model/ComputersListComputerId';
import {ComputersListComputerIdAccountinfo} from './model/ComputersListComputerIdAccountinfo';
import {ComputersListComputerIdBios} from './model/ComputersListComputerIdBios';
import {IpdiscoverList} from './model/IpdiscoverList';
import {IpdiscoverListInner} from './model/IpdiscoverListInner';
import {IpdiscoverNetdevices} from './model/IpdiscoverNetdevices';
import {IpdiscoverNetdevicesInner} from './model/IpdiscoverNetdevicesInner';
import {ListOfID} from './model/ListOfID';
import {SNMPDetail} from './model/SNMPDetail';
import {SNMPDetailInner} from './model/SNMPDetailInner';
import {SNMPType} from './model/SNMPType';
import {SNMPTypeInner} from './model/SNMPTypeInner';
import {SoftwaresList} from './model/SoftwaresList';
import {SoftwaresListInner} from './model/SoftwaresListInner';
import {DefaultApi} from './api/DefaultApi';

/**
* Object.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var OcsInventoryRestApi = require('index'); // See note below*.
* var xxxSvc = new OcsInventoryRestApi.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new OcsInventoryRestApi.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* <em>*NOTE: For a top-level AMD script, use require(['index'], function(){...})
* and put the application logic within the callback function.</em>
* </p>
* <p>
* A non-AMD browser application (discouraged) might do something like this:
* <pre>
* var xxxSvc = new OcsInventoryRestApi.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new OcsInventoryRestApi.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* </p>
* @module index
* @version 1.0
*/
export {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient,

    /**
     * The ComputerDetail model constructor.
     * @property {module:model/ComputerDetail}
     */
    ComputerDetail,

    /**
     * The ComputerDetailComputerId model constructor.
     * @property {module:model/ComputerDetailComputerId}
     */
    ComputerDetailComputerId,

    /**
     * The ComputersList model constructor.
     * @property {module:model/ComputersList}
     */
    ComputersList,

    /**
     * The ComputersListComputerId model constructor.
     * @property {module:model/ComputersListComputerId}
     */
    ComputersListComputerId,

    /**
     * The ComputersListComputerIdAccountinfo model constructor.
     * @property {module:model/ComputersListComputerIdAccountinfo}
     */
    ComputersListComputerIdAccountinfo,

    /**
     * The ComputersListComputerIdBios model constructor.
     * @property {module:model/ComputersListComputerIdBios}
     */
    ComputersListComputerIdBios,

    /**
     * The IpdiscoverList model constructor.
     * @property {module:model/IpdiscoverList}
     */
    IpdiscoverList,

    /**
     * The IpdiscoverListInner model constructor.
     * @property {module:model/IpdiscoverListInner}
     */
    IpdiscoverListInner,

    /**
     * The IpdiscoverNetdevices model constructor.
     * @property {module:model/IpdiscoverNetdevices}
     */
    IpdiscoverNetdevices,

    /**
     * The IpdiscoverNetdevicesInner model constructor.
     * @property {module:model/IpdiscoverNetdevicesInner}
     */
    IpdiscoverNetdevicesInner,

    /**
     * The ListOfID model constructor.
     * @property {module:model/ListOfID}
     */
    ListOfID,

    /**
     * The SNMPDetail model constructor.
     * @property {module:model/SNMPDetail}
     */
    SNMPDetail,

    /**
     * The SNMPDetailInner model constructor.
     * @property {module:model/SNMPDetailInner}
     */
    SNMPDetailInner,

    /**
     * The SNMPType model constructor.
     * @property {module:model/SNMPType}
     */
    SNMPType,

    /**
     * The SNMPTypeInner model constructor.
     * @property {module:model/SNMPTypeInner}
     */
    SNMPTypeInner,

    /**
     * The SoftwaresList model constructor.
     * @property {module:model/SoftwaresList}
     */
    SoftwaresList,

    /**
     * The SoftwaresListInner model constructor.
     * @property {module:model/SoftwaresListInner}
     */
    SoftwaresListInner,

    /**
    * The DefaultApi service constructor.
    * @property {module:api/DefaultApi}
    */
    DefaultApi
};
