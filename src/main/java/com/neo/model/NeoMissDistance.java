package com.neo.model;

import java.math.BigDecimal;

public class NeoMissDistance {

	private BigDecimal  astronomical;
	private BigDecimal  lunar;
	private BigDecimal  kilometers;
	private BigDecimal  miles;
	public BigDecimal getAstronomical() {
		return astronomical;
	}
	public void setAstronomical(BigDecimal astronomical) {
		this.astronomical = astronomical;
	}
	public BigDecimal getLunar() {
		return lunar;
	}
	public void setLunar(BigDecimal lunar) {
		this.lunar = lunar;
	}
	public BigDecimal getKilometers() {
		return kilometers;
	}
	public void setKilometers(BigDecimal kilometers) {
		this.kilometers = kilometers;
	}
	public BigDecimal getMiles() {
		return miles;
	}
	public void setMiles(BigDecimal miles) {
		this.miles = miles;
	}
		
	
	@Override
    public String toString() {
		
		StringBuilder str = new StringBuilder();
	    str.append("miss distance:{astronomical:" + astronomical);
	    str.append(", lunar:" + lunar);
	    str.append(", kilometers:" + kilometers);
	    str.append(", miles:" + miles+ "}");
	    return str.toString();
	   

    }

}
