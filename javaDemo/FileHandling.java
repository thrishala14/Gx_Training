package javaDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter file = new FileWriter("test.txt");
		file.write("my name is thrishala ");
		file.close();
		
		File f = new File("test.txt");
        Scanner s = new Scanner(f);
        while (s.hasNextLine()) {
            String data = s.nextLine();
            System.out.println(data);
        }
        s.close();
		
        
        FileOutputStream fos1 =new FileOutputStream("bao1.txt");;
        FileOutputStream fos2 =new FileOutputStream("bao2.txt");
        byte []values = {10,20,30};
        
        
        fos1.write(values);
        FileInputStream fis1 = new FileInputStream("bao1.txt");
        int j;
        while((j=fis1.read())!=-1) {
        System.out.println(j);}
        
        FileInputStream f1 = new FileInputStream("test.txt");
        int i;
        while((i=f1.read())!=-1) {
        	System.out.print((char)i);
        }
	}
}
