package week04_day5;

//데이터 => 변수 int a(공간확보); Data i = new Data(); (score형 데이터 공간 확보)
//명령 => 함수 (메서드)

//int => type, 기본형type : 하나의 값을 저장할 수 있는 자료형
//type, class는 사용자정의 자료형
class Datatype{
	int id;  //학번
	int kor; //국어점수
	int eng; //영어점수
	int tot; //합계
	
}

public class Ex01 {

	public static void main(String[] args) {
		int kor = 90;
		Datatype i = new Datatype();
		i.id = 19960926;
		i.kor = 90;
		i.eng = 100;
		i.tot = i.kor + i.eng;
		
		}
	
	
	}

