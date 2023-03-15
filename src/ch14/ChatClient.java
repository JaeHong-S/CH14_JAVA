package ch14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.*;
import java.util.*;

public class ChatClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("연결할 ip");
		String ip = sc.nextLine();
		System.out.println("전달할 메세지");
		String msg = sc.nextLine();
		Socket client = new Socket(ip, 7001);
		OutputStream os = client.getOutputStream();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
		bw.write(msg);
		bw.flush();
		os.close(); bw.close(); client.close();
		sc.close();
		System.out.println("메세지 전달 완료");
		
	}

}
