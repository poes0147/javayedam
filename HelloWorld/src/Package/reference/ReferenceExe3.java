package Package.reference;

import java.util.Scanner;

public class ReferenceExe3 {
	
	public static void main(String[] args) {
		
		
	}
	
	public static void exe() {
		// �̸�, ����ó, ���� ==> 100���� ����
		Scanner scn = new Scanner(System.in);
		String[][] friendAry = new String[100][3];
		friendAry[0][0] = "ȫ�浿";
		friendAry[0][1] = "010-0000-0000";
		friendAry[0][2] = "��";
		friendAry[1] = new String[] {"��μ�","010-1111-1111", "��"};
		
		System.out.println("�̸��Է�");
		String name = scn.nextLine();
		System.out.println("��ȭ��ȣ�Է�");
		String tel = scn.nextLine();
		System.out.println("�����Է�");
		String gender = scn.nextLine();
		
		friendAry[2] = new String[] {name,tel,gender};
		
		for(int i =0; i<friendAry.length; i++) {
			if(friendAry[i] != null ) {
				System.out.printf("�̸��� %s ����ó�� %s\n",friendAry[i][0], friendAry[i][1]);
			}
			
//		}
//		while(run) {
//			int num =0;
//			System.out.println("------------------------------");
//		    System.out.println("1.���, 2.�Է�, 3.��ȸ, 0.����");
//			System.out.println("------------------------------");
//		    System.out.print("�޴��� �������ּ���");
//		    num = Integer.parseInt(scn.nextLine());// ����Ÿ������ ��ȯ
//		    
//		    switch (num) {
//			case 1:
//				
//				break;
//			case 2:
//				
//				break;
//			case 3:
//				
//				break;
//			case 0:
//				
//				break;
//
//			default:
//				break;
//			}
		}
		
		
	}

}
