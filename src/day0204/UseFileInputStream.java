package day0204;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * FileInputStream을 사용한 파일의 내용 읽기
 * @author user
 */
public class UseFileInputStream {
	
	public UseFileInputStream() throws IOException{
		
		//1.파일에 스트림 연경
		File file = new File("e:/dev/temp/java_read.txt");
		if(file.exists()) {
			FileInputStream fis = null;
			try {
				fis = new FileInputStream(file);//파일에 스트림을 사용하여 연결하고
				//연결된 파일에서 최초 1byte만 읽어들인다.
//				int data = fis.read();//연결된 스트림에서 1byte를 가져온다.
//				System.out.println("읽어들인 데이터: "+ (char)data); //파일의 가장 처음 글자(영어만 읽어들임)
				
				//연결된 파일에서 모든 데이터를 1byte씩 읽어들인다.
				int data = 0;
				while((data = fis.read()) != -1) {//EOF
					System.out.print((char)data);
				}//end while
				
			}finally {
				if(fis != null) {//null pointer exception에 대해 처리하지 않아도 된다.
				fis.close();//스트림을 다 쓰면 반드시 연결을 끊어야 한다.(메모리 누수를 막기 위해): close()
				}//end if
			}//end finally
				
		}//end if

		
		
	}//UseFileInputStream

	public static void main(String[] args) {
		try {
			new UseFileInputStream();
		} catch (IOException e) {
			//생성자에서 여러행에서 발생한 IOException을 한번에 모아서 처리할 수 있다.
			e.printStackTrace();
		}//end catch
	}//main

}//class
