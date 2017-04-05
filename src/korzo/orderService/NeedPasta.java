package korzo.orderService;

public class NeedPasta implements Orders{
	
	public Garcons getOrder(){
		return new GarconTakeOrder(new OrderPasta());
	}

}
