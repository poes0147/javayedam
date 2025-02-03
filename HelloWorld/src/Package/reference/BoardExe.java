package Package.reference;

import java.lang.reflect.Executable;
import java.security.PublicKey;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.border.TitledBorder;

/*
 * ����Ŭ����
 * 1. �۸�� / 2.�۵��/3.����/9.����
 * ������ 4���� �̻�, 15���� ����
 * ���� ������ ������ ��� �Ұ�
 */

public class BoardExe {
	static Board[] boardRepo = new Board[100];// ��ñ۵�� �迭
	static Scanner scn = new Scanner(System.in);
//	static MemberExe exe = new MemberExe();
//	static String loginId;//�α��� ���̵� ����

	public static void main(String[] args) {
//		while (true) {
//			// id,pw �Ͻ��ϸ� �� ��� �ҷ�����
////			System.out.print("���̵� : ");
////			String id = scn.nextLine();
////			System.out.print("PW :");
////			String pw = scn.nextLine();
//			
////			String name = MemberExe.login(id,pw);
//
////			if (name != null) {
////				loginId = id; //�����޼ҵ� ������
////				System.out.println(name + "�� ȯ���մϴ�.");
////
////				break;
////			} else {
////				System.out.println("���̵�� ��й�ȣ�� Ȯ���ϼ��� ");
////			}
//		}
//		boolean run = true;
//		
		try {
			initData();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // �ʱⵥ���� ����

		while (true) {
			System.out.println("1. �۸��, 2.�۵��, 3.����, 9.����");
			System.out.print("����>");
			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1:// ���
				boardList();
				break;
			case 2:// ���
				addBoard();
				break;
			case 3:// ����
				removeBoard();
				break;
			case 9:// ����
			default:// 1,2,3,9�� �ƴϸ� else�� ���
				System.out.println("�޴��� Ȯ���ϼ���!");
			}

//			scn.nextLine();
		}
//		System.out.println("end of prog");

	}

	public static void initData() throws ParseException {
		// �迭�� ���� ������
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

//		boardRepo[0] = new Board("��ñ�����1", "�����Դϴ�1", "user01", sdf.parse("2025-02-03"));
//		boardRepo[1] = new Board("��ñ�����2", "�����Դϴ�1", "user01", sdf.parse("2025-02-03"));
//		boardRepo[2] = new Board("��ñ�����3", "�����Դϴ�1", "user01", sdf.parse("2025-02-03"));
//		boardRepo[3] = new Board("��ñ�����4", "�����Դϴ�1", "user01", sdf.parse("2025-02-03"));
//		boardRepo[4] = new Board("��ñ�����5", "�����Դϴ�1", "user01", sdf.parse("2025-02-03"));
//		boardRepo[5] = new Board("��ñ�����6", "�����Դϴ�1", "user01", sdf.parse("2025-02-03"));
//		boardRepo[6] = new Board("��ñ�����7", "�����Դϴ�1", "user01", sdf.parse("2025-02-03"));
//		boardRepo[7] = new Board("��ñ�����8", "�����Դϴ�1", "user01", sdf.parse("2025-02-03"));
//		boardRepo[8] = new Board("��ñ�����9", "�����Դϴ�1", "user01", sdf.parse("2025-02-03"));
//		boardRepo[9] = new Board("��ñ�����10", "�����Դϴ�1", "user01", sdf.parse("2025-02-03"));
//		boardRepo[10] = new Board("��ñ�����11", "�����Դϴ�1", "user01", sdf.parse("2025-02-03"));
//		boardRepo[11] = new Board("��ñ�����12", "�����Դϴ�1", "user01", sdf.parse("2025-02-03"));
//		boardRepo[12] = new Board("��ñ�����13", "�����Դϴ�1", "user01", sdf.parse("2025-02-03"));
//		boardRepo[13] = new Board("��ñ�����14", "�����Դϴ�1", "user01", sdf.parse("2025-02-03"));
//		boardRepo[14] = new Board("��ñ�����15", "�����Դϴ�1", "user01", sdf.parse("2025-02-03"));
//		boardRepo[15] = new Board("��ñ�����16", "�����Դϴ�1", "user01", sdf.parse("2025-02-03"));
	}
//	

