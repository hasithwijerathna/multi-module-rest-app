package com.hasith.sample.resource;

import com.hasith.client.model.User;
import com.hasith.client.model.Users;
import com.hasith.sample.service.UserService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import static com.hasith.sample.resource.UserResource.BASE_URL;

@Path(BASE_URL)
public class UserResource {
    public static final String BASE_URL = "/app/users";

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Users getAllUsers() {
        System.out.println("start getting all users");
        return UserService.getAllUser();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_XML)
    public User getUserById(@PathParam("id") int id) {
        System.out.println("start getting all users");
        return UserService.getUserById(id);
    }

    @POST
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public Users insertUser(User user) {
        return UserService.insertUser(user);
    }
}
