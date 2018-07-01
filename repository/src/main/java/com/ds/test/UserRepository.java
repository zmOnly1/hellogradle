package com.ds.test;

import java.util.*;

/**
 * Created by zm on 2018/7/1.
 */
public class UserRepository {

    private Map<String, User> userStore = new HashMap<>();

    public User add(User user){
        userStore.put(user.getName(), user);
        return user;
    }


}
