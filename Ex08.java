package week04_day5;

class MyException extends Exception{
	public MyException(String message) {
		super(message);
	}
}

class MyCalculator{
	public int add(int x, int y) {
		return x+y;
		
	}							//throws예외를 던지는 처리형 함수
	public int sub (int x, int y) throws MyException {
		//x가 음수일 때 예외발생
		if(x<0) {
			throw new MyException("음수예외");	//throw 예외를 일으키는 함수
		}
		return x-y;
	}
	
}

public class Ex08 {

	public static void main(String[] args) {
		
		MyCalculator m = new MyCalculator();
		try {
		int result = m.sub(-1, 3);
	}catch(MyException e) {
		System.out.println(e.getMessage());
//		e.printStackTrace();
	}
		System.out.println("출력");
	}

}
