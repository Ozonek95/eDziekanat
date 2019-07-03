package com.kacpiegzamin.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numer_albumu")
    private Long nrAlbumu;
    private String imie;
    private String nazwisko;
//    @ManyToMany(fetch = FetchType.LAZY)
//    private List<Przedmiot> przedmioty;

    public Student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void setPrzedmioty(List<Przedmiot> przedmioty) {
     //   this.przedmioty = przedmioty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nrAlbumu=" + nrAlbumu +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
