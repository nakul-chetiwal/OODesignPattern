package com.learn.designpattern.structuralDP.BridgeDesignPattern;

public class BusinessService implements UtilityService{
    private FileService fileService;

    public BusinessService(FileService fileService) {
        this.fileService = fileService;
    }

    @Override
    public String emailExtraction(String data) {
        fileService.dataProcessing(data);
        String email = "";
        if (data.contains(".com")) {
            email = data;
        }
        return email;
    }
}
