package Package.reference;

public class StaticExe {
	
	private static void main(String[] args) {
		
		MemberExe m1 = MemberExe.getInstance();
		
		MemberExe m2 = MemberExe.getInstance();	
		
		System.out.println();
		
	}

}
