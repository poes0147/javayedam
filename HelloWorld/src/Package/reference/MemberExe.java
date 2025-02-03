package Package.reference;
//등록된 사용자만 boardExe 등록, 목록, 삭제 가능하도록 하는 역할


public class MemberExe {
	
	//싱글톤객체 생성.
	//1. 필드를 static

	private static MemberExe instance = new MemberExe();
	
	//2. 생성자 은닉
	private MemberExe() {
	}
	// 3인스턴트를 제공해주는 메소드getInstance
	public static MemberExe getInstance() {
		return new MemberExe();	
	}

	
	
	Member[] members = {//
			new Member("user01","1111","이병찬"),//
			new Member("user02","1111","김병찬"),//
			new Member("user03","1111","박병찬") };
	public String login (String id, String pw) {
		for(int i = 0; i < members.length; i++) {
			if(members[i]!=null 
					&& members[i].getMemberId().equals(id)
					&& members[i].getMemberPw().equals(pw)) {
				return members[i].getMemberName(); // id/pw 일치.
			}
		}
		return null;
		
	}

}
