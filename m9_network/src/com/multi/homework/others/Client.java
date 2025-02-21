package com.multi.homework.others;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	/*
	 *  클라이언트용 TCP 소켓 프로그래밍 순서
	 *  
	 *  1) 서버의 IP 주소와 서버가 정한 포트 번호를 매개변수로 하여 클라언트용 소켓 객체 생성
	 *  2) 서버와의 입출력 스트림 오픈
	 *  3) 보조 스트림을 통해 성능 개선
	 *  4) 스트림을 통해 읽고 쓰기
	 *  5) 통신 종료
	 */
	public static void main(String[] args) {
		//1. 서버의 IP 주소와 서버가 정한  포트번호를 먼저 알아야함 
		int port = 8500;
		BufferedReader br = null;
		PrintWriter pw = null;
		
		try {
			//2.서버의 IP 주소와 서버가 정한 포트번호를 매개변수로하여 클라이언트용 소켓객체 생성

			String serverIP = InetAddress.getLocalHost().getHostAddress();
			
			Socket socket = new Socket(serverIP, port);/** 연결에 실패할 경우 null값이 반환된다.(소켓 객체 생성이 안됨)**/
			// 서버 IP : 172.30.1.28
			//Socket socket = new Socket("172.30.1.28",port); // IP 주소를 알면 이렇게 써주면됨
			
			//3.서버와의 입출력 스트림 오픈 
			if(socket != null){// 잘연결됬으면 
				InputStream input = socket.getInputStream();
				OutputStream output = socket.getOutputStream();
				br = new BufferedReader(new InputStreamReader(input));
				pw = new PrintWriter(output);
				
				Scanner sc = new Scanner(System.in);
				
				do{
					System.out.print("대화 입력 : ");
					// 클라이언트 --> 서버 메세지 전송
					String message = sc.nextLine();
					if(message.equals("exit")){
						System.out.println("대화종료");
						break;
					}else {
						//4.스트림을 통해 읽고 쓰기
						pw.println(message);
						pw.flush();
						

						// 서버 -> 클라이언트 메세지 읽어들임.
						String recieveMessage = br.readLine();
						System.out.println(recieveMessage);
						
					}
				
					
				}while(true);
			
				
			}
			
			//5.통신종료
			pw.close();
			br.close();

			socket.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
