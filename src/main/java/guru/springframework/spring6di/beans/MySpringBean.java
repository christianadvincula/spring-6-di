package guru.springframework.spring6di.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MySpringBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    private String message;

    public MySpringBean() {
        System.out.println("1. MySpringBean is being instantiated.");
    }

    public void setMessage(String message) {
        this.message = message;
        System.out.println("2. Property message is being set to: "+message);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("3. BeanNameAware setBeanName: " + name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("4. BeanFactory setBeanFactory: " + beanFactory);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("5. ApplicationContextAware setApplicationContext: " + applicationContext);
    }

    //BeanPostProcessor postProcessBeforeInitialization

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("7. InitializingBean afterPropertiesSet");
    }

    public void customInit() {
        System.out.println("8. Custom init-method: customInit() - Another custom initialization logic.");
    }

    //BeanPostProcessor postProcessBeforeInitialization

    @Override
    public void destroy() throws Exception {
        System.out.println("10. DisposableBean destroy");
    }

    public void customDestroy() {
        System.out.println("11. Custom destroy-method: customDestroy() - Another custom destroy logic.");
    }
}
