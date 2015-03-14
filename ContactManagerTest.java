import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ContactManagerTest {
//	private List<Contact> contacts;
//	private List<Meeting> meetings;

	SimpleDateFormat df;
//	Contact Pete = new ContactImpl("Pete Jones", "Marketing manager");
//	Contact Tom = new ContactImpl("Tom Hanks", "Actor"); 
//	Contact Mary = new ContactImpl("Mary");
//	Contact Chris;
	String notes;
	ContactManagerImpl cm;
	List<Contact> contacts2;
	
	
	@Test
	public void addNewContact() {
		cm = new ContactManagerImpl();
		cm.addNewContact("Chris", "Supervisor");
		Chris = new ContactImpl("Chris", "Supervisor");
		contacts2 = new ArrayList(); 
		contacts2.add(Pete);
		contacts2.add(Tom);
		contacts2.add(Mary);
		contacts2.add(Chris);
		String output = cm.getCMContacts().get(3).getName().toString();
		String expected = "Chris";
		assertEquals(output, expected);
	}
	
	@Test
	public void addMeetingNotes(){
		
	}
	
	@Test
	public void addPastMeeting(){
		
	}	
	@Test
	public void addFutureMeeting(){
		
	}	
	@Test
	public void getContats(){
		cm = new ContactManagerImpl();

		cm.addNewContact("Tom Hanks", "Astronaut");
		int output = cm.getContacts("Tom Hanks").size();
		int expected = 2;
		assertEquals(output, expected); 

		Set<Contact> input2 = cm.getContacts(1, 3);
		int output2 = input2.size();
		int expected2 = 2;
		assertEquals(expected2, output2); 
	}	
	@Test
	public void getFutureMeeting(){
		
	}	
	@Test
	public void getFutureMeegingList(){
		
	}	
	@Test
	public void getMeeting(){
		
	}	
	@Test
	public void getPastMeeting(){
		
	}	
	@Test
	public void getPastMeetingList(){
		
	}	
	@Test
	public void flush(){
		
	}	
}
