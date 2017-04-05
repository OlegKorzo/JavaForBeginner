package korzo.orderService;

public class Lunch {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Garcons go;
	
	go = (new NeedSalad()).getOrder();
	go.processOrder();
	
	go = (new NeedPasta()).getOrder();
	go.processOrder();
	
	go = (new NeedCutlet()).getOrder();
	go.processOrder();
	

	}

}
