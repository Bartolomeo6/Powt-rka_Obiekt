import java.util.ArrayList;
import java.util.Date;

public class Czytelnik extends Osoba{           // wykorzystujemy Czytelnika, bo on jest OSOBĄ
    private int nrCzytel;
    private static int liczbaCzytel;
    private ArrayList<Ksiazka> wypozyczoneKsiazki = new ArrayList<>();      //deklaracja Tablicy

    public Czytelnik(String imie, String nazwisko, Date dataUr) {
        super(imie, nazwisko, dataUr);
        nrCzytel++;
        this.nrCzytel = nrCzytel;
        this.wypozyczoneKsiazki = wypozyczoneKsiazki;
    }

    public void setNrCzytel(int nrCzytel) {
        this.nrCzytel = nrCzytel;
    }

    public static void setLiczbaCzytel(int liczbaCzytel) {
        Czytelnik.liczbaCzytel = liczbaCzytel;
    }

    public void setWypozyczoneKsiazki(ArrayList<Ksiazka> wypozyczoneKsiazki) {
        this.wypozyczoneKsiazki = wypozyczoneKsiazki;
    }

    public int getNrCzytel() {
        return nrCzytel;
    }

    public static int getLiczbaCzytel() {
        return liczbaCzytel;
    }

    public ArrayList<Ksiazka> getWypozyczoneKsiazki() {
        return wypozyczoneKsiazki;
    }

    public void dodajKsiazke(Ksiazka ksiazka){
        wypozyczoneKsiazki.add(ksiazka);
    }

    public int ileWypoz(){
        return wypozyczoneKsiazki.size();
    }
}
