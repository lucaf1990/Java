package multimediaChallenge;

public class Image extends MultimediaPlayer{
private int luminosity;
	
	public Image(String media_title, int image_luminosity) {
		super(media_title);
		this.luminosity = image_luminosity;
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
	
	public void Show() {
		System.out.print(title);
		for(int i=0; i<luminosity; i++) {
			System.out.print( "*");
		}
		
	}
}
