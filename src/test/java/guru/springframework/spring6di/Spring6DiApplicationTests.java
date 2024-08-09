package guru.springframework.spring6di;

import guru.springframework.spring6di.controllers.MyController;
import org.junit.jupiter.api.Test;
<<<<<<< Updated upstream
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
=======
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;
>>>>>>> Stashed changes

@SpringBootTest
@ExtendWith(OutputCaptureExtension.class)
class Spring6DiApplicationTests {

<<<<<<< Updated upstream
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
=======
	@MockBean
	private MyController myController;

	@Autowired
	private ApplicationContext context;
>>>>>>> Stashed changes

	@Test
	void contextLoads() {
		assertNotNull(context);
	}

	@Test
	void testMain(CapturedOutput output) {
		// Mocking the sayHello method
		when(myController.sayHello()).thenReturn("Hello Everyone!!!!");

		// Running the main method
		String[] args = {};
		Spring6DiApplication.main(args);

		// Verifying the output contains expected lines
		assertNotNull(output);
		String out = output.getOut();
		assert(out.contains("In Main Method"));
		assert(out.contains("Hello Everyone!!!!"));
	}
}
