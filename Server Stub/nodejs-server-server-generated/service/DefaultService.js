'use strict';


/**
 * Get a computer by its ID
 *
 * id Integer ID of the computer in OCS database
 * returns computersList
 **/
exports.computerIdGET = function(id) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "{computer_id}" : {
    "accountinfo" : [ {
      "HARDWARE_ID" : 16,
      "TAG" : "DEV-MACHINE"
    }, {
      "HARDWARE_ID" : 16,
      "TAG" : "DEV-MACHINE"
    } ],
    "batteries" : [ "batteries", "batteries" ],
    "bios" : [ {
      "BDATE" : "04/16/2021",
      "HARDWARE_ID" : 16,
      "SMODEL" : "PowerEdge R340",
      "BMANUFACTURER" : "Dell Inc.",
      "BVERSION" : "2.5.1",
      "MMANUFACTURER" : "Dell Inc.",
      "MSN" : "",
      "MMODEL" : "045M96",
      "SMANUFACTURER" : "",
      "ASSETTAG" : "",
      "TYPE" : "Rack Mount Chassis",
      "SSN" : ""
    }, {
      "BDATE" : "04/16/2021",
      "HARDWARE_ID" : 16,
      "SMODEL" : "PowerEdge R340",
      "BMANUFACTURER" : "Dell Inc.",
      "BVERSION" : "2.5.1",
      "MMANUFACTURER" : "Dell Inc.",
      "MSN" : "",
      "MMODEL" : "045M96",
      "SMANUFACTURER" : "",
      "ASSETTAG" : "",
      "TYPE" : "Rack Mount Chassis",
      "SSN" : ""
    } ]
  }
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Get sections informations of a specific computer
 *
 * id Integer ID of the computer in OCS database
 * sections String Name of the requested section (i.e -> bios, software, etc..)
 * where String Search on a specific column of the specific section. (optional)
 * operator String Search operator (like, not like, =, !=, <, >, <=, >=). Mandatory if where parameter is set. (optional)
 * returns computerDetail
 **/
exports.computerIdSectionsGET = function(id,sections,where,operator) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "{computer_id}" : {
    "bios" : [ {
      "BDATE" : "04/16/2021",
      "HARDWARE_ID" : 16,
      "SMODEL" : "PowerEdge R340",
      "BMANUFACTURER" : "Dell Inc.",
      "BVERSION" : "2.5.1",
      "MMANUFACTURER" : "Dell Inc.",
      "MSN" : "",
      "MMODEL" : "045M96",
      "SMANUFACTURER" : "",
      "ASSETTAG" : "",
      "TYPE" : "Rack Mount Chassis",
      "SSN" : ""
    }, {
      "BDATE" : "04/16/2021",
      "HARDWARE_ID" : 16,
      "SMODEL" : "PowerEdge R340",
      "BMANUFACTURER" : "Dell Inc.",
      "BVERSION" : "2.5.1",
      "MMANUFACTURER" : "Dell Inc.",
      "MSN" : "",
      "MMODEL" : "045M96",
      "SMANUFACTURER" : "",
      "ASSETTAG" : "",
      "TYPE" : "Rack Mount Chassis",
      "SSN" : ""
    } ]
  }
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Get a list of computers with its detail
 *
 * start Integer Start offset of the query (optional)
 * limit Integer Limit offset of the query (optional)
 * returns List
 **/
exports.computersGET = function(start,limit) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "{computer_id}" : {
    "accountinfo" : [ {
      "HARDWARE_ID" : 16,
      "TAG" : "DEV-MACHINE"
    }, {
      "HARDWARE_ID" : 16,
      "TAG" : "DEV-MACHINE"
    } ],
    "batteries" : [ "batteries", "batteries" ],
    "bios" : [ {
      "BDATE" : "04/16/2021",
      "HARDWARE_ID" : 16,
      "SMODEL" : "PowerEdge R340",
      "BMANUFACTURER" : "Dell Inc.",
      "BVERSION" : "2.5.1",
      "MMANUFACTURER" : "Dell Inc.",
      "MSN" : "",
      "MMODEL" : "045M96",
      "SMANUFACTURER" : "",
      "ASSETTAG" : "",
      "TYPE" : "Rack Mount Chassis",
      "SSN" : ""
    }, {
      "BDATE" : "04/16/2021",
      "HARDWARE_ID" : 16,
      "SMODEL" : "PowerEdge R340",
      "BMANUFACTURER" : "Dell Inc.",
      "BVERSION" : "2.5.1",
      "MMANUFACTURER" : "Dell Inc.",
      "MSN" : "",
      "MMODEL" : "045M96",
      "SMANUFACTURER" : "",
      "ASSETTAG" : "",
      "TYPE" : "Rack Mount Chassis",
      "SSN" : ""
    } ]
  }
}, {
  "{computer_id}" : {
    "accountinfo" : [ {
      "HARDWARE_ID" : 16,
      "TAG" : "DEV-MACHINE"
    }, {
      "HARDWARE_ID" : 16,
      "TAG" : "DEV-MACHINE"
    } ],
    "batteries" : [ "batteries", "batteries" ],
    "bios" : [ {
      "BDATE" : "04/16/2021",
      "HARDWARE_ID" : 16,
      "SMODEL" : "PowerEdge R340",
      "BMANUFACTURER" : "Dell Inc.",
      "BVERSION" : "2.5.1",
      "MMANUFACTURER" : "Dell Inc.",
      "MSN" : "",
      "MMODEL" : "045M96",
      "SMANUFACTURER" : "",
      "ASSETTAG" : "",
      "TYPE" : "Rack Mount Chassis",
      "SSN" : ""
    }, {
      "BDATE" : "04/16/2021",
      "HARDWARE_ID" : 16,
      "SMODEL" : "PowerEdge R340",
      "BMANUFACTURER" : "Dell Inc.",
      "BVERSION" : "2.5.1",
      "MMANUFACTURER" : "Dell Inc.",
      "MSN" : "",
      "MMODEL" : "045M96",
      "SMANUFACTURER" : "",
      "ASSETTAG" : "",
      "TYPE" : "Rack Mount Chassis",
      "SSN" : ""
    } ]
  }
} ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Get a ID list of computers update during the provided timestamp
 *
 * timestamp Integer Timestamp of the number of days to count down from the current date. Optional.
 * returns List
 **/
