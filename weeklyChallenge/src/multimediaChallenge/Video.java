package multimediaChallenge;

public class Video extends MultimediaPlayer {
	private int volume;
	private int luminosity;
	private int duration;
	public Video(String media_title, int media_duration, int media_volume, int media_luminosity ) {
		super(media_title);
		this.duration= media_duration;
		this.volume= media_volume;
		this.luminosity= media_luminosity;
		
	}
	public void getVolume() {
		
		System.out.print("Your video volume is currently set at: "+ volume + "\n");
	}
	public void setVolumeUp() {
		volume++; 
		System.out.print("Your video volume is currently set at: "+ volume + "\n");
	}
	public void setVolumeDown() {
		if (volume > 0 ) {
			volume--;
			System.out.print("Your video volume is currently set at: "+ volume + "\n");
		}
		else {
			System.out.println("Volume is set at minimun!");
		}
	}
	public int getLuminosity() {
		return luminosity;
	}
	public void setLuminosityDown() {
		if(luminosity >0) {
			luminosity--;
		}
	}
	public void setLuminosityUp() {
		luminosity++;
	}
	public int getDuration(){
		return duration;
	}
	public void Play() {
		System.out.println(title + " ");
		System.out.println(volume + " ");		
		System.out.println(duration + " ");
		System.out.println(" ");
		
		for (int i = 0; i<duration; i++) {
			System.out.print(title );
		for(int j= 0; j<volume; j++ ) {
			System.out.print("!");
			
		  } for(int x= 0; x<luminosity; x++) {
				System.out.print("*");
		    }
		System.out.print("\n");
		}		
	}
}
