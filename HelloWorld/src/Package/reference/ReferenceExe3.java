package Package.reference;

import java.util.Scanner;

public class ReferenceExe3 {
	
	public static void main(String[] args) {
		
		
	}
	
	public static void exe() {
		// 이름, 연락처, 성별 ==> 100개의 공간
		Scanner scn = new Scanner(System.in);
		String[][] friendAry = new String[100][3];
		friendAry[0][0] = "홍길동";
		friendAry[0][1] = "010-0000-0000";
		friendAry[0][2] = "남";
		friendAry[1] = new String[] {"김민수","010-1111-1111", "남"};
		
		System.out.println("이름입력");
		String name = scn.nextLine();
		System.out.println("전화번호입력");
		String tel = scn.nextLine();
		System.out.println("성별입력");
		String gender = scn.nextLine();
		
		friendAry[2] = new String[] {name,tel,gender};
		
		for(int i =0; i<friendAry.length; i++) {
			if(friendAry[i] != null ) {
				System.out.printf("이름은 %s 연락처는 %s\n",friendAry[i][0], friendAry[i][1]);
			}
			
//		}
//		while(run) {
//			int num =0;
//			System.out.println("------------------------------");
//		    System.out.println("1.목록, 2.입력, 3.조회, 0.종료");
//			System.out.println("------------------------------");
//		    System.out.print("메뉴를 선택해주세요");
//		    num = Integer.parseInt(scn.nextLine());// 문자타입으로 변환
//		    
//		    switch (num) {
//			case 1:
//				
//				break;
//			case 2:
//				
//				break;
//			case 3:
//				
//				break;
//			case 0:
//				
//				break;
//
//			default:
//				break;
//			}
		}
		
		
	}

}
