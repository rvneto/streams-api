package com.rasmoo.streams.streamsapi.entity;

import lombok.Getter;

import java.time.LocalDate;
import java.time.Period;
import java.util.UUID;

@Getter
public class Client {

    private UUID id;
    private String name;
    private LocalDate birthDate;

    public Client(String name, LocalDate birthDate) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        return Period.between(this.birthDate, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "{ name='" + name + "', birthDate=" + birthDate + " }";
    }
}
