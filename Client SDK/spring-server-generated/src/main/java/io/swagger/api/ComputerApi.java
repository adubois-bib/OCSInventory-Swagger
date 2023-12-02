/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.50).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.ComputerDetail;
import io.swagger.model.ComputersList;
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
public interface ComputerApi {

    @Operation(summary = "Get a computer by its ID", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ComputersList.class))),
        
        @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid") })
    @RequestMapping(value = "/computer/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ComputersList> computerIdGet(@Parameter(in = ParameterIn.PATH, description = "ID of the computer in OCS database", required=true, schema=@Schema()) @PathVariable("id") Integer id);


    @Operation(summary = "Get sections informations of a specific computer", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ComputerDetail.class))),
        
        @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid") })
    @RequestMapping(value = "/computer/{id}/{sections}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ComputerDetail> computerIdSectionsGet(@Parameter(in = ParameterIn.PATH, description = "ID of the computer in OCS database", required=true, schema=@Schema()) @PathVariable("id") Integer id, @Parameter(in = ParameterIn.PATH, description = "Name of the requested section (i.e -> bios, software, etc..)", required=true, schema=@Schema()) @PathVariable("sections") String sections, @Parameter(in = ParameterIn.QUERY, description = "Search on a specific column of the specific section." ,schema=@Schema()) @Valid @RequestParam(value = "where", required = false) String where, @Parameter(in = ParameterIn.QUERY, description = "Search operator (like, not like, =, !=, <, >, <=, >=). Mandatory if where parameter is set." ,schema=@Schema()) @Valid @RequestParam(value = "operator", required = false) String operator);

}

