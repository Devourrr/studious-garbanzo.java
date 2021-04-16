package week04_day5;

import java.io.IOException;

public class Ex04 {

	
	
	public static void main(String[] args) {
		

		
		//
		// 콘솔로부터 한 바이트씩 읽어옴
		// 'a' => 97
		try{
			int result = System.in.read();
			System.out.println((char)result);
		}catch(IOException e) {
			// TODO Auto-generated method stub
			e.printStackTrace();
			
		}
		
		
	}

}
