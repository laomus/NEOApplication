package com.neo.model;

import java.math.BigDecimal;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class NearEarthObject {
	
	private NeoLinks  links;
	
	@SerializedName("neo_reference_id")
	private String neoReferenceId;
	
	private String name;
	
	@SerializedName("nasa_jpl_url")
	private String nasaJplUrl;
	
	@SerializedName("absolute_magnitude_h")
	private BigDecimal absoluteMagnitudeh;
	
	@SerializedName("estimated_diameter")
	private NeoEstimatedDiameterMetrics estimatedDiameter;
	
	@SerializedName("is_potentially_hazardous_asteroid")
	private boolean isPotentiallyHazardousAsteroid;
	
	@SerializedName("close_approach_data")
	private List<NeoCloseApproachData> closeApproachData;
		
	@SerializedName("orbital_data")
	private NeoOrbitalData orbitalData;

	public NeoLinks getLinks() {
		return links;
	}

	public void setLinks(NeoLinks links) {
		this.links = links;
	}

	public String getNeoReferenceId() {
		return neoReferenceId;
	}

	public void setNeoReferenceId(String neoReferenceId) {
		this.neoReferenceId = neoReferenceId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public String getNasaJplUrl() {
		return nasaJplUrl;
	}

	public void setNasaJplUrl(String nasaJplUrl) {
		this.nasaJplUrl = nasaJplUrl;
	}

	public BigDecimal getAbsoluteMagnitudeh() {
		return absoluteMagnitudeh;
	}

	public void setAbsoluteMagnitudeh(BigDecimal absoluteMagnitudeh) {
		this.absoluteMagnitudeh = absoluteMagnitudeh;
	}

	public NeoEstimatedDiameterMetrics getEstimatedDiameter() {
		return estimatedDiameter;
	}

	public void setEstimatedDiameter(NeoEstimatedDiameterMetrics estimatedDiameter) {
		this.estimatedDiameter = estimatedDiameter;
	}

	public boolean isPotentiallyHazardousAsteroid() {
		return isPotentiallyHazardousAsteroid;
	}

	public void setPotentiallyHazardousAsteroid(boolean isPotentiallyHazardousAsteroid) {
		this.isPotentiallyHazardousAsteroid = isPotentiallyHazardousAsteroid;
	}

	public List<NeoCloseApproachData> getCloseApproachData() {
		return closeApproachData;
	}

	public void setCloseApproachData(List<NeoCloseApproachData> closeApproachData) {
		this.closeApproachData = closeApproachData;
	}

	public NeoOrbitalData getOrbitalData() {
		return orbitalData;
	}

	public void setOrbitalData(NeoOrbitalData orbitalData) {
		this.orbitalData = orbitalData;
	}
	
	@Override
    public String toString() {
		
		StringBuilder str = new StringBuilder();
	    str.append("NEO :{" + links.toString());
	    str.append(", neoReferenceId:" + neoReferenceId);
	    str.append(", name:" + name);
	    str.append(", nasa Jpl Url:" + nasaJplUrl);
	    str.append(", absolute Magnitude h:" + absoluteMagnitudeh);
	    str.append("," + estimatedDiameter);
	    str.append(", Potentially Hazardous Asteroid:" + isPotentiallyHazardousAsteroid);
	    str.append("," + closeApproachData.toString());
	    str.append(", orbital Data:" + orbitalData.toString() + "}");
	    return str.toString();
	   

    }

}
