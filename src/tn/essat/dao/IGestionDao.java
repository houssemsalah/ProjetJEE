package tn.essat.dao;

import java.util.List;


import tn.essat.model.ModeleVoiture;
import tn.essat.model.Promotion;
import tn.essat.model.Reservation;
import tn.essat.model.User;
import tn.essat.model.Voiture;

public interface IGestionDao {
	public List<ModeleVoiture> getAllModeleVoiture();
	public List<Voiture> getAllVoiture();
	public List<Voiture> getAllVoitureByModel(int id);
	public List<User> getAllUser();
	public List<User> getAllClients();
	public List<Promotion> getAllPromotion();
	public List<Reservation> getAllReservation();
	
	public ModeleVoiture getModelVoitureById(int id);
	public Voiture getVoitureByID(int id);
	public User getUserById(int id);
	public Promotion getAllPromotionById(int id);
	public Reservation getAllReservationById(int id);
	public List<Reservation> getAllReservationByUserID(int id);
	public List<Reservation> getAllReservationByVoitureId(int id);
	
	public void saveModele(ModeleVoiture m);
	public void saveVoiture(Voiture v);
	public void saveUser(User u);
	
	public void reserver(Reservation r);
	
	public User verif(String emailuser);
	
	public void deleteModele(int id);
	public void deleteVoiture(int id);
	public void deleteClient(int id);
	public void deletePromo(int id);
	
}
