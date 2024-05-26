package guru.springframework.spring6di.controllers;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("prototype")
public class MyController {

    public String sayHello() {
        System.out.println("I'm inside MyController");
        return "Hello Everyone!!!!";
    }

}
