package Package.reference;

public class Student { // �л��� ������ �Է��ϱ� ���� Ŭ����
	// �ʵ�(�Ӽ�): �̸�, ����, ����
	String studentName;
	int engScore;
	int mathScore;
	//������: �ʵ��� �ʱⰪ�� �����ؼ� �ν���Ʈ ����.
	Student() {//�⺻������: �Ű԰��� ���� ������
		
	}
	
	Student(String studentName, int engScore) {//
		this.studentName = studentName;
		this.engScore = engScore; 
	}
	
	Student(String studentName, int engScore, int mathScore) {//
		this.studentName = studentName;
		this.engScore = engScore; 
		this.mathScore = mathScore;
	}
	
	
	void printInfo() {
		System.out.printf("�̸��� %s, ���������� %d, ���������� %d \n",studentName, engScore, mathScore);
	}
	
	double getAverage() {
		return (engScore + mathScore)* 1.0 / 2;
	}
//	void scn() {
//	Scanner scn = new Scanner(System.in);
//	}
//	void pringAvg() {
//		System.out.printf("������ ��� : %f , ������ ��� : %f");
//	}
	
	
	

}
