package com.hasith.client;

import com.hasith.client.model.User;

/**
 * Created by hasith on 7/1/2017.
 */
public class App {
    public static void main(String[] args) {
        AppServiceClient appServiceClient = new AppServiceClient();
        /*appServiceClient
                .getAllUsers()
                .getUsers()
                .forEach(user -> System.out.println(user.toString()));*/

        //System.out.println(appServiceClient.getUserById(1).toString());

        appServiceClient
                .insertUser(new User(5, "Jayant"))
                .getUsers()
                .forEach(user -> System.out.println(user.toString()));
    }
}
