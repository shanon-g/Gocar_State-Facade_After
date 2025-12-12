package models;

public class Order {
	
	private String custName;
	private String pickup;
	private String destination;
	private Driver driver;
	
	public Order(String custName, String pickup, String destination) {
		super();
		this.custName = custName;
		this.pickup = pickup;
		this.destination = destination;
	}

	public String getCustName() {
		return custName;
	}

	public String getPickup() {
		return pickup;
	}

	public String getDestination() {
		return destination;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	//Order.java
	// Delegasi: Menggantikan order.getDriver().getName()
    public String getDriverName() {
        return driver.getName();
    }
    
    // Delegasi: Menggantikan 
    // order.getDriver().getName() + "..." + order.getDriver().getSpeed()
    public String getDriverInfo() {
        return "Driver " + driver.getName() + 
        		" going at " + driver.getSpeed() + "km/hour";
    }
}
