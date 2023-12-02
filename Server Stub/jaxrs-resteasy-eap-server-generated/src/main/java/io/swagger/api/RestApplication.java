package io.swagger.api;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;

import java.util.Set;
import java.util.HashSet;

import io.swagger.api.impl.ComputerApiServiceImpl;
import io.swagger.api.impl.ComputersApiServiceImpl;
import io.swagger.api.impl.IpdiscoverApiServiceImpl;
import io.swagger.api.impl.SnmpApiServiceImpl;
import io.swagger.api.impl.SnmpsApiServiceImpl;
import io.swagger.api.impl.SoftwaresApiServiceImpl;

@ApplicationPath("/")
public class RestApplication extends Application {


    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<Class<?>>();
        resources.add(ComputerApiServiceImpl.class);
        resources.add(ComputersApiServiceImpl.class);
        resources.add(IpdiscoverApiServiceImpl.class);
        resources.add(SnmpApiServiceImpl.class);
        resources.add(SnmpsApiServiceImpl.class);
        resources.add(SoftwaresApiServiceImpl.class);


        return resources;
    }




}
