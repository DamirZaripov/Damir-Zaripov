public class Human extends Monkey {
	
	Human() {
		setSpeach(true);
	}
	
	public String[] skills() {
		if (skill < 4) {
			beginnerSkills();
			skills[2] = "cook";
			skills[3] = "read";
		} else {
			skills[4] = "drive a car";
			skills[5] = "write a song";
		}	
		return skills;
	}
}