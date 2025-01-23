package Package.reference;

import java.util.Scanner;

/*
 * << 도서명, 저자, 출판사, 판매가격 >>
 * 기능 : 1. 도서 전체 목록 / 2. 도서등록 / 3. 조회(출판사) / 9.종료
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
			System.out.println("1. 도서 전체 목록 / 2. 도서등록 / 3. 조회(출판사) / 9.종료");
			System.out.print("선택하세요>>");

			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1:// 목록
				System.out.println("도서 목록을 불러옵니다.");
				for (int i = 0; i < bookRepository.length; i++) {
					if (bookRepository[i] != null) {
						bookRepository[i].printInfo();
					}
				}
				break;

			case 2:// 등록
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

			case 3:// 조회(출판사)
				System.out.print("출판사 입력해 주세요.");
				BookCompany = scn.nextLine();
				for (int i = 0; i < bookRepository.length; i++) {
					if (bookRepository[i] != null) {
						if (BookCompany.equals(bookRepository[i].bookCompany)) {
							bookRepository[i].printInfo();
						}else {
							System.out.println("찾는 도서가 없습니다.");
						}
					}
				}
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
