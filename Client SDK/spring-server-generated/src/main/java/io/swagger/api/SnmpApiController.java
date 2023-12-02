package io.swagger.api;

import io.swagger.model.SNMPDetail;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-12-02T10:36:41.547536827Z[GMT]")
@RestController
public class SnmpApiController implements SnmpApi {

    private static final Logger log = LoggerFactory.getLogger(SnmpApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public SnmpApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<SNMPDetail> snmpSnmpTypeGet(@Parameter(in = ParameterIn.PATH, description = "Name of the snmp type you want to list", required=true, schema=@Schema()) @PathVariable("snmp_type") String snmpType,@Parameter(in = ParameterIn.QUERY, description = "Start offset of the query" ,schema=@Schema()) @Valid @RequestParam(value = "start", required = false) Integer start,@Parameter(in = ParameterIn.QUERY, description = "Limit offset of the query" ,schema=@Schema()) @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SNMPDetail>(objectMapper.readValue("[ {\n  \"DefaultAddressIP\" : \"127.0.0.1\",\n  \"DefaultDescription\" : \"This is a description\",\n  \"LASTDATE\" : \"2023-06-08T12:22:18Z\",\n  \"DefaultUptime\" : \"DefaultUptime\",\n  \"DefaultGateway\" : \"172.18.25.254\",\n  \"DefaultName\" : \"My Equipment\",\n  \"DefaultMacAddress\" : \"DefaultMacAddress\",\n  \"ID\" : 1,\n  \"DefaultLocation\" : \"Here\"\n}, {\n  \"DefaultAddressIP\" : \"127.0.0.1\",\n  \"DefaultDescription\" : \"This is a description\",\n  \"LASTDATE\" : \"2023-06-08T12:22:18Z\",\n  \"DefaultUptime\" : \"DefaultUptime\",\n  \"DefaultGateway\" : \"172.18.25.254\",\n  \"DefaultName\" : \"My Equipment\",\n  \"DefaultMacAddress\" : \"DefaultMacAddress\",\n  \"ID\" : 1,\n  \"DefaultLocation\" : \"Here\"\n} ]", SNMPDetail.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SNMPDetail>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SNMPDetail>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SNMPDetail> snmpSnmpTypeIdGet(@Parameter(in = ParameterIn.PATH, description = "Name of the snmp type you want to list", required=true, schema=@Schema()) @PathVariable("snmp_type") String snmpType,@Parameter(in = ParameterIn.PATH, description = "Identifiant en base de données de l'équipement", required=true, schema=@Schema()) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SNMPDetail>(objectMapper.readValue("[ {\n  \"DefaultAddressIP\" : \"127.0.0.1\",\n  \"DefaultDescription\" : \"This is a description\",\n  \"LASTDATE\" : \"2023-06-08T12:22:18Z\",\n  \"DefaultUptime\" : \"DefaultUptime\",\n  \"DefaultGateway\" : \"172.18.25.254\",\n  \"DefaultName\" : \"My Equipment\",\n  \"DefaultMacAddress\" : \"DefaultMacAddress\",\n  \"ID\" : 1,\n  \"DefaultLocation\" : \"Here\"\n}, {\n  \"DefaultAddressIP\" : \"127.0.0.1\",\n  \"DefaultDescription\" : \"This is a description\",\n  \"LASTDATE\" : \"2023-06-08T12:22:18Z\",\n  \"DefaultUptime\" : \"DefaultUptime\",\n  \"DefaultGateway\" : \"172.18.25.254\",\n  \"DefaultName\" : \"My Equipment\",\n  \"DefaultMacAddress\" : \"DefaultMacAddress\",\n  \"ID\" : 1,\n  \"DefaultLocation\" : \"Here\"\n} ]", SNMPDetail.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SNMPDetail>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SNMPDetail>(HttpStatus.NOT_IMPLEMENTED);
    }

}
