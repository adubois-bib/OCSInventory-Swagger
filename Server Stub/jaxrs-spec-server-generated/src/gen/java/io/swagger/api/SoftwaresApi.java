package io.swagger.api;

import io.swagger.model.SoftwaresList;

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

@Path("/softwares")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2023-12-02T10:39:10.953308111Z[GMT]")
public class SoftwaresApi {

    @GET
    @Produces({ "application/json" })
    @Operation(summary = "Get software list from database", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = SoftwaresList.class))),
        @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid")
    })
    public Response softwaresGet(  @QueryParam("start") 

 @Parameter(description = "Start offset of the query")  Integer start
,  @QueryParam("limit") 

 @Parameter(description = "Limit offset of the query")  Integer limit
,  @QueryParam("soft") 

 @Parameter(description = "Name of the software you want to search (optional)")  String soft
) {
        return Response.ok().entity("magic!").build();
    }}
