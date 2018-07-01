package com.ds.test;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zm on 2018/7/1.
 */
public class UserRepositoryTest {

    UserRepository repository = new UserRepository();

    @Test
    public void add() {
        User user = repository.add(new User("test"));
        assertEquals("test", user.getName());
    }
}