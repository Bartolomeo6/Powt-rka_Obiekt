import java.util.Date;

public class Bibliotekarz extends Osoba {
    private Date dataZatrudnienia;

    public Bibliotekarz(String imie, String nazwisko, Date dataUr, Date dataZatrudnienia) {
        super(imie, nazwisko, dataUr);
        this.dataZatrudnienia = dataZatrudnienia;
    }
}
