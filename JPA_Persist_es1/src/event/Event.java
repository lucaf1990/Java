package event;
import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQuery(name="Event.findAll", query="SELECT e FROM Event e")
@Table(name = "event")
public class Event implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable = false)
	private String nome_evento;
	@Column(nullable = false)
	private String descrizione_evento;
	@Column(nullable = false)
	private String tipo_evento;
	@Column(nullable = false)
	private LocalDate data_evento;
	
	public Event() {}

	public Event (String nome_evento, String descrizione_evento,String tipo_evento,LocalDate data_evento) {

		setTipo_evento(tipo_evento);
		setNome_evento(nome_evento);
		setDescrizione_evento(descrizione_evento);
	    setData_evento(data_evento);
	}
	
	public String getNome_evento() {
		return nome_evento;
	}
	public void setNome_evento(String nome_evento) {
		this.nome_evento = nome_evento;
	}
	public String getDescrizione_evento() {
		return descrizione_evento;
	}
	public void setDescrizione_evento(String descrizione_evento) {
		this.descrizione_evento = descrizione_evento;
	}
	public String getTipo_evento() {
		return tipo_evento;
	}
	public void setTipo_evento(String tipo_evento) {
		this.tipo_evento = tipo_evento;
	}
	public LocalDate getData_evento() {
		return data_evento;
	}
	public void setData_evento(LocalDate data_evento) {
		this.data_evento = data_evento;
	}
	public Integer getId() {
		return id;
	}
	@Override
	public String toString() {
		return "MainEvento [id=" + id + ", nome_evento=" + nome_evento + ", descrizione_evento=" + descrizione_evento
				+ ", tipo_evento=" + tipo_evento + ", data_evento=" + data_evento + "]";
	}
	
	
	
	
}
