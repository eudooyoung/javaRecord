package com.multi.a_stream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectsStream {

    public void fileSave() {

        List<Phone> list = new ArrayList<>();

        list.add(new Phone("삼성", 2000));
        list.add(new Phone("애플", 3000));
        list.add(new Phone("엘지", 4000));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phone1.txt"))) {

            for (int i = 0; i < list.size(); i++) {
                oos.writeObject(list.get(i));
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void fileOpen() {

        try (ObjectInputStream oos = new ObjectInputStream(new FileInputStream("phone1.txt"))) {

            List<Phone> list = new ArrayList<>();
//            oos.close();

            int i = 0;
            while (true) {
                list.add((Phone) oos.readObject());
                System.out.println(list.get(i));
                i++;
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (EOFException e) { // 예외 처리 순서 확인
            System.out.println("프로그램 종료");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
