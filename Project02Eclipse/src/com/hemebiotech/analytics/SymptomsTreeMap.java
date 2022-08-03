package com.hemebiotech.analytics;

import java.util.TreeMap;
import java.util.List;
import java.util.Map;

/**
 * Ordered and count symptoms list in a TreeMap
 *
 */
public class SymptomsTreeMap implements ISymptomsMap {
	private Map<String, Integer> symptoms = new TreeMap<>();
	
	/**
	 * Browse symptoms list to add each symptom in the TreeMap
	 * 
	 * @param List<String>
	 */
	public void countSymptoms(List<String> symptomsList) {
		for (String symptom : symptomsList) {
			this.addSymptom(symptom);
		}
	}
	
	/**
	 * Add a symptom in the TreeMap
	 * 
	 * @param String label
	 */
	private void addSymptom(String label) {
		Integer quantity = 1;
		if(symptoms.containsKey(label)) {
			quantity = symptoms.get(label) + 1;
		}
		symptoms.put(label, quantity);
	}
	
	/**
	 * Return a map of symptoms
	 * 
	 * @return Map<String, Integer>
	 */
	public Map<String, Integer> getSymptoms() {
		return this.symptoms;
	}
}
