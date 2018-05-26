package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Gatunki")
public class Gatunek {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_gatunku")
	private int id;
	private String nazwa;
	
	public Gatunek(int id, String nazwa) {
		super();
		this.id = id;
		this.nazwa = nazwa;
	}
	public Gatunek() {
		super();
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
		return "Gatunek [id=" + id + ", nazwa=" + nazwa + "]";
	}
	
}
