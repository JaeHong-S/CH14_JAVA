package ch14;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Inet1 {
	public static void main(String[] args) throws UnknownHostException {
		Scanner sc = new Scanner(System.in);
		System.out.println("인터넷 주소를 입력하세요");
		String url = sc.nextLine();
		InetAddress addr = InetAddress.getByName(url);
		System.out.println("addr = " + addr.getHostAddress());
		sc.close();
	}
}
