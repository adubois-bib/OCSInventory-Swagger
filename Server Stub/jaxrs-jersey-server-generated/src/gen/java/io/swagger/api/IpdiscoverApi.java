package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.IpdiscoverApiService;
import io.swagger.api.factories.IpdiscoverApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.IpdiscoverList;
import io.swagger.model.IpdiscoverNetdevices;

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


@Path("/ipdiscover")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-12-02T10:39:06.559425209Z[GMT]")
public class IpdiscoverApi  {
   private final IpdiscoverApiService delegate;

   public IpdiscoverApi(@Context ServletConfig servletContext) {
      IpdiscoverApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("IpdiscoverApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (IpdiscoverApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = IpdiscoverApiServiceFactory.getIpdiscoverApi();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    @Produces({ "application/json" })
    @Operation(summary = "List IPDiscover network list", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = IpdiscoverList.class))),
        
        @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid") })
    public Response ipdiscoverGet(@Parameter(in = ParameterIn.QUERY, description = "Start offset of the query") @QueryParam("start") Integer start,@Parameter(in = ParameterIn.QUERY, description = "Limit offset of the query") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.ipdiscoverGet(start,limit,securityContext);
    }
    @GET
    @Path("/network/{netid}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get list of network devices scanned on one network", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = IpdiscoverNetdevices.class))),
        
        @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid") })
    public Response ipdiscoverNetworkNetidGet(@Parameter(in = ParameterIn.PATH, description = "Start offset of the query",required=true) @PathParam("netid") Integer netid,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.ipdiscoverNetworkNetidGet(netid,securityContext);
    }
}
