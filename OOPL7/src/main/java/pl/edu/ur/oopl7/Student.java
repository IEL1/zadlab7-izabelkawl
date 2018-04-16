/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

/**
 *
 * @author student
 */
class Student extends Osoba {

    private int nr_indeksu;
    private String typ_studiow;
    private String kierunek;
    private int rok_studiow;

    public Student(String imie, String nazwisko, int data_urodzenia, String plec, String cecha) {
        super(imie, nazwisko, data_urodzenia, plec, cecha);
    }
    @Override
    public String toString(){
    return "Informacje o studencie"+getImie()+getNazwisko();
}
    
}
