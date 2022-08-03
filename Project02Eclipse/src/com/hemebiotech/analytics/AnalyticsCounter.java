package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * Class of treatment of symptoms file
 * 
 */
public class AnalyticsCounter {
	private String inputFile;
	private String outputFile;
	
	public AnalyticsCounter(String inputFile, String outputFile) {
		this.inputFile = inputFile;
		this.outputFile = outputFile;
	}
	
	/**
	 * Method to launch all the process
	 * @throws Exception
	 */
	public void launch() throws Exception {
		List<String> symptoms = this.readSymptomsFile();
		Map<String, Integer> symptomsOrder = this.countSymptoms(symptoms);
		this.writeSymptomsFile(symptomsOrder);
	}
	
	/**
	 * Read the input file with all symptoms
	 * 
	 * @return List - List of symptoms
	 * @throws Exception
	 */
	private List<String> readSymptomsFile() throws Exception {
		ReadSymptomsFile reader = new ReadSymptomsFile(this.inputFile);
		return reader.getSymptoms();
	}
	
	/**
	 * Count and ordered symptoms
	 * 
	 * @param symptoms
	 * @return Map - List ordered of symptoms
	 */
	private Map<String, Integer> countSymptoms(List<String> symptoms) {
		SymptomsTreeMap symptomsTreeMap = new SymptomsTreeMap();
		symptomsTreeMap.countSymptoms(symptoms);
		return symptomsTreeMap.getSymptoms();
	}
	
	/**
	 * Write the output file with symptoms counted and ordered
	 * 
	 * @param symptomsOrder
	 * @throws Exception
	 */
	private void writeSymptomsFile(Map<String, Integer> symptomsOrder) throws Exception {
		WriteSymptomsFile writer = new WriteSymptomsFile(this.outputFile);
		writer.write(symptomsOrder);
	}
}
