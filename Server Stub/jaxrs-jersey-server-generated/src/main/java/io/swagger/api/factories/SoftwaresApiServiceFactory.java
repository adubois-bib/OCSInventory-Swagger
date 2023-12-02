package io.swagger.api.factories;

import io.swagger.api.SoftwaresApiService;
import io.swagger.api.impl.SoftwaresApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-12-02T10:39:06.559425209Z[GMT]")
public class SoftwaresApiServiceFactory {
    private final static SoftwaresApiService service = new SoftwaresApiServiceImpl();

    public static SoftwaresApiService getSoftwaresApi() {
        return service;
    }
}
