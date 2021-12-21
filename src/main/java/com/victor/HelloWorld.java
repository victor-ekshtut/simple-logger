package com.victor;

import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

public class HelloWorld {

  public static void main(final String[] args) {
    Logger logger = Logger.getLogger("test");
    
    System.out.println("Hello, World! The current time is test " + System.currentTimeMillis());
    logger.log(Priority.DEBUG, "Writing to logger");
  }

}
