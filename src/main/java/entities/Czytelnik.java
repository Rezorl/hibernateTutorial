package entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Czytelnicy")
public class Czytelnik {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_czytelnika")
	private int id;
	private String login;
	private String haslo;
	private String email;
	private String telefon;
	@Column(name="data_urodzenia")
	private Date dataUrodzenia;
	
	public Czytelnik() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Czytelnik(int id, String login, String haslo, String email, String telefon, Date dataUrodzenia) {
		super();
		this.id = id;
		this.login = login;
		this.haslo = haslo;
		this.email = email;
		this.telefon = telefon;
		this.dataUrodzenia = dataUrodzenia;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public Date getDataUrodzenia() {
		return dataUrodzenia;
	}

	public void setDataUrodzenia(Date dataUrodzenia) {
		this.dataUrodzenia = dataUrodzenia;
	}

	@Override
	public String toString() {
		return "Czytelnik [id=" + id + ", login=" + login + ", haslo=" + haslo + ", email=" + email + ", telefon="
				+ telefon + ", dataUrodzenia=" + dataUrodzenia + "]";
	}
	
}

/*create table Czytelnicy(
		id_czytelnika INT PRIMARY KEY,
		login NVARCHAR(30) NOT NULL,
		haslo NVARCHAR(30) NULL,
		email NVARCHAR(30) NOT NULL,
		telefon NVARCHAR(30),
		data_urodzenia DATE NOT NULL
	);
*/