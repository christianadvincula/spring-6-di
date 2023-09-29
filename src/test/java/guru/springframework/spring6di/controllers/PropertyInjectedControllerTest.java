package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PropertyInjectedControllerTest {

    @Autowired
    PropertyInjectedController controller;

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}