package Package;

import java.util.Scanner;


public class Todo {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("������ ���ڸ� �Է�");
		
		// while�� �Ἥ 
//		String num = scn.nextLine();
		while(true) { //�����Ա����α׷�. ���˴� �ϳ��� �ִ�.
			int bank = 0;
			System.out.println("1.�Ա�, 2.���, 3. �ܾ���ȸ, 4.����");
			System.out.print("�޴��� �������ּ���");
			int num = Integer.parseInt(scn.nextLine());// ����Ÿ������ ��ȯ

			if(num==1) {//1.�Ա�
				System.out.print("�ݾ��� �Է��� �ּ���");
				bank = Integer.parseInt(scn.nextLine());
				
			}else if (num == 2) {//2.���
				System.out.print("�ݾ��� �Է��� �ּ���");
				
			}else if (num == 3) {//3.�ܾ���ȸ
				System.out.printf("�ܾ��� %d �Դϴ�.\n", bank);
				
				
			}else if (num == 4) {//4����
				break;
			}
				
		}
			
		System.out.printf("end of prog");
	}

}
