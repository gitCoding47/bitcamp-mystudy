import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List <String> list = new ArrayList<>();

    list.add("이협건");
    list.add("홍길동");
    list.add("임꺽정");
    list.add("고길동");

    int listSize = list.size();

    System.out.println("저장된 데이터 수 : " + listSize);

    for (int i = 0; i < listSize; i++) {
      System.out.println(list.get(i));
    }

  }
}