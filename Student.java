package week04_day5;

public class Student {

	int id;
	int kor;
	int eng;
	int math;
	
	//»ý¼ºÀÚ
	public Student() {}

	public Student(int id, int kor, int eng, int math) {
		this.id = id;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	
	//
	
	public String getInfo() {
		return "id= " + id + " " + kor + " " + eng + " " + math;
	}
}
