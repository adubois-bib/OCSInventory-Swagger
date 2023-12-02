package io.swagger.api.factories;

import io.swagger.api.ComputersApiService;
import io.swagger.api.impl.ComputersApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-12-02T10:39:06.559425209Z[GMT]")
public class ComputersApiServiceFactory {
    private final static ComputersApiService service = new ComputersApiServiceImpl();

    public static ComputersApiService getComputersApi() {
        return service;
    }
}
