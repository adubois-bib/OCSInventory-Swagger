package io.swagger.api;

import io.swagger.model.ComputersList;
import io.swagger.model.ListOfID;
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
public class ComputersApiController implements ComputersApi {

    private static final Logger log = LoggerFactory.getLogger(ComputersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ComputersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<ComputersList>> computersGet(@Parameter(in = ParameterIn.QUERY, description = "Start offset of the query" ,schema=@Schema()) @Valid @RequestParam(value = "start", required = false) Integer start,@Parameter(in = ParameterIn.QUERY, description = "Limit offset of the query" ,schema=@Schema()) @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ComputersList>>(objectMapper.readValue("[ {\n  \"{computer_id}\" : {\n    \"accountinfo\" : [ {\n      \"HARDWARE_ID\" : 16,\n      \"TAG\" : \"DEV-MACHINE\"\n    }, {\n      \"HARDWARE_ID\" : 16,\n      \"TAG\" : \"DEV-MACHINE\"\n    } ],\n    \"batteries\" : [ \"batteries\", \"batteries\" ],\n    \"bios\" : [ {\n      \"BDATE\" : \"04/16/2021\",\n      \"HARDWARE_ID\" : 16,\n      \"SMODEL\" : \"PowerEdge R340\",\n      \"BMANUFACTURER\" : \"Dell Inc.\",\n      \"BVERSION\" : \"2.5.1\",\n      \"MMANUFACTURER\" : \"Dell Inc.\",\n      \"MSN\" : \"\",\n      \"MMODEL\" : \"045M96\",\n      \"SMANUFACTURER\" : \"\",\n      \"ASSETTAG\" : \"\",\n      \"TYPE\" : \"Rack Mount Chassis\",\n      \"SSN\" : \"\"\n    }, {\n      \"BDATE\" : \"04/16/2021\",\n      \"HARDWARE_ID\" : 16,\n      \"SMODEL\" : \"PowerEdge R340\",\n      \"BMANUFACTURER\" : \"Dell Inc.\",\n      \"BVERSION\" : \"2.5.1\",\n      \"MMANUFACTURER\" : \"Dell Inc.\",\n      \"MSN\" : \"\",\n      \"MMODEL\" : \"045M96\",\n      \"SMANUFACTURER\" : \"\",\n      \"ASSETTAG\" : \"\",\n      \"TYPE\" : \"Rack Mount Chassis\",\n      \"SSN\" : \"\"\n    } ]\n  }\n}, {\n  \"{computer_id}\" : {\n    \"accountinfo\" : [ {\n      \"HARDWARE_ID\" : 16,\n      \"TAG\" : \"DEV-MACHINE\"\n    }, {\n      \"HARDWARE_ID\" : 16,\n      \"TAG\" : \"DEV-MACHINE\"\n    } ],\n    \"batteries\" : [ \"batteries\", \"batteries\" ],\n    \"bios\" : [ {\n      \"BDATE\" : \"04/16/2021\",\n      \"HARDWARE_ID\" : 16,\n      \"SMODEL\" : \"PowerEdge R340\",\n      \"BMANUFACTURER\" : \"Dell Inc.\",\n      \"BVERSION\" : \"2.5.1\",\n      \"MMANUFACTURER\" : \"Dell Inc.\",\n      \"MSN\" : \"\",\n      \"MMODEL\" : \"045M96\",\n      \"SMANUFACTURER\" : \"\",\n      \"ASSETTAG\" : \"\",\n      \"TYPE\" : \"Rack Mount Chassis\",\n      \"SSN\" : \"\"\n    }, {\n      \"BDATE\" : \"04/16/2021\",\n      \"HARDWARE_ID\" : 16,\n      \"SMODEL\" : \"PowerEdge R340\",\n      \"BMANUFACTURER\" : \"Dell Inc.\",\n      \"BVERSION\" : \"2.5.1\",\n      \"MMANUFACTURER\" : \"Dell Inc.\",\n      \"MSN\" : \"\",\n      \"MMODEL\" : \"045M96\",\n      \"SMANUFACTURER\" : \"\",\n      \"ASSETTAG\" : \"\",\n      \"TYPE\" : \"Rack Mount Chassis\",\n      \"SSN\" : \"\"\n    } ]\n  }\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ComputersList>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ComputersList>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ListOfID>> computersLastupdateTimestampGet(@Parameter(in = ParameterIn.PATH, description = "Timestamp of the number of days to count down from the current date. Optional.", required=true, schema=@Schema()) @PathVariable("timestamp") Integer timestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ListOfID>>(objectMapper.readValue("[ {\n  \"ID\" : 1942\n}, {\n  \"ID\" : 1942\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ListOfID>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ListOfID>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ListOfID>> computersListIDGet(@Parameter(in = ParameterIn.QUERY, description = "Start offset of the query" ,schema=@Schema()) @Valid @RequestParam(value = "start", required = false) Integer start,@Parameter(in = ParameterIn.QUERY, description = "Limit offset of the query" ,schema=@Schema()) @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ListOfID>>(objectMapper.readValue("[ {\n  \"ID\" : 1942\n}, {\n  \"ID\" : 1942\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ListOfID>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ListOfID>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
