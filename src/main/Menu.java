package main;

import java.util.Scanner;

// Kelas baru untuk menangani semua tampilan menu dan input/output (I/O)
public class Menu {
    private Scanner sc;

    public Menu(Scanner sc) {
        this.sc = sc;
    }

    // Menampilkan menu autentikasi dan mendapatkan pilihan
    public int displayAuthMenu() {
        System.out.println("\n--- Authentication Menu ---");
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("3. Exit");
        System.out.print(">> ");
        
        int choice = sc.nextInt(); 
        sc.nextLine(); 
        return choice;
    }

    // Mendapatkan input untuk pendaftaran
    public String[] getRegistrationInput() {
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        return new String[]{username, password};
    }

    // Mendapatkan input untuk login
    public String[] getLoginInput() {
        System.out.print("Enter username: ");
        String loginUsername = sc.nextLine();
        System.out.print("Enter password: ");
        String loginPassword = sc.nextLine();
        return new String[]{loginUsername, loginPassword};
    }

    // Menampilkan menu aplikasi dan mendapatkan pilihan
    public int displayAppMenu(String loggedUser) {
        System.out.println("\n--- Gocar Application ---");
        System.out.println("Welcome, " + loggedUser + "!");
        System.out.println("1. Order Gocar");
        System.out.println("2. Exit");
        System.out.print(">> ");
        
        int choice = sc.nextInt(); 
        sc.nextLine(); 
        return choice;
    }

    // Mendapatkan input untuk pemesanan Gocar
    public String[] getOrderInput() {
        System.out.print("Enter your pickup location: ");
        String pickup = sc.nextLine();
        System.out.print("Enter your destination: ");
        String destination = sc.nextLine();
        return new String[]{pickup, destination};
    }
}