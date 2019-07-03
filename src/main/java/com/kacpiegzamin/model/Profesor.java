package com.kacpiegzamin.model;

import javax.persistence.*;
import java.util.List;

@Entity
class Profesor implements Prowadzący {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany
    private List<Zadanie> kalendarz;
    private List<Przedmiot> przedmioty;
}
