package com.test; 

import org.springframework.stereotype.Service;

@Service
public class EchoService {
  public void echo(String data) {
    System.out.println(data);
 }
}