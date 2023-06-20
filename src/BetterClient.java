public class BetterClient {

    Client c = new Client();
    int dodajLepiej(int x, int y) {
        int wynikBezDekoratora = c.dodaj(x,y);
        int udekorowanyWynik = wynikBezDekoratora * 10;
        return udekorowanyWynik;
    }
}
