package Package.reference;

import java.util.Scanner;

public class StudentExe { // ���� ������� ����ϴ� Ŭ����
	public static void main(String[] args) { 
		Scanner scn = new Scanner(System.in);
		
		Student[] students = new Student[5];
		
		Student std1 = new Student("ȫ�浿", 80, 90);
//		std1.studentName = "ȫ�浿";
//		std1.engScore = 80;
//		std1.mathScore = 90;
		
		Student std2 = new Student();
		std2.studentName = "��μ�";
		std2.engScore = 85;
		std2.mathScore = 88;
		
		Student std3 = new Student();
		std3.studentName = "ȫ����";
		std3.engScore = 75;
		std3.mathScore = 90;
		
		students[0] = std1;
		students[1] = std2;
		students[2] = std3;
		students[3] = new Student("�����", 86, 90);
		

		
		//�л��� �̸��� �Է¹޴� ���� : studName
		//�л��� ����� ����ϴ� ���α׷��� �ۼ�.
		
		System.out.print("�̸��� �Է��ϼ���");
		String studName = scn.nextLine();
		for(int i =0; i<students.length; i++) {
			if(students[i] != null && students[i].studentName.equals(studName)) {
//				System.out.printf("�̸��� %s, ����� %d, ������ %d �Դϴ�.\n",students[i].studentName,students[i].engScore,students[i].mathScore);
				System.out.printf("�л��� ����� %.2f�Դϴ�\n",students[i].getAverage());
				
			}
		}		
		
		 
//		System.out.println(students[0] instanceof Student); // �޼ҵ� Ȯ��

		
		//�޼ҵ�(���)
//		for(int i =0; i<students.length; i++) {
//			if(students[i] != null && students[i].getAverage() >= 85 ) {
////				System.out.printf("�̸��� %s, ����� %d, ������ %d �Դϴ�.\n",students[i].studentName,students[i].engScore,students[i].mathScore);
//				students[i].printInfo();
//			}
//		}
//		
//		System.out.printf("std1�� �� %s\n",std1);
//		System.out.printf("std2�� �� %s\n",std2);
		
		
	}
}
