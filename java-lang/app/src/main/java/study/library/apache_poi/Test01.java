// Apache poi 라이브러리 사용법 - 엑셀 Workbook + 시트 만들기
package study.library.apache_poi;

import java.io.FileOutputStream;

public class Test01 {
	public static void main(String[] args) throws Exception {
		XSSFWorkbook workbook = new XSSFWorkbook();

		try (FileOutputStream out = new FileOutputStream("temp/test.xlsx")) {
			workbook.write(null);
		}

		System.out.println("엑셀 파일 생성 완료!");
	}

}
