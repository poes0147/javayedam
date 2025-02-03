package Package.reference;
//��ϵ� ����ڸ� boardExe ���, ���, ���� �����ϵ��� �ϴ� ����


public class MemberExe {
	
	//�̱��水ü ����.
	//1. �ʵ带 static

	private static MemberExe instance = new MemberExe();
	
	//2. ������ ����
	private MemberExe() {
	}
	// 3�ν���Ʈ�� �������ִ� �޼ҵ�getInstance
	public static MemberExe getInstance() {
		return new MemberExe();	
	}

	
	
	Member[] members = {//
			new Member("user01","1111","�̺���"),//
			new Member("user02","1111","�躴��"),//
			new Member("user03","1111","�ں���") };
	public String login (String id, String pw) {
		for(int i = 0; i < members.length; i++) {
			if(members[i]!=null 
					&& members[i].getMemberId().equals(id)
					&& members[i].getMemberPw().equals(pw)) {
				return members[i].getMemberName(); // id/pw ��ġ.
			}
		}
		return null;
		
	}

}
