import java.util.Date;

public class Ksiazka {
    private String tytul;
    private Osoba autor;
    private boolean czyWypozycz;

    public Ksiazka(String tytul, String imie, String nazwisko, Date dataUrodzenia) {
        this.tytul = tytul;
        this.autor = autor;
        this.czyWypozycz = false;
        autor = new Osoba(imie,nazwisko,dataUrodzenia);
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public void setAutor(Osoba autor) {
        this.autor = autor;
    }

    public void setCzyWypozycz(boolean czyWypozycz) {
        this.czyWypozycz = czyWypozycz;
    }

    public String getTytul() {
        return tytul;
    }

    public Osoba getAutor() {
        return autor;
    }

    public boolean isCzyWypozycz() {
        return czyWypozycz;
    }
}
