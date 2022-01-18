package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car extends Vehicle {

	@Override
	public void license() {

		boolean ynn = true;
		
		do {
			System.out.println("Input license: ");
			license = scan.nextLine();
			Pattern p = Pattern.compile(license);
			Matcher m = p.matcher("[A-Z]{1} [0-9]{1,4} [A-Z]{1,3}");
			ynn = m.matches();
		} while (ynn == false);
		
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
			System.out.println("Input entertainment system amount [>= 1]: ");
			try {
				entSys = scan.nextInt();
			} catch (Exception e) {
				entSys = 404;
			} scan.nextLine();
		} while (entSys < 1);
		
		entSysList.add(entSys);
	}



}
