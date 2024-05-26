package guru.springframework.spring6di.services;

import org.springframework.stereotype.Component;

@Component
public class SingletonService {
    public void performService() {
        System.out.println("SingletonService instance: " + this);
    }
}
