package io.swagger.api;

import io.swagger.model.SNMPType;

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

@Path("/snmps")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2023-12-02T10:39:10.953308111Z[GMT]")
public class SnmpsApi {

    @GET
    @Path("/typeList")
    @Produces({ "application/json" })
    @Operation(summary = "Get a SNMP type list", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = SNMPType.class))),
        @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid")
    })
    public Response snmpsTypeListGet() {
        return Response.ok().entity("magic!").build();
    }}
