package state;

import models.Order;

public abstract class BaseOrderState implements OrderState {

	protected Order order;

	public BaseOrderState(Order order) {
		this.order = order;
	} 
	
	protected void delay() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}
