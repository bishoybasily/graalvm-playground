package com.gmail.bishoybasily.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class User {

    private String id;
    private String name;

}
