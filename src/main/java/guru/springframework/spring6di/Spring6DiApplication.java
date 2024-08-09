package guru.springframework.spring6di;

import guru.springframework.spring6di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class  Spring6DiApplication {

	public static ApplicationContext main(String[] args) {
		ApplicationContext context = SpringApplication.run(Spring6DiApplication.class, args);
		MyController controller = context.getBean(MyController.class);
		System.out.println("In Main Method");
		System.out.println(controller.sayHello());
		return context;
	}

}
