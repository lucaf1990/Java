package student;


import java.time.LocalDate;



public class Student {
	private Long id;
    private String name;
    private String lastname;
    private String gender;
    
	private LocalDate birthdate;
    private  double avg;
    private double min_vote;
    private double max_vote;
    @Override
    public String toString() {
        return "studenti [id=" + id + ", name=" + name + ", lastname=" + lastname + ", gender=" + gender
                + ", birthdate=" + birthdate + ", avg=" + avg + ", min_vote=" + min_vote + ", max_vote=" + max_vote
                + "]";
    }
	public Student(Long id, String name, String lastname, String gender, LocalDate birthdate, double avg,
			double min_vote, double max_vote) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.gender = gender;
		this.birthdate = birthdate;
		this.avg = avg;
		this.min_vote = min_vote;
		this.max_vote = max_vote;
	}
	public Student( String name, String lastname, String gender, LocalDate birthdate, 
			double min_vote, double max_vote) {
		super();
		
		this.name = name;
		this.lastname = lastname;
		this.gender = gender;
		this.birthdate = birthdate;
		this.avg = (min_vote+max_vote)/2;
		this.min_vote = min_vote;
		this.max_vote = max_vote;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public double getMin_vote() {
		return min_vote;
	}
	public void setMin_vote(double min_vote) {
		this.min_vote = min_vote;
	}
	public double getMax_vote() {
		return max_vote;
	}
	public void setMax_vote(double max_vote) {
		this.max_vote = max_vote;
	}
	public Long getId() {
		return id;
	}
    

}
