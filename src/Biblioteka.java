import java.util.ArrayList;

public class Biblioteka {
    public ArrayList<Czytelnik> czytelnicy;
    public ArrayList<Bibliotekarz> bibliotekarze;
    public ArrayList<Ksiazka> ksiazki;

    public Biblioteka(ArrayList<Czytelnik> czytelnicy, ArrayList<Bibliotekarz> bibliotekarze, ArrayList<Ksiazka> ksiazki) {
        czytelnicy = new ArrayList<>();
        bibliotekarze = new ArrayList<>();
        ksiazki = new ArrayList<>();
    }

    public void wypozyczKsiazke(Ksiazka ksiazka, Czytelnik czytelnik){
        if(ksiazka.isCzyWypozycz()){
            System.out.println("Nie można wypożyczyć książki");
        }
        else{
            czytelnik.dodajKsiazke(ksiazka);
            ksiazka.setCzyWypozycz(true);
        }
    }

    public int IleWypozyczono(Czytelnik czytelnik){
        return czytelnik.ileWypoz();
    }
}
