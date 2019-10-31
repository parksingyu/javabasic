import java.util.ArrayList;

public class exam2 {

	public static void main(String[] args) {
		ArrayList<String> nick = new ArrayList<String>();
		
		String ln = null;
		
		nick.add("제일로");
		nick.add("제일로다가긴친구들");
		nick.add("제일로다가긴친구");
		nick.add("제일로다가긴친구들일거임");
		nick.add("제일로다가긴친구들일거임그치");
		nick.add("제일");
		nick.add("제일로다가긴");
		nick.add("제일로다가");

		ln = nick.get(0);
		for(int i=0; i<nick.size()-1; i++) {
			if ( ln.length() < nick.get(i+1).length()) {
				ln = nick.get(i+1);
			}
		}
		System.out.println(ln);
	}
}