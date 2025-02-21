package com.multi.homework.others;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
 *  * TCP (Transmission Control Protocol)
 *  - 서버, 클라이언트 간의 1:1 소켓 통신 (연결 지향적 프로토콜)
 *  - 데이터 전송 전 먼저 서버, 클라이언트가 연결되어 있어야된다.
 *    --> 서버가 먼저 실행되어 클라이언트 요청을 기다림
 *    --> 서버, 클라이언트용 프로그램을 따로 구현해야된다. 
 *  

 *  - java.net 패키지에서 Socket, ServerSocket 클래스를 제공
 */  
 /*
 *  * Socket
 *  - 프로세스간의 통신을 담당
 *  - input / outputStream을 보유(이 스트림을 통해 프로세스간의 통신(입/출력)이 이루어짐)
 *  
 *  * ServerSocket
 *  - 포트와 연결(Bind)되어 외부의 연결 요청을 기다리다 연결요청이 들어오면
 *    Socket을 생성하여 소켓과 소켓간의 통신이 이루어 지도록 함
 *  - 한 포트에 하나의 ServerSocket만 연결할 수 있다. 
 */
public class Server {
	public static void main(String[] agrs) throws IOException{
		/*
		 * 서버용 TCP 소켓 프로그래밍 순서
		 * 
		 * 1) 서버의 포트번호 정함
		 * 2) 서버용 소켓 객체 생성 시 포트와 결합
		 * 3) 클라이언트 쪽에서 접속 요청이 오길 기다림
		 * 4) 접속 요청이 오면 요청 수락 후 해당 클라이언트에 대한 소켓 객체 생성
		 * 5) 연결된 클라이언트와 입출력 스트림 생성
		 * 6) 보조스트림을 통해 성능 개선
		 * 7) 스트림을 통해 읽고 쓰기
		 * 8) 통신 종료
		 */
		
		//1.서버의 포트번호를 정함 (0~65535)->(0~1023)
		int port = 8500;
		 // 포트는 0 ~ 65535 사이 지정 가능 (단, 1023번 이하는 이미 사용중인 포트가 많으니 이외의 포트 지정)
		 // 0 ~ 1023 : 웰노운(Well-Known port)
		 // 1024 ~ 65535 : 다이나믹 (Dynamic port)
		 
		//2.서버소켓만들기 
		ServerSocket server = new ServerSocket(port);
		
		//while(true){
			
			//3.클라이언트로부터 접속요청이 올때까지 대기
			System.out.println("클라이언트의 요청을 기다리고있습니다.");
			
			//4.접속요청이 오면 요청수락후 해당 클라이언트에 대한 소켓객체 생성
			Socket client = server.accept();
			
			String clientIp = client.getInetAddress().getHostAddress();
			System.out.println(clientIp + " 가 연결을 요청함!!");
			
			//5.연결된 클라이언트와 입출력 스트림생성
			
			/**
			//   -> 문자형태(한글 통신) : Reader나 Writer
			//   -> 속도향상 및 메소드(readLine() 또는 println())활용 : 
		    //      BufferedReader 나 PrintWriter
			**/
			InputStream input = client.getInputStream();
			OutputStream output = client.getOutputStream();
			
			
			//6.보조스트림을통해 성능개선
			// 6) 보조스트림을 통해 성능 개선
						// --> 문자형태로 주고받고자 할 경우 (즉, 2byte 단위로 안전하게 주고 받고자 한다면)
						//     바이트스트림 --> 문자스트림으로 변환  : InputStreamReader
						
			BufferedReader br = new BufferedReader(new InputStreamReader(input));
			PrintWriter pw = new PrintWriter(output);/**  -> 메세지를 클라이언트에게 전송하기 위한 코드**/
			Scanner sc = new Scanner(System.in);
			while(true){
				
				//7.스트림을 통해 읽고 쓰기 
				// 클라이언트 --> 서버로 전송한 메세지 읽어들임 (입력)
				String message = br.readLine(); // 만약 클라이언트로 부터 전달된 데이터가 있다면 message에 담겼을 것!!
				
				if(message != null && !message.equals("exit") ){
					System.out.println(client.getInetAddress().getHostAddress() + "가 보낸 메세지 : " + message);
					//서버-> 클라이언트로 메세지 전송
					System.out.print("대화 입력 : ");
					
					String msg = sc.nextLine();
					//4.스트림을 통해 읽고 쓰기
					pw.println(msg);
					pw.flush();
				
					//pw.println("메세지 받기 성공");
					//pw.flush();
				}else{
					System.out.println("접속 종료");
					break;
				}
			}
			
			br.close();
			pw.close();
			client.close();
			
		}
	//}
}
