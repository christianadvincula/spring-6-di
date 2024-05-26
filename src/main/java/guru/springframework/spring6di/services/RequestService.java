package guru.springframework.spring6di.services;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class RequestService {
    public void performService() {
        System.out.println("RequestService instance: " + this);
    }
}
