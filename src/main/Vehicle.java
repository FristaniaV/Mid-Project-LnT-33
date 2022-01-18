package main;

abstract public class Vehicle extends Main {
	
	public void brand() {
		
		do {
			System.out.println("Input brand [>= 5]: ");
			brand = scan.nextLine();
		} while (brand.length() < 4);
		
		brandList.add(brand);
	}
	
	public void name() {
		
		do {
			System.out.println("Input name [>= 5]: ");
			name = scan.nextLine();
		} while (name.length() < 4);
		
		nameList.add(name);
	}
	
	public abstract void license(); 
	
	public abstract void topSpeed(); 
	
	public abstract void gasCap(); 
	
	public void wheel() {
		
		do {
			System.out.println("Input wheel [ 4 <= wheel <= 6]: ");
			try {
				wheel = scan.nextInt();
			} catch (Exception e) {
				wheel = 404;
			} scan.nextLine();
		} while (wheel < 4 || wheel > 6);
		
		wheelList.add(wheel);
	}
	
	public void type() {
		
		do {
			System.out.println("Input type [SUV | Supercar | Minivan]: ");
			type = scan.nextLine();
		} while (!(type.equalsIgnoreCase("SUV") && !(type.equalsIgnoreCase("Supercar") && !(type.equalsIgnoreCase("Minivan")))));
		
		typeList.add(type);
	}
	
	public abstract void entSys();
	
	public void helm() {
		
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
