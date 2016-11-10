import java.util.ArrayList;

public class ListEvents {
	
	ArrayList<Event> eventsArray = new ArrayList<Event>();
    boolean successful; 
  
    public boolean add(Event event) {
		String eventStr = event.getEvent();
		successful = false;
		if (eventStr != null) {
			eventsArray.add(event);
			successful = true;
		}
		return successful;
	}
  
	public ArrayList getArray() {
		return eventsArray;
	}
  
}