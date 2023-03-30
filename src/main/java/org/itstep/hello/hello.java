package org.itstep.hello;

public class hello {
    private String message = "Hello ";
    private String name = "world";

    public hello() {
    }

    public hello(String message, String name) {
        this.message = message;

        this.name
                = name;
    }

    public String getMessage() {
        return message;
    }

    public void setName(String name) {

        this.name
                = name;
    }

    public String getName() {
        return name;
    }

}