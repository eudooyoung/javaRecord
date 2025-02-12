package com.multi.d_file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileExample2 {
	public static void main(String[] args) throws Exception {
		Path path = Paths.get("C:\\workspace\\multi2\\02_java\\m4_object\\file1.txt"); // 경로로 지정해서 확인 하는듯?
		Path pathToCopy = Paths.get("C:\\workspace\\multi2\\02_java\\m4_object\\file1_copy.txt");
//확인

		// 파일 생성
		createFileIfNotExists(path);//

		// 파일 복사
		copyFile(path, pathToCopy);

		// 파일 삭제
//		deleteFileIfExists(path);

	}
    // 파일 생성 메서드
    private static void createFileIfNotExists(Path path) {
        try {
            if (!Files.exists(path)) {
                Files.createFile(path);
                System.out.println("파일이 생성되었습니다.");
            } else {
                System.out.println("파일이 이미 존재합니다.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 파일 복사 메서드
    private static void copyFile(Path source, Path destination) {
        try {
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("파일이 복사되었습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 파일 삭제 메서드
    private static void deleteFileIfExists(Path path) {
        try {
            System.out.println(path.getFileName());

            Files.deleteIfExists(path);
            System.out.println("파일이 삭제되었습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



