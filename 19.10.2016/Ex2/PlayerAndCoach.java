class PlayerAndCoach extends Player {
	
	public int coach = 2; //ставка тренера 
	
	PlayerAndCoach(String name, int age, int experience, String country, String club, String countryOfClub) {
		super(name, age, experience, country, club, countryOfClub);
	}
	
	public int getCoach(){
		return coach;
	}
	public double Salary(int age, int experience, double salaryForLegionary, int coach) {
		salary = 1000*(age/10)*experience*salaryForLegionary*coach;
		return salary;
	}

	public boolean equals(PlayerAndCoach playerAndCoach) {
		String _name = playerAndCoach.getName();
		int _age = playerAndCoach.getAge();
		int _experience = playerAndCoach.getExperience();
		String _country = playerAndCoach.getCountry();
		String _club = playerAndCoach.getClub();
		String _countryOfClub = playerAndCoach.getCountryOfClub();
		if (name.equals(_name) && (age == _age) && (experience == _experience) && country.equals(_country)
		&& club.equals(_club) && countryOfClub.equals(_countryOfClub)) {
			return true; 
		} else {
			return false;
		}
		
	}
	
	
	
	public String toString() {
		return "Name : " + name + "\n" + "Age : " + age + "\n" + "Experience : " + experience + "\n" + "Country : " + country + "\n" + "Club : " +
		club + "\n" + "Country Of Club : " + countryOfClub;
	}
}