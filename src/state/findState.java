package state;

import models.Driver;
import models.Order;

public class findState extends BaseOrderState{

	public findState(Order order) {
		super(order);
	}

	@Override
	public String execute() { 
		String message = "\n=== Finding Driver ===\n";
        message += "Customer: " + order.getCustName() + "\n";
        message += "Pickup: " + order.getPickup() + "\n";
        message += "Destination: " + order.getDestination() + "\n";
        message += "Searching for drivers...";
		
        delay();
        
        Driver driver = new Driver();
        order.setDriver(driver);
        
        return message; // return String pesan
	}

	@Override
	public OrderState getNextState() {
		return new foundState(order);
	}	
	

}
