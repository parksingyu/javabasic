package d_array;

import java.util.Arrays;

public class Score {

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

		String[] students = {"오동규", "박제욱", "오제민", "전보영", "유지상", "박신규", "진주호", 
				"지원희", "한승희", "안정현", "이이슬", "이정은", "이선욱", "조건희", "최효은", "김혜정", 
				"김명성", "신유진", "조윤호", "조아라", "백운영", "최도혁", "김영호", "박희제", "현솔비"}; //선언과 초기화를 동시에 해야한다.
		int[] rank = new int[students.length];
		int[][] scores = new int[25][5]; // int[학생수][과목수]
		int[] sum = new int[scores.length]; // 합계
		double[] avg = new double[scores.length]; // 평균
		

		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j < scores[i].length; j++){
				scores[i][j] = (int)(Math.random() * 51) + 50;
			}
		}

		for (int i = 0; i < scores.length; i++){
			for (int j = 0; j < scores[i].length; j++){
				sum[i] = sum[i] + scores[i][j];
			}
			avg[i] = (double)sum[i] / scores[i].length; // 평균 구하기
		}

		for (int i = 0 ; i<rank.length; i++){
			rank[i] = 1; 
		}

		for (int i = 0; i < rank.length; i++){   
			for (int j = 0; j < rank.length; j++){ 
				if ( sum[i] < sum[j]){
					rank[i] = rank[i] + 1;
				} 
			}
		}

		for (int i = 0; i < rank.length-1; i++){
			for(int j= i+1; j<rank.length; j++){
				if ( rank[i] > rank[j]){
					int tmp = rank[i];
					rank[i] = rank[j];
					rank[j] = tmp;
				}
			}
		}  // 랭크 정렬

		for ( int i = 0; i < students.length; i++){
			for (int j = 0; j<students.length-1; j++){
				if (sum[i] > sum[j]){
					String tmp = students[i];
					students[i] = students[j+1];
					students[j+1] = tmp;
				}
			}
		} // 이름 정렬

		for (int i = 0; i < sum.length-1; i++){
			for(int j= i+1; j<sum.length; j++){
				if ( sum[i] < sum[j]){
					int tmp = sum[i];
					sum[i] = sum[j];
					sum[j] = tmp;

					int[] tmp1 = scores[i];
					scores[i] = scores[j];
					scores[j] = tmp1;
				}
			}
		}  // 합계 정렬

		for (int i = 0; i < avg.length-1; i++){
			for(int j= i+1; j<avg.length; j++){
				if ( avg[i] < avg[j]){
					double tmp = (double)avg[i];
					avg[i] = avg[j];
					avg[j] = tmp;
				}
			}
		}  // 평균 정렬

		System.out.println("석차\t이름\tJava\tOracle\tHTML\tJQuery\tJSP\t총점\t평균");  // 맨 상단 출력

		for ( int i=0; i < scores.length; i++){
			System.out.print(rank[i]+"\t");    // 이름 출력
			System.out.print(students[i]+"\t");    // 이름 출력
			for(int j = 0; j < scores[j].length; j++){
				System.out.print(scores[i][j]+"\t");  //점수 출력
			}
			System.out.println(sum[i] + "\t" + avg[i]);  // 합계, 평균 출력
		}
	}
}