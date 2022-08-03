package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Class to read the file and extract all symptoms
 *
 */
public class ReadSymptomsFile implements ISymptomsReader {
	
	private String filepath;
	
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomsFile (String filepath) {
		this.filepath = filepath;
	}
	
	@Override
	public List<String> getSymptoms() {
		List<String> listOfStrings = new ArrayList<String>();
   
		try {
			// load the data from file
			listOfStrings = Files.readAllLines(Paths.get(filepath));
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		return listOfStrings;
	}
	
}
