package com.example.emailverificationbackend.email;

public interface EmailSender {

    void send(String to , String email);
}
