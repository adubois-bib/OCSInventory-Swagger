package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.SoftwaresApiService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.SoftwaresList;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
@Path("/softwares")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-12-02T10:39:08.091957794Z[GMT]")
public class SoftwaresApi  {

    @Inject SoftwaresApiService service;

    @GET
    
    
    @Produces({ "application/json" })
    @Operation(summary = "Get software list from database", description = "", security = {
        @SecurityRequirement(name = "basicAuth")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = SoftwaresList.class))),
        
        @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid") })
    public Response softwaresGet(  @QueryParam("start") Integer start,  @QueryParam("limit") Integer limit,  @QueryParam("soft") String soft,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.softwaresGet(start,limit,soft,securityContext);
    }
}
