package Package.reference;

import java.security.PublicKey;
import java.util.Scanner;


public class BookExe {
	public static void main(String[] args) {
		static Scanner scn = new Scanner(System.in);
		static int sum = 0;
		static boolean run = true;

		static String BookName = "";
		static String BookWriter = "";
		static String BookCompany = "";
		static int BookPrice = 0;
		
		
		static Book[] bookRepository = new Book[100];
		
		public static void Init() {
			
		}
		public static void printList() {
			System.out.println("���� ����� �ҷ��ɴϴ�.");
			for (int i = 0; i < bookRepository.length; i++) {
				if (bookRepository[i] != null) {
					bookRepository[i].printInfo();
				}
			}
		}
		
		public static void addBook() {
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
				BookPrice = Integer.parseInt(scn.nextLine());
				if (bookRepository[i] == null) {
					bookRepository[i] = new Book(BookName, BookWriter, BookCompany, BookPrice);
				} 
			}
			sum += num;
		}//addbook
			
		public static void searchBook() {
			System.out.print("���ǻ� �Է��� �ּ���.");
			BookCompany = scn.nextLine();
			for (int i = 0; i < bookRepository.length; i++) {
				if (bookRepository[i] != null) {
					if (BookCompany.equals(bookRepository[i].getBookCompany())) {
						bookRepository[i].printInfo();
					} else {
						System.out.println("ã�� ������ �����ϴ�.");
					}
				}
			}
		}
		public static void ����Book() {
		System.out.println("������ �Է�");
		BookName = scn.nextLine();
		System.out.printf("�����Է�:");
		BookPrice = Integer.parseInt(scn.nextLine());
		boolean isExeis = false;
		for (int i = 0; i < bookRepository.length; i++) {
			
		}
		}
		public static void ����ȸ() {
		System.out.println("������ �Է�>>");
		BookName = scn.nextLine();
		for(int i=0; i<bookRepository.length;i++) {
			bookRepository[i].showTatailInfo();				}

		}

		while (run) {
//			scn.nextLine();
			System.out.println("1. ���� ��ü ��� / 2. ������� / 3. ��ȸ(���ǻ�) / 9.����");
			System.out.print("�����ϼ���>>");

			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1:// ���
				printList();
				break;
			case 2:// ���
				addBook();
				break;

			case 3:// ��ȸ(���ǻ�)
				searchBook();
				break;
			case 4://����
				����Book();
				break;
			case 5://����ȸ
				����ȸ();
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
