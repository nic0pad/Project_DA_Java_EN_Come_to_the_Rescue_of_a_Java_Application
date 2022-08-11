package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Write symptoms list in a file
 *
 */
public class WriteSymptomsFile implements ISymptomsWriter {
	private String filepath;
	
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public WriteSymptomsFile (String filepath) {
		this.filepath = filepath;
	}

	@Override
	public void write(Map<String, Integer> symptoms) {
		try {
			FileWriter writer = new FileWriter (filepath);
			for (String key : symptoms.keySet()) {
				writer.write(key + ": " + symptoms.get(key) + "\n");
			}
			writer.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
