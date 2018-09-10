package guru.springframework;

import guru.springframework.controllers.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

//		MyControllerImpl1 myController = (MyControllerImpl1)ctx.getBean("myController");
		TestControllerImpl testController = (TestControllerImpl)ctx.getBean("testControllerImpl");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("testController.hello(): ");
		testController.hello();

		System.out.println(" ");

		TestController2Impl testController2 = (TestController2Impl)ctx.getBean("testController2Impl");
		System.out.println("testController2.hello(): ");
		testController2.hello();

		System.out.println(" ");

		//Spring Profile | resources/application.properties spring.profiles.active
		ProfileTestImpl profileTestImpl = (ProfileTestImpl)ctx.getBean("profileTestImpl");
		System.out.println(profileTestImpl.sayGreeting());
		System.out.println("-----------------------------------------------------------------");
	}
}
