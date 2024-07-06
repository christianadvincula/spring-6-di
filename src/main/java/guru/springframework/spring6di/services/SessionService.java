package guru.springframework.spring6di.services;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class SessionService {
    public void performService() {
        System.out.println("SessionService instance: " + this);
    }
}
