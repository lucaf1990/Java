package Connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import student.Student;

public class DBconnection {

	private String url="jdbc:postgresql://localhost:5432/";
	private String dbName="ES_1"; // nome databse 
	private String userName="postgres"; // 
	private String password="24122005"; // 
	Statement st;
	

	public  DBconnection() throws SQLException {
		
	Connection conn =	DriverManager.getConnection(url+dbName, userName,password);
	 st=conn.createStatement(); //ritorna uno statment un oggetto di tipo connection
	//sulla quale posso far passare le info e modificarle, cancellarle
	 createStudentsTable();
	}
	
	public void createStudentsTable() throws SQLException {
		String sql= "CREATE TABLE IF NOT EXISTS Students("
				+ "id_user SERIAL PRIMARY KEY,"
				+ "name VARCHAR NOT NULL,"
				+ "lastName VARCHAR NOT NULL,"
				+ "gender VARCHAR NOT NULL,"
				+ "birthdate DATE NOT NULL,"
				+ "avg DECIMAL NOT NULL,"
				+ "min_vote DECIMAL NOT NULL,"
				+ "max_vote DECIMAL NOT NULL)";
		
	 this.st.executeUpdate(sql);
	
	}

	public void createStudents(Student s) throws SQLException {
	 
	 String sql= "INSERT INTO Students ( name,lastName,gender,birthdate,avg,min_vote,max_vote) "
				+ "VALUES ('"+s.getName()+"', '"+s.getLastname()+"',  '"+s.getGender()+"','"+s.getBirthdate()+"', '"+s.getMax_vote()+ "', '"+s.getAvg()+"', '"+s.getMin_vote()+"' )";
		this.st.executeUpdate(sql);
	 
	 }
	 
	
	
	
}
