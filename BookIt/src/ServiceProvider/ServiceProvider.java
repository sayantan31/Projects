package ServiceProvider;

import java.util.Date;

import DataManagement.AppointmentDao;
import DataManagement.ServiceProviderDao;

public class ServiceProvider {

	String first_name;
	String last_name;
	String myUsername;
	String myPassword;
	String myAddress;
	String myPhone;
	String myEmail;
	String business;
	//ProviderCalendar myCalendar;
	int consumer_id;
	String[] parts;
	
	
	public static void main(String args[]) {
		
	}
	
	public ServiceProvider() {
		parts = new String[8];
	}
	
	public int addSignupDetails(String str) {
		
		parts = str.split(" ");
		
		ServiceProviderDao provider = new ServiceProviderDao();
		
		provider.addProvider(parts);
		
		return ServiceProviderDao.provider_id;
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
	
	public int book(String providerName, String consumer_id, Date[] date) {
		
		AppointmentDao ad = new AppointmentDao();
		
		Appointment app = new Appointment(providerName, date);
		
		String[] str = {providerName, consumer_id, app.getDay(), app.getStartTime(), app.getEndTime()};
		
		return  ad.addAppointment(str);
	}
	
	public boolean cancel(String appointment) {
		
		AppointmentDao ad = new AppointmentDao();
		
		return ad.removeAppointment(appointment);
		
	}
}
