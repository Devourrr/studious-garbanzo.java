package week04_day5;

class MyException extends Exception{
	public MyException(String message) {
		super(message);
	}
}

class MyCalculator{
	public int add(int x, int y) {
		return x+y;
		
	}							//throws���ܸ� ������ ó���� �Լ�
	public int sub (int x, int y) throws MyException {
		//x�� ������ �� ���ܹ߻�
		if(x<0) {
			throw new MyException("��������");	//throw ���ܸ� ����Ű�� �Լ�
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
		System.out.println("���");
	}

}
