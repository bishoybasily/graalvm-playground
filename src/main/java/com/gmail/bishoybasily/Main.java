package com.gmail.bishoybasily;

import com.gmail.bishoybasily.model.User;
import com.google.gson.Gson;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        var user = new User().setId("123").setName("bishoy");
        var gson = new Gson();

        System.out.println(gson.toJson(user));

        var className = args[0];
        var capitalize = args[1];
        var input = args[2];

        var cls = Class.forName(className);
        var method = cls.getDeclaredMethod(capitalize, String.class);
        var result = method.invoke(null, input);
        System.out.println(result);

    }

}


class Capitalize {

    static String capitalize(String input) {
        return input.toUpperCase();
    }

}