import java.util.List;

public class Client {
    static String name;
    String surname;
    int age;
    long pesel;
    Address address = new Address();

    int rok;
    int miesiac;
    int dzien;

    int dodaj(int x, int y) {
        System.out.println("dodawnie intow !!!");
        return x + y;
    }

    double dodaj(double x, double y) {
        System.out.println("dodawanie double'i !!!");
        return x + y;
    }

    void setPesel(long p) {
        pesel = p;
        rok = (int) p/10000;
        miesiac = (int) p/100;
        dzien = (int) p/10;
    }

    int metoda(int x) {
        if(x > 5) {
            return 10;
        }
        App3.s.pole = 10;
        return 0;
    }

    void metodaCoNicNieZwraca(int x, double y) {
        double wynik = x*y;
        System.out.println(wynik);
    }

    void powiedzNazwisko() {
        System.out.println(this.surname);
    }
}
