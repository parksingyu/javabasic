package i_collection;

import java.util.HashMap;
import java.util.Set;

public class HashMapClass {
	public static void main(String[] args) {
		/*
		 * put()	: 지정된 키와 값을 저장
		 * get()	: 지정된 키의 값을 반환(없으면 null)
		 * remove()	: 지정된 키로 저장된 값을 제거
		 * keySet()	: 저장된 모든 키를 Set으로 반환
		 */
		HashMap<String, String> map = new HashMap<String, String>();  
		// <>앞이 키, 뒤에 있는게 밸류. type 지정을 해줄수도 안해줄수도 있다. 지정해주면 지정된 타입만 저장 가능.
		// 아무타입이나 넣게 되면 꺼내올때 예측하기 힘들어서 일반적으로 타입을 지정한다.
		
		map.put("title", "제목입니다.");  // "title" -> 키, "제목입니다" -> 밸류 
		map.put("content", "내용입니다.");
		map.put("user", "김승섭");
		map.put("date", "2019-10-16 09:29");
		
		System.out.println(map.get("title"));
		System.out.println(map.get("content"));
		System.out.println(map.get("user"));  //김승섭
		System.out.println(map.get("date"));
		
		map.put("user", "홍길동"); 
		//홍길동 -> 기존값에 덮어씀. 기존에 있던 김승섭은 사라지게 된다.
		//1개의 키에 여러개의 값을 저장할 수 없다.
		System.out.println(map.get("user"));
		map.put("user", "이순신");
		System.out.println(map.get("user"));
		
		map.remove("user"); // 그에 해당하는 키와 값이 삭제가 된다.
		System.out.println(map.get("user"));
		
		//map에 저장된 모든 내용 출력
		System.out.println();
		Set<String> keys = map.keySet();
		for(String key : keys){
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}
	}
}