package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanScopeController {
    private final SingletonService singletonService;
    private final PrototypeService prototypeService;
    private final RequestService requestService;
    private final ApplicationService applicationService;
    private final SessionService sessionService;

    public BeanScopeController(SingletonService singletonService, PrototypeService prototypeService, RequestService requestService, ApplicationService applicationService, SessionService sessionService) {
        this.singletonService = singletonService;
        this.prototypeService = prototypeService;
        this.requestService = requestService;
        this.applicationService = applicationService;
        this.sessionService = sessionService;
    }


    @RequestMapping("/singleton")
    public String getSingletonBean() {
        return singletonService.toString();
    }

    @RequestMapping("/prototype")
    public String getPrototypeBean() {
        return prototypeService.toString();
    }

    @RequestMapping("/session")
    public String getSessionService() {
        return sessionService.toString();
    }

    @RequestMapping("/request")
    public String getRequestService() {
        return requestService.toString();
    }

    @RequestMapping("/application")
    public String getApplicationService() {
        return applicationService.toString();
    }
}
