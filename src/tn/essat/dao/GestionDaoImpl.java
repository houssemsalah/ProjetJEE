package tn.essat.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import tn.essat.model.ModeleVoiture;
import tn.essat.model.Promotion;
import tn.essat.model.Reservation;
import tn.essat.model.User;
import tn.essat.model.Voiture;

public class GestionDaoImpl implements IGestionDao{

	EntityManager em;
	public GestionDaoImpl() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("xyz");
		this.em = factory.createEntityManager();
	}
	@Override
	public List<ModeleVoiture> getAllModeleVoiture() {
		Query qr=em.createQuery("select M from modele_voiture M");
		List<ModeleVoiture> liste=qr.getResultList();
		return liste;
	}

	@Override
	public List<Voiture> getAllVoiture() {
		Query qr=em.createQuery("select v from voiture v");
		List<Voiture> liste=qr.getResultList();
		return liste;
	}

	@Override
	public List<Voiture> getAllVoitureByModel(int id) {
		Query qr=em.createQuery("select v from voiture v where v.modl.id="+id);
		List<Voiture> liste=qr.getResultList();
		return liste;
	}

	@Override
	public List<User> getAllUser() {
		Query qr=em.createQuery("select u from user u ");
		List<User> liste=qr.getResultList();
		return liste;
	}

	@Override
	public List<User> getAllClients() {
		Query qr=em.createQuery("select u from user u where u.role=\"client\"");
		List<User> liste=qr.getResultList();
		return liste;
	}

	@Override
	public List<Promotion> getAllPromotion() {
		Query qr=em.createQuery("select p from promotion p ");
		List<Promotion> liste=qr.getResultList();
		return liste;
	}

	@Override
	public List<Reservation> getAllReservation() {
		Query qr=em.createQuery("select r from reservation r ");
		List<Reservation> liste=qr.getResultList();
		return liste;
	}

	@Override
	public ModeleVoiture getModelVoitureById(int id) {
		ModeleVoiture mv=em.find(ModeleVoiture.class, id);
		return mv;
	}

	@Override
	public Voiture getVoitureByID(int id) {
		Voiture v = em.find(Voiture.class, id);
		return v;		
	}

	@Override
	public User getUserById(int id) {
		User u = em.find(User.class, id);
		return u;
	}

	@Override
	public Promotion getAllPromotionById(int id) {
		Promotion p = em.find(Promotion.class, id);
		return p;
	}

	@Override
	public Reservation getAllReservationById(int id) {
		Reservation r = em.find(Reservation.class, id);
		return r;
	}
	

	@Override
	public void saveModele(ModeleVoiture m) {
		em.getTransaction().begin();
		em.persist(m);
		em.getTransaction().commit();		
	}

	@Override
	public void saveVoiture(Voiture v) {
		em.getTransaction().begin();
		em.persist(v);
		em.getTransaction().commit();		
	}

	@Override
	public void saveUser(User u) {
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();		
	}

	@Override
	public void reserver(Reservation r) {
		r.setEtat(1);
		em.getTransaction().begin();
		em.persist(r);
		em.getTransaction().commit();

	}

	 

	@Override
	public User verif(String emailuser) {	 
		Query qr = em.createQuery("select u from user u where u.emailuser='emailuser'");
	    
		User u = (User) qr.getSingleResult();
		return u;
	    
		
		//Query qr=em.createQuery("select u from user u where u.emailuser='login' and u.passworduser='password'");
		//return qr.getResultList().size()>0;	
	}

	@Override
	public void deleteModele(int id) {
		ModeleVoiture m = em.find(ModeleVoiture.class, id);
		em.getTransaction().begin();
		em.remove(m);
		em.getTransaction().commit();		
	}

	@Override
	public void deleteVoiture(int id) {
		Voiture v = em.find(Voiture.class, id);
		em.getTransaction().begin();
		em.remove(v);
		em.getTransaction().commit();		
	}

	@Override
	public void deleteClient(int id) {
		User u = em.find(User.class, id);
		em.getTransaction().begin();
		em.remove(u);
		em.getTransaction().commit();		
	}

	@Override
	public void deletePromo(int id) {
		Promotion p = em.find(Promotion.class, id);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();		
	}
	@Override
	public List<Reservation> getAllReservationByUserID(int id) {
		Query qr=em.createQuery("select r from reservation r where r.user_id="+id);
		List<Reservation> liste = qr.getResultList();
		return liste;
	}
	@Override
	public List<Reservation> getAllReservationByVoitureId(int id) {
		Query qr=em.createQuery("select r from reservation r where r.voiture_id="+id);
		List<Reservation> liste = qr.getResultList();
		return liste;
		
	}

}
