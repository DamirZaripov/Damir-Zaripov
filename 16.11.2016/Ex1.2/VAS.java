public class VAS extends Car {
	
	VAS(String nameCar, int yearOfRelease) {
		super (nameCar, yearOfRelease);
	}
	
	public String sound() {
		String soundCar = "KRHh...KRHH....";
		return soundCar;
	}
	
	public boolean brake() {
		int yearsCar = 2016 - yearOfRelease;
		if (yearsCar < 4) {
			broken = false; 
		} else {
			broken = true;
		}
		return broken;
	}
}