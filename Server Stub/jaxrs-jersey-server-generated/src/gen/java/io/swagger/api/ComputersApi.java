package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ComputersApiService;
import io.swagger.api.factories.ComputersApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.ComputersList;
import io.swagger.model.ListOfID;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;


@Path("/computers")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-12-02T10:39:06.559425209Z[GMT]")
public class ComputersApi  {
   private final ComputersApiService delegate;

   public ComputersApi(@Context ServletConfig servletContext) {
      ComputersApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ComputersApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ComputersApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = ComputersApiServiceFactory.getComputersApi();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    @Produces({ "application/json" })
    @Operation(summary = "Get a list of computers with its detail", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ComputersList.class)))),
        
        @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid") })
    public Response computersGet(@Parameter(in = ParameterIn.QUERY, description = "Start offset of the query") @QueryParam("start") Integer start,@Parameter(in = ParameterIn.QUERY, description = "Limit offset of the query") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.computersGet(start,limit,securityContext);
    }
    @GET
    @Path("/lastupdate/{timestamp}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get a ID list of computers update during the provided timestamp", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ListOfID.class)))),
        
        @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid") })
    public Response computersLastupdateTimestampGet(@Parameter(in = ParameterIn.PATH, description = "Timestamp of the number of days to count down from the current date. Optional.",required=true) @PathParam("timestamp") Integer timestamp,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.computersLastupdateTimestampGet(timestamp,securityContext);
    }
    @GET
    @Path("/listID")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get a ID list of all computers in the OCS database", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ListOfID.class)))),
        
        @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid") })
    public Response computersListIDGet(@Parameter(in = ParameterIn.QUERY, description = "Start offset of the query") @QueryParam("start") Integer start,@Parameter(in = ParameterIn.QUERY, description = "Limit offset of the query") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.computersListIDGet(start,limit,securityContext);
    }
}
