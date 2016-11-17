public class Main {
	
	public static void main(String[] args) {
		FootballPlayer fbp = new FootballPlayer("Messi", 1990);
		HockeyPlayer hkp = new HockeyPlayer("Ovechkin", 1980);
		System.out.println(fbp.toString());
		System.out.println(hkp.toString());
	}
}