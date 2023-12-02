package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.SnmpApiService;
import io.swagger.api.factories.SnmpApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.SNMPDetail;

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


@Path("/snmp")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-12-02T10:39:06.559425209Z[GMT]")
public class SnmpApi  {
   private final SnmpApiService delegate;

   public SnmpApi(@Context ServletConfig servletContext) {
      SnmpApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("SnmpApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (SnmpApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = SnmpApiServiceFactory.getSnmpApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/{snmp_type}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get snmp device list of a specific snmp type", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = SNMPDetail.class))),
        
        @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid") })
    public Response snmpSnmpTypeGet(@Parameter(in = ParameterIn.PATH, description = "Name of the snmp type you want to list",required=true) @PathParam("snmp_type") String snmpType,@Parameter(in = ParameterIn.QUERY, description = "Start offset of the query") @QueryParam("start") Integer start,@Parameter(in = ParameterIn.QUERY, description = "Limit offset of the query") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.snmpSnmpTypeGet(snmpType,start,limit,securityContext);
    }
    @GET
    @Path("/{snmp_type}/{id}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get a device from a snmp type with its ID", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = SNMPDetail.class))),
        
        @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid") })
    public Response snmpSnmpTypeIdGet(@Parameter(in = ParameterIn.PATH, description = "Name of the snmp type you want to list",required=true) @PathParam("snmp_type") String snmpType,@Parameter(in = ParameterIn.PATH, description = "Identifiant en base de données de l'équipement",required=true) @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.snmpSnmpTypeIdGet(snmpType,id,securityContext);
    }
}
