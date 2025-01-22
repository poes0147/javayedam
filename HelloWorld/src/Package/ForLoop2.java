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
//		studentAry[1][0] = "이병찬";
//		String[][] studentAry = {
//			    {"홍길동", "85"}, // 첫 번째 학생: 이름 + 점수
//			    {"이몽룡", "88"}, // 두 번째 학생: 이름 + 점수
//			    {"성춘향", "95"}   // 세 번째 학생: 이름 + 점수
//		}

		while (run) {
			System.out.println("1. 학생이름, 점수/ 2. 최고점수/4. 조회0.종료");
			System.out.print("선택하세요>");

			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1: // 1. 학생이름, 점수 입력
				for (int i = 0; i < studentAry.length; i++) {
					System.out.print("학생이름을 입력하세요.");
					studentName = scn.nextLine(); // [0][이병찬]
					studentAry[i][0] = studentName;
					System.out.print("점수를 입력하세요.");
					studentScore = scn.nextInt();
					scn.nextLine();
					studentAry[i][1] = ""+studentScore; // [0][점수 80]
				}
				for (int i = 0; i < studentAry.length; i++) {
					System.out.println(studentAry[i][0] + "의 점수" + studentAry[i][1]);//
				}
				System.out.println("입력완료");
				break;

			case 2: // 2. 최고점수
				int max = 0;
				String stu = "";
				for(int i = 0; i<studentAry.length; i++) {
						if(max < Integer.parseInt(studentAry[i][1])) {
						   max = Integer.parseInt(studentAry[i][1]);
						   stu = studentAry[i][0];
					}
				}
				System.out.printf("최고점수는 %s의 %d입니다\n", stu, max);

				break;
			case 3:
				
				
				break;
			case 4:
				System.out.print("학생이름을 입력하세요.");
				studentName = scn.nextLine();
				for(int i=0; i<studentAry.length; i++) {
					if(studentName.equals(studentAry[i][0])) {
						System.out.printf("%s의 점수는 %s입니다",studentAry[i][0], studentAry[i][1]);
						break;
					}else {
						System.out.print("찾는 학생이 없습니다.\n");
						break;
					}
						
				}
				break;
			case 0: // 0. 종료
				run = false;
				System.out.println("시스템을 종료합니다.");
				break;
				
			default:
				System.out.println("메뉴를 다시 선택하세요");
			}

		} // end of while

//		for(int i = 0; i< studentAry.length; i++) {
//			System.out.println(studentAry[i]);//null값으로 초기화
//		}
//		System.out.println("이름,점수 값을 입력");
//		string userVal = scn.nextLine();
//		System.out.println("이름은 홍길동이고 점수는 80점 입니다.");
	}
}
