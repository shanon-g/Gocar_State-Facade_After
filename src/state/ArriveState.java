package state;

import models.Order;

public class ArriveState extends BaseOrderState{
	
	public ArriveState(Order order) {
		super(order);
	}

	@Override
	public String execute() { 
		String message = "\n=== Arrive ===\n";
        message += "Customer: " + order.getCustName() + "\n";
        message += "Arrived at: " + order.getDestination() + "\n";
        message += "Order completed!";
        
        delay();
        
        return message; // Mengembalikan string
	}

	@Override
	public OrderState getNextState() {
		return null;
	}


}
