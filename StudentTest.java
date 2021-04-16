package week04_day5;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {

////		Student s = new Student(1001,99,100,100);
////		String result = s.getInfo();
////		System.out.println(result);
//		
		//
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		Student s2 = new Student( id, kor, eng, math);
		System.out.println(s2.getInfo());
		
		//ÆÄÀÏ
		
	}

}
