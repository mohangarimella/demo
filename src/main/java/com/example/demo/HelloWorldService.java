package com.example.demo;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * @author vgarimel
 */
@Component
@Path("/spring-docker/")
public class HelloWorldService {

    @GET
    @Path("/hello")
    public Response test() {
    	String timeStamp = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
    	String responseMessage="Hello World!!!.....Current Date and Time "+timeStamp+ " - Changes Through Code Pipeline - For Patrick";
        return Response.status(200).entity(responseMessage).build();
    }

}
