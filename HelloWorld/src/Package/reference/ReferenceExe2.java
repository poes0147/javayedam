package Package.reference;

import java.util.Scanner;

public class ReferenceExe2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sum = 0;
		String[][] userAry = { 
				{"홍길동","80"},
				{"김민수","85"},
				{"박현수","88"},
				{"김상현","90"},
				{"최기동","75"}
		};
//		userID[][] = 	
		String[] temp = {"","0"};
		for(int j = 0; j<userAry.length; j++) {	//userAry[j][i]
			 for(int i = 0; i < userAry[0].length; i++) {
//                 userAry[j][i] = scn.nextLine();
				 System.out.println(i+":"+j +"="+ userAry[j][i]);
			 }
			 sum += Integer.parseInt(userAry[j][1]);
			 if(Integer.parseInt(temp[1])<Integer.parseInt(userAry[j][1])) {
				 temp = userAry[j];
			 }
			}
//		 System.out.printf("최고점의 학생은 %s\n", temp);
		 System.out.println(sum);
	}
}
