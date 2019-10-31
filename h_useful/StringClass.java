package h_useful;

import java.util.Arrays;

public class StringClass {
	public static void main(String[] args) {
		/*
		 * equals()			: 문자열을 비교하여 같으면 true 다르면 false를 반환
		 * length()			: 문자열의 길이를 반환한다.
		 * substring()		: 주어진 범위에 해당하는 문자열을 반환한다.
		 * charAt()			: 지정된 위치의 문자를 반환한다.
		 * indexOf()		: 주어진 문자의 위치를 반환한다.
		 * lastIndexOf()	: 주어진 문자의 마지막 위치를 반환한다.
		 * replace()		: 문자열 내의 주어진 문자(문자열)를 새로운 문자(문자열)로 바꾼 문자열을 반환한다.
		 * replceAll()		: 문자열 내의 주어진 정규표현식과 일치하는 문자열을 새로운 문자열로 바꾼 문자열을 반환한다.
		 * split()			: 문자열을 주어진 정규표현식과 일치하는 문자열로 나누어 문자열 배열로 반환한다.
		 * startWith()		: 주어진 문자열로 시작하는지 여부를 반환한다.
		 * endsWith()		: 주어진 문자열로 끝나는지 여부를 반환한다.
		 * toUpperCase()	: 문자열로 대문자로 변환한 문자열을 반환한다.
		 * toLowerCase()	: 문자열을 소문자로 변환한 문자열을 반환한다.
		 * trim()			: 양끝의 공백을 제거한 문자열을 반환한다.
		 */
		
		String str = "abc abc  abc";
		System.out.println(str.indexOf("a"));  // 맨 첫번째 a를 찾아서 위치를 반환
		System.out.println(str.indexOf("a", 1));  // 1번인덱스부터 찾으세요라는 뜻
		System.out.println(str.indexOf("a", str.indexOf("a") + 1));
		System.out.println(str.lastIndexOf("b"));  //마지막부터 찾음.
		
		System.out.println(str.replace("a", "0"));  //문자열에 있는 모든 a를 0으로 표시된다.
		System.out.println(str.replaceAll("[a-z]", "0")); // a부터 z까지 모든 문자열이 0으로 표시된다.
		
		System.out.println(Arrays.toString(str.split(" "))); 
		// 결과값 : [abc, abc, , abc] -> 빈공백 한개씩 나눈거라서 한칸은 빈칸이 나온다.
		System.out.println(Arrays.toString(str.split(" +"))); 
		// 결과값 : [abc, abc, abc]->  +앞에 있는 공백이 하나 이상이라는 뜻. 하나든 두개든 하나로 취급을 해서 나눠줌.
		
		System.out.println(str.startsWith("a")); //문자열이 a로 시작하니 true가 나온다.
		System.out.println(str.startsWith("b")); //문자열이 b로 시작하지 않으니까 false가 나온다.
		
		System.out.println(str.endsWith("c")); //문자열의 마지막이 c로 끝나므로 true가 나온다.
		System.out.println(str.endsWith("b")); //문자열의 마지막이 b로 끝지 않으므로 false가 나온다.
		
		System.out.println(str.toUpperCase()); // 결과값:ABC ABC  ABC -> 모두 대문자로 표시
		System.out.println(str.toUpperCase().toLowerCase()); // 결과값:abc abc  abc -> 모두 소문자로 표시
		System.out.println(str.toLowerCase()); // 결과값:abc abc  abc -> 모두 소문자로 표시
		
		String str2 = " abc abc ";
		System.out.println(str2);  // 결과값 :  abc abc 
		System.out.println(str2.trim()); // 결과값 : abc abc -> 앞과 뒤에 공백을 제거한 문자열을 반환한다.
		
	}
}