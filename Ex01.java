package week04_day5;

//������ => ���� int a(����Ȯ��); Data i = new Data(); (score�� ������ ���� Ȯ��)
//��� => �Լ� (�޼���)

//int => type, �⺻��type : �ϳ��� ���� ������ �� �ִ� �ڷ���
//type, class�� ��������� �ڷ���
class Datatype{
	int id;  //�й�
	int kor; //��������
	int eng; //��������
	int tot; //�հ�
	
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

