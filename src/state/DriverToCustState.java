package state;

import models.Order;

public class DriverToCustState extends BaseOrderState {
	

	public DriverToCustState(Order order) {
		super(order);
	}

	@Override
	public String execute() {  // DriverToCustState.java
		String message = "\n=== Driver Heading to Customer ===\n";
		message += "Customer: " + order.getCustName() + "\n";
        message += order.getDriverInfo() + "\n";
        message += "Driver heading to: " + order.getPickup();
		
        delay();
        return message;
	}

	@Override
	public OrderState getNextState() {
		return new HeadingLocState(order);
	}


}
