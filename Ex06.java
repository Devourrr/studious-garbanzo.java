package week04_day5;
class MyException extends Exception {
	public MyException(String message) {
		super(message);
	}
}


class MyTest{
	public int add(int x, int y) {
		return x+y;
		
	}
	public int multi(int x, int y) throws MyException {
		if(x*y == 0) {
			throw new MyException("0Àº ¿¹¿Ü");
		}
		return x*y;
	}
}

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyTest m = new MyTest();
		try{
		int result = m.multi(100, 0);
		}catch(MyException e) {
		 System.out.println(e.getMessage());
		//e.prtinStackTrace();
	}

		System.out.println("print");
}
}
