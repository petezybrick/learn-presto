package com.pzybrick.learnpresto;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TryFirst {
	private static final Logger logger = LogManager.getLogger(TryFirst.class);

	public static void main(String[] args) {
		logger.info("Howdy {}",  "Slim");

	}

}
