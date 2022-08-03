package com.hemebiotech.analytics;

/**
 * Main Class of the Project to launch the process
 *
 */
public class Main {
	private static final String INPUT_FILE_PATH = System.getProperty("user.dir").concat("/resources/symptoms.txt");
	private static final String OUTPUT_FILE_PATH = System.getProperty("user.dir").concat("/resources/result.out");
	
	public static void main(String[] args) throws Exception {
		AnalyticsCounter analyticsCounter = new AnalyticsCounter(INPUT_FILE_PATH, OUTPUT_FILE_PATH);
		analyticsCounter.launch();
	}
}
