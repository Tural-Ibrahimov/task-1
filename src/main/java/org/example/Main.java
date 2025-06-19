package org.example;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

import java.util.Scanner;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

Scanner scanner=new Scanner(System.in);

        System.out.println("birinci imtahan balini daxil edin");
int bal1 = scanner.nextInt();

        System.out.println("ikinci imtahan balini daxil edin");
int bal2 = scanner.nextInt();

        System.out.println("ucuncu imtahan balini daxil edin");
int bal3 = scanner.nextInt();

if (bal1<40 || bal2<40 || bal3<40){
    System.out.println("Kesildiniz, birden cox neticeniz asagidir");
}
else {
    double orta=(bal1+bal2+bal3)/3;
    System.out.println(orta);
    if (orta >=85 && bal1>=85 && bal2>=85 && bal3>=85 ){
        System.out.println("Sz mukemmel sertifikati qazandiniz");
    } else if (orta >=70 && orta<85 && bal1>=60 && bal2>=60 && bal3>=60) {
        System.out.println("Siz nailiyyet sertifikati qazandiniz");
    } else if (orta>=50 && orta<70) {
        System.out.println( "kecdiniz");
    }else {
        System.out.println("kesildiniz");
    }

}
        }
    }
