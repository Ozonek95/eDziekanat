package com.kacpiegzamin.model;

import javax.persistence.Entity;
import java.util.List;
@Entity
public class StudentDoktorancki extends Student implements Prowadzący {
    public StudentDoktorancki(String imie, String nazwisko) {
        super(imie, nazwisko);
    }

    @Override
    public void setPrzedmioty(List<Przedmiot> przedmioty) {
        super.setPrzedmioty(przedmioty);
    }
}
