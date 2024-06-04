package com.rasmoo.streams.streamsapi.entity;

import lombok.Getter;

import java.util.UUID;

@Getter
public class Product {

    private UUID id;
    private String nome;
    private Double price;

    public Product(String nome, Double price) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.price = price;
    }
}
