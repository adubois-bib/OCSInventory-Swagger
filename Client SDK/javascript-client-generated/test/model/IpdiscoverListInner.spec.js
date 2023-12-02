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
    describe('IpdiscoverListInner', function() {
      beforeEach(function() {
        instance = new OcsInventoryRestApi.IpdiscoverListInner();
      });

      it('should create an instance of IpdiscoverListInner', function() {
        // TODO: update the code to test IpdiscoverListInner
        expect(instance).to.be.a(OcsInventoryRestApi.IpdiscoverListInner);
      });

      it('should have the property NETID (base name: "NETID")', function() {
        // TODO: update the code to test the property NETID
        expect(instance).to.have.property('NETID');
        // expect(instance.NETID).to.be(expectedValueLiteral);
      });

    });
  });

}));
