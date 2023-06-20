public class Square {
    int bok;
    int obw;
    int pole;

    Square(int bok1) {
        Client c = new Client();
        bok = bok1;
        obw = policzObw(bok1);
        pole = policzPole(bok1);
    }

    int policzPole(int bok) {
        return bok*bok;
    }

    int policzObw(int bok) {
        return bok*4;
    }
}
