package week04_day5;

//����ó�� : ����, try ~ catch

public class Ex03 {

	public static void main(String[] args) {
		int[] arr = {10,20,30};
		
		//����ó�� ����=> ���� try~catch����
		try {
		
		for(int i=0; i<=arr.length; i++) {
			System.out.println(arr[i]);
		}
		}catch(ArrayIndexOutOfBoundsException e) {
		//catch(Exception e)�� ��ü ����	
			System.out.println(e.getMessage());
			//���ܹ߻������� �ڵ�
		System.out.println("�迭�� ÷�� ����");
		}
		
		System.out.println("���");
		
		
		}
}