exports.computersLastupdateTimestampGET = function(timestamp) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "ID" : 1942
}, {
  "ID" : 1942
} ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Get a ID list of all computers in the OCS database
 *
 * start Integer Start offset of the query (optional)
 * limit Integer Limit offset of the query (optional)
 * returns List
 **/
exports.computersListIDGET = function(start,limit) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "ID" : 1942
}, {
  "ID" : 1942
} ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * List IPDiscover network list
 *
 * start Integer Start offset of the query (optional)
 * limit Integer Limit offset of the query (optional)
 * returns ipdiscoverList
 **/
exports.ipdiscoverGET = function(start,limit) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "NETID" : "172.18.25.0"
}, {
  "NETID" : "172.18.25.0"
} ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Get list of network devices scanned on one network
 *
 * netid Integer Start offset of the query
 * returns ipdiscoverNetdevices
 **/
exports.ipdiscoverNetworkNetidGET = function(netid) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "DATE" : "2023-06-08T12:15:08Z",
  "HARDWARE_ID" : 16,
  "NETID" : "172.18.25.0",
  "IP" : "172.18.25.254",
  "TAG" : "DEV-MACHINE",
  "MAC" : "00:0d:b9:51:fc:aa",
  "MASK" : "255.255.255.0",
  "NAME" : "-"
}, {
  "DATE" : "2023-06-08T12:15:08Z",
  "HARDWARE_ID" : 16,
  "NETID" : "172.18.25.0",
  "IP" : "172.18.25.254",
  "TAG" : "DEV-MACHINE",
  "MAC" : "00:0d:b9:51:fc:aa",
  "MASK" : "255.255.255.0",
  "NAME" : "-"
} ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Get snmp device list of a specific snmp type
 *
 * snmp_type String Name of the snmp type you want to list
 * start Integer Start offset of the query (optional)
 * limit Integer Limit offset of the query (optional)
 * returns SNMPDetail
 **/
exports.snmpSnmp_typeGET = function(snmp_type,start,limit) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "DefaultAddressIP" : "127.0.0.1",
  "DefaultDescription" : "This is a description",
  "LASTDATE" : "2023-06-08T12:22:18Z",
  "DefaultUptime" : "DefaultUptime",
  "DefaultGateway" : "172.18.25.254",
  "DefaultName" : "My Equipment",
  "DefaultMacAddress" : "DefaultMacAddress",
  "ID" : 1,
  "DefaultLocation" : "Here"
}, {
  "DefaultAddressIP" : "127.0.0.1",
  "DefaultDescription" : "This is a description",
  "LASTDATE" : "2023-06-08T12:22:18Z",
  "DefaultUptime" : "DefaultUptime",
  "DefaultGateway" : "172.18.25.254",
  "DefaultName" : "My Equipment",
  "DefaultMacAddress" : "DefaultMacAddress",
  "ID" : 1,
  "DefaultLocation" : "Here"
} ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Get a device from a snmp type with its ID
 *
 * snmp_type String Name of the snmp type you want to list
 * id Integer Identifiant en base de données de l'équipement
 * returns SNMPDetail
 **/
exports.snmpSnmp_typeIdGET = function(snmp_type,id) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "DefaultAddressIP" : "127.0.0.1",
  "DefaultDescription" : "This is a description",
  "LASTDATE" : "2023-06-08T12:22:18Z",
  "DefaultUptime" : "DefaultUptime",
  "DefaultGateway" : "172.18.25.254",
  "DefaultName" : "My Equipment",
  "DefaultMacAddress" : "DefaultMacAddress",
  "ID" : 1,
  "DefaultLocation" : "Here"
}, {
  "DefaultAddressIP" : "127.0.0.1",
  "DefaultDescription" : "This is a description",
  "LASTDATE" : "2023-06-08T12:22:18Z",
  "DefaultUptime" : "DefaultUptime",
  "DefaultGateway" : "172.18.25.254",
  "DefaultName" : "My Equipment",
  "DefaultMacAddress" : "DefaultMacAddress",
  "ID" : 1,
  "DefaultLocation" : "Here"
} ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Get a SNMP type list
 *
 * returns SNMPType
 **/
exports.snmpsTypeListGET = function() {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "TABLE_TYPE_NAME" : "snmp_default",
  "ID" : 13,
  "TYPE_NAME" : "Default"
}, {
  "TABLE_TYPE_NAME" : "snmp_default",
  "ID" : 13,
  "TYPE_NAME" : "Default"
} ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Get software list from database
 *
 * start Integer Start offset of the query (optional)
 * limit Integer Limit offset of the query (optional)
 * soft String Name of the software you want to search (optional) (optional)
 * returns softwaresList
 **/
exports.softwaresGET = function(start,limit,soft) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "PUBLISHER" : "Igor Pavlov",
  "VERSION" : "16.02",
  "NAME" : "7-Zip 16.02"
}, {
  "PUBLISHER" : "Igor Pavlov",
  "VERSION" : "16.02",
  "NAME" : "7-Zip 16.02"
} ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

