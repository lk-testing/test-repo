package com.acme.basic;

import java.beans.Transient;

import org.junit.Test;

public class HelloWorldTest {

  @Test
  public void sayHello() {
    new HelloWorld().sayHello();
  }
  @Test
  public void testing(){
    new HelloWorld().testing();
  }

}
