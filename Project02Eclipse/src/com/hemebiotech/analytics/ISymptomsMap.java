package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * Treatment of the list of symptoms
 *
 */
public interface ISymptomsMap {
	
	/**
	 * Treatment of symptoms : ordered key and number of occurrence
	 * 
	 * @param symptomsList
	 */
	void countSymptoms(List<String> symptomsList);
	
	/**
	 * 
	 * 
	 * @return a Map of all symptoms with number of occurrence
	 */
	Map<String, Integer> getSymptoms();
}
