package korzo.orderService;

public class GarconTakeOrder implements Garcons{
	
	private OrderService order;
	
	GarconTakeOrder(OrderService order){
		this.order = order;
	}
	
	public void processOrder(){
		this.order.makeDish();
	}

}
