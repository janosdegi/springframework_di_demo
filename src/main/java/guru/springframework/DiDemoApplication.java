package guru.springframework;

import guru.springframework.examplebeans.FakeDataSource;
import guru.springframework.examplebeans.FakeDataSource2;
import guru.springframework.examplebeans.SpringBootApplicationPropertyDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

//		MyControllerImpl1 myController = (MyControllerImpl1)ctx.getBean("myController");
//		TestControllerImpl testController = (TestControllerImpl)ctx.getBean("testControllerImpl");
//		System.out.println("-----------------------------------------------------------------");
//		System.out.println("testController.hello(): ");
//		testController.hello();
//
//		System.out.println(" ");
//
//		TestController2Impl testController2 = (TestController2Impl)ctx.getBean("testController2Impl");
//		System.out.println("testController2.hello(): ");
//		testController2.hello();
//
//		System.out.println(" ");

		//Spring Profile | resources/application.properties spring.profiles.active
//		ProfileTestImpl profileTestImpl = (ProfileTestImpl)ctx.getBean("profileTestImpl");
//		System.out.println(profileTestImpl.sayGreeting());
//		System.out.println("-----------------------------------------------------------------");

		//External Properties - Property Source -------------------------------------------------------//
		FakeDataSource fakeDataSource = (FakeDataSource)ctx.getBean(FakeDataSource.class);
		FakeDataSource2 fakeDataSource2 = (FakeDataSource2)ctx.getBean(FakeDataSource2.class);
		System.out.println();
		System.out.println("---External Properties-----------------------");
		System.out.println(fakeDataSource.toString());
		System.out.println(fakeDataSource2.toString());
		System.out.println("---------------------------------------------");

		System.out.println();

		//External Properties - Spring Boot Application Properties -----------------------------------//
		SpringBootApplicationPropertyDataSource springBootApplicationPropertyDataSource =
				(SpringBootApplicationPropertyDataSource)ctx.getBean(SpringBootApplicationPropertyDataSource.class);
		System.out.println("---Spring Boot Application Properties--------");
		System.out.println(springBootApplicationPropertyDataSource.toString());
		System.out.println("---------------------------------------------");
		System.out.println();
	}
}
