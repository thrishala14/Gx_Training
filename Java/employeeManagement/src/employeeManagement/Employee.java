package employeeManagement;

import java.util.Date;


public class Employee implements Comparable<Employee>{
	private long id;
	private String firstName;
	private String lastName;
	private Date dob;
	private double salary;
	private String city;
	private char gender;
	
	
	public Employee(long id, String firstName, String lastName, Date date, double salary, String city, char gender) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = date;
		this.salary = salary;
		this.city = city;
		this.gender = gender;
	}
	public long getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getDob() {
		String s = dob.getDate() + "/" + (dob.getMonth()+1)+ "/" + (dob.getYear() + 1900);
		return s;
	}
	public double getSalary() {
		return salary;
	}
	public String getCity() {
		return city;
	}
	public char getGender() {
		return gender;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public int compareTo(Employee o) {
		return (int) (this.id - o.id);
	}
	
}
