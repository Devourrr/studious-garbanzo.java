package week04_day5;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner ( new File("Score.txt"));
		Student[] arr = new Student [10];
		
		int index = 0;
		while(sc.hasNext()) {
			String input = sc.nextLine().trim();
			Scanner sc2 = new Scanner (input).useDelimiter(",");
			int id = sc2.nextInt();
			int kor = sc2.nextInt();
			int eng = sc2.nextInt();
			int math = sc2.nextInt();
			Student s = new Student(id,kor,eng,math);
			arr[index] = s;
			index++;
					
			}
		//배열 출력
		for(int i=0; i< index; i++) {
			System.out.println(arr[i].getInfo());
		}

		
	}

}
