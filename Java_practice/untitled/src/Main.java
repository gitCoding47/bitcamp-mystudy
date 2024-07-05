import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
    Scanner sc = new Scanner(System.in);

    System.out.print("1. 자동번호 생성 횟수: ");
    int cycle = sc.nextInt();
    int[] arr = new int[7];
    int m = 0;

    while (cycle > 0) {
      for (int i = 0; i < arr.length; i++) {
        arr[i] = (int) (Math.random() * 45) + 1;

        for (int j = 0; j < i; j++) {
          if (arr[i] == arr[j]) {
            i--;
          }
        }
      }
      for (int  i =0; i < arr.length - 1; i++) {
        System.out.printf("%5d", arr[i]);
      }
      System.out.printf("   +%5d", arr[6]);
      System.out.println();
      cycle--;
    }
    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
  }
}