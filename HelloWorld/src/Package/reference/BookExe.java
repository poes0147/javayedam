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
		String price = "";
		
//		String bookName;
//		String bookWriter;
//		String bookCompany;
//		String bookPrice;
		
		int blink = 0;
		
		int BookPrice = 0;
//		Student[] students = new Student[5];
		
		
		while (run) {
			scn.nextLine();
			System.out.println("1. ���� ��ü ��� / 2. ������� / 3. ��ȸ(���ǻ�) / 9.����");
			System.out.print("�����ϼ���>>");

			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1:// ���
				System.out.println("���� ����� �ҷ��ɴϴ�.");
				for (int i = 0; i < bookRepository.length; i++) {
					if (bookRepository[i] != null) {
						bookRepository[i].printInfo();;
					}
				}
				break;
			case 2:// ���
				System.out.print("����� ������ �Է��ϰڽ��ϱ�?");
				int num = Integer.parseInt(scn.nextLine());
				System.out.printf("%d��° ��Ϻ��� �߰��մϴ�.\n", sum);
				for (int i = 0; i < num; i++) {
					System.out.print("å�̸��Է�:");
					BookName = scn.nextLine();
					System.out.print("�۰��Է�:");
					BookWriter = scn.nextLine();
					System.out.print("���ǻ��Է�:");
					BookCompany = scn.nextLine();
					System.out.print("�����Է�:");
					BookPrice = scn.nextInt();
					price = Integer.toString(BookPrice);
					if (bookRepository[i] == null) {
						bookRepository[i] = new Book (BookName,BookWriter,BookCompany,price);
					}
				}
				sum += num;
				break;
			case 3:// ��ȸ(����)
				System.out.print("������ �Է��� �ּ���.");
//				gender = scn.nextLine();
//				for (int i = 0; i < friendAry.length; i++) {
//					if (friendAry[i][0] != null) {
//						if (friendAry[i][2].equals(gender)) {
//							System.out.printf("�̸� : %s ����ó : %s  ���� : %s\n", friendAry[i][0], friendAry[i][1],
//									friendAry[i][2]);
//						}
//					}
//				}
				break;
			case 9:// (����)
				run = false;
				break;
			}

		}
	}//end of prog
}
