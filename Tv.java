import java.util.Scanner;


public class Tv {

	public static void main(String[] args) {
		Tv tv = new Tv();
		
		int a = 20, b=40, c=60;
		
		Scanner sc = new Scanner(System.in);
		
		tv.volumeUp();
		tv.power();
		tv.volumeUp();
		tv.volumeDown();
		tv.volumeDown();
		tv.volumeDown();
		tv.volumeDown();
		tv.volumeDown();
		tv.channelDown();
		System.out.println(tv.channel);
		tv.channelDown();
		tv.channelDown();
		
		Tv tv2 = new Tv(20, 70);
		tv2.status();
		
		Tv tv3 = new Tv(40, 60);
		tv3.status();
	}
	
	

	boolean power;
	int volume;
	int channel;
	
	int a = 100, b = 200, c = 300;
	
	final int MAX_VOLUME = 100;
	final int MAX_CHANNEL = 100;
	final int MIN_VOLUME = 0;
	final int MIN_CHANNEL = 0;
	
	Tv(){
		this.power = false;
		this.volume = 10;
		this.channel = 10;
	}
	
	Tv(int a, int b){
		this.channel = a;
		this.volume = b;
	}
	
	void stest(){
		System.out.println(" a : " + a);
		System.out.println(" b : " + b);
		System.out.println(" c : " + c);
	}
	
	void power(){
		power = !power;
		if (power){
			System.out.println("현재 전원 상태 : 켜짐");
		} else {
			System.out.println("현재 전원 상태 : 꺼짐");
		}
	}
	
	void volumeUp(){
		if(power && MAX_VOLUME > volume){
			volume++;
		}
		if (power && MAX_VOLUME < volume){
			volume = 100;
		}
		System.out.println("현재 볼륨 : " + volume);
	}
	
	void volumeDown(){
		if (power && MIN_VOLUME < volume){
			volume--;
		} 
		if(power && MIN_VOLUME > volume){
			volume = MIN_VOLUME;
		}
		System.out.println("현재 볼륨 : " + volume);
	}
	
	void channelUp(){
		if(power && MAX_CHANNEL > channel){
			channel++;
		}
		if(power && MAX_CHANNEL < channel){
			channel = MAX_CHANNEL;
		}
		System.out.println("현재 채널 : " + channel);
	}
	
	void channelDown(){
		if(power && MIN_CHANNEL < channel){
			channel--;
		}
		if(power && MIN_CHANNEL > channel){
			channel = MIN_CHANNEL;
		}
		System.out.println("현재 채널 : " + channel);
	}
	
	void channelChange(int channel){
		
		if (channel > MAX_CHANNEL){
			channel = MAX_CHANNEL;
		} else if (channel < MIN_CHANNEL){
			channel = MIN_CHANNEL;
		}
		System.out.println("현재 채널 : " + channel);
	}
	
	void status(){
		System.out.println("현재 채널 : " + channel);
		System.out.println("현재 볼륨 : " + volume);
	}
}
