package model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Entity
@Table(name = "users")
public class User {

	public User(String name, String surname, LocalDate dateOfBirth) {

		this.name = name;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
	}

	public User() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long membership_number;
	private String name;
	private String surname;
	private LocalDate dateOfBirth;

	@Override
	public String toString() {
		return "User [name=" + name + ", surname=" + surname + ", dateOfBirth=" + dateOfBirth + ", membership_number="
				+ membership_number + "]";
	}

}
