package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ComputerApiService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.ComputerDetail;
import io.swagger.model.ComputersList;

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
@Path("/computer")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-12-02T10:39:08.091957794Z[GMT]")
public class ComputerApi  {

    @Inject ComputerApiService service;

    @GET
    @Path("/{id}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get a computer by its ID", description = "", security = {
        @SecurityRequirement(name = "basicAuth")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ComputersList.class))),
        
        @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid") })
    public Response computerIdGet( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.computerIdGet(id,securityContext);
    }
    @GET
    @Path("/{id}/{sections}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get sections informations of a specific computer", description = "", security = {
        @SecurityRequirement(name = "basicAuth")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ComputerDetail.class))),
        
        @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid") })
    public Response computerIdSectionsGet( @PathParam("id") Integer id, @PathParam("sections") String sections,  @QueryParam("where") String where,  @QueryParam("operator") String operator,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.computerIdSectionsGet(id,sections,where,operator,securityContext);
    }
}
