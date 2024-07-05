package project1;

public class App {
	String[] mainMenus = { "등록", "조회", "삭제", "수정", "도움말", "종료" };
	String[][] subMenus = { { "예산 설정", "수입 등록", "지출 등록" }, { "예산 조회", "가계부 내역 조회", "카테고리별 내역 조회" },
			{ "예산 삭제", "가계부 내역 삭제" }, { "예산 설정", "수입 수정", "지출 수정" } };

	public static void main(String[] args) {
		System.out.println("haello");
	}
}
