package guru.springframework.spring6di.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals("lifeCycleDemoBean")) {
            System.err.println("6. BeanPostProcessor postProcessBeforeInitialization called." + beanName);
        } /*else
            System.out.println("6. BeanPostProcessor postProcessBeforeInitialization: " + beanName);*/
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals("lifeCycleDemoBean")) {
            System.err.println("10. BeanPostProcessor postProcessAfterInitialization called." + beanName);
        }/* else
            System.out.println("9. BeanPostProcessor postProcessAfterInitialization: " + beanName);*/
        return bean;
    }
}
