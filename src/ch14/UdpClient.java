package ch14;

import java.io.IOException;
import java.net.*;
import java.util.*;

public class UdpClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("연결할 ip를 입력하세요");
		String ip = sc.nextLine();
		System.out.println("보낼 메세지를 입력하세요");
		String msg = sc.nextLine();
		
		DatagramSocket ds = new DatagramSocket();
		InetAddress addr = InetAddress.getByName(ip);
		byte[] bt = msg.getBytes(); //메세지를 byte 단위로 변경
		DatagramPacket dp = new DatagramPacket(bt, bt.length, addr, 5007);
		ds.send(dp);
		System.out.println("보내기 성공");
		
		
		ds.close();
		sc.close();
	}

}
