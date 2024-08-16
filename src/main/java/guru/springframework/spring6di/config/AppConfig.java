package guru.springframework.spring6di.config;

import guru.springframework.spring6di.beans.MyBeanPostProcessor;
import guru.springframework.spring6di.beans.MySpringBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller
public class AppConfig {

    @Bean
    public MyBeanPostProcessor myBeanPostProcessor(){
        return new MyBeanPostProcessor();
    }

    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    public MySpringBean mySpringBean() {
        MySpringBean mySpringBean = new MySpringBean();
        mySpringBean.setMessage("Hello World!");
        return mySpringBean;
    }
}
