package Package;

public class HelloWorld {
	   public static void main(String[] args) {
		      System.out.println("helloworld");
		      
		      int myAge = 20;
		      myAge = 38;
		      
		      for(int i = 1; i<=18; i++) {
		       System.out.println(i);
		      }
//		       public class V{
//		          public static void main(String[] age) {
		             int num1 = 1101111;
		             
		             byte num2 = 127;
		             short num3 = 128;
		             long num4 = 1111111111;
		             System.out.println(Long.MAX_VALUE);
		             int intReuslt = num2 + num1;
		             System.out.println(intReuslt);
		             
		             int[] intAry = {10, 20, 30};
//		             string[] strAry= {"kim", "lee"};
//		             strAry[2] = "Park";
		             
		             int[] anotherAry = new int[10];
		             for(int i = 0; i<anotherAry.length; i++) {
		                anotherAry[i] = (int) (Math.random()*100); //강제형변환
		                
		             }
		             
		             for (int num : anotherAry) {
		             System.out.println(anotherAry);
		             
		             num = 0;
		             }
		       }

}
