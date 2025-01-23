package Package.reference;

public class Student { // 학생의 정보를 입력하기 위핸 클래스
	// 필드(속성): 이름, 영어, 수학
	String studentName;
	int engScore;
	int mathScore;
	//생성자: 필드의 초기값을 지정해서 인스턴트 생성.
	Student() {//기본생성자: 매게값이 없는 생성자
		
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
		System.out.printf("이름은 %s, 영어점수는 %d, 수학점수는 %d \n",studentName, engScore, mathScore);
	}
	
	double getAverage() {
		return (engScore + mathScore)* 1.0 / 2;
	}
//	void scn() {
//	Scanner scn = new Scanner(System.in);
//	}
//	void pringAvg() {
//		System.out.printf("영어의 평균 : %f , 수학의 평균 : %f");
//	}
	
	
	

}
