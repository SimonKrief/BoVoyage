package fr.gtm.bovoyage.dao;

import java.util.List;

import fr.gtm.bovoyage.entities.DatesVoyage;
import fr.gtm.bovoyage.entities.Destination;

public interface DestinationDao {
	
	public void create(Destination destination);
	
	public void update(Destination destination);
	
	public void delete(Destination destination);
	
	public List<Destination> getDestinationsByRegion(String region);
	
	public Destination getDestinationById(String region);
	
	public List<DatesVoyage> getDatesVoyages(Destination destination);
	
	public List<Destination> getAllDestinations();
	
	

}
