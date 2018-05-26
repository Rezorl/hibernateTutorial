package entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Stanowiska")
public class Stanowisko {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_stanowiska")
	private int id;
	private String nazwa;
	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="id_stanowiska")
	private List<Pracownik> pracownik;
	public Stanowisko() {
		super();
	}

	public Stanowisko(int id, String nazwa, List<Pracownik> pracownik) {
		super();
		this.id = id;
		this.nazwa = nazwa;
		this.pracownik = pracownik;
	}

	public List<Pracownik> getPracownik() {
		return pracownik;
	}

	public void setPracownik(List<Pracownik> pracownik) {
		this.pracownik = pracownik;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	@Override
	public String toString() {
		return "Stanowisko [id=" + id + ", nazwa=" + nazwa + "]";
	}
}
