package com.learn.designprinciples.SOLID;

public class SingleResponsibilityPrinciple {
}
class AccountServicee{
    AccountRepository accountRepository=new AccountRepository();
    public void openAccount(){
        System.out.println("Logic to fill the details account");
        accountRepository.insert();
    }
}

class AccountRepository{
    public void insert(){
        System.out.println("Logic to Send data to Repository");
    }
}

class Notification{
    public void notification(){
        System.out.println("Logic to send notification");
    }
}