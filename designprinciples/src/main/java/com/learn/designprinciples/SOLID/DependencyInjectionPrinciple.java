package com.learn.designprinciples.SOLID;

public class DependencyInjectionPrinciple {
    public static void main(String[] args) {
        MyMessagee myMessagee=new MyMessagee("TCP");
        myMessagee.send("TCP","send to TCP");

    }
}

//Application Layer  -- High level Module
class MyMessagee{
    // High level Module is dependent on abstractions(high level Module)
    PrototypeHandler handler;
    MyMessagee(String s){
        handler=   PrototypeFactory.getPrototype("UDP");

    }

    public void send(String to, String message){
        handler.sendMessage();
    }
}

// High Level module
interface PrototypeHandler{
    public void sendMessage();
}

// Transport Layer - Low Level Module
class TCPPrototypeHandlerr implements PrototypeHandler{
    @Override
    public void sendMessage(){
        System.out.println("Message from TCPHandler");
    }
}

class UDPPrototypeHandlerr implements PrototypeHandler{
    @Override
    public void sendMessage(){
        System.out.println("Message from UDPHandler");
    }
}

class PrototypeFactory{
    public static PrototypeHandler getPrototype(String prototype){
        if("TCP".equalsIgnoreCase(prototype)){
            return new TCPPrototypeHandlerr();
        }
        if("UDP".equalsIgnoreCase(prototype)){
            return new UDPPrototypeHandlerr();
        }
        return null;
    }
}
