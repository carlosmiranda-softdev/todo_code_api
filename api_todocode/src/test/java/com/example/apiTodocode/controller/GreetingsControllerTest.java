package com.example.apiTodocode.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

// La aplicacion debe estar corriendo para que funcionen las peticiones
@SpringBootTest()
public class GreetingsControllerTest {
    private final int PORT = 8080;
    private final String API = "/api/v1/greetings";

    private final TestRestTemplate restTemplate = new TestRestTemplate();

    @Test
    public void testGetHelloWorld() {
        String url = "http://localhost:" + PORT + API + "/hello";
        String response = restTemplate.getForObject(url, String.class);
        assertEquals("Hello world!", response);
    }

    @Test
    public void testGetCustomGreeting() {
        String url = "http://localhost:" + PORT + API + "/custom-hello/John/30";
        String response = restTemplate.getForObject(url, String.class);
        assertEquals("Custom hello!, Welcome John, your age is 30", response);
    }

    @Test
    public void testGetHappyGreeting() {
        String url = "http://localhost:" + PORT + API + "/happy-hello?name=Carlos&age=27";
        String response = restTemplate.getForObject(url, String.class);
        assertEquals("Custom Happy!, Welcome Carlos, your age is 27", response);
    }
}
