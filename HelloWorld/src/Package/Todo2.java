package Package;

import java.nio.channels.IllegalBlockingModeException;
import java.util.Scanner;
import java.util.Spliterator;

//ģ�� �������� �� v.1
//�̸�, ����ó, ����(��/��) => ȫ�浿,010-0000-0000,��
//1. ���(�̸�,����ó,����)/2.���/3.��ȸ(����)/4.����/9.����
// string[] friendAry = new string[100]

public class Todo2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] friendAry = new String[20];
		boolean run = true;
		int sum = 0;

		while (run) {
			System.out.println("1. ���(�̸�,����ó,����)/2.���/3.��ȸ(����)/4.����/9.����");
			System.out.print("�����ϼ���>");

			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1:// ���
				System.out.println("ģ�� ����� �ҷ��ɴϴ�.");
				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i] != null) {
						System.out.println(friendAry[i]);
					}
				}
				break;
			case 2:// ���
				System.out.print("����� ������ �Է��ϰڽ��ϱ�?");
				int num = Integer.parseInt(scn.nextLine());
				System.out.printf("%d��° ��Ϻ��� �߰��մϴ�.", sum);
				for (int i = 0; i < num; i++) {
					System.out.print("ģ���� ������ �Է��� �ּ���(ex-�̸�,����ó,����)");
					friendAry[i + sum] = scn.nextLine(); // 5 +
				}
				sum += num;
				break;
			case 3:// ��ȸ(����)
				System.out.print("������ �Է��� �ּ���.");
				String gender = "";
				gender = scn.nextLine();
				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i] != null) {
						if (friendAry[i].split(",")[2].equals(gender)) {
							System.out.println(friendAry[i]);
						}
					}
				}
				break;
			case 4:// (����)
				System.out.print("������ �̸��� �Է��� �ּ���.");
				String name = "";
				name = scn.nextLine();
				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i] != null) {
						if (friendAry[i].split(",")[0].equals(name)) {
							friendAry[i] = null;
						}
					}
				}
				break;
			case 5:
				
				break;
			case 9:// (����)
				break;
			}

		}

	}
}
