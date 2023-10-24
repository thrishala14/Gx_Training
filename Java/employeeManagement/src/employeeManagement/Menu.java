package employeeManagement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		List<Employee> listEmp = new ArrayList<>();
		while(true) {
			System.out.println("----- MENU -----");
			System.out.println("Enter 1: Insert record");
			System.out.println("Enter 2: Display all records");
			System.out.println("Enter 3: Delete single record");
			System.out.println("Enter 4: Update record");
			System.out.println("Enter 5: Display one record based on ID.");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1: 
				try {
					listEmp = insert(listEmp);
				} catch (ParseException e) {
					System.out.println("The entered date is not in the format. Check the below error\n" + e.getMessage());
				} catch (Exception e) {
					System.out.println("The entered gender is not possible. Check the below error\n" + e.getMessage());
				}
				break;
				case 2: display(listEmp);
				break;
				case 3: delete(listEmp);
				break;
				case 4: try {
					update(listEmp);
				} catch (ParseException e) {
					System.out.println("The entered date is not in the format. Check the below error\n" + e.getMessage());
				} catch (Exception e) {
					System.out.println("The entered gender is not possible. Check the below error\n" + e.getMessage());
				}
				break;
				case 5: displayById(listEmp);
				break;
				default: System.exit(0);
			}
		}
		
	}

	private static List<Employee> display(List<Employee> listEmp) {
		
		
		for(Employee e: listEmp) {
			String gender = null;
			if(e.getGender()=='m') {
				gender = "Male";
			}
			else if (e.getGender() == 'f') {
				gender = "Female";
			}
			System.out.println("ID: " +e.getId() 
							+ "\n\t First Name: " + e.getFirstName()
							+ "\n\t Last Name: " + e.getLastName()
							+ "\n\t DOB: " + e.getDob()
							+ "\n\t City: " + e.getCity()
							+ "\n\t Salary: " + e.getSalary()
							+ "\n\t Gender: " + gender);
			
		}
		return listEmp;
		
	}

	private static List<Employee> displayById(List<Employee> listEmp) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the ID to be display");
		long idToBeDisplayed = sc1.nextLong();
		int flag = 1;
		for(int i = 0; i<listEmp.size();i++) {
			if(listEmp.get(i).getId() == idToBeDisplayed ) {
				flag = 0;
				System.out.println("ID: " +listEmp.get(i).getId() 
				+ "\n\t First Name: " + listEmp.get(i).getFirstName()
				+ "\n\t Last Name: " + listEmp.get(i).getLastName()
				+ "\n\t DOB: " + listEmp.get(i).getDob()
				+ "\n\t City: " + listEmp.get(i).getCity()
				+ "\n\t Salary: " + listEmp.get(i).getSalary());
				break;
			}
			
		}
		if(flag == 1) {
			System.out.println("ID Not Found");
		}
		return listEmp;
	}

	private static List<Employee> update(List<Employee> listEmp) throws Exception {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the ID to be updated");
		long idToBeUpdated = sc1.nextLong();
		int flag = 1;
		for(int i = 0; i<listEmp.size();i++) {
			if(listEmp.get(i).getId() == idToBeUpdated) {
				flag = 0;
				System.out.println("Enter First Name: ");
				listEmp.get(i).setFirstName(sc1.next());
				System.out.println("Enter Last Name: ");
				listEmp.get(i).setLastName(sc1.next());
				System.out.println("Enter DOB: ");
				String dob = sc1.next();
				
				SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyy");
				Date d = date.parse(dob);
				listEmp.get(i).setDob(d);
				
				System.out.println("Enter Salary: ");
				listEmp.get(i).setSalary(sc1.nextDouble());
				System.out.println("Enter City: ");
				listEmp.get(i).setCity(sc1.next());
				System.out.println("Enter Gender: ");
				char gender = sc1.next().charAt(0);
				if(gender!='m' && gender!='f') {
					throw new Exception("Gender should be male(m) or female(f)");
				}
				listEmp.get(i).setGender(gender);
				
				System.out.println("Updated ID " +idToBeUpdated + " successfully");
				break;
			}
		}
		if(flag == 1) {
			System.out.println("ID Not Found");
		}
		return listEmp;
	}

	private static List<Employee> delete(List<Employee> listEmp) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the ID to be deleted");
		long idToBeDeleted = sc1.nextLong();
		int flag = 1;
		for(int i = 0; i<listEmp.size();i++) {
			if(listEmp.get(i).getId() == idToBeDeleted) {
				flag = 0;
				listEmp.remove(listEmp.get(i));
				break;
			}
		}
		if(flag ==1) {
			System.out.println("ID Not Found");
		}
		return listEmp;
	}

	private static List<Employee> insert(List<Employee> listEmp) throws Exception {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter First Name: ");
		String firstName = sc1.next();
		System.out.println("Enter Last Name: ");
		String lastName = sc1.next();
		System.out.println("Enter DOB: ");
		String dob = sc1.next();
		
		SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyy");
		Date d = date.parse(dob);
		
		System.out.println("Enter Salary: ");
		double salary = sc1.nextDouble();
		System.out.println("Enter City: ");
		String city = sc1.next();
		System.out.println("Enter Gender: ");
		char gender = sc1.next().charAt(0);
		if(gender!='m' && gender!='f') {
			throw new Exception("Gender should be male(m) or female(f)");
		}
		long newId;
		Collections.sort(listEmp);
		if(!listEmp.isEmpty())
		newId = listEmp.get(listEmp.size()-1).getId() + 1;
		else
			newId = 1001;
		
		Employee e = new Employee(newId, firstName, lastName, d, salary, city, gender);
		listEmp.add(e);
		return listEmp;
	}

}
