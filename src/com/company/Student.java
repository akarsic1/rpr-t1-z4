package com.company;

public class Student {
    String ime, prezime;
    int broj_indexa;
    public Student(String n_ime, String n_prezime, int br_indexa){
        ime = n_ime;
        prezime = n_prezime;
        broj_indexa = br_indexa;
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

    public int getBroj_indexa() {
        return broj_indexa;
    }

    public void setBroj_indexa(int broj_indexa) {
        this.broj_indexa = broj_indexa;
    }
    @Override
    public String toString(){
        String za_ispis;
        za_ispis =(ime + " " + prezime + " " + "(" + broj_indexa + ")");
        return za_ispis;
    }
}
