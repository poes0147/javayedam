package Package;

import java.util.Scanner;


public class Todo {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("임의의 문자를 입력");
		int bank = 0;
		// while을 써서 
//		String num = scn.nextLine();
		while(true) { //은행입금프로그램. 계죄는 하나만 있다.

			int num =0;
				System.out.println("------------------------------");
			    System.out.println("1.입금, 2.출금, 3. 잔액조회, 4.종료");
				System.out.println("------------------------------");
			    System.out.print("메뉴를 선택해주세요");
			    num = Integer.parseInt(scn.nextLine());// 문자타입으로 변환
			    int money = 0;

			if(num==1) {//1.입금
				System.out.print("금액을 입력해 주세요");
				money = Integer.parseInt(scn.nextLine());
			    bank += money;
				
			}else if (num == 2) {//2.출금
				System.out.print("금액을 입력해 주세요");
				money = Integer.parseInt(scn.nextLine());
				bank -= money;
				
			}else if (num == 3) {//3.잔액조회
				System.out.printf("###잔액은 %d 입니다.###\n", bank);

				
			}else if (num == 4) {//4종료
				break;
			}
		}
		System.out.printf("end of prog");
	}

}
