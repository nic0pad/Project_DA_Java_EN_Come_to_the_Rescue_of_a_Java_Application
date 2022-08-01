package com.hemebiotech.analytics;

import java.util.Map;

public interface ISymptomsMap {
	
	void addSymptom(String label);
	
	Map<String, Integer> getSymptoms();
}
