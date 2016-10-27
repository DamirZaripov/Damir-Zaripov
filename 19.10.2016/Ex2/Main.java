public class Main{
	
	public static void main(String[] args){
		PlayerAndCoach Messi = new PlayerAndCoach("Messi", 40, 10, "Argentina", "Barsa", "Spain");
		PlayerAndCoach Aguero = new PlayerAndCoach("Aguero", 38, 8, "Argentina", "MC", "England");
		PlayerAndCoach Messi2 = new PlayerAndCoach("Arshavin", 40, 10, "Russia", "Rubin", "Russia");
		
		Messi2.clone(Messi);
		
		boolean objectsEqual1 = Messi.equals(Aguero);
		boolean objectsEqual2 = Messi.equals(Messi2);
		System.out.println(Messi.toString());
		System.out.println("======================");
		System.out.println(Aguero.toString());
		System.out.println("======================");
		System.out.println(Messi2.toString());
		System.out.println("======================");
		System.out.println("First equal = " + objectsEqual1);
		System.out.println("Second equal = " + objectsEqual2);
		System.out.println(Messi.hashCode());
	}
}