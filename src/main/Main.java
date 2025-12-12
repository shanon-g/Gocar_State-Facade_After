package main;

import java.util.Scanner;

import auth.authManager;
import facade.GocarFacade;

public class Main {
    
    // Perbaikan The Bloaters - Long Method:
	public Main() {
		
	}
    
    // Metode baru untuk menjalankan logika aplikasi utama
	public void run() {
        // Perbaikan The Bloaters - Large Class:
        // Pindahkan semua logika menu & I/O ke kelas Menu yang baru.
        
        Scanner sc = new Scanner(System.in);
		String loggedUser = null;
		authManager auth = new authManager();
        Menu menu = new Menu(sc); // Menggunakan kelas Menu untuk I/O
		
		System.out.println("=== Welcome to Gocar Application ===");
		
		// Menu 1: Authentication
		while (loggedUser == null) {
			int choice = menu.displayAuthMenu();
            
            if (choice == 1) { 
            	String[] credentials = menu.getRegistrationInput();
                // Menerima pesan dari auth.register dan mencetaknya
                String message = auth.register(credentials[0], credentials[1]);
                System.out.println(message); 
                continue;
            } else if (choice == 2) { 
            	String[] credentials = menu.getLoginInput();
                String result = auth.login(credentials[0], credentials[1]);
                
                // Main.java yang memutuskan apa yang dicetak berdasarkan hasilnya.
                if (result.equals("Invalid password!") || result.equals("Username not found!")) {
                    System.out.println(result);
                    continue;
                } else {
                    loggedUser = result;
                    System.out.println("Login successful! Welcome " + loggedUser + "!");
                    break;
                }
                
            } else if (choice == 3) { 
            	System.out.println("Thank you for using Gocar!");
            	return;
            } else {
                System.out.println("Invalid option!");
            }
		}
		
		// Menu 2: Application
		while (true) {
			
            int choice = menu.displayAppMenu(loggedUser);
			
            if (choice == 1) { 
            	String[] locations = menu.getOrderInput();
                String pickup = locations[0];
                String destination = locations[1];
                
                GocarFacade facade = new GocarFacade();
                // Menerima log lengkap dari Facade dan print di sini
                String orderLog = facade.orderGocar(loggedUser, pickup, destination);
                System.out.println(orderLog); 
                
                continue;
            } else if (choice == 2) { 
            	System.out.println("Thank you for using Gocar, " + loggedUser + "!");
                return;
            } else {
            	System.out.println("Invalid option!");
            }
		}
    }

    // Perbaikan The Bloaters - Long Method:
	public static void main(String[] args) {
		new Main().run();
	}

}