package korzo.orderService;

public class OrderCutlet implements OrderService{
	@Override
	public void makeDish(){
		System.out.println("Cutlet, sir!");
	}
}
