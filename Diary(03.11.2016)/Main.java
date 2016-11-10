import java.util.Scanner;
import java.util.Calendar;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Main {
	
	static ListEvents listEvents = new ListEvents();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Считывать с консоли
		Calendar cal = Calendar.getInstance();
		String date;
		String yourEvent;
		String yourDate;
		boolean isAddEvent;
		
		System.out.println("Hello! Let's go to use Diary! ");
		System.out.println("You can use some commands : add new event, print events for day, print all events, cheak date, exit ");
		System.out.println("-----------------------------------");
		System.out.print("Write command : ");
		
		
		String input;
		
		while (sc.hasNextLine()) {
			input = sc.nextLine();
			switch (input) {
				case "add new event" :
					System.out.println("Write date. Formate : dd.mm.yyyy");
					System.out.print("Date : ");
					date = sc.nextLine();
					System.out.print("Write your event : ");
					yourEvent = sc.nextLine();
					Event event = new Event(yourEvent,date);
					isAddEvent = listEvents.add(event);
					if (isAddEvent) {
						System.out.println("Event was add");
					} else {
						System.out.println("Event wasn't add");
					}
					System.out.println("-----------------------------------");
					System.out.print("Write new command : ");
					break;	
				case "exit" :
					System.out.print("Thanks for using Diary! Bye!");
					System.exit(0);
					break;
				case "cheak date" :
					System.out.println("Write date. Formate : dd.mm.yyyy");
					System.out.print("Date : ");
					yourDate = sc.nextLine();
					cheakDate(yourDate);
					System.out.println("-----------------------------------");
					System.out.print("Write new command : ");
					break;
				case "print events for day" :
					System.out.println("Write date. Formate : dd.mm.yyyy");
					System.out.print("Date : ");
					yourDate = sc.nextLine();
					printDate(yourDate);
					System.out.println("-----------------------------------");
					System.out.print("Write new command : ");
					break;
				case "print all events" :
					for (int i = 0; i < listEvents.getArray().size(); i++) {
						System.out.println("-----------------------------------");
						Event eventList = (Event) listEvents.getArray().get(i);
						System.out.println(eventList.toString());
					}
					System.out.println("-----------------------------------");
					System.out.print("Write new command : ");
					break;
				default:
					System.out.println("Command not found");
					System.out.println("-----------------------------------");
					System.out.print("Write new command : ");
			}
		} 
	}
	
	public static void printDate(String yourDate) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
			Calendar calendar = Calendar.getInstance();
			sdf.setLenient(false); 
			calendar.setTime(sdf.parse(yourDate));
			for (int i = 0; i < listEvents.getArray().size(); i++) {
						Event eventList = (Event) listEvents.getArray().get(i);
						Calendar myDate = eventList.getDate();
						if (myDate.equals(calendar)) {
							System.out.println("-----------------------------------");
							System.out.println(eventList.toStringEvent());
						}
					}
		} catch (ParseException e) {
			System.out.println("Date has incorrect format. Please, try again.");
		}
	}
	
	public static void cheakDate(String yourDate) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
			Calendar calendar = Calendar.getInstance();
			int n = 0;
			sdf.setLenient(false);
			calendar.setTime(sdf.parse(yourDate));
			for (int i = 0; i < listEvents.getArray().size(); i++) {
						Event eventList = (Event) listEvents.getArray().get(i);
						Calendar myDate = eventList.getDate();
						if (myDate.equals(calendar)) {
							n ++;
						}
					}
			if (n == 0) {
				System.out.println("Date is free");
			} else {
				System.out.println("Date isn't free");
			}
		} catch (ParseException e) {
			System.out.println("Date has incorrect format. Please, try again.");
		}
	}
}