package bitcamp.myapp;

import bitcamp.myapp.command.HelpCommand;
import bitcamp.myapp.command.HistoryCommand;
import bitcamp.myapp.command.ProjectCommand;
import bitcamp.myapp.command.UserCommand;
import bitcamp.util.Prompt;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

    MenuGroup mainMenu = new MenuGroup("메인");

    UserCommand userCommand;
    BoardCommand boardCommand;
    ProjectCommand projectCommand;
    HelpCommand helpCommand;
    HistoryCommand historyCommand;

    public App() {
        List<User> userList = new ArrayList<>();
        List<Project> projectList = new LinkedList<>();
        List<Board> boardList = new LinkedList<>();

        userCommand = new UserCommand(userList);
        boardCommand = new BoardCommand(boardList);
        projectCommand = new ProjectCommand(projectList, userList);
        helpCommand = new HelpCommand();
        historyCommand = new HistoryCommand();

        MenuGroup userMenu = new MenuGroup("회원");
        userMenu.add(new MenuItem("등록", userCommand));
        userMenu.add(new MenuItem("목록", userCommand));
        userMenu.add(new MenuItem("조회", userCommand));
        userMenu.add(new MenuItem("변경", userCommand));
        userMenu.add(new MenuItem("삭제", userCommand));
        mainMenu.add(userMenu);

        MenuGroup projectMenu = new MenuGroup("프로젝트");
        projectMenu.add(new MenuItem("등록", projectCommand));
        projectMenu.add(new MenuItem("목록", projectCommand));
        projectMenu.add(new MenuItem("조회", projectCommand));
        projectMenu.add(new MenuItem("변경", projectCommand));
        projectMenu.add(new MenuItem("삭제", projectCommand));
        mainMenu.add(projectMenu);

        MenuGroup boardMenu = new MenuGroup("게시판");
        boardMenu.add(new MenuItem("등록", boardCommand));
        boardMenu.add(new MenuItem("목록", boardCommand));
        boardMenu.add(new MenuItem("조회", boardCommand));
        boardMenu.add(new MenuItem("변경", boardCommand));
        boardMenu.add(new MenuItem("삭제", boardCommand));
        mainMenu.add(boardMenu);

        mainMenu.add(new MenuItem("도움말", helpCommand));
        mainMenu.add(new MenuItem("명령내역", historyCommand));

        mainMenu.setExitMenuTitle("종료");
    }


    public static void main(String[] args) {
        new App().execute();
    }

    void execute() {
        String appTitle = "[프로젝트 관리 시스템]";
        String line = "----------------------------------";

        try {
            mainMenu.execute();
        } catch (Exception ex) {
            System.out.println("실행 오류!");
        }

        System.out.println("종료합니다.");

        Prompt.close();
    }
}
