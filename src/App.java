import java.util.Random;

public class App {
    public static void main(String[] args) {
        Client c1 = new Client();
        Client c2 = new Client();

        c1.name = "Janusz";
        c1.surname = "Kowalski";
        c1.age = 30;
        c1.pesel = 123123;

        c2.name = "Zbyszek";
        c2.surname = "Malinowski";
        c2.pesel = 12345678901L;
        c2.age = 50;
        /*Address a2 = new Address();
        a2.city = "Krakow";
        a2.street = "Ogrodowa";
        c2.address = a2;*/
        c2.address.city = "Krakow";
        c2.address.street = "Ogrodowa";

        System.out.println(c2.name);

        int[] tab = new int[10];
        System.out.println(tab.length);

        int a = 5;
        System.out.println(tab);
        System.out.println(c1);
        System.out.println(c2);

        Client c3 = new Client();
        System.out.println(c3.age);
        System.out.println(c3.pesel);
        System.out.println(c3.name);
        System.out.println(c3.address);

        String[] strings = new String[10];
        strings[0] = "ashdgfkjh";
        System.out.println(strings[0]);

        //System.out.println(new Random().nextInt(1001));

        int x = 5;
        int wynikDodawania = c3.dodaj(x,9);
        double wynikDodawania2 = c3.dodaj(3.3, 5.5);

        System.out.println(wynikDodawania);
        System.out.println(c3.dodaj(3.3, 5.5));

        c3.metodaCoNicNieZwraca(4, 1.1);

        //System.out.println(c3.metodaCoNicNieZwraca(4, 1.1));

        GeneratorLiczb gl = new GeneratorLiczb();
        System.out.println(gl.generateValue());
        System.out.println(gl.generateValue());
        System.out.println(gl.generateValue());
        System.out.println(gl.generateValue());
        System.out.println(gl.generateValue());
        System.out.println(gl.generateValue());

        System.out.println(7);

        c3.dodaj(4, 4.4);
    }
}
