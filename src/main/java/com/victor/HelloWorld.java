package com.victor;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class HelloWorld {

  public static void main(final String[] args) {
    Logger logger = Logger.getLogger("test");
    
    System.out.println("Hello, World! The current time is test " + System.currentTimeMillis());
    logger.log(Level.INFO, "Writing to logger");
  }

}
