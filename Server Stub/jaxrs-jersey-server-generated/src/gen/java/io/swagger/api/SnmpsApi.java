package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.SnmpsApiService;
import io.swagger.api.factories.SnmpsApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.SNMPType;

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


@Path("/snmps")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-12-02T10:39:06.559425209Z[GMT]")
public class SnmpsApi  {
   private final SnmpsApiService delegate;

   public SnmpsApi(@Context ServletConfig servletContext) {
      SnmpsApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("SnmpsApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (SnmpsApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = SnmpsApiServiceFactory.getSnmpsApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/typeList")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get a SNMP type list", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = SNMPType.class))),
        
        @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid") })
    public Response snmpsTypeListGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.snmpsTypeListGet(securityContext);
    }
}
