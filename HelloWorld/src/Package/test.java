package Package;

import java.util.Scanner;

/*
 * �л����� �Է� �޾Ƽ� �迭 ����
 * �ְ�����, ���, �հ����� ���
 */

public class test {
	
	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		// �����迭
		int[] scores = new int[3];
		
		
		
		
		while(run) {
			System.out.println("1. �л����� �Է� / 2.�ְ����� / 3.��� / 4.�հ����� / 5.����");
			System.out.print("�����ϼ���");
//			Integer.parseInt(scn.nextLine());
			int menu = Integer.parseInt(scn.nextLine());
			
			switch(menu) {
			case 1: // �л����� �Է�
				for(int i=0; i<scores.length; i++ ) {
					System.out.print("������ �Է��ϼ���.");
					scores[i] = Integer.parseInt(scn.nextLine());
				}
				System.out.println("�Է¿Ϸ�");
				break;
			case 2: // �ְ����� ���
				int max = 0;
				for(int i = 0; i<scores.length; i++) {
					if(max<scores[i]) {
						max = scores[i];
					}
				}
				System.out.printf("�ְ������� %d�Դϴ�\n", max);
				break;
			case 3: // ������� ���
				int sum = 0;
				double avg = 0;
				
				for(int i = 0; i<scores.length; i++) {
					sum += scores[i];
				}
				avg = sum * 1.0 / scores.length;
				
				System.out.printf("�հ�� %d, ����� %f �Դϴ�.\n", sum, avg);
				break;
			case 4: // �հ����� ���
				break;
			case 5: // ����
				System.out.println("���α׷��� �����մϴ�.");
				run = false;
				break;
				
		    default:
				System.out.println("�޴��� �ٽ� �Է��ϼ���.");
			}
		}//end while
		System.out.println("end of prog");
	}
}
