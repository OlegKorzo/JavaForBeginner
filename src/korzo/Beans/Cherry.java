package korzo.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value="cherryContext")
public class Cherry extends Tree{
	Cherry(){
		super("cherry");
	}
	
	Cherry(int age){
		super("cherry", age);
	}
	
	//@Bean
	public Tree getThis(){
		return this;
	}	

}
