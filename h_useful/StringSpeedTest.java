package h_useful;

public class StringSpeedTest {
	
	public static void main(String[] args) {
/*		String str = "a";
		
		//시간을 재는 코드를 한번 적어보도록 할게요
		long start = System.currentTimeMillis(); //시작시간 재기
		
		for(int i = 0 ; i<200000; i++){
			str += "a";
		}
		long end = System.currentTimeMillis(); //끝나는 시간 재기
		System.out.println(end - start + "ms");  //끝나는시간 - 시작시간
*/		
		StringBuffer sb = new StringBuffer("a");
		long start2 = System.currentTimeMillis(); //시작시간 재기
		for (int i = 0 ; i < 200000; i++){
			sb.append("a"); //append는 문자열을 뒤에 계속 붙이는 메소드.
		}
		long end2 = System.currentTimeMillis(); //끝나는 시간 재기
		System.out.println(end2 - start2 + "ms");  //끝나는시간 - 시작시간
	}
}