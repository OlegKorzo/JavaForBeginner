package korzo.lessons;

import org.springframework.stereotype.Component;

public class Animals {
	String name;
	String voice;
	
	public void Voice() {
		System.out.println(name + " said " + voice);
	}
	public String getVoice() {
		return voice;
	}

	public void setVoice(String voice) {
		this.voice = voice;
	}

	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public Animals(){
		
	}
	
	public Animals(String name){
		this.name = name;
	}
	
	public Animals(String name, String voice){
		this.name = name;
		this.voice = voice;
	}
	
	public static class Cat extends Animals {
		
		public Cat(String name){
			super(name, "mau");
			
		}
		
		public Cat(){
			super();
			this.voice = "mau";
		}
		
	}	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animals zoo[] = new Animals[4];
		zoo[0] = new Cat("Joe");
		zoo[1] = new Dog("Harry");
		zoo[2] = new Cat("Kira");
		zoo[3] = new Dog("Kristina");
		
		for (int i = 0; i < zoo.length; i++) zoo[i].Voice();
		
		System.out.println(zoo[0].toString());
		
		
	}	
	
}



