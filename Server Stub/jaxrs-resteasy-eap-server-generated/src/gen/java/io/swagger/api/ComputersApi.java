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

import io.swagger.model.ComputersList;
import io.swagger.model.ListOfID;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
@Path("/computers")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2023-12-02T10:39:09.334447740Z[GMT]")
public interface ComputersApi  {
   
    @GET
    
    
    @Produces({ "application/json" })
    @Operation(summary = "Get a list of computers with its detail", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={  })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ComputersList.class)))),
                @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid")
         })
    Response computersGet( @QueryParam("start") Integer start, @QueryParam("limit") Integer limit,@Context SecurityContext securityContext);

    @GET
    @Path("/lastupdate/{timestamp}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get a ID list of computers update during the provided timestamp", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={  })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ListOfID.class)))),
                @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid")
         })
    Response computersLastupdateTimestampGet( @PathParam("timestamp") Integer timestamp,@Context SecurityContext securityContext);

    @GET
    @Path("/listID")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get a ID list of all computers in the OCS database", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={  })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ListOfID.class)))),
                @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid")
         })
    Response computersListIDGet( @QueryParam("start") Integer start, @QueryParam("limit") Integer limit,@Context SecurityContext securityContext);

}
