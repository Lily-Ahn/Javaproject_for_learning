package com.io.part01_byteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestByteStream {
	//Byte 단위의 기반스트림 FileOutPutStream, FileInputStream
	
	public void fileSave() {
		//출력
		FileOutputStream fout = null;
		
		//객체생성 = 스트림 생성 = 통로연결
		try {
			fout = new FileOutputStream("sample.txt");
			fout.write(97);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				//스트림 닫기
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void fileOpen() {
		
		//입력
		
		//try with resource
		//반드시 close() 처리를 해야하는 객체생성 구문을 
		//자동으로 close()됨 
		
		try(FileInputStream fin = new FileInputStream("sample.txt")) {
			int val;
			while((val=fin.read()) != -1) {
				System.out.print(val+" ");
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}

}
