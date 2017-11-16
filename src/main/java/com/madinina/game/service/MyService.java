package com.madinina.game.service;

import com.madinina.game.data.MyData;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Component
@Path("/")
public class MyService {

    @Inject
    private MyData myData;

    @GET
    @Path("test")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get() {
        System.out.println("GET");
        return Response.ok(myData).build();
    }

}
