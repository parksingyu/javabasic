package c_statement;
import java.util.Scanner;

public class baseball {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int ss = 0; 
		int bb = 0;
		int oo = 0;
		int a1 = (int) (Math.random() * 9) + 1;
		int a2 = (int) (Math.random() * 9) + 1;  
		int a3 = (int) (Math.random() * 9) + 1;
		
		System.out.print(a1);  // 첫번째 값 입력
		
		while (true){
			if (a1 == a2){
				a2 = (int) (Math.random() * 9) + 1;
			} else if ( a1 != a2){
				break;
			}
		}
		System.out.print(a2); // 두번째 값 입력
		
		while (true){
			if (a1 == a3 || a2 == a3 ){
				a3 = (int) (Math.random() * 9) + 1;
			} else {
				break;
			}
		}
		
		
		System.out.println(a3); // 세번째 값 입력
		
		while( ss != 3){
			ss = 0; 
			bb = 0;
			oo = 0;
			System.out.println("3자리 숫자를 입력해주세요.");
			int dan = Integer.parseInt(s.nextLine());
			
			if ( dan / 100 == a1){
				ss = ss+1;
			} else if ( (dan / 10) % 10 == a1){
				bb = bb + 1 ;
			} else if ( (dan % 10) == a1){
				bb = bb + 1;
			} else {
				oo = oo + 1;
			}
			
			if ( dan / 100 == a2){
				bb = bb + 1 ;
			} else if ( (dan / 10) % 10 == a2){
				ss = ss+1;
			} else if ( (dan % 10) == a2){
				bb = bb + 1;
			} else {
				oo = oo + 1;
			}
			
			if ( dan / 100 == a3){
				bb = bb + 1 ;
			} else if ( (dan / 10) % 10 == a3){
				bb = bb + 1;
			} else if ( (dan % 10) == a3){
				ss = ss+1;
			} else {
				oo = oo + 1;
			}
			System.out.println(ss+" 스트라이크");
			System.out.println(bb+" 볼");
			System.out.println(oo+" 아웃");
		}
	}
}