package com.company;

import java.lang.Math;

public class Main {

    public static void main(String args[]) {

        String str = "PAROLAMEA";
        String keyword = "BEC";
        String key = Vigenere.generateKey(str,keyword);
        String chipherText = Vigenere.cipherText(str,key);
        String unchiperText = Vigenere.originalText(chipherText,key);
        System.out.println("Vigenere: \n");
        System.out.println(chipherText);
        System.out.println(unchiperText);
        System.out.println("Vernam: \n");
        String ciphered = Vernam.cipherTextVernam("LAMULTIANI", "VIDAGTSROL");
        System.out.println(ciphered);
        String unphered = Vernam.originalTextVernam(ciphered,"VIDAGTSROL");
        System.out.println(unphered);
        System.out.println("Cezar: \n");
        System.out.println(Cezar.cifrareaCezar(3,"PAROLAMEA"));
        System.out.println(Cezar.decifrareaCezar(Cezar.cifrareaCezar(3,"PAROLAMEA").toString(),3));



    }
}
