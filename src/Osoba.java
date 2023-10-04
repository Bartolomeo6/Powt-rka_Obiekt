import java.util.Date;

abstract public class Osoba {
    private String imie;        // abstract - nie można utworzyć instancji
    private String nazwisko;
    private Date dataUr;

    // ETAP [1] -> Konstruktor

    public Osoba(String imie, String nazwisko, int rok, int miesiac, int dzien) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        dataUr = new Date(dzien,miesiac,rok);
    }

    // ETAP [2] -> GETTERY wszystkiego

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public Date getDataUr() {
        return dataUr;
    }
}
