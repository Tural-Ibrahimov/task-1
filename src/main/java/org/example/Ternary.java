package org.example;


public class Ternary {
    public static void main(String[] args) {
        int ay = 15;
        System.out.println(
                (ay >= 1 && ay <= 12) ?
                        (ay >= 3 && ay <= 5) ? "yaz" :
                        (ay >= 6 && ay <= 8) ? "yay" :
                                (ay >= 9 && ay <= 11) ?  "payiz" : "qis":"yalnis cavab"


        );

    }
}