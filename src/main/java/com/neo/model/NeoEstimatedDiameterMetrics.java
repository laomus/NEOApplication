package com.neo.model;

import com.google.gson.annotations.SerializedName;

public class NeoEstimatedDiameterMetrics {
	
	@SerializedName("kilometers")
	private NeoEstimatedDiameter estimatedDiameterKm;
	
	@SerializedName("meters")
	private NeoEstimatedDiameter estimatedDiameterMeters;
	
	@SerializedName("miles")
	private NeoEstimatedDiameter estimatedDiameterMiles;
	
	@SerializedName("feet")
	private NeoEstimatedDiameter estimatedDiameterFeet;

	public NeoEstimatedDiameter getEstimatedDiameterKm() {
		return estimatedDiameterKm;
	}

	public void setEstimatedDiameterKm(NeoEstimatedDiameter estimatedDiameterKm) {
		this.estimatedDiameterKm = estimatedDiameterKm;
	}

	public NeoEstimatedDiameter getEstimatedDiameterMeters() {
		return estimatedDiameterMeters;
	}

	public void setEstimatedDiameterMeters(NeoEstimatedDiameter estimatedDiameterMeters) {
		this.estimatedDiameterMeters = estimatedDiameterMeters;
	}

	public NeoEstimatedDiameter getEstimatedDiameterMiles() {
		return estimatedDiameterMiles;
	}

	public void setEstimatedDiameterMiles(NeoEstimatedDiameter estimatedDiameterMiles) {
		this.estimatedDiameterMiles = estimatedDiameterMiles;
	}

	public NeoEstimatedDiameter getEstimatedDiameterFeet() {
		return estimatedDiameterFeet;
	}

	public void setEstimatedDiameterFeet(NeoEstimatedDiameter estimatedDiameterFeet) {
		this.estimatedDiameterFeet = estimatedDiameterFeet;
	}
	
	
	@Override
    public String toString() {
		
		StringBuilder str = new StringBuilder();
	    str.append("Estimated Diameter :{Kilometers:" + estimatedDiameterKm.toString());
	    str.append(", Meters:" + estimatedDiameterMeters.toString());
	    str.append(", Miles:" + estimatedDiameterMiles.toString());
	    str.append(", Feet:" + estimatedDiameterFeet.toString()+ "}");
	    return str.toString();
	   

    }
	

}
