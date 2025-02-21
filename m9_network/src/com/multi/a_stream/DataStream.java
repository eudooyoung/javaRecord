package com.multi.a_stream;

import java.io.*;

public class DataStream {

    /* 데이터 자료형 별로 처리하는 기능을 추가한 보조스트림을 제공
    byte 단위가 아니고 기본 자료형의 크기로 읽고 쓰기 가능
     * DataInputStream/DataOutputStream
     * */
    public void fileSaveOpen() {
        try (
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("d_data.txt"));
                DataInputStream dis = new DataInputStream(new FileInputStream("d_data.txt"))
        ) {
            dos.writeUTF("박효신");
            dos.writeInt(1);
            dos.writeChar('a');
            dos.writeBoolean(true);

            while (true) {

                System.out.println(dis.readUTF() + " " + dis.readInt() + " " + dis.readChar() + " " + dis.readBoolean());
//                System.out.println(dis.readUTF());
//                System.out.println(dis.readInt());
//                System.out.println(dis.readChar());
//                System.out.println(dis.readBoolean());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (EOFException e) { // 파일의 끝을 만났을 때 발생하는 예외
            System.out.println("파일 읽기 완료");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
