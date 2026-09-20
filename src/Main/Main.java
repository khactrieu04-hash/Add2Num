package Main;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) {
		try {
			System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
		} catch (Exception e) {
			// Nếu môi trường không hỗ trợ UTF-8, chương trình vẫn chạy với encoding mặc định.
		}

		MyBigNumber myBigNumber = new MyBigNumber();
		String result = myBigNumber.sum("1234", "7569");
		System.out.println("Kết quả: " + result);
	}

}
