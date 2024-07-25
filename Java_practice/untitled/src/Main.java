import java.io.*;
import java.util.HashMap;

public class Main {
  static class My {
    String a;
    public My(String a) {
      this.a = a;
    }
  }

  public static void main(String[] args) {

    HashMap<Integer, My> map = new HashMap<>();

    for (int i = 0; i < 10; i++) {
      My my = new My(String.valueOf(Math.random() * 10000));
      System.out.println(my.a);
      map.put(i + 1, my);
    }

    System.out.println("---------------------------------");

    for (My my : map.values()) {
      System.out.println(my.a);
    }
  }
}