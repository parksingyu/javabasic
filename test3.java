import java.util.ArrayList;
import java.util.Random;


public class test3 {
	public static void main(String[] args) {
		
		ArrayList<Integer> java = new ArrayList<Integer>();
		ArrayList<Integer> java2 = new ArrayList<Integer>();
		
		int a, b;
		for (int i =0 ; i<25; i++){
			Random r = new Random();
			a = r.nextInt(10)+1;
			System.out.print(a + " ");
		}
		System.out.println(" ");
		
		for (int i =0 ; i<25; i++){
			Random r = new Random();
			b = r.nextInt(10);
			System.out.print(b + " ");
		}
		System.out.println(" ");
		
		
		//java.add((int)(Math.random() * 51) + 50 );
		
		for(int i = 0; i<25; i++){
			java.add((int)(Math.random() * 10)   ); // 0.5 - > 1.5
		}
		System.out.println(java);
		
		for(int i = 0; i<25; i++){
			java2.add((int)(Math.random() * 10) +1   ); // 0.5 - > 1.5
		}
		System.out.println(java2);
	}
}