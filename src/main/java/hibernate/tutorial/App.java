package hibernate.tutorial;

import dao.GatunekDAO;
import entities.Czytelnik;
import entities.Gatunek;
import entities.Pracownik;
import entities.Stanowisko;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		GatunekDAO gatunekDAO = new GatunekDAO();
		/*
		 * AutorDAO autorDao = new AutorDAO(); Autor r = new Autor(); r.setImie("dupa");
		 * autorDao.dodajAutora(r);
		 */

/*		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();

		a1.setImie("dupa");
		sessionFactory.getCurrentSession().getTransaction().begin();
		sessionFactory.getCurrentSession().save(a1);
		sessionFactory.getCurrentSession().getTransaction().commit();

		session.close();
		sessionFactory.close();*/
		
		for(Gatunek g : gatunekDAO.wezGatunki()) {
			System.out.println(g);
		}
		
		for(Stanowisko g : gatunekDAO.wezStanowiska()) {
			for(Pracownik p : g.getPracownik()) {
				System.out.println(p);
			}
		}
		
		for(Pracownik g : gatunekDAO.wezPracownikow()) {
			System.out.println(g);
			System.out.println(g.getStanowisko().getNazwa());
		}
		System.out.println("CZytelnicy: ");
		for(Czytelnik g : gatunekDAO.wezCzytelnikow()) {
			System.out.println(g);
		}
	}
}
