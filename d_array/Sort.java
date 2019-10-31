package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		/*
		 * << 정렬 >>
		 * - 선택정렬 : 첫번째 숫자부터 그 뒤의 모든 숫자들과 비교해서
		 *   작은수와 자리 바꾸기를 반복해 앞에서부터 작은수를 채워나가는 방식
		 * - 버블정렬 : 첫번째 숫자부터 바로 뒷 숫자와 비교해서
		 *   작은수와 자리바꾸기를 반복해 뒤에서부터 큰수를 채워나가는 방식
		 * - 삽입정렬 : 두번째 숫자부터 그 앞의 모든 숫자들과 비교해서
		 *   큰수들을 뒤로 밀고 중간에 삽입하는 방식
		 * - 석차구하기 : 모든 점수가 1등으로 시작해서 다른 점수들과 비교해
		 *   자신의 점수가 작으면 1씩 증가시키는 방식
		 */

		int[] numbers = new int[10];

		for (int i = 0; i<numbers.length; i++){
			numbers[i] = i +1;
		}

		shuffle(numbers);
		System.out.println(Arrays.toString(numbers));

//		printRank(numbers); //석차구하기
//		selectSort(numbers); //선택 정렬
//		bubbleSort(numbers); //버블정렬
		insertSort(numbers);
		System.out.println(Arrays.toString(numbers));
	}

	private static void insertSort(int[] numbers) {
		/*
		 * 1,0
		 * 2,1 2,0
		 * 3,2 3,1 3,0
		 * 4,3 4,2 4,1 4,0
		 * 5,4 5,3 5,2 5,1 5,0
		 */
		for (int i = 1; i<numbers.length; i++){
			int temp = numbers[i];
			int j = 0;
			for (j = i-1; j >= 0; j--){
				if (temp < numbers[j]){
					numbers[ j + 1 ] = numbers [j];
					System.out.println("numbers["+j + "]를(을) " +"numbers[" +(j+1) + "]에 붙여넣기 합니다." );
					System.out.println(Arrays.toString(numbers));
				} else {
					break;
				}
			}
			
			System.out.print("               j = " + j);
			numbers[j + 1] = temp;
			System.out.print(" "+i+"회 섞기 완료 ----------->");
			System.out.println(Arrays.toString(numbers));
		}
	}
	private static void bubbleSort(int[] numbers) {
		for (int i = 0; i<numbers.length; i++){               // 10개의 값을 찍어주는 반복문
			boolean changed = false;
			for (int j = 0 ; j < numbers.length-(i+1); j++){  // 0~9, 0~8, 0~7  
				if(numbers[j] > numbers[j+1]){                  // 
					int tmp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = tmp;
					changed = true;
				}
			}
			if(!changed){
				break;
			}
		}
	}
	private static void selectSort(int[] numbers) {
		/*
		 *  0,1 0,2 0,3 0,4 0,5 0,6 0,7 0,8 0,9 
		 *  1,2 1,3 1,4 1,5 1,6 1,7 1,8 1,9
		 *  2,3 2,4 2,5 2,6 2,7 2,8 2,9 
		 *   
		 */

		for (int i = 0; i < numbers.length-1; i++){
			for (int j = i+1; j < numbers.length; j++){
				if (numbers[i] > numbers[j]){
					int tmp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = tmp;
				}
			}
		}
	}
	
	private static void printRank (int[] numbers){
		//정수의 갯수만큼 등수를 채울 배열을 선언 및 초기화 한다.
		int[] rank = new int[numbers.length];

		//등수의 배열을 1로 채운다.
		for (int i = 0; i<rank.length; i++){
			rank[i] = 1;
		}

		//모든 정수를 비교할 수 있는 반복문을 만든다.
		for (int i = 0; i < numbers.length; i++){
			for (int j = 0; j < numbers.length; j++){
				//등수를 구할 정수보다 큰 정수가 있는 경우
				if(numbers[i] < numbers[j]){
					//등수를 1증가시킨다.
					rank[i]++;
				}
			}
		}
		//결과를 출력한다
		for(int i = 0; i < numbers.length; i++){
			System.out.println(numbers[i] + " : " + rank[i] + "등");
		}
	}

	private static void shuffle(int[] numbers){
		for (int i=0; i<numbers.length; i++){
			int random = (int) (Math.random() * numbers.length);
			int temp = numbers[0];
			numbers[0] = numbers[random];
			numbers[random] = temp;
		}
	}
}