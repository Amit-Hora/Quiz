package com.goeuro.utilities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Utilities {

	public static Map<Integer,Map<Integer,Set<Integer>>> sercToRouteToDest =new HashMap<>();
	
	
	public static  void readBusRoute(String fileLocation){
		try (Stream<String> stream = Files.lines(Paths.get(fileLocation))) {
			stream.forEach(line->{
				if(line.length()==1){
					return;
				}
				String values[]=line.split(" ");
				for(int i=1;i<values.length-1;i++){
					
					for(int j=i+1;j<values.length;j++){
						if(sercToRouteToDest.containsKey(Integer.parseInt(values[i]))){
							
							Map<Integer, Set<Integer>> routeToStation = sercToRouteToDest.get(Integer.parseInt(values[i]));
							if(routeToStation.containsKey(Integer.parseInt(values[0]))){
								routeToStation.get(Integer.parseInt(values[0])).add(Integer.parseInt(values[j]));
							}
							else{
								// new route
								Set<Integer> stations=new HashSet<>();
								stations.add(Integer.parseInt(values[j]));
								routeToStation.put(Integer.parseInt(values[0]), stations);
								
							}
						}else{
							//new station entry
							
							Set<Integer> stations=new HashSet<>();
							stations.add(Integer.parseInt(values[j]));
							Map<Integer, Set<Integer>> routeToStation = new HashMap<>();
							routeToStation.put(Integer.parseInt(values[0]), stations);
							sercToRouteToDest.put(Integer.parseInt(values[i]), routeToStation);
							
							
						}
					}
					
				}
			});
//			stream.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
