package io.swagger.api.factories;

import io.swagger.api.SnmpApiService;
import io.swagger.api.impl.SnmpApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-12-02T10:39:06.559425209Z[GMT]")
public class SnmpApiServiceFactory {
    private final static SnmpApiService service = new SnmpApiServiceImpl();

    public static SnmpApiService getSnmpApi() {
        return service;
    }
}
