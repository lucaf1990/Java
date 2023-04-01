package persistency_day1;


public class User {

	
	private Long id;
	private String name;
	private String surname;
	private Integer age; 
	private String email; 
	
	
	// con il private - principio di incapsulamento
	// con il private proteggiamo i dati 
	
	
	
	public User (String name, String surname, Integer age,String email) {
		super();
		this.name=name;
		this.surname=surname;
		this.age=age;
		this.email=email;
	}
	
	public User (Long id,String name, String surname, Integer age,String email) {
		super();
		this.id=id;
		this.name=name;
		this.surname=surname;
		this.age=age;
		this.email=email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", surname=" + surname + ", age=" + age + ", email=" + email + "]";
	}
	
	
	
}
