package onlineExamPortal;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlineExamPortal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		McqQuestion q1 = new McqQuestion(1, "first question");
		ParaQuestion q2 = new ParaQuestion(2, "second question");
		McqQuestion q3 = new McqQuestion(3, "third question");
		ParaQuestion q4 = new ParaQuestion(4, "fourth question");
		McqQuestion q5 = new McqQuestion(5, "fifth question");
		ParaQuestion q6 = new ParaQuestion(6, "sixth question");
		McqQuestion q7 = new McqQuestion(7, "seventh question");
		ParaQuestion q8 = new ParaQuestion(8, "eigth question");
		
		ArrayList<Question> questions = new ArrayList<Question>();
		questions.add(q1);
		questions.add(q2);
		questions.add(q3);
		questions.add(q4);
		questions.add(q5);
		questions.add(q6);
		questions.add(q7);
		questions.add(q8);
		
		System.out.println("Total number of questions is " +questions.size() +"\n");
		
		
		ArrayList<Question> calculas = new ArrayList<Question>();
		calculas.add(q1);
		calculas.add(q2);
		
		ArrayList<Question> algebra = new ArrayList<Question>();
		algebra.add(q3);
		algebra.add(q4);
		
		ArrayList<Question> physics = new ArrayList<Question>();
		physics.add(q5);
		physics.add(q6);
		
		ArrayList<Question> chemistry = new ArrayList<Question>();
		chemistry.add(q7);
		chemistry.add(q8);
		
		

		Topic calculasCourse = new Topic("Java", calculas);
		Topic algebraCourse = new Topic("Dbms", algebra);
		Topic physicsCourse = new Topic("Dbms", physics);
		Topic chemistryCourse = new Topic("Dbms", chemistry);
		
		ArrayList<Topic> maths = new ArrayList<Topic>();
		maths.add(calculasCourse);
		maths.add(algebraCourse);
		
		ArrayList<Topic> science = new ArrayList<Topic>();
		science.add(physicsCourse);
		science.add(chemistryCourse);
		
		Category mathematics = new Category("Maths", maths);
		Category sciences = new Category("Science", science);
		
		System.out.println("1. DISPLAY ALL QUESTIONS");
		System.out.println("2. DISPLAY BY TOPICS");
		System.out.println("3. DISPLAY BY CATEGORY AND TOPICS");
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		if(option == 1) {
			System.out.println("The questions are : ");
			for(Question q: questions) {
				q.toString();
			}
		}
		
		if(option == 2) {
			System.out.println("1. CALCULAS");
			System.out.println("2. ALGEBRA");
			System.out.println("3. PHYSICS");
			System.out.println("4. CHEMISTRY");
			
			Scanner sc1 = new Scanner(System.in);
			int option1 = sc1.nextInt();
			if(option1==1) {
				System.out.println("CALCULAS QUESTIONS");
				System.out.println(calculasCourse.getQuestions());
			}
			else if(option1==2) {
				System.out.println("ALGEBRA QUESTIONS");
				System.out.println(algebraCourse.getQuestions());
			}
			else if(option1==3) {
				System.out.println("PHYSICS QUESTIONS");
				System.out.println(physicsCourse.getQuestions());
			}
			else if(option1==4) {
				System.out.println("CHEMISTRY QUESTIONS");
				System.out.println(chemistryCourse.getQuestions());
			}
			sc1.close();
		}
		 if(option == 3) {
			System.out.println("1. MATHS");
			System.out.println("2. SCIENCE");
			
			Scanner sc2 = new Scanner(System.in);
			int option2 = sc2.nextInt();
			if(option2==1) {
				System.out.println("1. CALCULAS");
				System.out.println("2. ALGEBRA");
				Scanner sc1 = new Scanner(System.in);
				int option1 = sc1.nextInt();
				if(option1==1) {
					System.out.println("CALCULAS QUESTIONS");
					System.out.println(calculasCourse.getQuestions());
				}
				else if(option1==2) {
					System.out.println("ALGEBRA QUESTIONS");
					System.out.println(algebraCourse.getQuestions());
				}
				sc1.close();
			}
			else if(option2==2) {
				System.out.println("1. PHYSICS");
				System.out.println("2. CHEMISTRY");
				Scanner sc1 = new Scanner(System.in);
				int option1 = sc1.nextInt();
				if(option1==1) {
					System.out.println("PHYSICS QUESTIONS");
					System.out.println(physicsCourse.getQuestions());
				}
				else if(option1==2) {
					System.out.println("CHEMISTRY QUESTIONS");
					System.out.println(chemistryCourse.getQuestions());
				}
				sc1.close();
			}
	 }
	}
	
}
