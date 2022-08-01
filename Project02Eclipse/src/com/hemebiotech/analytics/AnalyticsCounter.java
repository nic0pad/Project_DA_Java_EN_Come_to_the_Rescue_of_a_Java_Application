package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.TreeMap;
import java.util.Map;

public class AnalyticsCounter {
	private static Map<String, Integer> symptoms = new TreeMap<>();
	
	public static void main(String args[]) throws Exception {
		String dir = System.getProperty("user.dir");

		// Read file
		BufferedReader reader = new BufferedReader (new FileReader(dir.concat("/Project02Eclipse/symptoms.txt")));
		String line = reader.readLine();

		while (line != null) {
			Integer quantity = 1;
			if(symptoms.containsKey(line)) {
				quantity = symptoms.get(line) + 1;
			}
			symptoms.put(line, quantity);

			line = reader.readLine();	// get another symptom
		}
		reader.close();
		
		// Generate output
		FileWriter writer = new FileWriter (dir.concat("/Project02Eclipse/result.out"));

		for (String key : symptoms.keySet()) {
			writer.write(key + ": " + symptoms.get(key) + "\n");
			System.out.println("key: " + key + " quantity: " + symptoms.get(key));
		}
		writer.close();
	}
}
