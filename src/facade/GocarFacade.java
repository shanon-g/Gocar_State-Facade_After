package facade;

import models.Order;
import state.OrderState;
import state.findState;

public class GocarFacade {
	
	public String orderGocar(String custName, String pickupLoc, String destination) { 
		
		StringBuilder log = new StringBuilder("\n=== Starting Gocar Order Process ===\n");
		
		Order order = new Order(custName, pickupLoc, destination);
		OrderState currState = new findState(order);
		
		while (currState != null) {
			log.append(currState.execute()).append("\n"); 
			currState = currState.getNextState();
		}
		
		log.append("=== Order Process Complete ===");
		
		return log.toString();
	}
}
