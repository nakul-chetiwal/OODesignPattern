package com.learn.designprinciples.SOLID;

public class SingleResponsibilityPrincipleBadExample {

}
// All implementation is done in one class, in one method actaully
class AccountService{
    public void openAccount(){
        System.out.println("Logic to fill the details account");
        System.out.println("Logic to Send data to Repository");
        System.out.println("Logic to send notification");
    }
}


