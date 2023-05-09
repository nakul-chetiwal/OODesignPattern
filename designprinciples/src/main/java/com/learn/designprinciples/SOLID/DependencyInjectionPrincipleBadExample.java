package com.learn.designprinciples.SOLID;

public class DependencyInjectionPrincipleBadExample {


}

// Dependency Injection Principle is violated-High level module is dependant on low level module
//Application Layer  -- High level Module
class MyMessage{
 TCPPrototypeHandler handler=new TCPPrototypeHandler();

 public void send(String to, String message){
     handler.sendMessage();
 }

}

// Transport Layer - Low Level Module
class TCPPrototypeHandler{
   public void sendMessage(){
        System.out.println("Message from TCPHandler");
    }

}

