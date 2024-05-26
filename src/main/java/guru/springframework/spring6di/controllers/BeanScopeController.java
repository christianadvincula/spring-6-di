package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.*;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanScopeController {

    private final SingletonService singletonService;

    private final ObjectProvider<PrototypeService> prototypeServiceObjectProvider;

    private final RequestService requestService;

    private final ApplicationService applicationService;

    private final SessionService sessionService;

    public BeanScopeController(
            SingletonService singletonService,
            ObjectProvider<PrototypeService> prototypeServiceObjectProvider,
            RequestService requestService,
            ApplicationService applicationService,
            SessionService sessionService) {
        this.singletonService = singletonService;
        this.prototypeServiceObjectProvider = prototypeServiceObjectProvider;
        this.requestService = requestService;
        this.applicationService = applicationService;
        this.sessionService = sessionService;
    }


    @RequestMapping("/singleton")
    public String getSingletonBean() {
        singletonService.performService();
        return "Service performed with: " + singletonService;
    }

    @RequestMapping("/prototype")
    public String getPrototypeBean() {
        PrototypeService prototypeService = prototypeServiceObjectProvider.getObject();
        prototypeService.performService();
        return "Service performed with: " + prototypeService;
    }

    @RequestMapping("/session")
    public String getSessionService() {
        sessionService.performService();
        return "Service performed with: " + sessionService;
    }

    @RequestMapping("/request")
    public String getRequestService() {
        requestService.performService();
        return "Service performed with: " + requestService;
    }

    @RequestMapping("/application")
    public String getApplicationService() {
        applicationService.performService();
        return "Service performed with: " + applicationService;
    }
}
