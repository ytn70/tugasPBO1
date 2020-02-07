package com.tugas;

import java.awt.*;
import java.util.Random;

public class Player{
    String nama;
    int speed,healthPoint,hasil;
    Random angkaRandom = new Random();

    Player(String inputNama,int inputSpeed,int inputHealthpoint){
        nama= inputNama;
        speed=inputSpeed;
        healthPoint= inputHealthpoint;
    }
    void run(){
        System.out.println("\nMULAI");
        System.out.println(nama+" Mulai berlari");
        System.out.println(nama+" Sedang berlari dengan kecepatan "+speed);
    }
    void isDead(){
        if(healthPoint<=0){
            System.out.println("Terkena obstacle dan dia mati");

        }else{
            System.out.println("Masih berlari dengan kecepatan "+speed);
            obstacles();
        }
    }
    void obstacles(){
        for(int i=0;i<100;i++){
            hasil=1+angkaRandom.nextInt(9);
            if(hasil%2==0){
                speed=speed-hasil;
                healthPoint=healthPoint-(8*hasil);
               if(healthPoint>0&&speed>0){
                   System.out.println("Terkena obstacle, kecepatan "+speed+" darah "+healthPoint);
               }
                else{
                    break;
               }
            }
        }isDead();
    }
}