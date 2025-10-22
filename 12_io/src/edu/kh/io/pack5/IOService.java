package edu.kh.io.pack5;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class IOService {
	public void output1() {
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			//fos = new FileOutputStream("text.txt"); // -> 경로가 아니라 파일
			fos = new FileOutputStream("/io_test/20251014/text.txt");
			
			/* - FileOutputStream은 1바이트씩 데이터를 입출력
			 * -> 통로가 좁아서 데이터 입출력 시 속도가 느림
			 * -> 보조스트림 이용 시 버퍼에 입출력할 내용을 모아서 한번에 입출력!
			 * -> 기반 스트림(FileOutputStream)을 이용하는 횟수, 시간이 줄어듬.
			 * -> 성능, 시간 효율 향상 */
			bos = new BufferedOutputStream(fos);
			
			
			
			
			// StringBuilder -> String 변환 -> charAt() -> char 변환
			// String content = sb.toString();
			StringBuilder sb = new StringBuilder();
			String str = sb.toString();
			str = "안녕하세요!";
			
			
//			for(int i = 0; i < str.length(); i++) {
//				char ch = str.charAt(i);
//				bos.write(ch);
//				
//			}
			
			
			bos.write(str.getBytes()); // byte[]로 만들어 반환하고
			// 내부적으로 문자 인코딩을 적용하여 한글도 깨지지 않고 출력됨.
			
			
			
			bos.flush(); // FileOutputStream에서는 flush() 선택 사항 <중요!! 말만 선택사항이지 어디든 사용함.>
			// flush : 스트림 안에 남아있는 모든 데이터를 외부로 모두 밀어냄
			
			System.out.println("출력 완료.");
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			// 사용 완료한 스트림을 제거(닫기, 메모리 반환)하는 코드 작성
			// -> 메모리 누수 방지를 위해서 필요.
			try {
				if(bos != null) bos.close();
				// 스트림이 정상 생성된 경우
				//스트림을 닫는다는 의미이다.
				
				// close() 메서드도 IOException을 발생시키기 때문에
				//try-catch 이용하여 예외 처리 필수!
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
