package com.learn.designpattern.structuralDP.BridgeDesignPattern;

public class BridgeRunner {
    public static void main(String[] args) {
        UtilityService utilityService = new BusinessService(new ExcelFileService());
        utilityService.emailExtraction("brown@gmail.com");
    }
}
