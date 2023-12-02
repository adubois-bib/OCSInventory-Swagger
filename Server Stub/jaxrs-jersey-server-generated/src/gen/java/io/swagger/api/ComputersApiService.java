package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.ComputersList;
import io.swagger.model.ListOfID;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-12-02T10:39:06.559425209Z[GMT]")
public abstract class ComputersApiService {
    public abstract Response computersGet( Integer start, Integer limit,SecurityContext securityContext) throws NotFoundException;
    public abstract Response computersLastupdateTimestampGet(Integer timestamp,SecurityContext securityContext) throws NotFoundException;
    public abstract Response computersListIDGet( Integer start, Integer limit,SecurityContext securityContext) throws NotFoundException;
}
