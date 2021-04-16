package week04_day5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileTest {

	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(new File("input.txt"));
			int sum=0;
			while(sc.hasNext()) {
				int kor = sc.nextInt();
				sum += kor;
				System.out.println(kor);
			}
		
			System.out.println("รัวี= "+ sum);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
