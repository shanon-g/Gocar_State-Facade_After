package repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DriverRepository {
	private static final String FILE_PATH = "resources/drivers.txt";
	private static List<String> driverNames = new ArrayList<>();
	
	static {
		loadDriverNames(); 
	}

	private static void loadDriverNames() {
		try {
			driverNames = Files.readAllLines(Paths.get(FILE_PATH));
		} catch (IOException e) {
			System.err.println("Failed to load driver list: " + e.getMessage());
			driverNames = Arrays.asList("DefaultDriver");
		}
	}
	
	public static List<String> getDriverNames() {
		return driverNames;
	}
}
