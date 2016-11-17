public class FootballPlayer implements SalaryInterface, YearsForGameInterface, GoalCelebrationInterface {
	
	protected String name;
    protected int date;
	
	FootballPlayer(String name, int date) {
		this.name = name;
		this.date = date;
	}
	
	public String celebration() {
		String celebrationGoal = "ÐÐÐÐÀÄÎÑÒÜ";
		return celebrationGoal;
	}
	
	public double salary() {
		double sal = 1000*20*10;
		return sal;
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
		"Salary : "  + salary() + "\n" + 
		"Goal celebration : " + celebration() + "\n" + 
		"Years for game : " + yearsForGame() + "\n" + 
		"----------------------------" ;
	}
	
}