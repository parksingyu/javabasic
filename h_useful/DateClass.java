package h_useful;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public class DateClass {

	public static void main(String[] args) {
		Date today = new Date(); //현재 날짜
		System.out.println(today); //결과값: Tue Oct 15 11:04:40 KST 2019 ->  우리가 읽기엔 익숙치 않다.
		
		//날짜 -> 포맷 -> 문자열
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd"); //소문자 m은 다른용도로 쓰이기 때문에 M만 대문자이다.
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss.sss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yy-MM-dd HH:mm:ss a"); // a는 오전, 오후 표현
		
		String format = sdf1.format(today);
		System.out.println(format);
		System.out.println(sdf1.format(today));
		
		String format2 = sdf2.format(today);
		System.out.println(sdf2.format(today));
		System.out.println(format2);
		
		String format3 = sdf3.format(today);
		System.out.println(sdf3.format(today));
		System.out.println(format3);
		System.out.println(sdf4.format(today));
		
		//문자열 -> 포맷 -> 날짜
		String str = "2019년 10월 16일";
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy년 MM월 dd일");
		//Date dateStr = sdf5.parse(str); //에러가 난다. 이유는? 예외처리를 안해서.. 1. 트라이캐치에 넣거나, 예외를 던져주거나
		
		try {
			Date dateStr = sdf5.parse(str);
			System.out.println(dateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		Calendar cal = Calendar.getInstance();
		
		//날짜 셋팅
		cal.setTime(new Date());
		cal.set(2019,  9, 16);  //2019/10/16 (월은 0부터 시작)
		System.out.println(sdf3.format(cal.getTime()));
		
		//날짜 계산
		cal.add(Calendar.YEAR, 1); // 연도를 1 증가시키겠다는 뜻.
		cal.add(Calendar.MONTH, 2); // 월을 2 증가시키겠다는 뜻.
		cal.add(Calendar.DAY_OF_MONTH, -3); // 일을 3 감소시키겠다는 뜻.
		cal.add(Calendar.HOUR, 2); // 2시간 증가시키겠다는 뜻.
		cal.add(Calendar.MINUTE, 5); // 5분 증가시키겠다는 뜻.
		cal.add(Calendar.SECOND, -10); // 10초 감소시키겠다는 뜻.
		System.out.println(sdf3.format(cal.getTime()));
	}
}