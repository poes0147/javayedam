package Package;

import java.nio.channels.IllegalBlockingModeException;
import java.util.Scanner;
import java.util.Spliterator;

//친구 정보관리 앱 v.1
//이름, 연락처, 성별(남/여) => 홍길동,010-0000-0000,남
//1. 목록(이름,연락처,성별)/2.등록/3.조회(성별)/4.삭제/9.종료
// string[] friendAry = new string[100]

public class Todo2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] friendAry = new String[20];
		boolean run = true;
		int sum = 0;

		while (run) {
			System.out.println("1. 목록(이름,연락처,성별)/2.등록/3.조회(성별)/4.삭제/9.종료");
			System.out.print("선택하세요>");

			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1:// 목록
				System.out.println("친구 목록을 불러옵니다.");
				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i] != null) {
						System.out.println(friendAry[i]);
					}
				}
				break;
			case 2:// 등록
				System.out.print("몇명의 정보를 입력하겠습니까?");
				int num = Integer.parseInt(scn.nextLine());
				System.out.printf("%d번째 목록부터 추가합니다.", sum);
				for (int i = 0; i < num; i++) {
					System.out.print("친구의 정보를 입력해 주세요(ex-이름,연락처,성별)");
					friendAry[i + sum] = scn.nextLine(); // 5 +
				}
				sum += num;
				break;
			case 3:// 조회(성별)
				System.out.print("성별을 입력해 주세요.");
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
			case 4:// (삭제)
				System.out.print("삭제할 이름을 입력해 주세요.");
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
			case 9:// (종료)
				break;
			}

		}

	}
}
