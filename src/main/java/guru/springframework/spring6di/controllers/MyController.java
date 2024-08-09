package guru.springframework.spring6di.controllers;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello() {
        return "Hello Everyone!!!!";
    }

}