	public static void boardList() {
		// �۸��
		// 1������: 0~4, 2������ 5~9, 3������ 10~14
		int page = 1;
//		int nullIdx = 0;
		int lastPage = (int) Math.ceil(getMaxCount() / 5.0);
		while (true) {
//			int firstIdx = (page - 1) * 5;
//			int lastIdx = (page * 5) - 1;
			int endCnt = page * 5;
			int startCnt = endCnt - 5;
			int loopCnt = 0;
//			for (int x = 0; x <= boardRepo.length; x++) {
//				if (boardRepo[x] != null) {
//					nullIdx++;
//				}
//			}
//			System.out.print(nullIdx);
			for (int i = 0; i < boardRepo.length; i++) {
				if (boardRepo[i] != null) {
					loopCnt++;
					if (loopCnt > startCnt && loopCnt <= endCnt) {
						System.out.println(loopCnt + "   " + boardRepo[i].showBoard());// null ���� ������. �׷����ٺ��� 4���� ��µ� ���
																						// �߻�!!
					}
				}
			}
			System.out.println("���������� :p, ���������� : n, ���� : q");
			String paging = scn.nextLine();
			if (paging.equals("n")) {
				// ������ ���������� ���� ��
				if (page < lastPage) {
					page++;
				}
			} else if (paging.equals("p")) {
				// 1���ٴ� ū ��
				if (page > 1) {
					page--;
				}
			} else if (paging.equals("q")) {
				return;
			}
		}
	}

	public static int getMaxCount() {
		int count = 5;
		for (int i = 0; i < boardRepo.length; i++) {
			if (boardRepo[i] != null) {
				count++;
			}
		}
		return count;
	}

	public static void addBoard() {
		// �۵��
		int min = 4;
		int max = 15;

		System.out.print("���� : ");
		String title = scn.nextLine();
		if (title.length() > min && title.length() < max) {
			for (int i = 0; i < boardRepo.length; i++) {
				if (boardRepo[i].getTitle().equals(title)) {
					System.out.println("���� ������ �ֽ��ϴ�.");
					return;
				} else {
					System.out.print("���� : ");
					String content = scn.nextLine();
					System.out.print("���� : ");
					String writer = scn.nextLine();
					if (boardRepo[i] == null) {
						boardRepo[i] = new Board(title, content, writer, new Date());
						System.out.println("����� �Ϸ�Ǿ����ϴ�.");
					} break; // ��ĭ�� ��� �� Ż��
				}
//			System.out.print("���� : ");
//			String content = scn.nextLine();
//			System.out.print("���� : ");
//			String writer = scn.nextLine();
//			System.out.print("��¥ : ");
//			String writeDate = scn.nextLine();
				// �迭�� �� ������ ���.

//			for (int i = 0; i < boardRepo.length; i++) {
//				if (boardRepo[i] == null) {
//					boardRepo[i] = new Board(title, content, writer , new Date());
//					System.out.println("����� �Ϸ�Ǿ����ϴ�.");
//					break; // ��ĭ�� ��� �� Ż��
//				}
//			}
			}
		}else {
			System.out.println("å ������ ���̸� Ȯ���ϼ���.");
		}


	}

	public static void removeBoard() {
		// �ۻ���
		System.out.print("������ ���� : ");
		String titel = scn.nextLine();
		for (int i = 0; i < boardRepo.length; i++) {
			if (boardRepo[i].getTitle().equals(titel)) {
				boardRepo[i] = null;
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				break; // ��ĭ�� ��� �� Ż��
			}
		}
	}

}
