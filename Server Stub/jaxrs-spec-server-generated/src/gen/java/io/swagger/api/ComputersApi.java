package io.swagger.api;

import io.swagger.model.ComputersList;
import io.swagger.model.ListOfID;

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

@Path("/computers")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2023-12-02T10:39:10.953308111Z[GMT]")
public class ComputersApi {

    @GET
    @Produces({ "application/json" })
    @Operation(summary = "Get a list of computers with its detail", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ComputersList.class)))),
        @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid")
    })
    public Response computersGet(  @QueryParam("start") 

 @Parameter(description = "Start offset of the query")  Integer start
,  @QueryParam("limit") 

 @Parameter(description = "Limit offset of the query")  Integer limit
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/lastupdate/{timestamp}")
    @Produces({ "application/json" })
    @Operation(summary = "Get a ID list of computers update during the provided timestamp", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ListOfID.class)))),
        @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid")
    })
    public Response computersLastupdateTimestampGet( @PathParam("timestamp")

 @Parameter(description = "Timestamp of the number of days to count down from the current date. Optional.") Integer timestamp
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/listID")
    @Produces({ "application/json" })
    @Operation(summary = "Get a ID list of all computers in the OCS database", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ListOfID.class)))),
        @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid")
    })
    public Response computersListIDGet(  @QueryParam("start") 

 @Parameter(description = "Start offset of the query")  Integer start
,  @QueryParam("limit") 

 @Parameter(description = "Limit offset of the query")  Integer limit
) {
        return Response.ok().entity("magic!").build();
    }}
