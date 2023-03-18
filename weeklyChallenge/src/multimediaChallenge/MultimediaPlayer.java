package multimediaChallenge;

public abstract class MultimediaPlayer {

	public String title;
		
public MultimediaPlayer(String media_title){
	this.title= media_title;
}
		
 String getTitle() {
	return title;
}	
}
