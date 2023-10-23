package assignment17th;

public class Student {
	private String name;
	private int rollNo;
	private int classNo;
	
	public Student(String name, int rollNo, int classNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.classNo = classNo;
	}

	public String getName() {
		return name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public int getClassNo() {
		return classNo;
	}


	public void setName(String name) {
		this.name = name;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setClassNo(int classNo) {
		this.classNo = classNo;
	}

	
}
