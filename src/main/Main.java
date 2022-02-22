package main;

import java.util.ArrayList;
import java.util.Scanner;
import main.Vehicle;
import main.Car;
import main.Motorcycle;

public class Main {

	Scanner scan = new Scanner(System.in);

	ArrayList<String> vhcType = new ArrayList<>();
	ArrayList<Vehicle> vhcData = new ArrayList<>();

	int input;

	public Main() {

		Menu();
	}

	public void Menu() {

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
			}
			scan.nextLine();
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

		String vehicle;
		String brand;
		String name;
		String license = "";
		int topSpeed;
		int gasCap;
		int wheel;
		String type;
		int entSys;
		int helm;

		do {
			System.out.print("Input type [Car | Motorcycle]: ");
			vehicle = scan.nextLine();
		} while (!(vehicle.equalsIgnoreCase("Car")) && !(vehicle.equalsIgnoreCase("Motorcycle")));

		vhcType.add(vehicle);

		if (vehicle.equalsIgnoreCase("Car")) {

			do {
				System.out.print("Input brand [>= 5]: ");
				brand = scan.nextLine();
			} while (brand.length() < 4);

			do {
				System.out.print("Input name [>= 5]: ");
				name = scan.nextLine();
			} while (name.length() < 4);

			do {
				System.out.print("Input license: ");
				license = scan.nextLine();
//						Pattern p = Pattern.compile(license);
//						Matcher m = p.matcher("[A-Z]{1} [0-9]{1,4} [A-Z]{1,3}");
//						ynn = m.matches();
//					} while (ynn == false);
			} while (license.length() < 3);

			do {
				System.out.print("Input top speed [ 100 <= topSpeed <= 250]: ");
				try {
					topSpeed = scan.nextInt();
				} catch (Exception e) {
					topSpeed = 404;
				}
				scan.nextLine();
			} while (topSpeed < 100 || topSpeed > 250);

			do {
				System.out.print("Input gas capacity [30 <= gasCap <= 60]: ");
				try {
					gasCap = scan.nextInt();
				} catch (Exception e) {
					gasCap = 404;
				}
				scan.nextLine();
			} while (gasCap < 30 || gasCap > 60);

			do {
				System.out.print("Input wheel [ 4 <= wheel <= 6]: ");
				try {
					wheel = scan.nextInt();
				} catch (Exception e) {
					wheel = 404;
				}
				scan.nextLine();
			} while (wheel < 4 || wheel > 6);

			do {
				System.out.print("Input type [SUV | Supercar | Minivan]: ");
				type = scan.nextLine();
			} while (!(type.equalsIgnoreCase("SUV")) && !(type.equalsIgnoreCase("Supercar"))
					&& !(type.equalsIgnoreCase("Minivan")));

			do {
				System.out.print("Input entertainment system amount [>= 1]: ");
				try {
					entSys = scan.nextInt();
				} catch (Exception e) {
					entSys = 404;
				}
				scan.nextLine();
			} while (entSys < 1);

//			Car cD = new Car(brand, name, wheel, type, license, topSpeed, gasCap, entSys);
//			vhcData.add(cD);
			vhcData.add(new Car(brand, name, wheel, type, license, topSpeed, gasCap, entSys));
			System.out.println("Insert Success!");
			System.out.println();
			System.out.println("Press enter to continue...");
			scan.nextLine();
//			Menu();

		} else if (vehicle.equalsIgnoreCase("Motorcycle")) {
			do {
				System.out.print("Input brand [>= 5]: ");
				brand = scan.nextLine();
			} while (brand.length() < 4);

			do {
				System.out.print("Input name [>= 5]: ");
				name = scan.nextLine();
			} while (name.length() < 4);

			do {
				System.out.print("Input license: ");
				license = scan.nextLine();
//					Pattern p = Pattern.compile(license);
//					Matcher m = p.matcher("[A-Z]{1} [0-9]{1,4} [A-Z]{1,3}");
//					ynn = m.matches();
//				} while (ynn == false);
			} while (license.length() < 3);

			do {
				System.out.print("Input top speed [ 100 <= topSpeed <= 250]: ");
				try {
					topSpeed = scan.nextInt();
				} catch (Exception e) {
					topSpeed = 404;
				}
				scan.nextLine();
			} while (topSpeed < 100 || topSpeed > 250);

			do {
				System.out.print("Input gas capacity [30 <= gasCap <= 60]: ");
				try {
					gasCap = scan.nextInt();
				} catch (Exception e) {
					gasCap = 404;
				}
				scan.nextLine();
			} while (gasCap < 30 || gasCap > 60);

			do {
				System.out.print("Input wheel [ 2 <= wheel <= 3]: ");
				try {
					wheel = scan.nextInt();
				} catch (Exception e) {
					wheel = 404;
				}
				scan.nextLine();
			} while (wheel < 2 || wheel > 3);

			do {
				System.out.print("Input type [Automatic | Manual]: ");
				type = scan.nextLine();
			} while (!(type.equalsIgnoreCase("Automatic")) && !(type.equalsIgnoreCase("Manual")));

			do {
				System.out.print("Input helm amount [>= 1]: ");
				try {
					helm = scan.nextInt();
				} catch (Exception e) {
					helm = 404;
				}
				scan.nextLine();
			} while (helm < 1);

			Motorcycle mD = new Motorcycle(brand, name, wheel, type, license, topSpeed, gasCap, helm);
			vhcData.add(mD);
			System.out.println("Insert Success!");
			System.out.println();
			System.out.println("Press enter to continue...");
			scan.nextLine();
			Menu();
		}
	}

	public void View() {

		if (vhcData.isEmpty()) {
			System.out.println(
					"|-----|------------|------------------|------------|----------|----------|----------|----------|----------|----------|");
			System.out.printf("|%-5s|%-12s|%-18s|%-12s|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|\n", "No", "Type", "Brand",
					"Name", "License", "Top Speed", "Gas Cap.", "Wheel", "Type", "Ent Sys", "Helm");
			System.out.println(
					"|-----|------------|------------------|------------|----------|----------|----------|----------|----------|----------|");
			System.out.println(
					"|-----|------------|------------------|------------|----------|----------|----------|----------|----------|----------|");
			System.out.println("There is nothing here. Please input something...");
			System.out.println("Press enter to continue...");
			scan.nextLine();
			Menu();
		} else {
			System.out.println(
					"|-----|------------|------------------|------------|----------|----------|----------|----------|----------|----------|----------|");
			System.out.printf("|%-5s|%-12s|%-18s|%-12s|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|\n", "No", "Type",
					"Brand", "Name", "License", "Top Speed", "Gas Cap.", "Wheel", "Type", "Ent Sys", "Helm");
			System.out.println(
					"|-----|------------|------------------|------------|----------|----------|----------|----------|----------|----------|----------|");
			for (int i = 0; i < vhcType.size(); i++) {
				if (vhcType.get(i).equalsIgnoreCase("Car")) {
					System.out.printf("|%-5d|%-12s|%-18s|%-12s|%-10s|%-10d|%-10d|%-10d|%-10s|%-10d|%-10d|\n", (i + 1),
							vhcType.get(i), vhcData.get(i).getBrand(), vhcData.get(i).getName(),
							vhcData.get(i).getLicense(), vhcData.get(i).getTopSpeed(), vhcData.get(i).getGasCap(),
							vhcData.get(i).getWheel(), vhcData.get(i).getType(), vhcData.get(i).getEntSys());
				} else if (vhcType.get(i).equalsIgnoreCase("Motorcycle")) {
					System.out.printf("|%-5d|%-12s|%-18s|%-12s|%-10s|%-10d|%-10d|%-10d|%-10s|%-10d|%-10d|\n", (i + 1),
							vhcType.get(i), vhcData.get(i).getBrand(), vhcData.get(i).getName(),
							vhcData.get(i).getLicense(), vhcData.get(i).getTopSpeed(), vhcData.get(i).getGasCap(),
							vhcData.get(i).getWheel(), vhcData.get(i).getType(), vhcData.get(i).getHelm());
				}
				System.out.println(
						"|-----|------------|------------------|------------|----------|----------|----------|----------|----------|----------|----------|");
			}
			// 5, 12, 18, 12, 10, 10, 10, 10, 10, 10 = 107

			do {
				System.out.print("Pick a vehicle number to test drive[Enter '0' to exit]: ");
				try {
					input = scan.nextInt();
				} catch (Exception e) {
					input = 404;
				}
				scan.nextLine();
				if (input == 0) {
					Menu();
				} else {
					if (vhcType.get(input).equalsIgnoreCase("car")) {
						System.out.println("Brand: " + vhcData.get(input).getBrand());
						System.out.println("Name: " + vhcData.get(input).getName());
						System.out.println("License Plate: " + vhcData.get(input).getLicense());
						System.out.println("Type: " + vhcData.get(input).getType());
						System.out.println("Gas Capacity: " + vhcData.get(input).getGasCap());
						System.out.println("Top Speed: " + vhcData.get(input).getTopSpeed());
						System.out.println("Wheel(s): " + vhcData.get(input).getWheel());
						System.out.println("Entertainment System: " + vhcData.get(input).getEntSys());
						
					} else if (vhcType.get(input).equalsIgnoreCase("Motorcycle")) {
						System.out.println("Brand: " + vhcData.get(input).getBrand());
						System.out.println("Name: " + vhcData.get(input).getName());
						System.out.println("License Plate: " + vhcData.get(input).getLicense());
						System.out.println("Type: " + vhcData.get(input).getType());
						System.out.println("Gas Capacity: " + vhcData.get(input).getGasCap());
						System.out.println("Top Speed: " + vhcData.get(input).getTopSpeed());
						System.out.println("Wheel(s): " + vhcData.get(input).getWheel());
						System.out.println("Helm: " + vhcData.get(input).getHelm());
					}

				}

			} while (input < 0 || input > vhcType.size());
		}
	}

	public static void main(String[] args) {
		new Main();

	}

}
