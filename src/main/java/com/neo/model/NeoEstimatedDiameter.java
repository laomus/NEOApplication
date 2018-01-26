package com.neo.model;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

public class NeoEstimatedDiameter {
	
	@SerializedName("estimated_diameter_min")
	private BigDecimal estimatedDiameterMin;

	@SerializedName("estimated_diameter_max")
	private BigDecimal estimatedDiameterMax;

	public BigDecimal getEstimatedDiameterMin() {
		return estimatedDiameterMin;
	}

	public void setEstimatedDiameterMin(BigDecimal estimatedDiameterMin) {
		this.estimatedDiameterMin = estimatedDiameterMin;
	}

	public BigDecimal getEstimatedDiameterMax() {
		return estimatedDiameterMax;
	}

	public void setEstimatedDiameterMax(BigDecimal estimatedDiameterMax) {
		this.estimatedDiameterMax = estimatedDiameterMax;
	}

	@Override
    public String toString() {
		
		StringBuilder str = new StringBuilder();
	    str.append("{estimated Diameter Min:" + estimatedDiameterMin.toString());
	    str.append(", estimated Diameter Max:" + estimatedDiameterMax.toString()+ "}");
	    return str.toString();
	   

    }
	
	
}
