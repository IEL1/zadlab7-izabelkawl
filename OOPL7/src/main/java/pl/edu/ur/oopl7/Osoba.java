/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

/**
 *
 * @author Izabela
 */
public class Osoba {

    private String imie;
    private String plec;
    private String cecha;
    private String nazwisko;
    private int data_urodzenia;

    public Osoba(String imie, String nazwisko, int data_urodzenia, String plec, String cecha) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.data_urodzenia = data_urodzenia;
        this.plec = plec;
        this.cecha = cecha;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getData_urodzenia() {
        return data_urodzenia;
    }

    public void setData_urodzenia(int data_urodzenia) {
        this.data_urodzenia = data_urodzenia;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    public String getCecha() {
        return cecha;
    }

    public void setCecha(String cecha) {
        this.cecha = cecha;
    }
}
