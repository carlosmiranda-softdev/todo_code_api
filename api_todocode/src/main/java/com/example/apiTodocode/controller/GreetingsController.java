package com.example.apiTodocode.controller;

import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("api/v1/greetings")
public class GreetingsController {

    // without param
    @GetMapping("/hello")
    public String getHelloWorld() {
        return "Hello world!";
    }

    // path param = custom-hello/name/age
    @GetMapping("/custom-hello/{name}/{age}")
    public String getCustomGreeting(@PathVariable String name,
                                    @PathVariable int age) {
        return "Custom hello!, Welcome " + name + ", your age is " + age;
    }

    // query param = happy-hello?name=Carlos&age=27
    @GetMapping("/happy-hello")
    public String getHappyGreeting(@RequestParam("name") String name,
                                   @RequestParam("age") int age) {
        return "Custom Happy!, Welcome " + name + ", your age is " + age;
    }

    // request body = JSON
    @GetMapping("/json-body")
    public String getJsonBody(@RequestBody String json) {
        return json;
    }

}
// https://www.youtube.com/watch?v=cMXTd6PoFpo&list=PLQxX2eiEaqbySJV-NmQpdo4mpt_09miyy&index=3