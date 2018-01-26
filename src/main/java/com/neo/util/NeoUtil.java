package com.neo.util;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.neo.model.NearEarthObject;
import com.neo.model.NearEarthObjectCatalog;
import com.neo.model.NeoCloseApproachCatalog;

public class NeoUtil {


	public static NeoCloseApproachCatalog convertJsonToNeoCatalog(String json) {

		Gson gson = new Gson();            
		//Map<String, List<NearEarthObject>> values = new HashMap<String, List<NearEarthObject>>();
		//NearEarthObjectCatalog neoCatalog = new NearEarthObjectCatalog();
		//neoCatalog.setNearEarthObjects(values);
		return gson.fromJson(json, NeoCloseApproachCatalog.class);

	}
	
	
	
}
