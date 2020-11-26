package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class Semestar {
    private String ime;
    private List<Predmet> obavezniPredmeti;
    private List<Predmet> izborniPredmeti;

    public Semestar(String ime) {
        this.ime = ime;
        obavezniPredmeti = new ArrayList<>();
        izborniPredmeti = new ArrayList<>();
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public List<Predmet> getObavezniPredmeti() {
        return obavezniPredmeti;
    }

    public void setObavezniPredmeti(List<Predmet> obavezniPredmeti) {
        this.obavezniPredmeti = obavezniPredmeti;
    }

    public List<Predmet> getIzborniPredmeti() {
        return izborniPredmeti;
    }

    public void setIzborniPredmeti(List<Predmet> izborniPredmeti) {
        this.izborniPredmeti = izborniPredmeti;
    }
}
