package com.multi.b_network.a_tcp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

//    서버에서 응담할 때
//    네트워크 계층: IP 주소로 패킷을 전달
//    전송계층: 이미 연결되어 있어, 핸드쉐이킹은 일어나지 않는다. 포트정보를 가지고 데이터 잔달
//    애플리케이션 계층: 클라이언트의 브라우저가 서버응답을 화면에 표시
    public static void main(String[] args) {

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

        try {
            ServerSocket serverSocket = new ServerSocket(9090); // 0 ~ 65535 -> 0 ~ 1023 을 피해서 작성
            System.out.println("서버 소켓 시작");
            System.out.println("클라이언트의 요청을 기다리는 중");

            int count = 0;
            while (true) {
                //        서버는 accept()를 호출한 상태에서 **대기**
                //        클라이언트가 연결 요청(SYN)
                //        서버가 SYN + ACK 응답
                //        클라이언트가 ACK 전송 → TCP 3-way handshake 완료
                //        서버는 accept()에서 클라이언트의 연결을 받아들임
                //        새로운 Socket 객체를 반환하고, 이후 데이터 통신 가능
                Socket socket = serverSocket.accept(); // 연결 요청을 받고 소켓 반환? ...4)

                count++;

                System.out.println("클라이언트 연결됨 " + count + " 접속");

                PrintWriter out = new PrintWriter(socket.getOutputStream(), true); // autoFlush: 스트림 안에 있는 값을 내보냄

                out.print("안녕 !!!");

                out.close();
                socket.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
