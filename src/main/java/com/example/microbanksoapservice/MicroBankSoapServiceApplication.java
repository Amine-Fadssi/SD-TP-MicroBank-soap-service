package com.example.microbanksoapservice;

public class MicroBankSoapServiceApplication {
    public static void main(String[] args) {
        String adress = "http://0.0.0.0:9090/";
        Endpoint.publish(adress, new MicroBank());
        System.out.printf("Micro bank soap com.example.microbanksoapservice.service is deployed successfully sur l'adresse : %s",
                adress);
    }
}