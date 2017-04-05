package korzo.lessons;

public class Dog extends Animals {
	final String privateVoice = "gav-gav";
	public Dog(String name){
		//super(name, this.privateVoice);
		super(name, "gav-gav");
		
	}
	
	public Dog(){
		super();
		this.name = "Unnamed";
		this.voice = "gav-gav";
	}
	
}
