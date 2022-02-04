package day0204;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 * File클래스 사용
 * @author user
 */
public class UseFile {

	public UseFile() {
		//1.파일 생성
		File file = new File("e:/dev/temp/java_read.txt");
		
		System.out.println(file.exists()?"존재":"경로확인");//파일의 존재 여부
		System.out.println(file.length()+"byte");//파일의 크기
		System.out.println(file.isFile()?"파일":"디렉토리");
		System.out.println(file.isDirectory()?"디렉토리":"파일");
		System.out.println(file.isHidden()?"숨김파일":"일반파일");
		System.out.println(file.canRead()?"읽기가능":"읽기불가능");
		System.out.println(file.canWrite()?"쓰기가능":"쓰기불가능");
		System.out.println(file.canExecute()?"실행가능":"실행불가능");
		long lm = file.lastModified();
		System.out.println("마지막으로 수정된 날짜 "+lm);
		
		Date date = new Date(lm);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("마지막으로 수정된 날짜 "+sdf.format(date));
		
		System.out.println("파일 경로 : "+file.getPath());
		System.out.println("파일 절대경로 : "+file.getAbsolutePath());
		try {
			System.out.println("파일 규범경로 : "+file.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}//end catch
		
		System.out.println("파일을 가진 폴더명 : "+file.getParent());
		System.out.println("파일명 : "+file.getName());
		
		//파일 reName(파일명 변경)
		//1.변경할 이름을 가진 File 생성
//		File rename = new File(file.getParent()+"/java_read_1.txt");
//		System.out.println(file.renameTo(rename));
		
		//파일 삭제
//		System.out.println(file.delete());
		
		//디렉토리 생성
		//1.생성할 디렉토리명을 가진 파일을 생성
		File mk = new File("e:/dev1/temp/test");
		System.out.println(mk.mkdir());//false: 상위폴더가 없어서 하위폴더를 만들지 못함
		
		File mk1 = new File("e:/dev1/temp/test");
		System.out.println(mk.mkdirs());//true: 상위폴더가 없어도 상위폴더를 만든 후 하위폴더 생성
		
		
		
		
	}//UseFile

	public static void main(String[] args) {
		new UseFile();

	}//main

}//class
