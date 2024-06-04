package guru.springframework.spring6di;

import guru.springframework.spring6di.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Spring6DiApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	MyController myController;

	@Test
	void testAutowiredMyController() {
		System.out.println("testAutowiredMyController: "+myController.sayHello());
		assertEquals(myController.sayHello(), "Hello Everyone!!!!", "sayHello returned String is Hello Everyone!!!!");
	}

	@Test
	void testGetControllerFromApplicationContext() {
		MyController controller = applicationContext.getBean(MyController.class);
		System.out.println("testGetControllerFromApplicationContext: "+controller.sayHello());
		assertEquals(myController.sayHello(), "Hello Everyone!!!!", "sayHello returned String is Hello Everyone!!!!");
	}

	@Test
	void contextLoads() {
	}

}
