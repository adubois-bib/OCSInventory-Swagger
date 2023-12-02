package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.SoftwaresList;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2023-12-02T10:39:09.334447740Z[GMT]")
public class SoftwaresApiServiceImpl implements SoftwaresApi {
      public Response softwaresGet(Integer start,Integer limit,String soft,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
