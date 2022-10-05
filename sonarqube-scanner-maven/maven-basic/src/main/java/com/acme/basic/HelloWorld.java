package com.acme.basic;
import org.apache.log4j.Logger;


public class HelloWorld {

  private static final Logger LOGGER = Logger.getLogger( HelloWorld.class );

  void sayHello() {
    LOGGER.info("Hello");
  }


/* 
  void notCovered() {
    System.out.println("This method is not covered by unit tests");
  }
*/


  void notscanned() {
    System.out.println("This method is not scanned");
  }
  void testing(){
    int a = 5+6;
    LOGGER.info("a= " + a);
    int b = 0;
  }
}