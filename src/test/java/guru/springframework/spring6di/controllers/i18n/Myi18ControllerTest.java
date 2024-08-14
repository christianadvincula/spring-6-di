package guru.springframework.spring6di.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"PRD","ES"})
@SpringBootTest
class Myi18ControllerTest {

    private final Myi18Controller myi18Controller;

    @Autowired
    public Myi18ControllerTest(Myi18Controller myi18Controller) {
        this.myi18Controller = myi18Controller;
    }

    @Test
    void sayHello() {
        System.out.println(this.myi18Controller.sayHello());
    }
}