package com.kacpiegzamin.model;

import javax.persistence.*;
import java.util.List;
@Entity
class Przedmiot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "identyfikator_przedmiotu")
    private Long id;
    private String nazwa;
    private int ECTS;
    private double iloscGodzin;
    @ManyToMany
    private List<Prowadzący> prowadzący;
    @OneToMany
    private List<Zajecia> zajecia;
    private Profesor profesor;
}
