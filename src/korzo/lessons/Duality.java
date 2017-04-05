package korzo.lessons;

interface Child {
	public static void whoami(int age){
		System.out.println("Hi, I'm a child. I'm " + age + " years old.");
	}
}

interface Man {

	public static void whoami(int age){
		System.out.println("Hi, I'm a man. I'm " + age + " years old.");
	}
}

public class Duality implements Child, Man{
	
	
	
	public static void whoami(int age){
		if (age < 17) Child.whoami(age);
		else Man.whoami(age);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Duality george = new Duality();
		
		george.whoami(100);
	}

}
