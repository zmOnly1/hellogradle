package com.ds.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * Created by zm on 2018/7/1.
 */
public class App {
    protected final static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);

        while (i++ > 0){
            logger.info(i + " pls input user name");
            User user = new User(scanner.nextLine());
            System.out.println(user);
        }
    }

}
