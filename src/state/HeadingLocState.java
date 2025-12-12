package state;

import models.Order;

public class HeadingLocState extends BaseOrderState{
	

	public HeadingLocState(Order order) {
		super(order);
	}

	@Override
	public String execute() {  // HeadingLocState.java
		String message = "\n=== Driver with Customer ===\n";
        message += "Customer: " + order.getCustName() + "\n";
        message += order.getDriverInfo() + "\n";
        message += "Heading to: " + order.getDestination();
		
        delay();
        
        return message;
	}

	@Override
	public OrderState getNextState() {
		return new ArriveState(order);
	}

}
