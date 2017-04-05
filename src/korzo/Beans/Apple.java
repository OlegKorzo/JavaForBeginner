package korzo.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value="appleContext")
public class Apple extends Tree{
	
	Apple(){
		super("apple");
	}
	
	Apple(int age){
		super("apple", age);
	}
	
	//@Bean
	public Tree getThis(){
		return this;
	}

}
