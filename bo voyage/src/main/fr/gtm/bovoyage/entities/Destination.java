package fr.gtm.bovoyage.entities;

import java.util.ArrayList;
import java.util.List;

public class Destination {
	
	private String region;
	private String descriptif;
	private List<String> images = new ArrayList<String>();
	private List<DatesVoyage> datesVoyage;
    private long id;
	

	public Destination() {
		// TODO Auto-generated constructor stub
		datesVoyage = new ArrayList<DatesVoyage>();
		
	}


	public Destination(String region, String descriptif, List<String> images, long id) {
		super();
		this.region = region;
		this.descriptif = descriptif;
		this.images = images;
		this.id = id;
		
		datesVoyage = new ArrayList<DatesVoyage>();
	}
	
	
	public List<DatesVoyage> getDatesVoyage() {
		return datesVoyage;
	}


	public void setDatesVoyage(List<DatesVoyage> datesVoyage) {
		this.datesVoyage = datesVoyage;
	}


	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}


	public String getDescriptif() {
		return descriptif;
	}


	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}


	public List<String> getImages() {
		return images;
	}


	public void setImages(List<String> images) {
		this.images = images;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}
	
	
	
	
	

}
