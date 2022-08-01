package com.hemebiotech.analytics;

import java.util.TreeMap;
import java.util.List;
import java.util.Map;

public class SymptomsTreeMap implements ISymptomsMap {
	private Map<String, Integer> symptoms = new TreeMap<>();
	
	public void countSymptoms(List<String> symptomsList) {
		for (String symptom : symptomsList) {
			this.addSymptom(symptom);
		}
	}
	
	public void addSymptom(String label) {
		Integer quantity = 1;
		if(symptoms.containsKey(label)) {
			quantity = symptoms.get(label) + 1;
		}
		symptoms.put(label, quantity);
	}
	
	public Map<String, Integer> getSymptoms() {
		return this.symptoms;
	}
}
