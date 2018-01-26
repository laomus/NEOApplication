package com.neo.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

public class NeoCloseApproachCatalog {
	
	private NeoLinks  links;
	
	@SerializedName("element_count")
	private int elementCount;
		
	@SerializedName("near_earth_objects")
	private Map<Date, List<NearEarthObject>> nearEarthObjects;

	public NeoLinks getLinks() {
		return links;
	}

	public void setLinks(NeoLinks links) {
		this.links = links;
	}

	public int getElementCount() {
		return elementCount;
	}

	public void setElementCount(int elementCount) {
		this.elementCount = elementCount;
	}

	
	public Map<Date, List<NearEarthObject>> getNearEarthObjects() {
		return nearEarthObjects;
	}

	public void setNearEarthObjects(Map<Date, List<NearEarthObject>> nearEarthObjects) {
		this.nearEarthObjects = nearEarthObjects;
	}

	
	
   
	
	
   
}
