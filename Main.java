package com.company;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int n,sayi,i,max=0,min=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tam sayı gireceksiniz: ");
        n = input.nextInt();

        //n tane sayı alma işlemi
        for (i=1;i<=n;i++){
            System.out.print(i +".sayiyi giriniz: ");
            sayi = input.nextInt();

            if(i==1){
                max=sayi;
                min=sayi;
            }
            if (sayi>max)
                max=sayi;
            if(sayi<min)
                min=sayi;
        }
        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+min);
    }
}
