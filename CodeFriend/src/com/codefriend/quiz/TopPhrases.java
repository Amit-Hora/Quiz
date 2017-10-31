package com.codefriend.quiz;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class TopPhrases {
	private static final transient  Logger logger = Logger.getLogger(TopPhrases.class.getName());
	public static void main(String[] args){
		
		String fileName = null;
		if(args.length==0){
			System.out.println("Provide the file path to read");
			System.exit(1);
		}else{
			fileName=args[0];
		}
		/**
		 * Stream file content and split based on pipe
		 * Calculate content by keeping map of
		 * word - > countof times 
		 */

		getTopNValues(fileName);
		
	}
	/**
	 * 
	 * @param fileName - location of the file to read
	 */
	public static void getTopNValues(String fileName){
		final Map<String,Integer> hashMapOFWords=new HashMap<>();
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

			stream.forEach(content->{
				String[] contents=content.split("\\|");
				
				for(String word:contents){
					if(hashMapOFWords.containsKey(word)){
						hashMapOFWords.put(word, hashMapOFWords.get(word)+1);
					}
					else{
						hashMapOFWords.put(word, 1);	
					}
				}
				
			});
			/**
			 *  Sort the collection by Map value.
             *	Limit the collection to 100000.
			 */
			Map<String,Integer> sortedhashMapOFWords = hashMapOFWords.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(100000)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1,v2)->v1, LinkedHashMap::new));
			
			sortedhashMapOFWords.entrySet().stream().forEach(System.out::println);
			

		} catch (IOException e) {
			  logger.log(Level.SEVERE, e.toString(), e);
		}catch (Exception e) {
			  logger.log(Level.SEVERE, e.toString(), e);
		}
	}
	
	


	
}
