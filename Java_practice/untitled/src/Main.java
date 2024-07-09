import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String[] menus = {"예금", "출금", "잔고", "종료"};
    Scanner sc = new Scanner(System.in);
    int menuNo = 0;
    String line = "-------------------------------------";

    while (menuNo != 4) {
      System.out.println(line);
      for (int i = 0; i < menus.length; i++) {
        System.out.printf("%d. %s", (i + 1), menus[i]);
        if (i == 3) break;
        System.out.print(" | ");
      }
      menuNo = sc.nextInt();
    }

  }
}