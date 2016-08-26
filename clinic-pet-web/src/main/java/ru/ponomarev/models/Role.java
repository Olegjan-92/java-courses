package ru.ponomarev.models;

/**
 * Created by oleg on 23.08.16.
 */
public class Role extends Base {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                '}';
    }
}
