package com.learn.designpattern.structuralDP.BridgeDesignPattern;

public class TextFileService implements FileService{
    @Override
    public void dataProcessing(String data) {
        System.out.println("TextFileService");
    }
}
