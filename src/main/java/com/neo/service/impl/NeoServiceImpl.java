package com.neo.service.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.neo.model.NearEarthObject;
import com.neo.model.NearEarthObjectCatalog;
import com.neo.model.NeoCloseApproachCatalog;
import com.neo.service.INeoService;
import com.neo.util.NeoUtil;

/* Implements the NEO service  */

public class NeoServiceImpl implements INeoService{
	
	private final Client client = ClientBuilder.newClient();
	public static final String URL_NEO_FOR_TODAY= "https://api.nasa.gov/neo/rest/v1/feed/today";
	public static final String URL_NEO_LIST= "https://api.nasa.gov/neo/rest/v1/neo/browse";
	public static final String API_KEY= "api_key";
	public static final String IS_DETAILED= "detailed";

	

	public List<NearEarthObject> getClosestNeoForToday(String isDetailed, String apiKey) {

		Map<String, String> params = new HashMap<String, String>();
		params.put(IS_DETAILED, isDetailed);
		params.put(API_KEY, apiKey);
		String json = getRequest(URL_NEO_FOR_TODAY, params);
		NeoCloseApproachCatalog  catalog = NeoUtil.convertJsonToNeoCatalog(json);
    	Map<Date, List<NearEarthObject>> map = ((Map<Date, List<NearEarthObject>>) catalog.getNearEarthObjects());
    	List<NearEarthObject> nearEarthObjectList = null;
    	for (Entry<Date, List<NearEarthObject>> entry : map.entrySet())
    	{
    		nearEarthObjectList = (List<NearEarthObject>) entry.getValue();
    	}
    				
		return nearEarthObjectList;		
	}

	public NearEarthObject getLargestNeo(String apiKey) {
		
		Map<String, String> params = new HashMap<String, String>();
		params.put(API_KEY, apiKey);
		String json = getRequest(URL_NEO_LIST, params);	
		Gson gson = new Gson();            
		NearEarthObjectCatalog  catalog =  gson.fromJson(json, NearEarthObjectCatalog.class);
		return findLargestNeo(gson, catalog);
		
	}

	private NearEarthObject findLargestNeo(Gson gson, NearEarthObjectCatalog catalog) {
		
		BigDecimal max = BigDecimal.ZERO;
    	NearEarthObject largestNeo = null;
    	List<NearEarthObject> nearEarthObjectList = catalog.getNearEarthObjects();
    	for(NearEarthObject neObject:nearEarthObjectList) {
    		BigDecimal estimateDiameter =  neObject.getEstimatedDiameter().getEstimatedDiameterKm().getEstimatedDiameterMax();
    			if(estimateDiameter.compareTo(max) == 1) {
    				max = estimateDiameter;
    				largestNeo = neObject;		
    			}   	  
    	}
    	return largestNeo;
	}

		
	public String getRequest(String url, Map<String, String> params) {
		
		Builder request = buildRequest(url, params);
		return request.get(String.class);
	}
	
	
	private Builder buildRequest(String url, Map<String, String> params) {
		
		WebTarget target = client.target(url);
		for (Entry<String, String> entry : params.entrySet())
		{
			target = target.queryParam(entry.getKey() , entry.getValue());
    	}
		
		Builder request = target.request(MediaType.APPLICATION_JSON);
		return request;
	}
}
