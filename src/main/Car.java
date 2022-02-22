package main;

public class Car extends Vehicle {

	String license;
	int topSpeed;
	int gasCap;
	int entSys;
	
	public Car (String brand, String name, int wheel, String type, String license, int topSpeed, int gasCap, int entSys) {
		super(brand, name, wheel, type);
		this.license = license;
		this.topSpeed = topSpeed;
		this.gasCap = gasCap;
		this.entSys = entSys;
	}
	
	@Override
	public String getLicense() {
		return license;
	}

	@Override
	public int getTopSpeed() {
		return topSpeed;
	}

	@Override
	public int getGasCap() {
		return gasCap;
	}

	@Override
	public int getEntSys() {
		return entSys;
	}

	@Override
	public int getHelm() {
		return 0;
	}
	
	public void View() {
		if (vhcData.get(input).getType().equalsIgnoreCase("Supercar")) {
			System.out.println("Boosting!");
		} else {
			System.out.println("Turning on entertainment system...");
		}
	}

}
