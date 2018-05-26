package dao;

import java.util.List;

import org.hibernate.SessionFactory;

import entities.Czytelnik;
import entities.Gatunek;
import entities.Pracownik;
import entities.Stanowisko;
import utils.HibernateUtil;

public class GatunekDAO {
	private SessionFactory sessionFactory;
	
	public GatunekDAO() {
		sessionFactory = HibernateUtil.getSessionFactory();
	}

	public void dodajGatunek(Gatunek a) {
		try {
			if (!sessionFactory.getCurrentSession().getTransaction().isActive()) {
				sessionFactory.getCurrentSession().getTransaction().begin();
			}
			sessionFactory.getCurrentSession().save(a);
			sessionFactory.getCurrentSession().getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			sessionFactory.getCurrentSession().getTransaction().rollback();
		}
	}
	
	public List<Gatunek> wezGatunki(){
		try {
			if(!sessionFactory.getCurrentSession().getTransaction().isActive()) {
				sessionFactory.getCurrentSession().getTransaction().begin();
			}
			return sessionFactory.getCurrentSession().createCriteria(Gatunek.class).list();
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Czytelnik> wezCzytelnikow(){
		try {
			if(!sessionFactory.getCurrentSession().getTransaction().isActive()) {
				sessionFactory.getCurrentSession().getTransaction().begin();
			}
			return sessionFactory.getCurrentSession().createCriteria(Czytelnik.class).list();
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Stanowisko> wezStanowiska(){
		try {
			if(!sessionFactory.getCurrentSession().getTransaction().isActive()) {
				sessionFactory.getCurrentSession().getTransaction().begin();
			}
			return sessionFactory.getCurrentSession().createCriteria(Stanowisko.class).list();
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Pracownik> wezPracownikow(){
		try {
			if(!sessionFactory.getCurrentSession().getTransaction().isActive()) {
				sessionFactory.getCurrentSession().getTransaction().begin();
			}
			return sessionFactory.getCurrentSession().createCriteria(Pracownik.class).list();
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
