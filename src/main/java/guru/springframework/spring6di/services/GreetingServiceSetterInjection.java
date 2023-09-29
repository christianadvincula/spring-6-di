package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GreetingServiceSetterInjection implements GreetingService {
    @Override
    public String sayHello() {
        return "Hey I'm Setting a Greeting!!";
    }
}
