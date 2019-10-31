
public class test2 {

	public static void main(String[] args) {
		
				
		try{
			int result = 10 / 0; //예외가 발생한 위치에서 프로그램이 비정상적으로 종료된다.
			System.out.println(result); //예외 발생시 실행되지 않는다.
		}
		
		catch (ArithmeticException | IndexOutOfBoundsException e){
			//e.printStackTrace(); // 예외 메시지를 출력한다.
			System.out.println("예외가 출력됨");
		}
	}
}