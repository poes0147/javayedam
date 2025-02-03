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
			System.out.println("도서 목록을 불러옵니다.");
			for (int i = 0; i < bookRepository.length; i++) {
				if (bookRepository[i] != null) {
					bookRepository[i].printInfo();
				}
			}
		}
		
		public static void addBook() {
			System.out.printf("몇권의 정보를 입력하겠습니까?");
			int num = Integer.parseInt(scn.nextLine());
			System.out.printf("%d번째 목록부터 추가합니다.\n", sum);
			for (int i = 0; i < num; i++) {
				System.out.printf("책이름입력:");
				BookName = scn.nextLine();
				System.out.printf("작가입력:");
				BookWriter = scn.nextLine();
				System.out.printf("출판사입력:");
				BookCompany = scn.nextLine();
				System.out.printf("가격입력:");
				BookPrice = Integer.parseInt(scn.nextLine());
				if (bookRepository[i] == null) {
					bookRepository[i] = new Book(BookName, BookWriter, BookCompany, BookPrice);
				} 
			}
			sum += num;
		}//addbook
			
		public static void searchBook() {
			System.out.print("출판사 입력해 주세요.");
			BookCompany = scn.nextLine();
			for (int i = 0; i < bookRepository.length; i++) {
				if (bookRepository[i] != null) {
					if (BookCompany.equals(bookRepository[i].getBookCompany())) {
						bookRepository[i].printInfo();
					} else {
						System.out.println("찾는 도서가 없습니다.");
					}
				}
			}
		}
		public static void 수정Book() {
		System.out.println("도서명 입력");
		BookName = scn.nextLine();
		System.out.printf("가격입력:");
		BookPrice = Integer.parseInt(scn.nextLine());
		boolean isExeis = false;
		for (int i = 0; i < bookRepository.length; i++) {
			
		}
		}
		public static void 상세조회() {
		System.out.println("도서명 입력>>");
		BookName = scn.nextLine();
		for(int i=0; i<bookRepository.length;i++) {
			bookRepository[i].showTatailInfo();				}

		}

		while (run) {
//			scn.nextLine();
			System.out.println("1. 도서 전체 목록 / 2. 도서등록 / 3. 조회(출판사) / 9.종료");
			System.out.print("선택하세요>>");

			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1:// 목록
				printList();
				break;
			case 2:// 등록
				addBook();
				break;

			case 3:// 조회(출판사)
				searchBook();
				break;
			case 4://수정
				수정Book();
				break;
			case 5://상세조회
				상세조회();
				break;
			default:
				return;
			case 9:// (종료)
				run = false;
				break;
			}

		}
	}// end of prog
}
