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
    }

    public static void cos(Square s) {
        //s.pole = 1000;
        s.pole = 10;
    }
}
