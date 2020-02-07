package com.tugas;

public class Main {
    public static void main(String[] args) {
       Player pemain1 = new Player("Andrew", 18,  100 );
       pemain1.run();
       pemain1.isDead();
       Player pemain2 = new Player("Reza",20,93);
       pemain2.run();
       pemain2.isDead();
    }

}