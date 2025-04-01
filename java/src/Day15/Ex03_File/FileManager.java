package Day15.Ex03_File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * - 메뉴 출력 메소드
 * - 폴더 내의 파일 목록
 * - 파일 정보 조회
 * - 폴더 생성
 * - 폴더 삭제
 * - 파일 생성
 * - 파일 삭제
 */
public class FileManager {

    private String path;

    /**
     * 메뉴 출력 메소드
     */
    private static void menu() {
        System.out.println(":::::::::파일 관리 ::::::::::::::");
        System.out.println("1. 파일 목록");
        System.out.println("2. 파일 조회");
        System.out.println("3. 폴더 생성");
        System.out.println("4. 폴더 삭제");
        System.out.println("5. 파일 생성");
        System.out.println("6. 파일 삭제");
        System.out.println("0. 프로그램 종료");
        System.out.println(":::::::: 번호 : ");
    }

    /**
     * 파일 목록
     * @param path
     */
    private static void fileList(String path) {
        System.out.println(path);
        System.out.println("----------------------------------------");
        File file = new File(path);  // 경로를 지정하여 파일 객체
        File[] fileList = file.listFiles();  // 하위 경로의 파일 목록을 File

        System.out.println("파일명\t\t용량\t\t수정일자");
        for (File subFile : fileList) {
            long update = subFile.lastModified();  // 최종 수정일자
            Date date = new Date(update);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            String updateDate = sdf.format(date);
            String fileName = subFile.getName();
            // 용량
            long size = subFile.length();
            System.out.print(fileName + "\t\t");
            System.out.print(size + "\t\t");
            System.out.println(updateDate + "\t\t");
            System.out.println();
        }

        System.out.println("-----------------------------------------");
    }

    /**
     * 파일 정보 조회
     * @param filepath
     */
    private static void fileInfo(String filePath) {
        File file = new File(filePath);
        System.out.print("파일 종류 : ");
        if (file.isDirectory()) System.out.println("디렉토리");
        if (file.isFile()) System.out.println("일반파일");

        long update = file.lastModified();
        Date date = new Date(update);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String updateDate = sdf.format(date);

        System.out.println(file.getName() + "\t\t");
        System.out.println(file.length() + "\t\t");
        System.out.println(updateDate + "\t\t");
        System.out.println();
    }

    /**
     * 폴더 생성
     * @param path
     */
    private static void makeDirectory(String path) {
        File file = new File(path);

        // 폴더 생성
        // mkdir()  : 생성할 경로의 상위 경로까지 기존 디렉토리가 존재해야 한다. (없으면 에러)
        // mkdirs() : 생성할 경로의 상위 경로까지 디렉토리를 생성해 준다.
        if (file.mkdir()) {
            System.out.println("디렉토리 생성 성공!");
        } else {
            System.err.println("디렉토리 생성 실패!");
        }
        System.out.println("경로 : " + path);
    }

    /**
     * 폴더 삭제
     * @param path
     */
    private static void deleteDirectory(String path) {
        File file = new File(path);

        // TODO: 지정 폴더 하위 경로에 다른 파일이 있으면?
        if (file.delete()) {
            System.out.println("폴더 삭제 성공!");
        } else {
            System.out.println("폴더 삭제 실패!");
        }
    }

    /**
     * 파일 생성
     * @param path  : 파일을 생성할 경로
     * @param fileName : 파일명
     */
    private static void createFile(String path, String fileName) {
        // 1. File 객체 생성
        File file = new File(path, fileName);

        try {
            // 2. FileWriter 객체 생성
            FileWriter fw = new FileWriter(file);
            Scanner sc = new Scanner(System.in);
            System.out.println("내용을 입력하세요: ");
            String text = sc.nextLine();
            fw.write(text);
            fw.close();
            System.out.println(fileName + " 파일을 생성하였습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 파일 삭제
     * @param filepath
     */
    private static void deleteFile(String filepath) {
        File file = new File(filepath);

        // 파일 존재 여부 확인
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("파일 삭제 성공!");
            } else {
                System.err.println("파일 삭제 실패!");
            }
        } else {
            System.err.println("파일이 존재하지 않습니다.");
        }
    }

    public static void main(String[] args) {
        int menuNo;  // 메뉴번호
        Scanner sc = new Scanner(System.in);
        do {
            // 메뉴판 출력
            menu();

            // 메뉴번호 입력
            menuNo = sc.nextInt();
            sc.nextLine(); // 엔터 키 처리

            // 0번 -> 종료
            if (menuNo == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 파일 경로 입력
            System.out.print("파일 또는 폴더 경로를 입력하세요: ");
            String path = sc.nextLine();

            // 메뉴 선택
            switch (menuNo) {
                case 1:
                    fileList(path);
                    break;
                case 2:
                    fileInfo(path);
                    break;
                case 3:
                    makeDirectory(path);
                    break;
                case 4:
                    deleteDirectory(path);
                    break;
                case 5:
                    System.out.print("생성할 파일명을 입력하세요: ");
                    String fileName = sc.nextLine();
                    createFile(path, fileName);
                    break;
                case 6:
                    deleteFile(path);
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                    break;
            }

        } while (true);
    }
}
