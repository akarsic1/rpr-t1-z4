package com.company;



public class Program {

    public static void main(String[]  arg){
        Student student1 = new Student("Amel", "Amelovic",   22);
        Student student2 = new Student("Mujo", "Mujic", 23);
        Student student3 = new Student("Kare", "Karic", 24);
        Predmet predmet1 = new Predmet("TP", 2457,40);
        predmet1.upisi(student1);
        predmet1.upisi(student2);
        predmet1.upisi(student3);
        predmet1.ispisStudenata();
        predmet1.Ispisi(student1);
        predmet1.ispisStudenata();

    }

}