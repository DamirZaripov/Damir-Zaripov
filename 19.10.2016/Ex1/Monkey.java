class Monkey{
	
	protected int iq;
	protected String country;
	protected String[] skills = new String[4];
	protected int skill;
	protected boolean speach = false;
	
	public void setIntelligenceQuotient(int iq){
		this.iq = iq;
	}
	
	public int getIntelligenceQuotient(){
		return iq;
	}
	
	public void setCountry(String country){
		this.country = country;
	}
	
	public String getCountry(){
		return country;
	} 
	
	public void setSpeach(boolean speach) {
		this.speach = speach;
	}
	
	public void defineSkills() {
		if (iq < 51) {
			skill = 1;
		}
		if ((iq > 51) && (iq < 100)) {
			skill = 3;
		}
		if ((iq > 99)) {
			skill = 5;
		}
	}
	
	public String[] skills() {
		if (skill <= 2) {
			beginnerSkills();
		} else {
			upperSkills();
		} 
		return skills;
	}
	
	public void beginnerSkills() {
		skills[0] = "speach is " + speach;
		skills[1] = "eat banana";
	}
	
	public void upperSkills() {
		beginnerSkills();
		skills[2] = "make fire";
	} 
}