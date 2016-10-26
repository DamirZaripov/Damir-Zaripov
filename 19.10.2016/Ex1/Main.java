public class Main {
	
	static Human human = new Human();
	static String[] skills;
	
	public static void main(String[] args) {
		human.setIntelligenceQuotient(101);
		human.setCountry("Russia");
		printInformationForHuman();
	}
	
	public static void printInformationForHuman() {
		int iq = human.getIntelligenceQuotient();
		skills = human.skills();
		String country = human.getCountry();
		System.out.println("Information about Human:");
		System.out.println("IQ = " + iq);
		System.out.println("Country : " + country);
		System.out.print("Actions : ");
		for (int i = 0; i < skills.length; i++) {
			String action = skills[i];
			if (i == 0) {
				System.out.print(action);
			} else {		
				System.out.print(", " + action);
			}	
		}	
	}
}
