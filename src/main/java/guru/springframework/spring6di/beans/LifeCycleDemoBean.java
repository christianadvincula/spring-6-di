package guru.springframework.spring6di.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class LifeCycleDemoBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    private String javaVersion;

    public LifeCycleDemoBean() {
        System.err.println("###############################################");
        System.err.println("1. LifeCycleDemoBean constructor called.");
    }

    @Value("${java.specification.version}")
    public void setJavaVersion(String javaVersion) {
        this.javaVersion = javaVersion;
        System.err.println("2. Setting property javaVersion called. "+javaVersion);
    }

    @Override
    public void setBeanName(String name) {
        System.err.println("3. BeanNameAware setBeanName called. " +name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.err.println("4. BeanFactoryAware setBeanFactory called.");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.err.println("5. ApplicationContextAware setApplicationContext called.");
    }

    //BeanPostProcessor postProcessBeforeInitialization

    @PostConstruct
    public void postConstruct() {
        System.err.println("7. @PostConstruct postConstruct called.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.err.println("8. InitializingBean afterPropertiesSet called.");
    }

    public void initMethod() {
        System.err.println("9. Custom initMethod called.");
    }

    //BeanPostProcessor postProcessAfterInitialization

    @PreDestroy
    public void preDestroy() {
        System.err.println("11. @PreDestroy preDestroy called.");
    }

    @Override
    public void destroy() throws Exception {
        System.err.println("10. DisposableBean destroy called.");
    }

    public void destroyMethod() {
        System.err.println("11. Custom initDestroy called.");
        System.err.println("###############################################");
    }
}
