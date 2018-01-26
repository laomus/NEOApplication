package com.neo.model;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

public class NeoRelativeVelocity {

	@SerializedName("kilometers_per_second")
	private BigDecimal kilometersPerSecond;
	
	@SerializedName("kilometers_per_hour")
	private BigDecimal  kilometersPerHour;
	
	@SerializedName("miles_per_hour")
	private BigDecimal  milesPerHour;

	public BigDecimal getKilometersPerSecond() {
		return kilometersPerSecond;
	}

	public void setKilometersPerSecond(BigDecimal kilometersPerSecond) {
		this.kilometersPerSecond = kilometersPerSecond;
	}

	public BigDecimal getKilometersPerHour() {
		return kilometersPerHour;
	}

	public void setKilometersPerHour(BigDecimal kilometersPerHour) {
		this.kilometersPerHour = kilometersPerHour;
	}

	public BigDecimal getMilesPerHour() {
		return milesPerHour;
	}

	public void setMilesPerHour(BigDecimal milesPerHour) {
		this.milesPerHour = milesPerHour;
	}

	@Override
    public String toString() {
		
		StringBuilder str = new StringBuilder();
	    str.append("{kilometers Per Second:" + kilometersPerSecond);
	    str.append(", kilometers Per Hour:" + kilometersPerHour);
	    str.append(", miles per hour:" + milesPerHour + "}");	    
	    return str.toString();
	   

    }
	
}
