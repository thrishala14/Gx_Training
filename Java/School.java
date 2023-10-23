package assignment17th;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Develop an object oriented program for managing a school which categorizes students as either hosteliers or day 
 * scholars to determine their respective bus name, route and commuting timing based on their roll no or roll no and 
 * class input.
 */

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bus b1 = new Bus(510, "kadugodi", "9:00");
		Bus b2 = new Bus(520, "hoodi", "9:30");
		Bus b3 = new Bus(530, "hope farm", "9:15");
		Bus b4 = new Bus(540, "agrahara", "9:20");
		
		
	
		DayScholars s1 = new DayScholars("nathan", 100, 8, b1);
		Hosteliers s2 = new Hosteliers("ariana", 101, 7);
		DayScholars s3 = new DayScholars("taylor", 102, 9, b2);
		Hosteliers s4 = new Hosteliers("justin", 103, 6);
		DayScholars s5 = new DayScholars("joe", 104, 10, b3);
		Hosteliers s6 = new Hosteliers("selena", 105, 8);
		DayScholars s7 = new DayScholars("jennifer", 100, 10, b4);
		Hosteliers s8 = new Hosteliers("charlie", 100, 9);
		
		List<DayScholars> dayScholars = new ArrayList<DayScholars>();
		dayScholars.add(s1);
		dayScholars.add(s3);
		dayScholars.add(s5);
		dayScholars.add(s7);
		
		List<Hosteliers> hosteliers = new ArrayList<Hosteliers>();
		hosteliers.add(s2);
		hosteliers.add(s4);
		hosteliers.add(s6);
		hosteliers.add(s8);
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter student roll no: ");
			int rollNo = sc.nextInt();
			System.out.println("Enter student class: ");
			int classNo = sc.nextInt();
			
			search(rollNo, classNo, dayScholars, hosteliers);
			
		} catch(InputMismatchException e) {
			System.out.println("invalid inputs!!!");
		}
		sc.close();
	}

	private static void search(int rollNo, int classNo, List<DayScholars> dayScholars, List<Hosteliers> hosteliers) {
		int flag = 1;
		if(flag == 1) {
			for(Hosteliers h : hosteliers) {
				if(h.getRollNo() == rollNo && h.getClassNo() == classNo) {
					System.out.println(h.getName() +" is a hostelier");
					flag = 0;
				}
			}
		}
		if(flag == 1) {
			for(DayScholars d: dayScholars) {
				if(d.getRollNo() == rollNo && d.getClassNo() == classNo) {
					System.out.println("Bus No: " +d.getBus().getBusNo() 
							+"\nBus Route: " +d.getBus().getRoute() 
							+"\nBus Timings: " +d.getBus().getTimings());
					flag =0;
				}
			}
		}
		if(flag == 1) {
			System.out.println("Student not found!!");
		}
	}

}
