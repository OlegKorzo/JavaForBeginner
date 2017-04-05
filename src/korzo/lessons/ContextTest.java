package korzo.lessons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import korzo.lessons.Dog;


@Configuration
@ComponentScan({"Bean", "Animals"})
public class ContextTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ApplicationContext contextDog = new AnnotationConfigApplicationContext(Dog.class);
		
	
		//contextDog.getBean(Dog.class).setName("Pesik");
		contextDog.getBean(Dog.class).Voice();		
		
	

	}

}
