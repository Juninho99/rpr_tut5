package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String ime;
    private String prezime;
    private Semestar semestar;
    private List<Predmet> predmeti;
    private Boolean upisan;

    public Student(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
        predmeti = new ArrayList<>();
        upisan = false;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Semestar getSemestar() {
        return semestar;
    }

    public void setSemestar(Semestar semestar) {
        this.semestar = semestar;
    }

    public List<Predmet> getPredmeti() {
        return predmeti;
    }

    public void setPredmeti(List<Predmet> predmeti) {
        this.predmeti = predmeti;
    }

    void dodajObaveznePredmete() {
        this.predmeti = semestar.getObavezniPredmeti();
        //provjeriti da li ima preko 30 ects
    }

    void dodajIzborniPredmet(Predmet predmet) {
        //provjeriti da li ima preko 30 ects
    }
}
