package korzo.Beans;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("korzo.Beans")
//@Scope("prototype")

public class Garden {
	
	//@Autowired
	//@Qualifier(value="cherryContext")	
	private Tree tree;
	
	
	public Garden(Tree tr){
		//this.tree = tr;
	}

	
	@Autowired
	@Qualifier(value="appleContext")
	public void setTree(Tree tr){
		this.tree = tr;
	}


	public void print(){
		tree.whatTree();
	}
	
	public void setAge(int age){
		tree.setAge(age);
	}
	
	public static void main(String[] args) {
		ApplicationContext contextGarden = new AnnotationConfigApplicationContext(Garden.class);
		Garden garden = contextGarden.getBean(Garden.class);
		
		garden.print();
		
		garden.setAge(-1);
		garden.print();
		
		garden = contextGarden.getBean(Garden.class);
		System.out.println(garden == contextGarden.getBean(Garden.class));
		garden.print();
	}

}
