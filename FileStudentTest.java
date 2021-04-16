package week04_day5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileStudentTest {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new File ("Score.txt"));

		String input = sc.nextLine().trim();
		System.out.println(input);
		Scanner sc2 = new Scanner(input).useDelimiter(",");
		int id = sc2.nextInt();
		int kor = sc2.nextInt();
		int eng = sc2.nextInt();
		int math = sc2.nextInt();
		Student s = new Student(id,kor,eng,math);
		System.out.println(s.getInfo());
	}

}
