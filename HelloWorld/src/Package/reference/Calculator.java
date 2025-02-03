package Package.reference;

public class Calculator {
	//1~100사이의 임의의 값을 [배열로 반환] n개를 반환하는 기능
	
	// 별을 출력하는 메소드
	public void printStrar(int times, String types) {
		

		for (int i = 1; i<=times; i++) {
			System.out.printf(types);
		}
	}
	
	public int[] randomAry(int n) {
		int[] result = new int[n];
		for(int i=0; i<result.length;i++) {
			result[i]=(int) (Math.random()*100)+1; 
		}
		return result;
	}
	
	//두 수의 합을 반환.
	public int sum(int a, int b) {
		return a + b;
		
	}
	
	public double sum(double a, double b) {
		return a + b;
		
	}
	
	public int max(int num1, int num2) {
		return num1 <num2 ? num1:num2;
//		if(num1 > num2) {
//			return num1;
//		}
//		return num2;
	}
	
	
	
	
	
//	public int sum(int[] intAry) {
//		for(int i=0;i<intAry.length;i++) {
//			int sum = 0;
//			return sum += intAry[i];
//		
//
//	}
//
//	}
}