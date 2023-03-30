package org.itstep.hello;

import org.springframework.web.bind.annotation.PathVariable;

public class HelloRepo {
    private static hello hello = new hello();
    public hello  hello(){
        return hello;
    }

    public hello helloName(String name){
        return new hello("Hello", name);
    }

    public void changeName(String name){
        hello.setName(name);
    }
}
