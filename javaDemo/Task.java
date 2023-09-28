package javaDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file1InputStream = new FileInputStream("file1.txt");

		int sameWords = 0, uniqueWords = 0, count = 0;
		Scanner s1 = new Scanner(file1InputStream);
		System.out.println("---------Similar words--------");
		ArrayList<String> al = new ArrayList<String>();
		while (s1.hasNext()) {

			String a = s1.next();
			FileInputStream file2InputStream = new FileInputStream("file2.txt");
			Scanner s2 = new Scanner(file2InputStream);
			// System.out.println(a);
			while (s2.hasNext()) {
				String b = s2.next();
				// System.out.println(a);
				if (a.equals(b)) {

					al.add(a);

					sameWords++;
				}

			}
			s2.close();
		}

		s1.close();
		Set<String> set = new HashSet<>(al);
		System.out.println(set);
		// System.out.println(sameWords);

		// System.out.println("Find out how many times it occurred in both the file.");
		System.out.println("----In file 1---");
		FileInputStream fileInputStream = new FileInputStream("file1.txt");

		Scanner r1 = new Scanner(fileInputStream);
		int countFile1 = 0;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		while (r1.hasNext()) {
			String a = r1.next();
			// System.out.println(a);
			if (al.contains(a)) {
				if (map.containsKey(a)) {
					map.replace(a, map.get(a) + 1);
				} else
					map.put(a, 1);

			}

		}
		System.out.println(map);
		r1.close();

		System.out.println("----In file 2---");
		FileInputStream fileInputStream2 = new FileInputStream("file2.txt");

		Scanner r2 = new Scanner(fileInputStream2);
		int countFile2 = 0;
		HashMap<String, Integer> map2 = new HashMap<String, Integer>();
		while (r2.hasNext()) {
			String a = r2.next();
			// System.out.println(a);
			if (al.contains(a)) {
				if (map2.containsKey(a)) {
					map2.replace(a, map2.get(a) + 1);
				} else
					map2.put(a, 1);

			}

		}
		System.out.println(map2);
		r2.close();

		System.out.println("-----Unique Words-----");
		System.out.println("-----File 1-----");
		FileInputStream f31 = new FileInputStream("file1.txt");
		Scanner r31 = new Scanner(f31);
		while (r31.hasNext()) {
			String a = r31.next();
			if (!al.contains(a)) {
				System.out.println(a);
			}
		}
		System.out.println("-----File 2-----");
		FileInputStream f32 = new FileInputStream("file2.txt");
		Scanner r32 = new Scanner(f32);
		while (r32.hasNext()) {
			String b = r32.next();
			if (!al.contains(b)) {
				System.out.println(b);
			}
		}

		System.out.println("-----file 3-----");
		FileInputStream f41 = new FileInputStream("file1.txt");
		FileInputStream f42 = new FileInputStream("file2.txt");
		FileOutputStream fos = new FileOutputStream("file3.txt");

		Scanner r41 = new Scanner(f41);
		Scanner r42 = new Scanner(f42);
		while (r41.hasNext() && r42.hasNext()) {
			String a = r41.next();
			String b = r42.next();
			System.out.println(a);
			System.out.println(b);
			fos.write(a.getBytes());
			fos.write("\r \n".getBytes());
			fos.write(b.getBytes());
			fos.write("\r \n".getBytes());

		}

	}

}
