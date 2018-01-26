package com.neo.model;

import com.google.gson.annotations.SerializedName;

public class NeoCloseApproachData {

	@SerializedName("close_approach_date")
	private String closeApproachDate;
	
	@SerializedName("epoch_date_close_approach")
	private long epochDateCloseApproach;
	
	@SerializedName("relative_velocity")
    private NeoRelativeVelocity relativeVelocity;
	
	@SerializedName("miss_distance")
	private NeoMissDistance missDistance;
	
	@SerializedName("orbiting_body")
	private String orbitingBody;

	public String getCloseApproachDate() {
		return closeApproachDate;
	}

	public void setCloseApproachDate(String closeApproachDate) {
		this.closeApproachDate = closeApproachDate;
	}

	public long getEpochDateCloseApproach() {
		return epochDateCloseApproach;
	}

	public void setEpochDateCloseApproach(long epochDateCloseApproach) {
		this.epochDateCloseApproach = epochDateCloseApproach;
	}

	public NeoRelativeVelocity getRelativeVelocity() {
		return relativeVelocity;
	}

	public void setRelativeVelocity(NeoRelativeVelocity relativeVelocity) {
		this.relativeVelocity = relativeVelocity;
	}

	public NeoMissDistance getMissDistance() {
		return missDistance;
	}

	public void setMissDistance(NeoMissDistance missDistance) {
		this.missDistance = missDistance;
	}

	public String getOrbitingBody() {
		return orbitingBody;
	}

	public void setOrbitingBody(String orbitingBody) {
		this.orbitingBody = orbitingBody;
	}
    
	@Override
    public String toString() {
		
		StringBuilder str = new StringBuilder();
	    str.append("Close Approach Data:{closeApproachDate:" + closeApproachDate);
	    str.append(", epochDateCloseApproach:" + epochDateCloseApproach);
	    str.append(", Relative Velocity:" + relativeVelocity.toString());
	    str.append(", miss Distance:" + missDistance.toString());
	    str.append(", orbitingBody:" + orbitingBody + "}");
	    return str.toString();
	   

    }
	
}
