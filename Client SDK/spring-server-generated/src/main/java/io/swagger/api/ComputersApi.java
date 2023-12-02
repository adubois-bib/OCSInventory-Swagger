/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.50).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.ComputersList;
import io.swagger.model.ListOfID;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-12-02T10:36:41.547536827Z[GMT]")
@Validated
public interface ComputersApi {

    @Operation(summary = "Get a list of computers with its detail", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ComputersList.class)))),
        
        @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid") })
    @RequestMapping(value = "/computers",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<ComputersList>> computersGet(@Parameter(in = ParameterIn.QUERY, description = "Start offset of the query" ,schema=@Schema()) @Valid @RequestParam(value = "start", required = false) Integer start, @Parameter(in = ParameterIn.QUERY, description = "Limit offset of the query" ,schema=@Schema()) @Valid @RequestParam(value = "limit", required = false) Integer limit);


    @Operation(summary = "Get a ID list of computers update during the provided timestamp", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ListOfID.class)))),
        
        @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid") })
    @RequestMapping(value = "/computers/lastupdate/{timestamp}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<ListOfID>> computersLastupdateTimestampGet(@Parameter(in = ParameterIn.PATH, description = "Timestamp of the number of days to count down from the current date. Optional.", required=true, schema=@Schema()) @PathVariable("timestamp") Integer timestamp);


    @Operation(summary = "Get a ID list of all computers in the OCS database", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ListOfID.class)))),
        
        @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid") })
    @RequestMapping(value = "/computers/listID",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<ListOfID>> computersListIDGet(@Parameter(in = ParameterIn.QUERY, description = "Start offset of the query" ,schema=@Schema()) @Valid @RequestParam(value = "start", required = false) Integer start, @Parameter(in = ParameterIn.QUERY, description = "Limit offset of the query" ,schema=@Schema()) @Valid @RequestParam(value = "limit", required = false) Integer limit);

}

