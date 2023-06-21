public class App3 {
    static Square s = new Square(10);

    public static void main(String[] args) {
        Square k1 = new Square(5);
        System.out.println(k1.bok);
        System.out.println(k1.obw);
        System.out.println(k1.pole);

        cos(k1);

        System.out.println(k1.bok);
        System.out.println(k1.obw);
        System.out.println(k1.pole);

        Square k2 = new Square(6);

        System.out.println(k1.porownaj(k2));

        PorownywaczKwadratow porownywacz = new PorownywaczKwadratow();
        System.out.println(porownywacz.porownaj(k1, k2));

        Square k3 = new Square(5);
        Square k4 = new Square();
        Square k5 = new Square(6, 24, 36);
    }

    public static void cos(Square s) {
        //s.pole = 1000;
        s.pole = 10;
    }
}
