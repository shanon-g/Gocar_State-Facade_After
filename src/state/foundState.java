package state;

import models.Order;

public class foundState extends BaseOrderState {
	
	public foundState(Order order) {
		super(order);
	}

	@Override
	public String execute() { // foundState.java
		String message = "\n=== Driver Found ===\n";
        message += "Customer: " + order.getCustName() + "\n";
        message += "Driver Found!\n";
        // metode delegasi order.getDriverName()
        message += "Driver:" + order.getDriverName();
        
        delay();
        
        return message; 
	}

	@Override
	public OrderState getNextState() {
		return new DriverToCustState(order);
	}


}
