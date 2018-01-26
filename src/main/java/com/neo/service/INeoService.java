package com.neo.service;

import java.util.List;

import com.neo.model.NearEarthObject;

public interface INeoService {

	public List<NearEarthObject> getClosestNeoForToday(String isDetailed, String apiKey);
	
	public NearEarthObject getLargestNeo(String apiKey);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
