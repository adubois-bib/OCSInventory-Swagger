package io.swagger.api;

import io.swagger.model.ComputerDetail;
import io.swagger.model.ComputersList;

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

@Path("/computer")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2023-12-02T10:39:10.953308111Z[GMT]")
public class ComputerApi {

    @GET
    @Path("/{id}")
    @Produces({ "application/json" })
    @Operation(summary = "Get a computer by its ID", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ComputersList.class))),
        @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid")
    })
    public Response computerIdGet( @PathParam("id")

 @Parameter(description = "ID of the computer in OCS database") Integer id
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/{id}/{sections}")
    @Produces({ "application/json" })
    @Operation(summary = "Get sections informations of a specific computer", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ComputerDetail.class))),
        @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid")
    })
    public Response computerIdSectionsGet( @PathParam("id")

 @Parameter(description = "ID of the computer in OCS database") Integer id
, @PathParam("sections")

 @Parameter(description = "Name of the requested section (i.e -&gt; bios, software, etc..)") String sections
,  @QueryParam("where") 

 @Parameter(description = "Search on a specific column of the specific section.")  String where
,  @QueryParam("operator") 

 @Parameter(description = "Search operator (like, not like, &#x3D;, !&#x3D;, &lt;, &gt;, &lt;&#x3D;, &gt;&#x3D;). Mandatory if where parameter is set.")  String operator
) {
        return Response.ok().entity("magic!").build();
    }}
