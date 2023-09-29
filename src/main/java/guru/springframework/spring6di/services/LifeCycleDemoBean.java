package guru.springframework.spring6di.services;

import guru.springframework.spring6di.controllers.MyController;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware
        , InitializingBean, BeanPostProcessor, DisposableBean {

    public LifeCycleDemoBean() {
        System.out.println("[*-_-*] 00 I'm in the LifeCycleBean Constructor [*-_-*]");
    }

    private String javaVer;
    private String beanName;

    @Value("${java.specification.version}")
    public void setJavaVer(String javaVer) {
        this.javaVer = javaVer;
        System.out.println("[*-_-*] 01 Properties Set. Java Ver:[" + this.javaVer +"] [*-_-*]");
    }

    @Override
    public void setBeanName(String name) {
        beanName = name;
        System.out.println("[*-_-*] 02 BeanNameAware setBeanName name:["+name+"] [*-_-*]");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("[*-_-*] 03 BeanFactoryAware setBeanFactory beanFactory: beanName ["+beanName+"] : ["+beanFactory.containsBean(beanName)+"] [*-_-*]");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("[*-_-*] 04 ApplicationContextAware setApplicationContext applicationContext:["+applicationContext.toString()+"] [*-_-*]");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("[*-_-*] 05 @PostConstruct postConstruct [*-_-*]");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("[*-_-*] 06 InitializingBean afterPropertiesSet [*-_-*]");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("[*-_-*] 07 BeanPostProcessor postProcessBeforeInitialization beanName:["+beanName+"] [*-_-*]");

        if (bean instanceof MyController){
            MyController myController = (MyController) bean;
            //System.out.println("[*-_-*] 07 BeanPostProcessor postProcessBeforeInitialization beanName:["+beanName+"] [*-_-*]");
            myController.beforeInit();
        }
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("[*-_-*] 08 BeanPostProcessor postProcessAfterInitialization beanName:["+beanName+"] [*-_-*]");

        if (bean instanceof MyController){
            MyController myController = (MyController) bean;
            //System.out.println("[*-_-*] 08 BeanPostProcessor postProcessAfterInitialization beanName:["+beanName+"] [*-_-*]");
            myController.afterInit();
        }
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("[*-_-*] 09 @PreDestroy preDestroy [*-_-*]");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("[*-_-*] 10 DisposableBean destroy [*-_-*]");
    }
}
