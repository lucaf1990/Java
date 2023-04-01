package gestioneDB;

import java.sql.SQLException;

import java.text.*;
import java.time.LocalDate;

import Connector.DBconnection;
import student.Student;
public class GestioneDB {

	public static void main(String[] args) throws ParseException {
		
		
		
		try {
			DBconnection myconn= new DBconnection();
			myconn.createStudentsTable();
			
			
			Student student_1 = new Student("Luca", "Forma", "Male", LocalDate.of(1990, 06, 11), 9.2, 8.4);
			Student student_2 = new Student("Kevin", "Fuccio", "Male", LocalDate.of(2002, 07, 07), 9.2, 8.4);
			Student student_3 = new Student("Alberto", "Macis", "Male", LocalDate.of(1992, 01, 13), 9.2, 8.4);
			Student student_4 = new Student("Daniele", "Testi", "Male", LocalDate.of(1998, 10, 22), 9.2, 8.4);
			myconn.createStudents(student_2);
			myconn.createStudents(student_3);
			myconn.createStudents(student_4);
				
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
		
	}

}
