package guru.springframework.spring6di.config;

import guru.springframework.spring6di.beans.LifeCycleDemoBean;
import guru.springframework.spring6di.beans.MyBeanPostProcessor;
import guru.springframework.spring6di.beans.MySpringBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public LifeCycleDemoBean lifeCycleDemoBean() {
        return new LifeCycleDemoBean();
    }

    @Bean
    public static MyBeanPostProcessor myBeanPostProcessor(){
        return new MyBeanPostProcessor();
    }

    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    public MySpringBean mySpringBean() {
        MySpringBean mySpringBean = new MySpringBean();
        mySpringBean.setMessage("Hello World!");
        return mySpringBean;
    }
}
