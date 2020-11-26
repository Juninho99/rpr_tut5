package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class Predmet {
    private String ime;
    private int ects;
    private List<Student> studenti;

    public Predmet(String ime, int ects) {
        this.ime = ime;
        this.ects = ects;
        studenti = new ArrayList<>();
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getEcts() {
        return ects;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }
}
