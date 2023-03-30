package org.itstep.hello;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    private static HelloRepo helloRepo = new HelloRepo();


    @GetMapping("/hello")
    public hello hello(){
        return helloRepo.hello();
    }

    @GetMapping("/hello/{name}")
    public hello helloName(@PathVariable String name){
        return helloRepo.helloName(name);
    }

    @GetMapping("/hello/{hello}/{name}")
    public hello helloNameRus(@PathVariable String hello, @PathVariable String name){
        return new hello( hello, name);
    }
    @GetMapping("/hello2")
    public hello helloP(@RequestParam String message, @RequestParam String name) {
        return new hello(message, name);
    }
    @PostMapping("/hello")
    public void changeName(@RequestBody hello hello){
        helloRepo.changeName(hello.getName());
    }
}
