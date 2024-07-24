import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {

    // 다음 세 학생의 성적 정보를 score.data 파일에 바이너리 형식으로 저장하라!
    // => java.io.BufferedOutputStream 클래스를 사용하라.
    // => java.io.DataOutputStream 클래스를 사용하라.
    //
    Score s1 = new Score("홍길동", 100, 100, 100);
    Score s2 = new Score("임꺽정", 90, 90, 90);
    Score s3 = new Score("유관순", 80, 80, 80);

    FileInputStream out0 = new FileInputStream("temp/score.data");
    BufferedInputStream out1 = new BufferedInputStream(out0);
    DataInputStream out = new DataInputStream(out1);

    out.close();

    System.out.println("출력 완료!");
  }

}