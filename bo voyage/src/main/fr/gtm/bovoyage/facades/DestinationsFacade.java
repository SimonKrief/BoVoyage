package fr.gtm.bovoyage.facades;

import java.util.List;

import fr.gtm.bovoyage.dao.DestinationDao;
import fr.gtm.bovoyage.entities.DatesVoyage;
import fr.gtm.bovoyage.entities.Destination;

public class DestinationsFacade {
	
	private DestinationDao dao;
	
	
	public DestinationsFacade() {
		// TODO Auto-generated constructor stub
	
	}
	
	
	
	
	
	public List<Destination> getAllDestinations(){
		return dao.getAllDestinations();
	}
	
	
	public List<Destination> getDestinationsByRegion(String region){
		return dao.getDestinationsByRegion(region);
	}
	
	public void create(Destination destination) {
		dao.create(destination);
	}
	
	
	
	
	public List<DatesVoyage> getDatesVoyages(Destination destination)
	{
		return dao.getDatesVoyages(destination);
	}
	
	
	public List<DatesVoyage> getDatesVoyages(long idDestination)
	{
		List<Destination> destinationsTemp = dao.getAllDestinations();
		for(Destination d : destinationsTemp) {
			if (d.getId()==idDestination)
			{
				return d.getDatesVoyage();
			}
		}
		
		return null;
	
	}
	

}
