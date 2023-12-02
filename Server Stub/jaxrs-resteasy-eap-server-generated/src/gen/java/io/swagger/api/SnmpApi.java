package io.swagger.api;

import io.swagger.model.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.SNMPDetail;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
@Path("/snmp")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2023-12-02T10:39:09.334447740Z[GMT]")
public interface SnmpApi  {
   
    @GET
    @Path("/{snmp_type}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get snmp device list of a specific snmp type", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={  })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = SNMPDetail.class))),
                @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid")
         })
    Response snmpSnmpTypeGet( @PathParam("snmp_type") String snmpType, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit,@Context SecurityContext securityContext);

    @GET
    @Path("/{snmp_type}/{id}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get a device from a snmp type with its ID", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={  })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = SNMPDetail.class))),
                @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid")
         })
    Response snmpSnmpTypeIdGet( @PathParam("snmp_type") String snmpType, @PathParam("id") Integer id,@Context SecurityContext securityContext);

}
