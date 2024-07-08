public class App {

    static String[] mainMenus = new String[] {"회원", "프로젝트", "게시판", "도움말", "종료"};
    static String[][] subMenus = {
            {"등록", "목록", "조회", "변경", "삭제"},
            {"등록", "목록", "조회", "변경", "삭제"},
            {"등록", "목록", "조회", "변경", "삭제"},
            {"등록", "목록", "조회", "변경", "삭제"}
    };

    public static void main(String[] args) {

        printMenu();
    }
    static void printMenu() {
        String boldAnsi = "\033[1m";
        String redAnsi = "\033[31m";
        String resetAnsi = "\033[0m";

        String appTitle = "[프로젝트 관리 시스템]";
        String line = "-------------------------------";

        System.out.println(boldAnsi + line + resetAnsi);
        System.out.println(boldAnsi + appTitle + resetAnsi);

        for (int i = 0; i < mainMenus.length; i++) {
            if (mainMenus[i].equals("종료")) {
                System.out.printf("%s%d. %s%s\n", (boldAnsi + resetAnsi), (i + 1), mainMenus[i], resetAnsi);
            }
            else {
                System.out.printf("%d. %s\n", (i + 1), mainMenus[i]);
            }
        }
        System.out.println(boldAnsi + line + resetAnsi);
    }
}
