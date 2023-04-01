package persistency_day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBConnection {

	//classe per sfruttare il drivere jdcb per connettertmi al database 
	
	private String url="jdbc:postgresql://localhost:5432/";
	private String dbName="JDBC_JAVA_1_MyDatabase"; // nome databse 
	private String userName="postgres"; // 
	private String password="24122005"; // 
	Statement st;
	/*try {
	DriverManager.getConnection(url+dbName, userName,password);
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	*/	
		
	
	public  DBConnection() throws SQLException {
		
	Connection conn =	DriverManager.getConnection(url+dbName, userName,password);
	 st=conn.createStatement(); //ritorna uno statment un oggetto di tipo connection
	//sulla quale posso far passare le info e modificarle, cancellarle
	 createTableUsers();
	}
	
	//ritorna un oggetto di tipo connection 
	
		//dobbiamo dirgli come comportarsi in caso di errore
		//quando ci connettiamo o accediamo ad una risorsa esterna
		//il try and catch throw the exceptions in caso la risorsa esterna 
		//non sia disponibile, Java non riesce a controllare le risorse esterne 
		//oppure posso usare il throws la rimando a dopo dico a Java so che puo 
		//succedere qualcosa ma la gestirò al momento ion cui credo l'oggetto 
	
	public void createTableUsers() throws SQLException {
		String sql= "CREATE TABLE IF NOT EXISTS Users("
				+ "id_user SERIAL PRIMARY KEY,"
				+ "name VARCHAR NOT NULL,"
				+ "surname VARCHAR NOT NULL,"
				+ "age INT2 NOT NULL,"
				+ "email VARCHAR NOT NULL UNIQUE)";
		
		//PER ESEGUIRE LA STRINGA DEVO PRENDERE IL MIO OGGETTO ST
	 this.st.executeUpdate(sql);
		
	}
	
	public void createUser(User u) throws SQLException {
		String sql = "INSERT INTO Users (name,surname,age,email) "
				+ "VALUES ('"+u.getName()+"', '"+u.getSurname()+"', "+u.getAge()+", '"+u.getEmail()+"')";
		this.st.executeUpdate(sql);
	}

	public 	User findUser(Long id) throws SQLException {
		User user_1 = null;
		String sql="SELECT * FROM Users WHERE id_user =" + id;
		ResultSet myRes=this.st.executeQuery(sql);
		if(myRes.next()) {
			Long idUser= myRes.getLong("id_user");
			String name= myRes.getString("name");
			String surname= myRes.getString("surname");
			int age= myRes.getInt("age");
			String email= myRes.getString("email");
			
			user_1= new User(idUser, name, surname, age, email);
			
		}
		return user_1;
	} 	
	
	public void updateUser(User u) throws SQLException {
		String sql= "UPDATE Users "
				+ " SET name='"+u.getName()+"', surname='"+u.getSurname()+"', age='"+u.getAge()+"', email= '"+u.getEmail()+"' "
				+ "WHERE id_user=  "+ u.getId();
		
		this.st.executeUpdate(sql);
	}
	
	
	public void deleteUser(User u) throws SQLException {
		String sql = "DELETE FROM Users WHERE id_user = " + u.getId();
		this.st.executeUpdate(sql);
		System.out.println("Utente eliminato!!!");
	}
	
	
	public ArrayList<User> findAllUsers() throws SQLException {
		ArrayList<User> users= new ArrayList<User>();
		String sql="SELECT * FROM Users";
		ResultSet myRes=this.st.executeQuery(sql);
		while(myRes.next()) {
			Long idUser= myRes.getLong("id_user");
			String name= myRes.getString("name");
			String surname= myRes.getString("surname");
			int age= myRes.getInt("age");
			String email= myRes.getString("email");
			System.out.print(myRes);
			User user_1= new User(idUser, name, surname, age, email);
			users.add(user_1);
			
		}
		System.out.println("Users");
		return users;
	
	}
	
	
}
