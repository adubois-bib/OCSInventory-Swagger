package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.SoftwaresApiService;
import io.swagger.api.factories.SoftwaresApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
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

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;


@Path("/softwares")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-12-02T10:39:06.559425209Z[GMT]")
public class SoftwaresApi  {
   private final SoftwaresApiService delegate;

   public SoftwaresApi(@Context ServletConfig servletContext) {
      SoftwaresApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("SoftwaresApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (SoftwaresApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = SoftwaresApiServiceFactory.getSoftwaresApi();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    @Produces({ "application/json" })
    @Operation(summary = "Get software list from database", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = SoftwaresList.class))),
        
        @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid") })
    public Response softwaresGet(@Parameter(in = ParameterIn.QUERY, description = "Start offset of the query") @QueryParam("start") Integer start,@Parameter(in = ParameterIn.QUERY, description = "Limit offset of the query") @QueryParam("limit") Integer limit,@Parameter(in = ParameterIn.QUERY, description = "Name of the software you want to search (optional)") @QueryParam("soft") String soft,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.softwaresGet(start,limit,soft,securityContext);
    }
}
