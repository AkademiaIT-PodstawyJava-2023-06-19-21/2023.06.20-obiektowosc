import baza.danych.v1.Connector;

public class App5 {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        System.out.println(a == b);

        Square s1 = new Square(5);
        Square s2 = new Square(6);

        System.out.println(s1 == s2);

        System.out.println(s1.pole);
        System.out.println(s2.pole);

        s1.pole = 50;

        System.out.println(s1.pole);
        System.out.println(s2.pole);

        System.out.println(s1.equals(s2));

        String tekst1 = "ABC";
        String tekst2 = "ABC";

        System.out.println(tekst1.equals(tekst2));

        System.out.println(tekst1 == tekst2);

        tekst1 = tekst1 + "XYZ";

        System.out.println(tekst1);
        System.out.println(tekst2);

        String s = "sdkajhdgfkjahsgdkjhf";
        String mniejszyString = s.substring(0,5);
        System.out.println(mniejszyString);
        char[] chars = s.toCharArray();
        for(char c : chars) {
            System.out.println(c);
        }

        final int x = 5;
        final Square square = new Square(5);

        square.bok = 7;
        System.out.println(square.bok);

        //square = new Square(7);

        Connector connector = new Connector();
    }
}
