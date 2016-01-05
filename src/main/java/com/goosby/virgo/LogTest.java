package com.goosby.virgo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {
	protected static Logger logger = LoggerFactory.getLogger(LogTest.class);
	
	public static void main(String[] args){
		logger.info("This is {} log model !", "info");
	}
	
	
}
