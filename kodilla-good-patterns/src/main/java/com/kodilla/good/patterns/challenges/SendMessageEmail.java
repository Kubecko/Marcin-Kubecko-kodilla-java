package com.kodilla.good.patterns.challenges;

public class SendMessageEmail implements  SendMessage{
    @Override
    public void sendMessage(UserAllegro userAllegro) {
        System.out.println("I sent email " + userAllegro.getEmail());
    }

    @Override
    public void sendNotMessage(UserAllegro userAllegro) {
        System.out.println("I could not send email " + userAllegro.getEmail());
    }

}
