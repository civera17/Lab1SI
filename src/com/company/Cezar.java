package com.company;

public class Cezar {

    public static StringBuffer cifrareaCezar(int key, String text) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                char ch = (char) (((int) text.charAt(i) +
                        key - 65) % 26 + 65);
                stringBuffer.append(ch);
            } else {
                char ch = (char) (((int) text.charAt(i) +
                        key - 97) % 26 + 97);
                stringBuffer.append(ch);
            }
        }
        return stringBuffer;
    }

    public static StringBuffer decifrareaCezar(String cifrat, int key) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < cifrat.length(); i++) {
            if (Character.isUpperCase(cifrat.charAt(i))) {
                char ch = (char) (((int) cifrat.charAt(i) -
                        key - 65) % 26 + 65);
                stringBuffer.append(ch);
            } else {
                char ch = (char) (((int) cifrat.charAt(i) -
                        key - 97) % 26 + 97);
                stringBuffer.append(ch);
            }
        }
        return stringBuffer;
    }
}
