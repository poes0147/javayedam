package Package.reference;

import java.util.Scanner;

/*
 * << ������, ����, ���ǻ�, �ǸŰ��� >>
 * ��� : 1. ���� ��ü ��� / 2. ������� / 3. ��ȸ(���ǻ�) / 9.����
 */
public class BookExe {
	public static void main(String[] args) {
		Book[] bookRepository = new Book[100];

		Scanner scn = new Scanner(System.in);
		int sum = 0;
		boolean run = true;

		String BookName = "";
		String BookWriter = "";
		String BookCompany = "";
		String BookPrice = "";

		while (run) {
//			scn.nextLine();
			System.out.println("1. ���� ��ü ��� / 2. ������� / 3. ��ȸ(���ǻ�) / 9.����");
			System.out.print("�����ϼ���>>");

			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1:// ���
				System.out.println("���� ����� �ҷ��ɴϴ�.");
				for (int i = 0; i < bookRepository.length; i++) {
					if (bookRepository[i] != null) {
						bookRepository[i].printInfo();
					}
				}
				break;

			case 2:// ���
				System.out.printf("����� ������ �Է��ϰڽ��ϱ�?");
				int num = Integer.parseInt(scn.nextLine());
				System.out.printf("%d��° ��Ϻ��� �߰��մϴ�.\n", sum);
				for (int i = 0; i < num; i++) {
					System.out.printf("å�̸��Է�:");
					BookName = scn.nextLine();
					System.out.printf("�۰��Է�:");
					BookWriter = scn.nextLine();
					System.out.printf("���ǻ��Է�:");
					BookCompany = scn.nextLine();
					System.out.printf("�����Է�:");
					BookPrice = scn.nextLine();
//					price = Integer.toString(BookPrice);
					if (bookRepository[i] == null) {
						bookRepository[i] = new Book(BookName, BookWriter, BookCompany, BookPrice);
					}else {
						bookRepository[i+sum] = new Book(BookName, BookWriter, BookCompany, BookPrice);
					}
				}
				sum += num;
				break;

			case 3:// ��ȸ(���ǻ�)
				System.out.print("���ǻ� �Է��� �ּ���.");
				BookCompany = scn.nextLine();
				for (int i = 0; i < bookRepository.length; i++) {
					if (bookRepository[i] != null) {
						if (BookCompany.equals(bookRepository[i].bookCompany)) {
							bookRepository[i].printInfo();
						}else {
							System.out.println("ã�� ������ �����ϴ�.");
						}
					}
				}
				break;
				
			default:
				return;
				
			case 9:// (����)
				run = false;
				break;
			}

		}
	}// end of prog
}
