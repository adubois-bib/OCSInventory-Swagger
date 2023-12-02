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
(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.OcsInventoryRestApi);
  }
}(this, function(expect, OcsInventoryRestApi) {
  'use strict';

  var instance;

  describe('(package)', function() {
    describe('ComputersListComputerIdAccountinfo', function() {
      beforeEach(function() {
        instance = new OcsInventoryRestApi.ComputersListComputerIdAccountinfo();
      });

      it('should create an instance of ComputersListComputerIdAccountinfo', function() {
        // TODO: update the code to test ComputersListComputerIdAccountinfo
        expect(instance).to.be.a(OcsInventoryRestApi.ComputersListComputerIdAccountinfo);
      });

      it('should have the property HARDWARE_ID (base name: "HARDWARE_ID")', function() {
        // TODO: update the code to test the property HARDWARE_ID
        expect(instance).to.have.property('HARDWARE_ID');
        // expect(instance.HARDWARE_ID).to.be(expectedValueLiteral);
      });

      it('should have the property TAG (base name: "TAG")', function() {
        // TODO: update the code to test the property TAG
        expect(instance).to.have.property('TAG');
        // expect(instance.TAG).to.be(expectedValueLiteral);
      });

    });
  });

}));
