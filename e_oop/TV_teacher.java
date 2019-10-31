package e_oop;

public class TV_teacher {

	public static void main(String[] args) {
		TV_teacher tv = new TV_teacher("삼성");

		tv.power();
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeDown();
		tv.volumeDown();
		tv.volumeDown();
		tv.volumeDown();
		tv.volumeDown();
		tv.changeChannel(20);

	}
	boolean power;
	int channel; 
	int volume;
	String brand;

	final int MIN_CHANNEL = 1;
	final int MAX_CHANNEL = 100;
	final int MIN_VOLUME = 0;
	final int MAX_VOLUME = 10;

	TV_teacher(String brand){
		power = false; 
		channel = MIN_CHANNEL; 
		volume = 5;
		this.brand = brand;
	}
	
	void power(){
		power = !power;
		System.out.println(power ? "TV 켜짐" : "TV 꺼짐");
	}
	
	void changeChannel(int channel){
		if(power){
			if(MIN_CHANNEL <= channel && channel <= MAX_CHANNEL){
				this.channel = channel;
			}
			System.out.println("채널. " + this.channel);
		}
	}
	
	void channelUp(){
		changeChannel(channel +1);
	}

	void channelDown(){
		changeChannel(channel -1);
	}

	void volumeUp(){
		if(power){
			if(volume < MAX_VOLUME){
				volume++;
			}
			showVolume(volume);
		}
	}

	void volumeDown(){
		if(power){
			if(MIN_VOLUME < volume){
				volume--;
			}
		}
		showVolume(volume);
	}

	void showVolume(int volume){
		System.out.println("음량. ");
		for(int i = MIN_VOLUME + 1; i<=MAX_VOLUME; i++){
			if(i<=volume){
				System.out.print("■");
			} else{
				System.out.print("□");
			}
		}
		System.out.println();
	}
}

//과제. 클래스 하나로 간단한 프로그램을 만들어주세요.
//발표 : 프로그램 주제, 기능, 메서드 구성, 시연
