package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("default")
@SpringBootTest
class Myi18NControllerTest {

    @Autowired
    Myi18NController controller;

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}