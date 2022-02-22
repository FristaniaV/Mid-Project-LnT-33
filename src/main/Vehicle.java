package main;

public abstract class Vehicle extends Main {

	private String brand;
	private String name;
	private int wheel;
	private String type;
	
	public Vehicle(String brand, String name, int wheel, String type) {
		super();
		this.brand = brand;
		this.name = name;
		this.wheel = wheel;
		this.type = type;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public String getName() {
		return name;
	}

	public abstract String getLicense();

	public abstract int getTopSpeed();

	public abstract int getGasCap();

	public int getWheel() {
		return wheel;
	}

	public String getType() {
		return type;
	}

	public abstract int getEntSys();

	public abstract int getHelm();
	
	public void CarView() {
		if (vhcData.get(input).getType().equalsIgnoreCase("Supercar")) {
			System.out.println("Boosting!");
		} else {
			System.out.println("Turning on entertainment system...");
		}
	}
	
	public void MotorView() {
		System.out.println(vhcData.get(input).getName() + " is standing!");
	}
	
//	public String compareTo(Vehicle compareVehicle) {
//		
//		String compareType = ((Vehicle) compareVehicle).getQuantity(); 
//		
//		//ascending order
//		return this.quantity - compareQuantity;
//		
//		//descending order
//		//return compareQuantity - this.quantity;
//		
//	}	
}
