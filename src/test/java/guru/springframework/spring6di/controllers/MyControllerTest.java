package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyControllerTest {
    @Autowired
    private MyController myController;

    @Test
    void sayHello() {
        //MyController myController = new MyController();
        System.out.println(myController.sayHello());
    }
}