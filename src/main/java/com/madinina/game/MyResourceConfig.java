package com.madinina.game;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.madinina.game.service.MyService;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;
import java.util.HashSet;
import java.util.Set;

@Component
@ApplicationPath("/api")
@Produces("application/json")
public class MyResourceConfig extends ResourceConfig {

    @Autowired
    public MyResourceConfig(ObjectMapper objectMapper) {
        // register endpoints
        packages("com.madinina.game.service");

    }
}


