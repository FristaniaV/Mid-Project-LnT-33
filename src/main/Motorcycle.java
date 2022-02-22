package main;

public class Motorcycle extends Vehicle {

	String license;
	int topSpeed;
	int gasCap;
	int helm;
	
	public Motorcycle (String brand, String name, int wheel, String type, String license, int topSpeed, int gasCap, int helm) {
		super(brand, name, wheel, type);
		this.license = license;
		this.topSpeed = topSpeed;
		this.gasCap = gasCap;
		this.helm = helm;
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
		return 0;
	}

	@Override
	public int getHelm() {
		return helm;
	}

}
