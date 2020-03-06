package com.spring.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;




//(6) Perform Constructor Injection in a Spring Bean
interface Q6_1
{
  void display();
}
//@Component
class Q6_2 implements Q6_1
{
 @Override
 public void display() {
  System.out.println("Aman Sharma");
 }
}
//@Component
public class Q6 {
 private final Q6_1 Q6;
 //@Autowired
 public Q6(Q6_1 q6) {   ///Constructor Injection
  Q6 = q6;
 }
 void name()
 {
  Q6.display();
 }
}
