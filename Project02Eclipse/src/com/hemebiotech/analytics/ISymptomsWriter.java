package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Write in a file the list of symptoms with occurrence
 *
 */
public interface ISymptomsWriter {
	/**
	 * Write in the file the symptoms
	 * 
	 * @param symptoms
	 */
	void write(Map<String, Integer> symptoms);
}
