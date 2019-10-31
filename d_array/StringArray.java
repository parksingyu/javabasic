package d_array;

import java.util.Scanner;

public class StringArray {
	
	public static void main(String[] args) {
		
		for (String arg : args){
			System.out.println(arg);
		}
		
		String s = new String("ABCD"); //참조형 타입을 초기화 하는 방법 괄호가 붙으면 무조건 메소드이다.
		String str = "ABCD"; // String은 특별히 간단하게 초기화 가능.
		
		char[] charArray = str.toCharArray(); // String 클래스 내부에 문자배열 가지고 있다.
		System.out.println(charArray); //char 배열은 특별히 배열의 내용이 출력된다.
		
		//String 클래스 내부에 문자배열을 다루는 여러가지 메서드가 정의되어 있다.
		
		/*
		 * << String의 주요 메서드 >>
		 * - equals()   : 문자열의 내용이 같은지 확인한다.
		 * - length()   : 문자열의 길이를 반환한다.
		 * - charAt()   : 문자열에서 해당 위치에 있는 문자를 반환한다.
		 * - substring(): 문자열에서 해당 범위에 있는 문자열을 반환한다.
		 * - indexOf()  : 문자열 내의 특정 문자열의 인덱스를 반환한다.
		 * - replace()  : 문자열 내의 특정 문자열을 원하는 문자열로 변경해 반환한다.
		 */
		
		for(int i = 0; i < str.length(); i++){
			System.out.println(str.charAt(i));
		}
		
		String revStr = ""; //str을 거꾸로 담을 변수
		//뒤에서부터 한글자씩
		//ABCD
		for (int i = str.length() - 1; i >= 0; i--){
			revStr = revStr + str.charAt(i);  
//			revStr += str.charAt(i);
		}
		System.out.println(revStr);  // 결과 : DCBA
		
		str = "0123456789";
		String sub1 = str.substring(3); //3번 인덱스부터 잘라서 반환한다.
		System.out.println(sub1); // 결과 : 3456789
		String sub2 = str.substring(5, 8); //5번 인덱스부터 8번 인덱스 전!!까지 잘라서 반환한다.
		System.out.println(sub2); // 결과 : 567
		
		String[] stores = new String[3]; //참조형의 기본값인 null이 저장된다.
		stores[0] = "굽네치킨";
		stores[1] = "피자나라 치킨공주";
		stores[2] = "도미노 피자";
		
		for(String store : stores){
			int i = store.indexOf("치킨");
			if(0 <= i){
				System.out.println(i + " / " + store);
			} else {
				System.out.println(i); //해당되는 문자열이 없는 경우 -1을 반환한다.
			}
		}
		String[] menus = {
				"치킨 18000원",
				"피자 9900원",
				"돈가스 8000원",
				"떡볶이 5000원"
		};
		
		for(String menu : menus){
			String name = menu.substring(0, menu.indexOf(" "));
			System.out.print(name + " ");
			
			String price = menu.substring(menu.indexOf(" ")+1, menu.indexOf("원"));
			int price1 = Integer.parseInt(price); 
			System.out.println(price1);
		}
		
		str = "123456789";
		
		str = str.replace("3", "짝");
		str = str.replace("6", "짝");
		str = str.replace("9", "짝\n");
		System.out.println(str);
		
		String pn = "010-2363-3647";
		//하이픈(-) 을 제거해서 출력해주세요.
		pn = pn.replace("-", "");
		System.out.println(pn);
		
		//숫자를 입력받아 입력받은 숫자에
		//3자리 마다 콤마(,)를 붙여 출력해주세요.
		//ex) 1234567 -> 1,234,567
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요 ");
		String number = sc.nextLine();
		String newNumber = "";

		int cnt = 0;
		for ( int i = number.length()-1; i>=0; i--){
			newNumber =  number.charAt(i) + newNumber ;
			cnt ++;
			if(cnt % 3 == 0 && cnt != number.length()){
				newNumber = "," + newNumber;
			}
			System.out.println(newNumber);
		}
		
		System.out.println(newNumber);
	}
}















