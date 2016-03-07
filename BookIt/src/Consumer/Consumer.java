package Consumer;

import java.text.SimpleDateFormat;
import java.util.Date;

import DataManagement.AppointmentDao;
import DataManagement.ConsumerDao;

public class Consumer {

	String first_name;
	String last_name;
	String myUsername;
	String myPassword;
	String myAddress;
	String myPhone;
	String myEmail;
	Calendar myCalendar;
	int consumer_id;
	String[] parts;
	
	
	public static void main(String args[]) {
		
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
	
	
	public int book(String str) {
		
		Calendar cal = new Calendar();
		
		AppointmentDao ad = new AppointmentDao();
		
		Appointment app = new Appointment(str);
		
		if(cal.isValid(app)) {
			String[] bookstr = {app.getProvider(), app.getConsumerID(), app.getDay(), app.getStartTime(), app.getEndTime()};
			for(String s : bookstr) {
				System.out.println(s);
			}
			return  ad.addAppointment(bookstr);
		}
		return -1;
	}
	
	public void cancel(String appointment) {
		
		AppointmentDao ad = new AppointmentDao();
		
		ad.removeAppointment(appointment);
		
	}
	
}
