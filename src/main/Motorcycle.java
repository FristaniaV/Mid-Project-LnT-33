package main;

public class Motorcycle extends Vehicle {

	@Override
	public void license() {

		
		
		licenseList.add(license);
		
	}

	@Override
	public void topSpeed() {
		
		do {
			System.out.println("Input top speed [ 100 <= topSpeed <= 250]: ");
			try {
				topSpeed = scan.nextInt();
			} catch (Exception e) {
				topSpeed = 404;
			} scan.nextLine();
		} while (topSpeed < 100 || topSpeed > 250);
		
		topSpeedList.add(topSpeed);
	}

	@Override
	public void gasCap() {
		
		do {
			System.out.println("Input gas capacity [30 <= gasCap <= 60]: ");
			try {
				gasCap = scan.nextInt();
			} catch (Exception e) {
				gasCap = 404;
			} scan.nextLine();
		} while (gasCap < 30 || gasCap > 60);
		
		gasCapList.add(gasCap);
		
	}

	@Override
	public void entSys() {

		do {
			System.out.println("Input helm amount [>= 1]: ");
			try {
				helm = scan.nextInt();
			} catch (Exception e) {
				helm = 404;
			} scan.nextLine();
		} while (helm < 1);
		
		helmList.add(helm);
	}



}
