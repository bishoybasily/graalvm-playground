package com.gmail.bishoybasily;

import com.gmail.bishoybasily.model.User;

public class Main {

    public static void main(String[] args) {

        var bishoy = new User().setId("123").setName("bishoy");

        System.out.println(bishoy.toString());
    }

}
