package com.learn.designpattern.structuralDP.BridgeDesignPattern;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BridgeRunnerTest {
    @Test
    public void testEmailExtraction() {
        FileService fileService = new ExcelFileService();
        UtilityService utilityService = new BusinessService(fileService);

        String data = "john.doe@example.com";
        String email = utilityService.emailExtraction(data);

        assertEquals("john.doe@example.com", email);
    }
}
