package guru.springframework.spring6di.services;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

@Component
@ApplicationScope
public class ApplicationService {
    public void performService() {
        System.out.println("ApplicationService instance: " + this);
    }
}
