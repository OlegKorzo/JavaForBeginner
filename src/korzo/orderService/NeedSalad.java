package korzo.orderService;

public class NeedSalad implements Orders{
	
	public Garcons getOrder(){
		return new GarconTakeOrder(new OrderSalad());
	}

}
