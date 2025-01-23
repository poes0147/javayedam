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
			System.out.println("1. 목록(이름,연락처,성별)/2.등록/3.조회(성별)/4.삭제/9.종료");
			System.out.print("선택하세요>");

			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1:// 목록
				System.out.println("친구 목록을 불러옵니다.");
				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i][0] != null) {
						System.out.printf("이름 : %s 연락처 : %s  성별 : %s\n", friendAry[i][0], friendAry[i][1],
								friendAry[i][2]);
					}
				}
				break;
			case 2:// 등록
				System.out.print("몇명의 정보를 입력하겠습니까?");
				int num = Integer.parseInt(scn.nextLine());
				System.out.printf("%d번째 목록부터 추가합니다.\n", sum);
				for (int i = 0; i < num; i++) {
					System.out.print("이름입력:");
					name = scn.nextLine();
					System.out.print("전화번호입력:");
					tel = scn.nextLine();
					System.out.print("성별입력:");
					gender = scn.nextLine();
					if (friendAry[i][0] == null) {
						friendAry[i] = new String[] { name, tel, gender };
					}

				}
				sum += num;
				break;
			case 3:// 조회(성별)
				System.out.print("성별을 입력해 주세요.");
				gender = scn.nextLine();
				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i][0] != null) {
						if (friendAry[i][2].equals(gender)) {
							System.out.printf("이름 : %s 연락처 : %s  성별 : %s\n", friendAry[i][0], friendAry[i][1],
									friendAry[i][2]);
						}
					}
				}
				break;
			case 4:// (삭제)
				System.out.print("삭제할 이름을 입력해 주세요.");
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
			case 9:// (종료)
				run = false;
				break;
			}

		}

	}

}
