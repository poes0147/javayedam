package Package;

import java.util.Scanner;


public class Todo {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("������ ���ڸ� �Է�");
		int bank = 0;//����
		// while�� �Ἥ 
//		String num = scn.nextLine();
		while(true) { //�����Ա����α׷�. ���˴� �ϳ��� �ִ�.

			int num =0;
				System.out.println("------------------------------");
			    System.out.println("1.�Ա�, 2.���, 3. �ܾ���ȸ, 4.����");
				System.out.println("------------------------------");
			    System.out.print("�޴��� �������ּ���");
			    num = Integer.parseInt(scn.nextLine());// ����Ÿ������ ��ȯ
			    int money = 0;

			if(num==1) {//1.�Ա�
				System.out.print("�ݾ��� �Է��� �ּ���");
				money = Integer.parseInt(scn.nextLine());
			    bank += money;
				System.out.print("�Ա��� �Ϸ�Ǿ����ϴ�.");
				scn.nextLine();
				
			}else if (num == 2) {//2.���
				System.out.print("�ݾ��� �Է��� �ּ���");
				money = Integer.parseInt(scn.nextLine());
				if(bank >= money) {
					bank -= money;
					System.out.print("����� �Ϸ�Ǿ����ϴ�.");
				} else {
					System.out.println("�ܾ��� �����մϴ�.");
				}
				scn.nextLine();

			}else if (num == 3) {//3.�ܾ���ȸ
				System.out.printf("###�ܾ��� %d �Դϴ�.###\n", bank);
				scn.nextLine();
				
			}else if (num == 4) {//4����
				System.out.printf("����Ǿ����ϴ�.");
				break;
			}
		}
		System.out.printf("end of prog");
	}

}
