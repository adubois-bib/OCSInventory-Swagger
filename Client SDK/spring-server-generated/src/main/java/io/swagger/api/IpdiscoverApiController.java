package io.swagger.api;

import io.swagger.model.IpdiscoverList;
import io.swagger.model.IpdiscoverNetdevices;
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
public class IpdiscoverApiController implements IpdiscoverApi {

    private static final Logger log = LoggerFactory.getLogger(IpdiscoverApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public IpdiscoverApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<IpdiscoverList> ipdiscoverGet(@Parameter(in = ParameterIn.QUERY, description = "Start offset of the query" ,schema=@Schema()) @Valid @RequestParam(value = "start", required = false) Integer start,@Parameter(in = ParameterIn.QUERY, description = "Limit offset of the query" ,schema=@Schema()) @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<IpdiscoverList>(objectMapper.readValue("[ {\n  \"NETID\" : \"172.18.25.0\"\n}, {\n  \"NETID\" : \"172.18.25.0\"\n} ]", IpdiscoverList.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<IpdiscoverList>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<IpdiscoverList>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<IpdiscoverNetdevices> ipdiscoverNetworkNetidGet(@Parameter(in = ParameterIn.PATH, description = "Start offset of the query", required=true, schema=@Schema()) @PathVariable("netid") Integer netid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<IpdiscoverNetdevices>(objectMapper.readValue("[ {\n  \"DATE\" : \"2023-06-08T12:15:08Z\",\n  \"HARDWARE_ID\" : 16,\n  \"NETID\" : \"172.18.25.0\",\n  \"IP\" : \"172.18.25.254\",\n  \"TAG\" : \"DEV-MACHINE\",\n  \"MAC\" : \"00:0d:b9:51:fc:aa\",\n  \"MASK\" : \"255.255.255.0\",\n  \"NAME\" : \"-\"\n}, {\n  \"DATE\" : \"2023-06-08T12:15:08Z\",\n  \"HARDWARE_ID\" : 16,\n  \"NETID\" : \"172.18.25.0\",\n  \"IP\" : \"172.18.25.254\",\n  \"TAG\" : \"DEV-MACHINE\",\n  \"MAC\" : \"00:0d:b9:51:fc:aa\",\n  \"MASK\" : \"255.255.255.0\",\n  \"NAME\" : \"-\"\n} ]", IpdiscoverNetdevices.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<IpdiscoverNetdevices>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<IpdiscoverNetdevices>(HttpStatus.NOT_IMPLEMENTED);
    }

}
