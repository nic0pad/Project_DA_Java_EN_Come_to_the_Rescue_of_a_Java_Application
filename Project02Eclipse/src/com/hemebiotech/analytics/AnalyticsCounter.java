package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {
	private static final String INPUT_FILE_PATH = System.getProperty("user.dir").concat("/resources/symptoms.txt");
	private static final String OUTPUT_FILE_PATH = System.getProperty("user.dir").concat("/resources/result.out");
	
	public static void main(String args[]) throws Exception {
		List<String> symptoms = readSymptomsFile();
		Map<String, Integer> symptomsOrder = countSymptoms(symptoms);
		writeSymptomsFile(symptomsOrder);
	}
	
	private static List<String> readSymptomsFile() throws Exception {
		ReadSymptomsFile reader = new ReadSymptomsFile(INPUT_FILE_PATH);
		return reader.GetSymptoms();
	}
	
	private static Map<String, Integer> countSymptoms(List<String> symptoms) {
		SymptomsTreeMap symptomsTreeMap = new SymptomsTreeMap();
		symptomsTreeMap.countSymptoms(symptoms);
		return symptomsTreeMap.getSymptoms();
	}
	
	private static void writeSymptomsFile(Map<String, Integer> symptomsOrder) throws Exception {
		WriteSymptomsFile writer = new WriteSymptomsFile(OUTPUT_FILE_PATH);
		writer.write(symptomsOrder);
	}
}
