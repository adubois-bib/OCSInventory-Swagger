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

import io.swagger.model.ComputerDetail;
import io.swagger.model.ComputersList;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
@Path("/computer")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2023-12-02T10:39:09.334447740Z[GMT]")
public interface ComputerApi  {
   
    @GET
    @Path("/{id}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get a computer by its ID", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={  })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ComputersList.class))),
                @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid")
         })
    Response computerIdGet( @PathParam("id") Integer id,@Context SecurityContext securityContext);

    @GET
    @Path("/{id}/{sections}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get sections informations of a specific computer", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={  })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ComputerDetail.class))),
                @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid")
         })
    Response computerIdSectionsGet( @PathParam("id") Integer id, @PathParam("sections") String sections, @QueryParam("where") String where, @QueryParam("operator") String operator,@Context SecurityContext securityContext);

}
