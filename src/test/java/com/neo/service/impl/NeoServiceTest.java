package com.neo.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.core.MediaType;

import org.junit.jupiter.api.Test;

import com.google.gson.Gson;
import com.neo.model.NearEarthObject;
import com.neo.model.NearEarthObjectCatalog;
import com.neo.model.NeoCloseApproachCatalog;
import com.neo.model.NeoCloseApproachData;
import com.neo.model.NeoEstimatedDiameter;
import com.neo.service.INeoService;
import com.neo.util.NeoUtil;

import junit.framework.TestCase;

/* Root resource (exposed at "myresource" path) */

public class NeoServiceTest extends TestCase{
	
	private final Client client = ClientBuilder.newClient();
	private final String URL_NEO_FOR_TODAY= "https://api.nasa.gov/neo/rest/v1/feed/today";
	private final String URL_NEO_LIST= "https://api.nasa.gov/neo/rest/v1/neo/browse";
	private final String API_KEY= "api_key";
	private final String IS_DETAILED= "detailed";

	
	
	
    public void testmethod() {
       org.junit.Assert.assertTrue( new ArrayList().isEmpty() );
    }
	

	

	public void testgetClosestNeoForToday() {

		
		
	}


	
	
	public void  testgetLargestNeo() {

		
		
	}

	
	
	
}
