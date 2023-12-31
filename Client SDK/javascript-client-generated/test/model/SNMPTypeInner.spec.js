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
    describe('SNMPTypeInner', function() {
      beforeEach(function() {
        instance = new OcsInventoryRestApi.SNMPTypeInner();
      });

      it('should create an instance of SNMPTypeInner', function() {
        // TODO: update the code to test SNMPTypeInner
        expect(instance).to.be.a(OcsInventoryRestApi.SNMPTypeInner);
      });

      it('should have the property ID (base name: "ID")', function() {
        // TODO: update the code to test the property ID
        expect(instance).to.have.property('ID');
        // expect(instance.ID).to.be(expectedValueLiteral);
      });

      it('should have the property TABLE_TYPE_NAME (base name: "TABLE_TYPE_NAME")', function() {
        // TODO: update the code to test the property TABLE_TYPE_NAME
        expect(instance).to.have.property('TABLE_TYPE_NAME');
        // expect(instance.TABLE_TYPE_NAME).to.be(expectedValueLiteral);
      });

      it('should have the property TYPE_NAME (base name: "TYPE_NAME")', function() {
        // TODO: update the code to test the property TYPE_NAME
        expect(instance).to.have.property('TYPE_NAME');
        // expect(instance.TYPE_NAME).to.be(expectedValueLiteral);
      });

    });
  });

}));
