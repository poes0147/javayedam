package Package;

import java.util.Scanner;

public class Todo3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[][] friendAry = new String[20][3];
		boolean run = true;
		int sum = 0;
		String name = "";
		String tel = "";
		String gender = "";

		while (run) {
			System.out.println("1. ���(�̸�,����ó,����)/2.���/3.��ȸ(����)/4.����/9.����");
			System.out.print("�����ϼ���>");

			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1:// ���
				System.out.println("ģ�� ����� �ҷ��ɴϴ�.");
				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i][0] != null) {
						System.out.printf("�̸� : %s ����ó : %s  ���� : %s\n", friendAry[i][0], friendAry[i][1],
								friendAry[i][2]);
					}
				}
				break;
			case 2:// ���
				System.out.print("����� ������ �Է��ϰڽ��ϱ�?");
				int num = Integer.parseInt(scn.nextLine());
				System.out.printf("%d��° ��Ϻ��� �߰��մϴ�.\n", sum);
				for (int i = 0; i < num; i++) {
					System.out.print("�̸��Է�:");
					name = scn.nextLine();
					System.out.print("��ȭ��ȣ�Է�:");
					tel = scn.nextLine();
					System.out.print("�����Է�:");
					gender = scn.nextLine();
					if (friendAry[i][0] == null) {
						friendAry[i] = new String[] { name, tel, gender };
					}

				}
				sum += num;
				break;
			case 3:// ��ȸ(����)
				System.out.print("������ �Է��� �ּ���.");
				gender = scn.nextLine();
				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i][0] != null) {
						if (friendAry[i][2].equals(gender)) {
							System.out.printf("�̸� : %s ����ó : %s  ���� : %s\n", friendAry[i][0], friendAry[i][1],
									friendAry[i][2]);
						}
					}
				}
				break;
			case 4:// (����)
				System.out.print("������ �̸��� �Է��� �ּ���.");
				name = scn.nextLine();
				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i][0] != null) {
						if (friendAry[i][0].equals(name)) {
							for (int j = 0; j < 3; j++) {
								friendAry[i] = new String[] { null, null, null };
							}
						}
					}
				}
				break;
			case 5:

				break;
			case 9:// (����)
				run = false;
				break;
			}

		}

	}

}
