import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.ParseException;

class Event {
	
	private String yourEvent;
	private SimpleDateFormat sdf;
	private Calendar calendar;
	
	public Event(String yourEvent, String date) {
		try {
			sdf = new SimpleDateFormat("dd.MM.yyyy");
			calendar = Calendar.getInstance();
			sdf.setLenient(false); // Выключает у Calendar снисходительность к неправильной дате (если не выключить, то 13 месяц преватится в 1 месяц нового года)
			calendar.setTime(sdf.parse(date));
			this.yourEvent = yourEvent;
		} catch (ParseException e) {
			System.out.println("Date has incorrect format. Please, try again.");
		}
	}
	
	public String getEvent() {
		return yourEvent;
	}
	
	public Calendar getDate() {
		return calendar;
	}
	
	public String toString() {
		String date = sdf.format(calendar.getTime());
		return "Date: " + date + "\n" + "Event: " + yourEvent;
	}
	
	public String toStringEvent() {
		String date = sdf.format(calendar.getTime());
		return "Event: " + yourEvent;
	}
}