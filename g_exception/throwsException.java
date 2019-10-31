package g_exception;

import java.io.IOException;

public class throwsException {
	public static void main(String[] args) {
		/*
		 * << 메서드에 예외 선언하기 >>
		 * - void method() throws Exception {}
		 * - 메서드의 구현부 끝에 throws 키워드와 예외 클래스명으로 예외를 선언할 수 있다.
		 * - 예외를 선언하면 예외처리를 하지 않고 자신을 호출한 메서드로 예외처리를 넘겨준다.
		 */
		
		//1. 예외선언, 2. 트라이캐치 이거 두개만 하면 된다.!
		
		try {
			method();
		} catch (IOException e) {
			// 넘겨받은 예외를 처리한다.
			e.printStackTrace();
		}
	}

	private static void method() throws IOException { //예외를 처리하지 않고 넘겨준다.
		throw new IOException();
	}
}