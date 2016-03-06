package Consumer;

import java.text.SimpleDateFormat;
import java.util.Date;

import DataManagement.ConsumerDao;

public class Consumer {

	String first_name;
	String last_name;
	String myUsername;
	String myPassword;
	String myAddress;
	String myPhone;
	String myEmail;
	String myCalendar;
	String[] parts;
	
	
	public static void main(String args[]) {
		Consumer c = new Consumer();
		//c.addSignupDetails("sayantan sengupta sayantan31 archie123 mathilda 6692242714 sayantan31@gmail.com");
	}
	
	public Consumer() {
		parts = new String[8];
	}
	
	public int addSignupDetails(String str) {
		
		parts = str.split(" ");
		
		ConsumerDao consumer = new ConsumerDao();
		
		consumer.addConsumer(parts);
		
		return ConsumerDao.consumer_id;
	}
	
	
	public void setFirstName() {
		first_name = parts[0];
	}
	
	public void setLastName() {
		last_name = parts[1];
	}
	
	public void setUsername() {
		myUsername= parts[2];
	}
	
	public void setPassword() {
		myPassword = parts[3];
	}
	
	public void setAddress() {
		myAddress = parts[4];
	}
	
	public void setPhone() {
		myPhone = parts[5];
	}
	
	public void setEmail() {
		myEmail = parts[6];
	}
	
	public String getFirstName() {
		return first_name;
	}
	
	public String getLastName() {
		return last_name;
	}
	
	public String getUsername() {
		return myUsername;
	}
	
	public String getPassword() {
		return myPassword;
	}
	
	public String getAddress() {
		return myAddress;
	}
	
	public String getPhone() {
		return myPhone;
	}
	
	public String getEmail() {
		return myEmail;
	}
	
	
	
	public void book(Appointment appo) {
		
		
		
	}
	
	public void cancel(Appointment appo) {
		
		
		
	}
	
}
