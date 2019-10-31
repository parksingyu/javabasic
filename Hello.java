import java.util.ArrayList;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
		ArrayList<String> name = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("이름을 입력하세여");
		String s1 = sc.nextLine();
		name.add(s1);
		//System.out.println("이름을 입력하세여");
		String s2 = sc.nextLine();
		name.add(s2);
		//System.out.println("이름을 입력하세여");
		String s3 = sc.nextLine();
		name.add(s3);
		//System.out.println("이름을 입력하세여");
		String s4 = sc.nextLine();
		name.add(s4);
		//System.out.println("이름을 입력하세여");
		String s5 = sc.nextLine();
		name.add(s5);
		System.out.println(name);
		System.out.println("\n\n");
		for(int i =0; i<name.size(); i++) {
			String a = name.get(i).substring(0,1);
			String b = "김";
			if(a.equals(b)) {
				System.out.println(name.get(i));
			}
		}
	}
}

