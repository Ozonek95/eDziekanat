package com.kacpiegzamin.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
class Zadanie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nazwaZadania;
    private LocalDateTime czasRozpoczecia;
    private LocalDateTime czasZakonczenia;

    public Zadanie(String nazwaZadania, LocalDateTime czasRozpoczecia, LocalDateTime czasZakonczenia) {
        this.nazwaZadania = nazwaZadania;
        this.czasRozpoczecia = czasRozpoczecia;
        this.czasZakonczenia = czasZakonczenia;
    }
}
