package persistency_day1;

import java.sql.SQLException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args)  {


	try {
		DBConnection firstTry= new DBConnection();
		//User user1= new User("Luca", "Forma", 32, "lucaforma14@gmail.com");
		//User user2= new User("Alberto", "Macis", 32, "macis@gmail.com");
		//User user3= new User("Kevin", "Fuccio", 32, "FuccioKevin90@gmail.com");
		//User user4= new User("Daniele", "Testi", 32, "Danytesti@gmail.com");
		//firstTry.createUser(user1);	//aggiunge un utente nel DB
		//firstTry.createUser(user2);	//aggiunge un utente nel DB
		//firstTry.createUser(user3);	//aggiunge un utente nel DB
		//firstTry.createUser(user4);	//aggiunge un utente nel DB
		//User readUser= firstTry.findUser(1l);
		//System.out.println(readUser);
		
		//readUser.setAge(33);
		//firstTry.updateUser(readUser);
		//firstTry.deleteUser(readUser);
		
		ArrayList<User> newList= firstTry.findAllUsers();
		newList.forEach(u->System.out.println(u));
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("Upload Stauts Failed");
	}	
		
	

	
	
		
	}

}
