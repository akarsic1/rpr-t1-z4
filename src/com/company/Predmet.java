package com.company;



public class Predmet {
    private Student[] niz_studenata;
    private String naziv_predmeta;
    private int sifra_predmeta;
    private static int max_broj_studenata = 10;
    private int velicina = 0;

    public Predmet(String predmet, int sifra, int m){
        niz_studenata = new Student[m];
        naziv_predmeta = predmet;
        sifra_predmeta = sifra;
        max_broj_studenata = m;
    }
    public void upisi(Student student){
        niz_studenata[velicina] = student;
        velicina++;
    }
    public void Ispisi(Student s){
        for (int i=0;i<velicina;i++)
            if(s.getIme().equals(niz_studenata[i].getIme())){
                for(int j=i;j+1<velicina;j++)
                    niz_studenata[j]=niz_studenata[j+1];
            }
        velicina--;
    }

    public String getNaziv_predmeta() {
        return naziv_predmeta;
    }

    public void setNaziv_predmeta(String naziv_predmeta) {
        this.naziv_predmeta = naziv_predmeta;
    }

    public int getSifra_predmeta() {
        return sifra_predmeta;
    }

    public void setSifra_predmeta(int sifra_predmeta) {
        this.sifra_predmeta = sifra_predmeta;
    }

    public int getVelicina() {
        return velicina;
    }

    public void ispisStudenata(){
        for(int i = 0; i < velicina; i++){
            System.out.print(i + 1 + ". ");
            niz_studenata[i].ispisiStudenta();
        }
    }
}