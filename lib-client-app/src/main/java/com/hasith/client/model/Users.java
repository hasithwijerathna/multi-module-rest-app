package com.hasith.client.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@XmlRootElement(name = "users")
public class Users {

    private Set<User> users = new HashSet<>();

    public Set<User> getUsers() {
        return users;
    }

    @XmlElement(name = "user")
    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
