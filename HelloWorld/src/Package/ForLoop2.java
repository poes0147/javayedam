package Package;

//import java.awt.Menu;
import java.util.Scanner;

public class ForLoop2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[][] studentAry = new String[3][2];
		String studentName = "";
		int studentScore = 0;
		boolean run = true;
//		studentAry[1][0] = "�̺���";
//		String[][] studentAry = {
//			    {"ȫ�浿", "85"}, // ù ��° �л�: �̸� + ����
//			    {"�̸���", "88"}, // �� ��° �л�: �̸� + ����
//			    {"������", "95"}   // �� ��° �л�: �̸� + ����
//		}

		while (run) {
			System.out.println("1. �л��̸�, ����/ 2. �ְ�����/4. ��ȸ0.����");
			System.out.print("�����ϼ���>");

			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1: // 1. �л��̸�, ���� �Է�
				for (int i = 0; i < studentAry.length; i++) {
					System.out.print("�л��̸��� �Է��ϼ���.");
					studentName = scn.nextLine(); // [0][�̺���]
					studentAry[i][0] = studentName;
					System.out.print("������ �Է��ϼ���.");
					studentScore = scn.nextInt();
					scn.nextLine();
					studentAry[i][1] = ""+studentScore; // [0][���� 80]
				}
				for (int i = 0; i < studentAry.length; i++) {
					System.out.println(studentAry[i][0] + "�� ����" + studentAry[i][1]);//
				}
				System.out.println("�Է¿Ϸ�");
				break;

			case 2: // 2. �ְ�����
				int max = 0;
				String stu = "";
				for(int i = 0; i<studentAry.length; i++) {
						if(max < Integer.parseInt(studentAry[i][1])) {
						   max = Integer.parseInt(studentAry[i][1]);
						   stu = studentAry[i][0];
					}
				}
				System.out.printf("�ְ������� %s�� %d�Դϴ�\n", stu, max);

				break;
			case 3:
				
				
				break;
			case 4:
				System.out.print("�л��̸��� �Է��ϼ���.");
				studentName = scn.nextLine();
				for(int i=0; i<studentAry.length; i++) {
					if(studentName.equals(studentAry[i][0])) {
						System.out.printf("%s�� ������ %s�Դϴ�",studentAry[i][0], studentAry[i][1]);
						break;
					}else {
						System.out.print("ã�� �л��� �����ϴ�.\n");
						break;
					}
						
				}
				break;
			case 0: // 0. ����
				run = false;
				System.out.println("�ý����� �����մϴ�.");
				break;
				
			default:
				System.out.println("�޴��� �ٽ� �����ϼ���");
			}

		} // end of while

//		for(int i = 0; i< studentAry.length; i++) {
//			System.out.println(studentAry[i]);//null������ �ʱ�ȭ
//		}
//		System.out.println("�̸�,���� ���� �Է�");
//		string userVal = scn.nextLine();
//		System.out.println("�̸��� ȫ�浿�̰� ������ 80�� �Դϴ�.");
	}
}
