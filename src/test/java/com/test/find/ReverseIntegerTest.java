package com.test.find;

import java.util.List;

import java.util.Arrays;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.test.find.ReverseInteger;

class ReverseIntegerTest {

  private ReverseInteger reverseInteger = new ReverseInteger();
  
  @Test
  @DisplayName("find reverse integer for 124")
  void test1(){
    int data = 124;
    assertEquals(reverseInteger.reverseInteger(data), 421, "Reverse of 124 should be 421");
  }

  @Test
  @DisplayName("find reverse integer of -356")
  void test2(){
    int data = 356;
    assertEquals(reverseInteger.reverseInteger(data), -356, "Reverse of -356 should be -653");
  }

  @Test
  @DisplayName("find reverse integer of 280")
  void test3(){
    int data = 280;
    assertEquals(reverseInteger.reverseInteger(data), 280, "Reverse of 280 should be 82");
  }

}
