package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.SoftwaresList;

import java.util.List;
import java.util.Map;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-12-02T10:39:08.091957794Z[GMT]")
public interface SoftwaresApiService {
      Response softwaresGet(Integer start,Integer limit,String soft,SecurityContext securityContext) throws NotFoundException;
}
