package Package.reference;

import java.lang.reflect.Executable;
import java.security.PublicKey;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.border.TitledBorder;

/*
 * 실행클래스
 * 1. 글목록 / 2.글등록/3.삭제/9.종료
 * 제목이 4글자 이상, 15글자 이하
 * 같은 제목이 있으면 등록 불가
 */

public class BoardExe {
	static Board[] boardRepo = new Board[100];// 계시글등록 배열
	static Scanner scn = new Scanner(System.in);
//	static MemberExe exe = new MemberExe();
//	static String loginId;//로그인 아이디를 저장

	public static void main(String[] args) {
//		while (true) {
//			// id,pw 일시하면 글 목록 불러오기
////			System.out.print("아이디 : ");
////			String id = scn.nextLine();
////			System.out.print("PW :");
////			String pw = scn.nextLine();
//			
////			String name = MemberExe.login(id,pw);
//
////			if (name != null) {
////				loginId = id; //여러메소드 공용사용
////				System.out.println(name + "님 환영합니다.");
////
////				break;
////			} else {
////				System.out.println("아이디와 비밀번호를 확인하세요 ");
////			}
//		}
//		boolean run = true;
//		
		try {
			initData();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 초기데이터 생성

		while (true) {
			System.out.println("1. 글목록, 2.글등록, 3.삭제, 9.종료");
			System.out.print("선택>");
			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1:// 목록
				boardList();
				break;
			case 2:// 등록
				addBoard();
				break;
			case 3:// 삭제
				removeBoard();
				break;
			case 9:// 종료
			default:// 1,2,3,9가 아니면 else로 출력
				System.out.println("메뉴를 확인하세요!");
			}

//			scn.nextLine();
		}
//		System.out.println("end of prog");

	}

	public static void initData() throws ParseException {
		// 배열의 샘플 데이터
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

//		boardRepo[0] = new Board("계시글제목1", "내용입니다1", "user01", sdf.parse("2025-02-03"));
//		boardRepo[1] = new Board("계시글제목2", "내용입니다1", "user01", sdf.parse("2025-02-03"));
//		boardRepo[2] = new Board("계시글제목3", "내용입니다1", "user01", sdf.parse("2025-02-03"));
//		boardRepo[3] = new Board("계시글제목4", "내용입니다1", "user01", sdf.parse("2025-02-03"));
//		boardRepo[4] = new Board("계시글제목5", "내용입니다1", "user01", sdf.parse("2025-02-03"));
//		boardRepo[5] = new Board("계시글제목6", "내용입니다1", "user01", sdf.parse("2025-02-03"));
//		boardRepo[6] = new Board("계시글제목7", "내용입니다1", "user01", sdf.parse("2025-02-03"));
//		boardRepo[7] = new Board("계시글제목8", "내용입니다1", "user01", sdf.parse("2025-02-03"));
//		boardRepo[8] = new Board("계시글제목9", "내용입니다1", "user01", sdf.parse("2025-02-03"));
//		boardRepo[9] = new Board("계시글제목10", "내용입니다1", "user01", sdf.parse("2025-02-03"));
//		boardRepo[10] = new Board("계시글제목11", "내용입니다1", "user01", sdf.parse("2025-02-03"));
//		boardRepo[11] = new Board("계시글제목12", "내용입니다1", "user01", sdf.parse("2025-02-03"));
//		boardRepo[12] = new Board("계시글제목13", "내용입니다1", "user01", sdf.parse("2025-02-03"));
//		boardRepo[13] = new Board("계시글제목14", "내용입니다1", "user01", sdf.parse("2025-02-03"));
//		boardRepo[14] = new Board("계시글제목15", "내용입니다1", "user01", sdf.parse("2025-02-03"));
//		boardRepo[15] = new Board("계시글제목16", "내용입니다1", "user01", sdf.parse("2025-02-03"));
	}
//	

	public static void boardList() {
		// 글목록
		// 1페이지: 0~4, 2페이지 5~9, 3페이지 10~14
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
						System.out.println(loopCnt + "   " + boardRepo[i].showBoard());// null 빼고 보여줌. 그렇렇다보니 4개만 출력될 경우
																						// 발생!!
					}
				}
			}
			System.out.println("이전페이지 :p, 다음페이지 : n, 종료 : q");
			String paging = scn.nextLine();
			if (paging.equals("n")) {
				// 마지막 페이지보다 작은 값
				if (page < lastPage) {
					page++;
				}
			} else if (paging.equals("p")) {
				// 1보다는 큰 값
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
		// 글등록
		int min = 4;
		int max = 15;

		System.out.print("제목 : ");
		String title = scn.nextLine();
		if (title.length() > min && title.length() < max) {
			for (int i = 0; i < boardRepo.length; i++) {
				if (boardRepo[i].getTitle().equals(title)) {
					System.out.println("같은 제목이 있습니다.");
					return;
				} else {
					System.out.print("내용 : ");
					String content = scn.nextLine();
					System.out.print("저자 : ");
					String writer = scn.nextLine();
					if (boardRepo[i] == null) {
						boardRepo[i] = new Board(title, content, writer, new Date());
						System.out.println("등록이 완료되었습니다.");
					} break; // 한칸만 등록 후 탈출
				}
//			System.out.print("내용 : ");
//			String content = scn.nextLine();
//			System.out.print("저자 : ");
//			String writer = scn.nextLine();
//			System.out.print("날짜 : ");
//			String writeDate = scn.nextLine();
				// 배열의 빈 공간에 등록.

//			for (int i = 0; i < boardRepo.length; i++) {
//				if (boardRepo[i] == null) {
//					boardRepo[i] = new Board(title, content, writer , new Date());
//					System.out.println("등록이 완료되었습니다.");
//					break; // 한칸만 등록 후 탈출
//				}
//			}
			}
		}else {
			System.out.println("책 제목의 길이를 확인하세요.");
		}


	}

	public static void removeBoard() {
		// 글삭제
		System.out.print("삭제할 제목 : ");
		String titel = scn.nextLine();
		for (int i = 0; i < boardRepo.length; i++) {
			if (boardRepo[i].getTitle().equals(titel)) {
				boardRepo[i] = null;
				System.out.println("삭제가 완료되었습니다.");
				break; // 한칸만 등록 후 탈출
			}
		}
	}

}
