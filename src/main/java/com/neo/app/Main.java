package com.neo.app;

import java.util.List;

import com.google.gson.Gson;
import com.neo.model.NearEarthObject;
import com.neo.service.INeoService;
import com.neo.service.impl.NeoServiceImpl;


public class Main {


	public static void main(String[] args) {

		INeoService neoService = new NeoServiceImpl();
		
		List<NearEarthObject> closestNeoList = neoService.getClosestNeoForToday("true","DEMO_KEY");
		if(closestNeoList !=null) {
			System.out.println("Number of NEO Closest to Earth:" + closestNeoList.size());
			System.out.println("NEO Closest to Earth Detailed Data");
			for(NearEarthObject neObject:closestNeoList) {
				System.out.println(neObject.toString());
			}
		}
		NearEarthObject largestNeo = neoService.getLargestNeo("DEMO_KEY");
		System.out.println("\n\nLargest NEO Detailed Data");
		if(largestNeo !=null) {
			System.out.println(largestNeo.toString());
		
		}
		
		
	}
}