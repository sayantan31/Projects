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
	
	
	public int book(String providerName, String consumer_id, Date[] date) {
		
		AppointmentDao ad = new AppointmentDao();
		
		Appointment app = new Appointment(providerName, date);
		
		String[] str = {providerName, consumer_id, app.getDay(), app.getStartTime(), app.getEndTime()};
		
		return  ad.addAppointment(str);
	}
	
	public void cancel(String appointment) {
		
		AppointmentDao ad = new AppointmentDao();
		
		ad.removeAppointment(appointment);
		
	}
	
}
