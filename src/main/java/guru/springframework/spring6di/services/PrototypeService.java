package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeService {
    public void performService() {
        System.out.println("PrototypeService instance: " + this);
    }
}
