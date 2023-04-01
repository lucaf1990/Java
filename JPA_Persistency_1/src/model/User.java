package model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "users_jpa")
@NamedQuery(name = "User.findAll", query = "SELECT u from User u ")
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user")
	private Long id_user;
	@Column(nullable = false)
	private String name_user;
	@Column(nullable = false)
	private String lastname_user;
	@Column(nullable = false, unique = true)

	private String email_user;

	public String getName_user() {
		return name_user;
	}

	public void setName_user(String name_user) {
		this.name_user = name_user;
	}

	public String getLastname_user() {
		return lastname_user;
	}

	public void setLastname_user(String lastname_user) {
		this.lastname_user = lastname_user;
	}

	public String getEmail_user() {
		return email_user;
	}

	public void setEmail_user(String email_user) {
		this.email_user = email_user;
	}

	public Long getId_user() {
		return id_user;
	}

	@Override
	public String toString() {
		return "User [id_user=" + id_user + ", name_user=" + name_user + ", lastname_user=" + lastname_user
				+ ", email_user=" + email_user + "]";
	}

}