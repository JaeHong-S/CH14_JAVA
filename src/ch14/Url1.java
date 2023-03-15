package ch14;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Url1 {
	public static void main(String[] args) throws MalformedURLException {//주소가 없으면 어쩔꺼니
		Scanner sc = new Scanner(System.in);
		System.out.println("URL을 입력하세요");
		String str = sc.nextLine();
		URL url = new URL(str);
		System.out.println("프로토콜 : " +  url.getProtocol());
		System.out.println("호스트 : " +  url.getHost());
		System.out.println("포트 : " +  url.getPort());
		System.out.println("파일 경로 : " +  url.getFile());
		sc.close();
	}

}
