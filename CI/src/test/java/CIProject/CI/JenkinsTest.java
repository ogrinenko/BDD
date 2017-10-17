package CIProject.CI;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JenkinsTest {

 @Before
 public void setUp()  {
  System.out.println("-------------------------");
 }

 @After
 public void tearDown() {
  System.out.println("-------------------------");
 }

 @Test
 public void test1() {
  
  System.out.println("Test 1");
  int a = 5;
  int b = 5;
  Assert.assertTrue(a == b);
 }
 
 @Test
 public void test2() {
  
  System.out.println("Test 2");
  int a = 5;
  int b = 5;
  Assert.assertTrue(a == b);
 }

}