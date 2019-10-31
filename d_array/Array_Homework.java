package d_array;
public class Array_Homework {
	public static void main(String[] args) {
		int random;
		int[] count;
		count = new int[10];
		for (int i = 0; i<500; i++){                     // 500번 도는 반복문 생성
			random = (int) (Math.random() * 10)+ 1;      // 1~10 사이 랜덤수 출력
			for (int j = 0; j<=9; j++){                  
				if (random == j+1){                      // random의 값이 j+1이라면
					count [j] = count [j] + 1;           // 숫자의 갯수를 count[i]에 저장
				}
			}
		}
		for(int i = 0; i<count.length; i++){
			System.out.println(i+1 + "의 갯수 : " + count[i]);
		}
//		//선생님 방법
//		int []counts = new int[10];
//		
//		for (int i = 0 ; i<500; i++){
//			int random = (int) (Math.random() * 10)+ 1;
//			counts [random -1]++;
//		}
//		for(int i = 0; i<counts.length; i++){
//			System.out.println(i+1 + "의 갯수 : " + counts[i]);
//		}
	}
}