package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import guru.springframework.spring6di.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayHello();
    }

    public void beforeInit(){
        System.out.println("[*-_-*] Before Init - Called by Bean Post Processor [*-_-*]");
    }

    public void afterInit(){
        System.out.println("[*-_-*] After init called by Bean Post Processor [*-_-*]");
    }
}
