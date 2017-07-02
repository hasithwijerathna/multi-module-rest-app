package com.hasith.client;

import com.hasith.client.model.User;
import com.hasith.client.model.Users;
import com.hasith.client.util.BaseClient;

import java.util.HashMap;
import java.util.Map;

class AppServiceClient extends BaseClient {

    Users getAllUsers() {
        return getRestTemplate().getForObject(BASE_URL + "/app/users", Users.class);
    }

    User getUserById(int id) {

        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("id", String.valueOf(id));

        return getRestTemplate().getForObject(BASE_URL + "/app/users/{id}", User.class, stringMap);
    }

    Users insertUser(User user){
        return getRestTemplate().postForObject(BASE_URL+ "/app/users", user, Users.class);
    }
}
