package week04_day5;

//예외처리 : 선택, try ~ catch

public class Ex03 {

	public static void main(String[] args) {
		int[] arr = {10,20,30};
		
		//예외처리 선택=> 문법 try~catch문법
		try {
		
		for(int i=0; i<=arr.length; i++) {
			System.out.println(arr[i]);
		}
		}catch(ArrayIndexOutOfBoundsException e) {
		//catch(Exception e)로 대체 가능	
			System.out.println(e.getMessage());
			//예외발생했을때 코드
		System.out.println("배열의 첨자 오류");
		}
		
		System.out.println("출력");
		
		
		}
}

