package Package.reference;

import java.util.Scanner;

public class StudentExe { // 받은 정보들로 사용하는 클래스
	public static void main(String[] args) { 
		Scanner scn = new Scanner(System.in);
		
		Student[] students = new Student[5];
		
		Student std1 = new Student("홍길동", 80, 90);
//		std1.studentName = "홍길동";
//		std1.engScore = 80;
//		std1.mathScore = 90;
		
		Student std2 = new Student();
		std2.studentName = "김민수";
		std2.engScore = 85;
		std2.mathScore = 88;
		
		Student std3 = new Student();
		std3.studentName = "홍정학";
		std3.engScore = 75;
		std3.mathScore = 90;
		
		students[0] = std1;
		students[1] = std2;
		students[2] = std3;
		students[3] = new Student("김민지", 86, 90);
		

		
		//학생의 이름을 입력받는 변수 : studName
		//학생의 평균을 출력하는 프로그램을 작성.
		
		System.out.print("이름을 입력하세요");
		String studName = scn.nextLine();
		for(int i =0; i<students.length; i++) {
			if(students[i] != null && students[i].studentName.equals(studName)) {
//				System.out.printf("이름은 %s, 영어는 %d, 수학은 %d 입니다.\n",students[i].studentName,students[i].engScore,students[i].mathScore);
				System.out.printf("학생의 평균은 %.2f입니다\n",students[i].getAverage());
				
			}
		}		
		
		 
//		System.out.println(students[0] instanceof Student); // 메소드 확인

		
		//메소드(기능)
//		for(int i =0; i<students.length; i++) {
//			if(students[i] != null && students[i].getAverage() >= 85 ) {
////				System.out.printf("이름은 %s, 영어는 %d, 수학은 %d 입니다.\n",students[i].studentName,students[i].engScore,students[i].mathScore);
//				students[i].printInfo();
//			}
//		}
//		
//		System.out.printf("std1의 값 %s\n",std1);
//		System.out.printf("std2의 값 %s\n",std2);
		
		
	}
}
