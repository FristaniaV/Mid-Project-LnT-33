package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner scan = new Scanner(System.in);
	
	String vehicle;
	String brand;
	String name;
	String license;
	int topSpeed;
	int gasCap;
	int wheel;
	String type;
	int entSys;
	int helm;
	
	ArrayList<String> vehicleList = new ArrayList<>();
	ArrayList<String> brandList = new ArrayList<>();
	ArrayList<String> nameList = new ArrayList<>();
	ArrayList<String> licenseList = new ArrayList<>();
	ArrayList<Integer> topSpeedList = new ArrayList<>();
	ArrayList<Integer> gasCapList = new ArrayList<>();
	ArrayList<Integer> wheelList = new ArrayList<>();
	ArrayList<String> typeList = new ArrayList<>();
	ArrayList<Integer> entSysList = new ArrayList<>();
	ArrayList<Integer> helmList = new ArrayList<>();
	
	Car vhc1 = new Car();
	Motorcycle vhc2 = new Motorcycle();
	
	public Main() {
		
		int chooseMenu;
		
		do {
			System.out.println("Menu");
			System.out.println("======================");
			System.out.println("1. Input Data");
			System.out.println("2. View Data");
			System.out.println("3. Exit");
			System.out.print(">> ");
			try {
				chooseMenu = scan.nextInt();
			} catch (Exception e) {
				chooseMenu = 404;
			}scan.nextLine();
		} while (chooseMenu < 1 || chooseMenu > 3);
		
		if (chooseMenu == 1) {
			Input();
		} else if (chooseMenu == 2) {
			View();
		} else if (chooseMenu == 3) {
			System.exit(0);
		}
		
	}
	
	public void Input() {
		
		do {
			System.out.print("Input type [Car | Motorcycle]: ");
			vehicle = scan.nextLine();
		} while (!(vehicle.equalsIgnoreCase("Car")) && !(vehicle.equalsIgnoreCase("Motorcycle")));
		
		vehicleList.add(vehicle);
		
		if (vehicle.equalsIgnoreCase("Car")) {
			vhc1.brand();
			vhc1.name();
			vhc1.license();
			vhc1.topSpeed();
			vhc1.gasCap();
			vhc1.wheel();
			vhc1.type();
			vhc1.entSys();
		} else if (vehicle.equalsIgnoreCase("Motorcycle")) {
			vhc2.brand();
			vhc2.name();
			vhc2.license();
			vhc2.topSpeed();
			vhc2.gasCap();
			vhc2.wheel();
			vhc2.type();
			vhc2.helm();
		}
		
	}

	public void View() {
		
		for (int i = 0; i < nameList.size(); i++) {
			System.out.println("|-----|------------|------------------|------------|----------|----------|----------|----------|----------|----------|");
			System.out.printf("|%s-5|%s-12|%s-18|%s-12|%s-10|%s-10|%s-10|%s-10|%s-10|%s-10|", "No", "Type", "Brand", "Name", "License", "Top Speed", "Gas Cap.", "Wheel", "Type", "Ent Sys", "Helm");
			System.out.println("|-----|------------|------------------|------------|----------|----------|----------|----------|----------|----------|");
		}
		// 5, 12, 18, 12, 10, 10, 10, 10, 10, 10 = 107
	}

	public static void main(String[] args) {
		new Main();

	}

}
