package models;

import java.util.List;
import java.util.Random;

import repository.DriverRepository;

public class Driver {
	
	private String name;
	private int speed;
	private static final Random rand = new Random();

	public Driver() {
		List<String> driverNames = DriverRepository.getDriverNames(); 
		this.name = driverNames.get(rand.nextInt(driverNames.size()));
		this.speed = rand.nextInt(5) + 1;
	}

	public String getName() {
		return name;
	}

	public int getSpeed() {
		return speed;
	}
}
