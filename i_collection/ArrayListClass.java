package i_collection;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {
		
		/*
		 * add()	: 마지막 위치에 객체를 추가
		 * get()	: 지정된 위치의 객체를 반환
		 * set()	: 지정된 위치에 주어진 객체를 저장(수정)
		 * remove()	: 지정된 위치의 객체를 제거
		 * size()	: 저장된 객체의 수 반환
		 */
		
		ArrayList<Object> list = new ArrayList<Object>();
		// <>에 Object를 입력하면 어떤 타입의 값도 올 수 있음.
		list.add("스트링 타입");
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(true);
		list.add(new ArrayListClass());
		System.out.println(list);
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("abc");
		list2.add("123");
		list2.add("가나다");
		list2.add("마바사");
		System.out.println(list2);
		list2.set(1, "456");  
		System.out.println(list2);
		
		System.out.println();
		for(int i = 0; i < list2.size(); i++){  //size()는 리스트의 길이
			System.out.println(list2.get(i));
		}
		
		
		list2.remove(0);
		//리스트에 저장된 값을 삭제하면 그 뒤의 모든 값의 인덱스가 당겨진다.
		System.out.println(list2.get(0));
		
		System.out.println();
		ArrayList<ArrayList<Integer>> list3 = new ArrayList<ArrayList<Integer>>(); //2차원 배열과 같다.
		ArrayList<Integer> list4 = new ArrayList<Integer>();
		list4.add(10);
		list4.add(20);
		list4.add(30);
		
		list3.add(list4);
		System.out.println(list3);
		
		list4 = new ArrayList<Integer>();
		list4.add(10);
		list4.add(20);
		list4.add(35);
		list3.add(list4);
		System.out.println(list3);
		
		System.out.println("");
		
		//정수를 저장할 수 있는 ArrayList를 생성해 값을 5번 넣어주세요.
		ArrayList<Integer> intlist = new ArrayList<Integer>();
		for(int i = 0 ; i < 5; i++){
			intlist.add(i+100);
		}
		System.out.println(intlist);  //혹은
		
		for (int i = 0; i<intlist.size(); i++){
			System.out.print(intlist.get(i) + ", ");
		}
		
		//위에서 만든 ArrayList에 담긴 값들의 합계와 평균을 출력해주세요.
		System.out.println("");
		int sum = 0;
		for (int i = 0; i<intlist.size(); i++){
			sum = sum + intlist.get(i);
		}
		System.out.println("합계 : " + sum);
		
		float avg = 0;
		avg = (float)sum / intlist.size();
		System.out.println("평균 : " + avg);
		
		//위에서 만든 ArrayList에 담긴 값들 중 최소값과 최대값을 출력해주세요.
		int min = intlist.get(0);
		int max = intlist.get(0);
		
		for(int i = 0; i<intlist.size(); i++){
			if ( min > intlist.get(i) ){
				min = intlist.get(i);
			}
			if ( max < intlist.get(i) ){
				max = intlist.get(i);
			}
		}
		System.out.println("최소값 : " + min + " / 최대값 : " + max );
	}
}