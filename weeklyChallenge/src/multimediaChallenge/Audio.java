package multimediaChallenge;

public  class Audio extends MultimediaPlayer {

	private int volume;
	private int duration;
	
	public Audio(String media_title, int media_duration, int media_volume) {
		super(media_title);
	    this.volume= media_volume;	
	    this.duration= media_duration;
	}

	public void getVolume() {
		System.out.print("Your video volume is currently set at: "+ volume + "\n");
	}
	
	public void setVolumeUp() {
		volume++; 
	}
	
	public void setVolumeDown() {
		if (volume > 0 ) {
			volume--;
		}
		else {
			System.out.println("Volume is set at minimun!");
		}
	}
	
	public int getDuration(){
		return duration;
	}
	
	public void Play() {
		
		for (int i = 0; i<duration; i++) {
			System.out.print(title );
		for(int j= 0; j<volume; j++ ) {
			System.out.print("!");
		} 
			System.out.print("\n");
		}			
	}
}
