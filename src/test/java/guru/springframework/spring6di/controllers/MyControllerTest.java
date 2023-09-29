package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyControllerTest {
    @Autowired
    MyController controller;

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}