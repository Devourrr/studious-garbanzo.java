package week04_day5;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//		String price_="hidkjdkkd";
		String price_="25125";
		int price = Integer.parseInt(price_); // NumberFormatException
		int point = (int) (price *0.1);
		
		System.out.println("����Ʈ=" + point );
		
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
			System.out.println("���ڷ� �� ���ڿ��̿��� �մϴ�.");
		}
		
	}

}
