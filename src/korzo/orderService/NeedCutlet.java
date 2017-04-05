package korzo.orderService;


public class NeedCutlet implements Orders{
	
	public Garcons getOrder(){
		return new GarconTakeOrder(new OrderCutlet());
	}

}
