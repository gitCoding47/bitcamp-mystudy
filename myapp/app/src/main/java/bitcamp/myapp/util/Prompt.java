package bitcamp.myapp.util;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Prompt {

  static Scanner keyboardScanner = new Scanner(System.in);
  static Queue inputQueue = new LinkedList<>(); // Correct queue implementation

  public static String input(String format, Object... args) {
    String promptTitle = String.format(format, args); // Correct usage of String.format
    System.out.print(promptTitle + " "); // Print the prompt with a space

    String input = keyboardScanner.nextLine();

    if (format.endsWith(">")) {
      inputQueue.offer(promptTitle + input);
      if (inputQueue.size() > 20) {
        inputQueue.poll();
      }
    }

    return input;
  }

  public static int inputInt(String format, Object... args) {
    return Integer.parseInt(input(format, args)); // Reuse the input method for integers
  }

  public static void close() {
    keyboardScanner.close();
  }

  public static void printHistory() {
    System.out.println("[명령 내역]---------------");
    Iterator iterator = inputQueue.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    System.out.println("------------------------끝");
  }
}