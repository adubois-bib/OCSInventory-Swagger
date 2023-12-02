package io.swagger.api;

import io.swagger.model.SNMPDetail;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/snmp")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2023-12-02T10:39:10.953308111Z[GMT]")
public class SnmpApi {

    @GET
    @Path("/{snmp_type}")
    @Produces({ "application/json" })
    @Operation(summary = "Get snmp device list of a specific snmp type", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = SNMPDetail.class))),
        @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid")
    })
    public Response snmpSnmpTypeGet( @PathParam("snmp_type")

 @Parameter(description = "Name of the snmp type you want to list") String snmpType
,  @QueryParam("start") 

 @Parameter(description = "Start offset of the query")  Integer start
,  @QueryParam("limit") 

 @Parameter(description = "Limit offset of the query")  Integer limit
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/{snmp_type}/{id}")
    @Produces({ "application/json" })
    @Operation(summary = "Get a device from a snmp type with its ID", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = SNMPDetail.class))),
        @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid")
    })
    public Response snmpSnmpTypeIdGet( @PathParam("snmp_type")

 @Parameter(description = "Name of the snmp type you want to list") String snmpType
, @PathParam("id")

 @Parameter(description = "Identifiant en base de données de l&#x27;équipement") Integer id
) {
        return Response.ok().entity("magic!").build();
    }}
