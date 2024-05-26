package guru.springframework.spring6di.services;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.SessionAttributes;

@Component
@SessionAttributes
public class SessionService {
    public void performService() {
        System.out.println("SessionService instance: " + this);
    }
}
