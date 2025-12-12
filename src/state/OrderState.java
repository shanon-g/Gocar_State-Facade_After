package state;


public interface OrderState {
	String execute();
	OrderState getNextState();
}
