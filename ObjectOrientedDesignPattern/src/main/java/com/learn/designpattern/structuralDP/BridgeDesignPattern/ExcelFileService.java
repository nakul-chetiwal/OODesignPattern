package com.learn.designpattern.structuralDP.BridgeDesignPattern;

public class ExcelFileService implements FileService{
    @Override
    public void dataProcessing(String data) {
        System.out.println("ExcelFileService");
    }
}
