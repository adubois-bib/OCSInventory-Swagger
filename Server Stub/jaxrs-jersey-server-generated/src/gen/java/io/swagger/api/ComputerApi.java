package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ComputerApiService;
import io.swagger.api.factories.ComputerApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
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

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;


@Path("/computer")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-12-02T10:39:06.559425209Z[GMT]")
public class ComputerApi  {
   private final ComputerApiService delegate;

   public ComputerApi(@Context ServletConfig servletContext) {
      ComputerApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ComputerApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ComputerApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = ComputerApiServiceFactory.getComputerApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/{id}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get a computer by its ID", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ComputersList.class))),
        
        @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid") })
    public Response computerIdGet(@Parameter(in = ParameterIn.PATH, description = "ID of the computer in OCS database",required=true) @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.computerIdGet(id,securityContext);
    }
    @GET
    @Path("/{id}/{sections}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get sections informations of a specific computer", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ComputerDetail.class))),
        
        @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid") })
    public Response computerIdSectionsGet(@Parameter(in = ParameterIn.PATH, description = "ID of the computer in OCS database",required=true) @PathParam("id") Integer id,@Parameter(in = ParameterIn.PATH, description = "Name of the requested section (i.e -> bios, software, etc..)",required=true) @PathParam("sections") String sections,@Parameter(in = ParameterIn.QUERY, description = "Search on a specific column of the specific section.") @QueryParam("where") String where,@Parameter(in = ParameterIn.QUERY, description = "Search operator (like, not like, =, !=, <, >, <=, >=). Mandatory if where parameter is set.") @QueryParam("operator") String operator,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.computerIdSectionsGet(id,sections,where,operator,securityContext);
    }
}
