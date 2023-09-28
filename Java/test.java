package javaDemo;

import java.util.ArrayList;
import java.util.List;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] values = {1, 2, 3, 4, 5, 6};
		List<Patient> patients = new ArrayList<>();
		Patient patient = new Patient();
		patient.setid(1);
		patient.setName("abc");
		
		Patient patient1 = new Patient();
		patient1.setid(2);
		patient1.setName("xyz");
		
		patients.add(0, patient);
		patients.add(1, patient1);
		
		
		
	}

}
