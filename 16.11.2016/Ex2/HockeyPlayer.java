public class HockeyPlayer implements SalaryInterface, YearsForGameInterface, GoalCelebrationInterface {
	
	protected String name;
    protected int date;
	
	HockeyPlayer(String name, int date) {
		this.name = name;
		this.date = date;
	}
	double sal = 0;
	
	public String celebration() {
		String celebrationGoal = "ËËËËÀÄÎÑÒÜ";
		return celebrationGoal;
	}
	
	public double salary() {
	    sal = 1000*300;
		return sal;
	}
	
	public double salaryNationalTeam() {
		double salNationalTeam = salary() + 1000;
		return salNationalTeam;
	}
	
	public int yearsForGame() {
		if (2016 - date > 0) {
			int yearsGame = 2016 - date;
			return yearsGame;
		} else {
			return 0;
		}
	}
	
	public String toString() {
		return 
		"Name : " + name + "\n" + 
		"Salary : "  + salaryNationalTeam() + "\n" + 
		"Goal celebration : " + celebration() + "\n" + 
		"Years for game : " + yearsForGame() + "\n" + 
		"----------------------------" ;
	}
	
}