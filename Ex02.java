package week04_day5;


class Datatype2 {
	private int id;
	private int kor;
	private int eng;
	private int tot;
	
	public Datatype2() {
		
	}
	
	public Datatype2(int id, int kor, int eng) {
		this.id = id;
		this.kor = kor;
		this.eng = eng;
		this.tot = this.kor + this.eng;
		}
	
	public String getInfo() {
		return id + " : " + tot;
		
	}
	
	public void caltTot() {
		tot = this.kor + this.eng;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
}

public class Ex02 {

	public static void main(String[] args) {
		int kor = 90;
		int eng = 100;
		System.out.println("kor: " +kor);
		System.out.println("eng: " +eng);
		Datatype2 i = new Datatype2(19960926,90,100);
		System.out.println(i.getInfo());
		
		//국어점수 변경;
		i.setKor(69);
		i.caltTot();
		System.out.println(i.getInfo());
		
		
		
		
	
	}
}
