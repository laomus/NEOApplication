package com.neo.model;

import java.math.BigDecimal;
import com.google.gson.annotations.SerializedName;

public class NeoOrbitalData {

	@SerializedName("orbit_id")
	private int  orbitId;
	
	@SerializedName("orbit_determination_date")
	private String  orbitDeterminationDate;
	
	@SerializedName("orbit_uncertainty")
	private int  orbitUncertainty;
	
	@SerializedName("minimum_orbit_intersection")
	private BigDecimal  minOrbitIntersection;

	@SerializedName("jupiter_tisserand_invariant")
	private BigDecimal  jupiterTisserandInvariant;
	
	@SerializedName("epoch_osculation")
	private BigDecimal  epochOsculation;
	
	@SerializedName("eccentricity")
	private BigDecimal  eccentricity;
	
	@SerializedName("semi_major_axis")
	private BigDecimal  semiMajorAxis;
	
	@SerializedName("inclination")
	private BigDecimal  inclination;
	
	@SerializedName("ascending_node_longitude")
	private BigDecimal  ascendNodeLongitude;
	
	@SerializedName("orbital_period")
	private BigDecimal  orbitalPeriod;
	
	@SerializedName("perihelion_distance")
	private BigDecimal  perihelionDistance;
	
	@SerializedName("aphelion_distance")
	private BigDecimal  aphelionDistance;
	
	@SerializedName("perihelion_time")
	private BigDecimal  perihelionTime;
	
	@SerializedName("mean_anomaly")
	private BigDecimal  meanAnomaly;
	
	@SerializedName("mean_motion")
	private BigDecimal  meanMotion;
	
	@SerializedName("equinox")
	private String  equinox;

	public int getOrbitId() {
		return orbitId;
	}

	public void setOrbitId(int orbitId) {
		this.orbitId = orbitId;
	}

	public String getOrbitDeterminationDate() {
		return orbitDeterminationDate;
	}

	public void setOrbitDeterminationDate(String orbitDeterminationDate) {
		this.orbitDeterminationDate = orbitDeterminationDate;
	}

	public int getOrbitUncertainty() {
		return orbitUncertainty;
	}

	public void setOrbitUncertainty(int orbitUncertainty) {
		this.orbitUncertainty = orbitUncertainty;
	}

	public BigDecimal getMinOrbitIntersection() {
		return minOrbitIntersection;
	}

	public void setMinOrbitIntersection(BigDecimal minOrbitIntersection) {
		this.minOrbitIntersection = minOrbitIntersection;
	}

	public BigDecimal getJupiterTisserandInvariant() {
		return jupiterTisserandInvariant;
	}

	public void setJupiterTisserandInvariant(BigDecimal jupiterTisserandInvariant) {
		this.jupiterTisserandInvariant = jupiterTisserandInvariant;
	}

	public BigDecimal getEpochOsculation() {
		return epochOsculation;
	}

	public void setEpochOsculation(BigDecimal epochOsculation) {
		this.epochOsculation = epochOsculation;
	}

	public BigDecimal getEccentricity() {
		return eccentricity;
	}

	public void setEccentricity(BigDecimal eccentricity) {
		this.eccentricity = eccentricity;
	}

	public BigDecimal getSemiMajorAxis() {
		return semiMajorAxis;
	}

	public void setSemiMajorAxis(BigDecimal semiMajorAxis) {
		this.semiMajorAxis = semiMajorAxis;
	}

	public BigDecimal getInclination() {
		return inclination;
	}

	public void setInclination(BigDecimal inclination) {
		this.inclination = inclination;
	}

	public BigDecimal getAscendNodeLongitude() {
		return ascendNodeLongitude;
	}

	public void setAscendNodeLongitude(BigDecimal ascendNodeLongitude) {
		this.ascendNodeLongitude = ascendNodeLongitude;
	}

	public BigDecimal getOrbitalPeriod() {
		return orbitalPeriod;
	}

	public void setOrbitalPeriod(BigDecimal orbitalPeriod) {
		this.orbitalPeriod = orbitalPeriod;
	}

	public BigDecimal getPerihelionDistance() {
		return perihelionDistance;
	}

	public void setPerihelionDistance(BigDecimal perihelionDistance) {
		this.perihelionDistance = perihelionDistance;
	}

	public BigDecimal getAphelionDistance() {
		return aphelionDistance;
	}

	public void setAphelionDistance(BigDecimal aphelionDistance) {
		this.aphelionDistance = aphelionDistance;
	}

	public BigDecimal getPerihelionTime() {
		return perihelionTime;
	}

	public void setPerihelionTime(BigDecimal perihelionTime) {
		this.perihelionTime = perihelionTime;
	}

	public BigDecimal getMeanAnomaly() {
		return meanAnomaly;
	}

	public void setMeanAnomaly(BigDecimal meanAnomaly) {
		this.meanAnomaly = meanAnomaly;
	}

	public BigDecimal getMeanMotion() {
		return meanMotion;
	}

	public void setMeanMotion(BigDecimal meanMotion) {
		this.meanMotion = meanMotion;
	}

	public String getEquinox() {
		return equinox;
	}

	public void setEquinox(String equinox) {
		this.equinox = equinox;
	}

	
	
	
}
