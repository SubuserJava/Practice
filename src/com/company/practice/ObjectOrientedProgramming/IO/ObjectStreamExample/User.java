package com.company.practice.ObjectOrientedProgramming.IO.ObjectStreamExample;

import java.io.Serial;
import java.io.Serializable;

public class User implements Serializable{

    @Serial
    private static final long serialVersionUID = 4420784010615351583L;
    private Long id;
    private String name;

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public User() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
