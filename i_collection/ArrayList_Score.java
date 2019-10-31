package i_collection;

import java.util.ArrayList;

public class ArrayList_Score {
	public static void main(String[] args) {
		/*
		 * 우리반 모두의 Java, Oralce, HTML, JQuery, JSP 점수를
		 * 50 ~ 100까지 랜덤으로 생성시켜주시고,
		 * 석차순으로 석차, 이름, 과목별 점수, 총점, 평균을 출력해주세요.
		 * 
		 *  석차 이름    Java    Oracle    HTML    JQuery    JSP    총점       평균
		 *  1    오동규  100     100       100     100       100    100      100  
		 *  1    오동규  100     100       100     100       100    100      100  
		 *  1    오동규  100     100       100     100       100    100      100  
		 *  1    오동규  100     100       100     100       100    100      100  
		 *  1    오동규  100     100       100     100       100    100      100  
		 */ 
		
		float avg = 0;
		int[] rank = new int[25];
		ArrayList<ArrayList<Integer>> list1 = new ArrayList<ArrayList<Integer>>();
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<Integer> java = new ArrayList<Integer>();
		ArrayList<Integer> oracle = new ArrayList<Integer>();
		ArrayList<Integer> html = new ArrayList<Integer>();
		ArrayList<Integer> jquery = new ArrayList<Integer>();
		ArrayList<Integer> jsp = new ArrayList<Integer>();
		ArrayList<Integer> scoresum = new ArrayList<Integer>();
		ArrayList<Float> scoreavg = new ArrayList<Float>();
		ArrayList<Integer> ranking = new ArrayList<Integer>();
		
		String[] students = {"오동규", "박제욱", "오제민", "전보영", "유지상", "박신규", "진주호", 
				"지원희", "한승희", "안정현", "이이슬", "이정은", "이선욱", "조건희", "최효은", "김혜정", 
				"김명성", "신유진", "조윤호", "조아라", "백운영", "최도혁", "김영호", "박희제", "현솔비"}; //선언과 초기화를 동시에 해야한다.
		
		for ( int i = 0; i<students.length; i++){
			name.add(students[i]);
			java.add((int)(Math.random() * 51) + 50);
			oracle.add((int)(Math.random() * 51) + 50);
			html.add((int)(Math.random() * 51) + 50);
			jquery.add((int)(Math.random() * 51) + 50);
			jsp.add((int)(Math.random() * 51) + 50);
			scoresum.add(java.get(i) + oracle.get(i) + html.get(i) + jquery.get(i) + jsp.get(i));
			avg = (float)scoresum.get(i) / 5;
			scoreavg.add(avg);
			ranking.add(1);
		}
		
		for (int i = 0; i < 25; i++){   
			for (int j = 0; j < 25; j++){
				if ( scoresum.get(i) < scoresum.get(j)){
					ranking.set(i, ranking.get(i)+1);
				} 
			}
		}
		
		for(int i = 0; i<name.size()-1; i++){
			for(int j = i+1; j<name.size(); j++){
				if(scoresum.get(i) < scoresum.get(j) ){
					int tmp = scoresum.get(i);
					scoresum.set(i, scoresum.get(j) );
					scoresum.set(j, tmp);
					
					String tmp1 = name.get(i);
					name.set(i, name.get(j) );
					name.set(j, tmp1);
					
					int tmp2 = java.get(i);
					java.set(i, java.get(j) );
					java.set(j, tmp2);
					
					int tmp3 = oracle.get(i);
					oracle.set(i, oracle.get(j) );
					oracle.set(j, tmp3);
					
					int tmp4 = html.get(i);
					html.set(i, html.get(j) );
					html.set(j, tmp4);
					
					int tmp5 = jquery.get(i);
					jquery.set(i, jquery.get(j) );
					jquery.set(j, tmp5);
					
					int tmp6 = jsp.get(i);
					jsp.set(i, jsp.get(j) );
					jsp.set(j, tmp6);
					
					float tmp7 = scoreavg.get(i);
					scoreavg.set(i, scoreavg.get(j) );
					scoreavg.set(j, tmp7);
					
					int tmp8 = ranking.get(i);
					ranking.set(i, ranking.get(j) );
					ranking.set(j, tmp8);
				}
			}
		}
		
		System.out.println("석차\t이름\tJava\tOracle\tHTML\tJQuery\tJSP\t총점\t평균");  // 맨 상단 출력
		for(int i = 0; i<name.size(); i++){
			System.out.print(ranking.get(i) + "\t");
			System.out.print(name.get(i) + "\t");
			System.out.print(java.get(i) + "\t");
			System.out.print(oracle.get(i) + "\t");
			System.out.print(html.get(i) + "\t");
			System.out.print(jquery.get(i) + "\t");
			System.out.print(jsp.get(i) + "\t");
			System.out.print(scoresum.get(i) + "\t");
			System.out.println(scoreavg.get(i) + "\t");
		}
	}
}