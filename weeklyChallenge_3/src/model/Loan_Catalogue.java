package model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "loans_catalogue")
public class Loan_Catalogue {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private User utente;
	@ManyToOne
	private Archive loan;
	private LocalDate day_loan_start;
	private LocalDate day_loan_end_prevision;
	private LocalDate day_loan_end;

	public Loan_Catalogue() {
		super();
	}

	@Override
	public String toString() {
		return "Loan_Catalogue [utente=" + utente + ", loan=" + loan + ", day_loan_start=" + day_loan_start
				+ ", day_loan_end_prevision=" + day_loan_end_prevision + ", day_loan_end=" + day_loan_end + "]";
	}

	public Loan_Catalogue(User u, Archive a, LocalDate day_loan_start, LocalDate day_loan_end) {
		this.utente = u;
		this.loan = a;
		this.day_loan_start = day_loan_start;
		this.day_loan_end_prevision = day_loan_start.plusDays(30);
		this.day_loan_end = day_loan_end;

	}

}
