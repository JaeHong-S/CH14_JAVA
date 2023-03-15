package ch14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLConn1 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("URL을 입력하세요");
		String addr = sc.nextLine();
		URL url = new URL(addr); // 인터넷 주소가 생성
		URLConnection uc = url.openConnection(); // 인터넷 연결
		InputStream is = uc.getInputStream();
//	인터넷으로 읽어온 정보를 한줄씩 읽어서 출력 한글처리 utf-8, euc-kr(ms949)
		BufferedReader br = new BufferedReader(new InputStreamReader(is, "utf-8"));
		String str = null;
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
		sc.close();
		is.close();
		br.close();
	}
}