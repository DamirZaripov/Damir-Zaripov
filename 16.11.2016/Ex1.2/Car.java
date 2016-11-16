public abstract class Car {
	
	protected String nameCar;
    protected int yearOfRelease;
    protected boolean broken;
	
	Car(String nameCar, int yearOfRelease) {
		this.nameCar = nameCar;
		this.yearOfRelease = yearOfRelease;
	}
	
    public abstract String sound();
	public abstract boolean brake();
	
	public String toString() {
		return 
		"Car : " + nameCar + "\n" + 
		"Brokean : " + brake() + "\n" + 
		"Sound of car : " + sound() + "\n" +
		"----------------------------" ;
	}
} 