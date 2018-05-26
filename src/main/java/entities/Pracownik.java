package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="Pracownicy")
public class Pracownik {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_pracownika")
	private int id;
	private String login;
	private String haslo;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_stanowiska")
	private Stanowisko stanowisko;
	public Pracownik() {
		super();
	}
	
	public Pracownik(int id, String login, String haslo, Stanowisko stanowisko) {
		super();
		this.id = id;
		this.login = login;
		this.haslo = haslo;
		this.stanowisko = stanowisko;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getHaslo() {
		return haslo;
	}
	public void setHaslo(String haslo) {
		this.haslo = haslo;
	}
	
	public Stanowisko getStanowisko() {
		return stanowisko;
	}
	public void setStanowisko(Stanowisko stanowisko) {
		this.stanowisko = stanowisko;
	}
	@Override
	public String toString() {
		return "Pracownik [id=" + id + ", login=" + login + ", haslo=" + haslo + " stanowisko=" + stanowisko + "]";
	}
	
}
