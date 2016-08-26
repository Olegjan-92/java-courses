package ru.ponomarev.lessons;

import java.util.*;

/**
 * Created by oleg on 15.07.16.
 */
public class UserRunner {

    public static void main(String[] args) {
        Map<String, User> users = new HashMap<String, User>();
        users.put("1", new User("1", "первый"));
        users.put("2", new User("2", "второй"));
        users.put("3", new User("1", "первый"));




        /*Map<String, User> users = new HashMap<String, User>();
        users.put("1", new User("1", "first"));
        users.put("2", new User("2", "second"));
        users.put("1", new User("1", "first"));*/

        for (Map.Entry<String, User> user : users.entrySet()){
            System.out.println(user);
        }
    }

}
