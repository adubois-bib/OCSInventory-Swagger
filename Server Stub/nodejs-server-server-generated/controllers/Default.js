'use strict';

var utils = require('../utils/writer.js');
var Default = require('../service/DefaultService');

module.exports.computerIdGET = function computerIdGET (req, res, next, id) {
  Default.computerIdGET(id)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.computerIdSectionsGET = function computerIdSectionsGET (req, res, next, id, sections, where, operator) {
  Default.computerIdSectionsGET(id, sections, where, operator)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.computersGET = function computersGET (req, res, next, start, limit) {
  Default.computersGET(start, limit)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.computersLastupdateTimestampGET = function computersLastupdateTimestampGET (req, res, next, timestamp) {
  Default.computersLastupdateTimestampGET(timestamp)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.computersListIDGET = function computersListIDGET (req, res, next, start, limit) {
  Default.computersListIDGET(start, limit)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.ipdiscoverGET = function ipdiscoverGET (req, res, next, start, limit) {
  Default.ipdiscoverGET(start, limit)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.ipdiscoverNetworkNetidGET = function ipdiscoverNetworkNetidGET (req, res, next, netid) {
  Default.ipdiscoverNetworkNetidGET(netid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.snmpSnmp_typeGET = function snmpSnmp_typeGET (req, res, next, snmp_type, start, limit) {
  Default.snmpSnmp_typeGET(snmp_type, start, limit)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.snmpSnmp_typeIdGET = function snmpSnmp_typeIdGET (req, res, next, snmp_type, id) {
  Default.snmpSnmp_typeIdGET(snmp_type, id)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.snmpsTypeListGET = function snmpsTypeListGET (req, res, next) {
  Default.snmpsTypeListGET()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.softwaresGET = function softwaresGET (req, res, next, start, limit, soft) {
  Default.softwaresGET(start, limit, soft)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
