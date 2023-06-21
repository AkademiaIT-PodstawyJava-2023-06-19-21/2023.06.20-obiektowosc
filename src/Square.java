public class Square {
    int bok;
    int obw;
    int pole;

    Square(int bok) {
        //Client c = new Client();
        this.bok = bok;
        this.obw = policzObw(bok);
        this.pole = policzPole(bok);
    }

    public Square() {
    }

    public Square(int bok, int obw, int pole) {
        this.bok = bok;
        this.obw = obw;
        this.pole = pole;
    }

    Square(int bok, int obw) {
        this(bok, obw, bok*bok);
        System.out.println("cos");
    }

    int policzPole(int bok) {
        return bok*bok;
    }

    int policzObw(int bok) {
        return bok*4;
    }

    void wypiszPole() {
        System.out.println(this.pole);
    }

    int porownaj(Square square) {
        if(this.pole > square.pole) {
            return 1;
        } else if (square.pole > this.pole) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        Square square = (Square) obj;
        return this.bok == square.bok;
    }
}
