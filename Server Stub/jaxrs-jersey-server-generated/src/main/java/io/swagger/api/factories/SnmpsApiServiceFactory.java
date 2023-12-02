package io.swagger.api.factories;

import io.swagger.api.SnmpsApiService;
import io.swagger.api.impl.SnmpsApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-12-02T10:39:06.559425209Z[GMT]")
public class SnmpsApiServiceFactory {
    private final static SnmpsApiService service = new SnmpsApiServiceImpl();

    public static SnmpsApiService getSnmpsApi() {
        return service;
    }
}
