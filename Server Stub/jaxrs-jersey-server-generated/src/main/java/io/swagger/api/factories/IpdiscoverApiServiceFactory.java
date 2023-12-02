package io.swagger.api.factories;

import io.swagger.api.IpdiscoverApiService;
import io.swagger.api.impl.IpdiscoverApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-12-02T10:39:06.559425209Z[GMT]")
public class IpdiscoverApiServiceFactory {
    private final static IpdiscoverApiService service = new IpdiscoverApiServiceImpl();

    public static IpdiscoverApiService getIpdiscoverApi() {
        return service;
    }
}
