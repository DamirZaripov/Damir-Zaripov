class Player {
	
	protected String name;
	protected int age; 
	protected int experience;
	protected String country;
	protected String club;
	protected String countryOfClub;
	protected String legionary; 
	protected double salaryForLegionary;
	protected double salary; 
	
	Player(String name, int age, int experience, String country, String club, String countryOfClub) {
		this.name = name;
		this.age = age;
		this.experience = experience;
		this.country = country;
		this.club = club;
		this.countryOfClub = countryOfClub;
	}
	
	public void clone(Player player) {
		this.name = player.getName();
		this.age = player.getAge();
		this.experience = player.getExperience();
		this.country = player.getCountry();
		this.club = player.getClub();
		this.countryOfClub = player.getCountryOfClub();
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getExperience() {
		return experience;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getClub() {
		return club;
	}
	
	public String getCountryOfClub() {
		return countryOfClub;
	}
	
	public double gerSalary() {
		return salary;
	}
	
	public String Legionary(String country, String countryOfClub) {
		if (country.equals(countryOfClub)) {
			legionary = "No"; salaryForLegionary = 1;
		} else {
			legionary = "Yes"; salaryForLegionary = 1.5;
		}
		return legionary;
	}
	
	public int hashCode() {
		int result = 17;
		
		result = result * 37 + this.name.hashCode();
		result = result * 37 + this.age;
		result = result * 37 + this.experience;
		result = result * 37 + this.country.hashCode();
		result = result * 37 + this.club.hashCode();
		result = result * 37 + this.countryOfClub.hashCode();
		return result;
	}
	
	public double getSalaryForLegionary() {
		return salaryForLegionary;
	}
	
	public double Salary(int age, int experience, double salaryForLegionary) {
		salary = 1000*(age/10)*experience*salaryForLegionary;
		return salary;
	}
	
	
}