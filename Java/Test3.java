package javaDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test3 {
	public static void main(String []args) throws IOException {
		Employee e = new Employee();
		e.setId(1);
		e.setName("abc");
		
		FileOutputStream fos = new FileOutputStream("employee.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);;
		objectOutputStream.writeObject(e);
		objectOutputStream.close();
	}
}
