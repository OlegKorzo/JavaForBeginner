package korzo.lessons;

import java.io.Serializable;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;

import korzo.lessons.Dog;


//@Configuration
//@ComponentScan({"Bean", "Animals"})
@Component
public class Bean implements Serializable{
	private String name;
	private Bean bean;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void print(String name) {
		System.out.println(name);
	}
	
	
	public Bean(){
		System.out.println("Bean default constructor");
	}
	
	public Bean(String name){
		this.name = name;
		System.out.println(this.name);
	}
	

	public void Whoami(){
		System.out.print(this.name);
	}
	
	
	public static void main(String[] args) {
		
		//Bean b = new Bean();
		//Bean c = new Bean("asd");
		//b.setName("qwe");
		//System.out.println("Hello world " + b.getName() + " " + c.getName());
		
		//ApplicationContext context = new AnnotationConfigApplicationContext(Bean.class);
		ApplicationContext contextDog = new AnnotationConfigApplicationContext(Dog.class);
		
		//System.out.println(context.getBean(Bean.class));
		//context.getBean(Bean.class).setName("Lesya");
		//((Bean)context.getBean(Bean.class)).print("WTF OMG");
		//Bean)o.print();
		
		//((Bean)context.getBean(Bean.class).setName("Lesya")).setName("Rusya");
		
		contextDog.getBean(Dog.class).setName("Pesik");
		contextDog.getBean(Dog.class).Voice();
		
		((AbstractApplicationContext) contextDog).close();
		
		//System.out.println(context.getBean(Bean.class).getName());
	}
	

}
