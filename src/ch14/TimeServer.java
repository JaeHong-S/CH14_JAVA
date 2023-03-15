package ch14;

import java.io.*;
import java.net.*;
import java.util.GregorianCalendar;

public class TimeServer {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(7000);
		try {
			System.out.println("서버 작동 중");
			while(true) {
				Socket client = ss.accept(); //클라이언트가 접속하기를 기다림
				OutputStream os = client.getOutputStream(); //client에 보낸다
				ObjectOutputStream oos = new ObjectOutputStream(os); //직열화해서 
				oos.writeObject(new GregorianCalendar());
				oos.flush(); //스트림에서 정보를 밀어낸다. 보낸다.
				os.close(); oos.close(); client.close();
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			ss.close();
		}
	}

}
