package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service("greetingServiceProperty")
public class GreetingServicePropertyInjected implements GreetingService {
    @Override
    public String sayHello() {
        return "Friends don't let friends to property injection!!!!!";
    }
}
