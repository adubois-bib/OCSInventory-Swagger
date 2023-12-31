package io.swagger.api;

import io.swagger.model.ComputerDetail;
import io.swagger.model.ComputersList;
import io.swagger.model.IpdiscoverList;
import io.swagger.model.IpdiscoverNetdevices;
import io.swagger.model.ListOfID;
import io.swagger.model.SNMPDetail;
import io.swagger.model.SNMPType;
import io.swagger.model.SoftwaresList;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * OCS Inventory Rest API
 *
 * <p>No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 */
@Path("/")
public interface DefaultApi  {

    /**
     * Get a computer by its ID
     *
     */
    @GET
    @Path("/computer/{id}")
    @Produces({ "application/json" })
    @Operation(summary = "Get a computer by its ID", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ComputersList.class))),
        @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid") })
    public ComputersList computerIdGet(@PathParam("id") Integer id);

    /**
     * Get sections informations of a specific computer
     *
     */
    @GET
    @Path("/computer/{id}/{sections}")
    @Produces({ "application/json" })
    @Operation(summary = "Get sections informations of a specific computer", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ComputerDetail.class))),
        @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid") })
    public ComputerDetail computerIdSectionsGet(@PathParam("id") Integer id, @PathParam("sections") String sections, @QueryParam("where") String where, @QueryParam("operator") String operator);

    /**
     * Get a list of computers with its detail
     *
     */
    @GET
    @Path("/computers")
    @Produces({ "application/json" })
    @Operation(summary = "Get a list of computers with its detail", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ComputersList.class)))),
        @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid") })
    public List<ComputersList> computersGet(@QueryParam("start") Integer start, @QueryParam("limit") Integer limit);

    /**
     * Get a ID list of computers update during the provided timestamp
     *
     */
    @GET
    @Path("/computers/lastupdate/{timestamp}")
    @Produces({ "application/json" })
    @Operation(summary = "Get a ID list of computers update during the provided timestamp", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ListOfID.class)))),
        @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid") })
    public List<ListOfID> computersLastupdateTimestampGet(@PathParam("timestamp") Integer timestamp);

    /**
     * Get a ID list of all computers in the OCS database
     *
     */
    @GET
    @Path("/computers/listID")
    @Produces({ "application/json" })
    @Operation(summary = "Get a ID list of all computers in the OCS database", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ListOfID.class)))),
        @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid") })
    public List<ListOfID> computersListIDGet(@QueryParam("start") Integer start, @QueryParam("limit") Integer limit);

    /**
     * List IPDiscover network list
     *
     */
    @GET
    @Path("/ipdiscover")
    @Produces({ "application/json" })
    @Operation(summary = "List IPDiscover network list", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = IpdiscoverList.class))),
        @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid") })
    public IpdiscoverList ipdiscoverGet(@QueryParam("start") Integer start, @QueryParam("limit") Integer limit);

    /**
     * Get list of network devices scanned on one network
     *
     */
    @GET
    @Path("/ipdiscover/network/{netid}")
    @Produces({ "application/json" })
    @Operation(summary = "Get list of network devices scanned on one network", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = IpdiscoverNetdevices.class))),
        @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid") })
    public IpdiscoverNetdevices ipdiscoverNetworkNetidGet(@PathParam("netid") Integer netid);

    /**
     * Get snmp device list of a specific snmp type
     *
     */
    @GET
    @Path("/snmp/{snmp_type}")
    @Produces({ "application/json" })
    @Operation(summary = "Get snmp device list of a specific snmp type", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = SNMPDetail.class))),
        @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid") })
    public SNMPDetail snmpSnmpTypeGet(@PathParam("snmp_type") String snmpType, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit);

    /**
     * Get a device from a snmp type with its ID
     *
     */
    @GET
    @Path("/snmp/{snmp_type}/{id}")
    @Produces({ "application/json" })
    @Operation(summary = "Get a device from a snmp type with its ID", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = SNMPDetail.class))),
        @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid") })
    public SNMPDetail snmpSnmpTypeIdGet(@PathParam("snmp_type") String snmpType, @PathParam("id") Integer id);

    /**
     * Get a SNMP type list
     *
     */
    @GET
    @Path("/snmps/typeList")
    @Produces({ "application/json" })
    @Operation(summary = "Get a SNMP type list", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = SNMPType.class))),
        @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid") })
    public SNMPType snmpsTypeListGet();

    /**
     * Get software list from database
     *
     */
    @GET
    @Path("/softwares")
    @Produces({ "application/json" })
    @Operation(summary = "Get software list from database", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = SoftwaresList.class))),
        @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid") })
    public SoftwaresList softwaresGet(@QueryParam("start") Integer start, @QueryParam("limit") Integer limit, @QueryParam("soft") String soft);
}
