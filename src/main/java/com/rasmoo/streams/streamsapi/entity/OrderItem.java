package com.rasmoo.streams.streamsapi.entity;

import lombok.Getter;

import java.util.UUID;

@Getter
public class OrderItem {

    private UUID id;
    private Product product;
    private int amount;

    public OrderItem(Product product, int amount) {
        this.id = UUID.randomUUID();
        this.product = product;
        this.amount = amount;
    }

    public Double getPrice() {
        return product.getPrice() * this.amount;
    }
}
