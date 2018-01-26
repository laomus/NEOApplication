package com.neo.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class NearEarthObjectCatalog {
	
	private NeoLinks  links;
	
	@SerializedName("element_count")
	private int elementCount;
	
	@SerializedName("near_earth_objects")
	private List<NearEarthObject> nearEarthObjects;
	
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

	
	public List<NearEarthObject> getNearEarthObjects() {
		return nearEarthObjects;
	}

	public void setNearEarthObjects(List<NearEarthObject> nearEarthObjects) {
		this.nearEarthObjects = nearEarthObjects;
	}

	
	
}
