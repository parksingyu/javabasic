package h_useful;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		/*
		 * 정규표현식 : 문자열의 패턴을 검사하는 표현식
		 * 
		 *  ^	뒷 문자로 시작
		 *  $	앞 문자로 종료
		 *  .	임의의 문자(줄바꿈 제외)
		 *  *	앞 문자가 0개 이상
		 *  +	앞 문자가 없거나 1개
		 *  []	문자의 집합이나 범위([a-z] : a부터 z까지, [^a-z] : a부터 z가 아닌 것)
		 *  {}	앞 문자의 개수({2} : 2개, {2,4} : 2개이상 4개 이하)
		 *  ()	그룹화(1개의 문자처럼 인식)
		 *  |	OR 연산
		 *  \s	공백, 탭, 줄바꿈
		 *  \S	공백, 탭, 줄바꿈이 아닌 문자
		 *  \w	알파벳이나 숫자
		 *  \W	알파벳이나 숫자가 아닌 문자
		 *  \d	숫자
		 *  \D	숫자가 아닌 문자
		 *  (?i) 뒷 문자의 대소문자 구분 안함
		 *  \	정규표현식에서 사용되는 특수문자 표현
		 */
		
		String str = "abc123";
		//String regex = "[a-z]{3}[0-9]{1,3}";
		//String regex = "[a-z0-9]+";
		//String regex = "\\w*"; //알파벳이나 숫자일 경우
		String regex = ".*";  // 줄바꿈을 제외한 어떤 문자든지 0개 이상이면 true
		
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(str);
		
		System.out.println(m.matches());
		
		//아이디, 전화번호, 이메일주소의 유효성을 검사하는 정규표현식을 만들어주세요.
		//아이디 5~20자의 영문 소문자, 숫자와 특수기호(_),(-)만 사용 가능합니다.
		System.out.print ("아이디 정규식 : ");
		String id = "taijijr92";
		String regex1 = "[a-z0-9_-]{5,20}";
		
		Pattern p1 = Pattern.compile(regex1);
		Matcher m1 = p1.matcher(id);
		System.out.println(m1.matches());
		
		System.out.print ("전화번호 정규식 : ");
		String pn = "010-2236-2784";
		String regex2 = "[0-9-]{11,13}";
		Pattern p2 = Pattern.compile(regex2);
		Matcher m2 = p2.matcher(pn);
		System.out.println(m2.matches());
		
		System.out.print ("email 정규식 : ");
		String email = "taijijr92@hanmail.net";
		String regex3 = "[a-z0-9-_.@]{15,32}";
		Pattern p3 = Pattern.compile(regex3);
		Matcher m3 = p3.matcher(email);
		System.out.println(m3.matches());
	}
}