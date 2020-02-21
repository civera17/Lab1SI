package com.company;


public class Vernam {

    public static String cipherTextVernam(String str, String key) {
        String cipher_text = "";

        for (int i = 0; i < str.length(); i++) {

            int x = (str.charAt(i) + key.charAt(i)) % 26;

            x += 'A';

            cipher_text += (char) (x);
        }
        return cipher_text;
    }
    public static String originalTextVernam(String cipher_text, String key) {
        String orig_text = "";

        for (int i = 0; i < cipher_text.length(); i++) {

            int x = (cipher_text.charAt(i) -
                    key.charAt(i) + 26) % 26;

            x += 'A';
            orig_text += (char) (x);
        }
        return orig_text;
    }
}
