public class PorownywaczKwadratow {
    int porownaj(Square square1, Square square2) {
        if(square1.pole > square2.pole) {
            return 1;
        } else if (square2.pole > square1.pole) {
            return -1;
        } else {
            return 0;
        }
    }
}
