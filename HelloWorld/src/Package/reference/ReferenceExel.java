package Package.reference;

public class ReferenceExel {
	
	public static void main(String[] args) {
		//�迭����
		double[] dblAry = new double[5];
		dblAry = new double[] {160.5, 174.6};
		//������ �迭

		int[][] intAry = new int[2][3];
		for(int i = 0; i<2; i++) {
			for(int j =0; j<3;j++) {
				intAry[i][j] = 10+i+j;
			}
		}
		for(int j = 0; j<intAry.length; j++) {
			
		 for(int i = 0; i < intAry[0].length; i++) {
			 System.out.println(i+"|"+j +"="+ intAry[j][i]);
		 }
		}
	}
	
	
	
	
	
	public int sum(int num1, int num2) {
		return num1 + num2;
	}
	
   public void method1() {
	   System.out.println("method1()�� ȣ��Ǿ����ϴ�.");
   }
   private void method2() {
	   System.out.println("method2()�� ȣ��Ǿ����ϴ�.");
   }
}
