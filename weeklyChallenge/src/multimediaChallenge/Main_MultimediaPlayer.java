package multimediaChallenge;

import java.util.Scanner;

public class Main_MultimediaPlayer {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {

		MultimediaPlayer[] myPlayer = new MultimediaPlayer[2];
		
		for(int i = 0; i <myPlayer.length; i++){
			System.out.println(" Pick something to continue..." + "\n" +"Press 1 for Image" + "\n" + "Press 2 for Audio"+ "\n"+
								"Press 3 for Video" +"\n");
			
			int userImput= scanner.nextInt();
			scanner.nextLine();
			
			switch(userImput) {
			
			case 1:
				System.out.println("Pick a Title for your Image" + "\n");	
				String title= scanner.nextLine();
				
				System.out.println("Pick the screen Luminosity" + "\n");	
				int luminosity= scanner.nextInt();
				
				scanner.nextLine();
				
				myPlayer[i]= new Image(title, luminosity );
			break;
				
				
			case 2:
				System.out.println("Pick a Title for your Audio" + "\n");	
				title= scanner.nextLine();
				
				System.out.println("Pick your Volume " + "\n");	
				int volume= scanner.nextInt();
				
				scanner.nextLine();
				
				System.out.println("Pick the Duration " + "\n");	
				int durata= scanner.nextInt();
				scanner.nextLine();
				
				myPlayer[i]= new Audio(title, volume, durata );
			break;
			
				
			case 3: 
				System.out.println("Pick a Title for your Video" + "\n");	
				title= scanner.nextLine();
				
				System.out.println("Pick your Volume " + "\n");	
				volume= scanner.nextInt();
				
				scanner.nextLine();
				
				System.out.println("Pick the Duration " + "\n");	
				durata= scanner.nextInt();
				scanner.nextLine();
				System.out.println("Pick the screen Luminosity" + "\n");	
				luminosity= scanner.nextInt();
				
				scanner.nextLine();
				
				myPlayer[i]= new Video(title, volume, durata, luminosity );
			break;
				
				
			default:
					System.out.println("Error - Chose a number between 1 to 3");
				i--;	
			break;
			}
		}	
		
		int userChoice= -1;
		
		while (userChoice != 0) {
			System.out.println("\n" + "Which media do you want to play? -  Press 0 to Exit");
			
			userChoice= scanner.nextInt();	
			
			if(userChoice>=1&& userChoice<=5) {
				MultimediaPlayer myplay= myPlayer[userChoice-1];
				
				if(myplay instanceof Audio) {
					((Audio) myplay).Play();}
				else if(myplay instanceof Video) {
					((Video) myplay).Play();
				}
				else if(myplay instanceof Image) {
					((Image) myplay).Show();
				}
				else {
					System.out.println("This media is not valid");
				} 
				
		}   else {
				System.out.println("Thanks! See you next!");
				scanner.close();
			} 	
		}		
	}
}
