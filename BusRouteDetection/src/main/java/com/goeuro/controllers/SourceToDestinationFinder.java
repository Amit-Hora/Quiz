package com.goeuro.controllers;

import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goeuro.beans.RouteResponse;
import com.goeuro.utilities.Utilities;
import com.google.gson.Gson;

@RequestMapping("/api")
@Controller
@CrossOrigin("*")
public class SourceToDestinationFinder {

	@RequestMapping(value = "/direct", method = RequestMethod.GET)
	@CrossOrigin(origins = "*")
	public @ResponseBody String isDirect(@RequestParam(value = "dep_sid") String dep_sid,
			@RequestParam(value = "arr_sid") String arr_sid) {
		final RouteResponse routeResponse=new RouteResponse();
		routeResponse.setDirect_bus_route(false);
		routeResponse.setDep_sid(Integer.parseInt(dep_sid));
		routeResponse.setArr_sid(Integer.parseInt(arr_sid));
		Map<Integer, Set<Integer>> routesToStation = Utilities.sercToRouteToDest.get(Integer.parseInt(dep_sid));
		if(routesToStation!=null){
		routesToStation.forEach((k,v)->{
			
			if(v.contains(Integer.parseInt(arr_sid))){
				routeResponse.setDirect_bus_route(true);
			}
			
		});
		}
		Gson gson=new Gson();
		return gson.toJson(routeResponse);
		
	}
}
