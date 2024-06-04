package com.rasmoo.streams.streamsapi.entity;

import lombok.Getter;

import java.util.List;
import java.util.UUID;

@Getter
public class Order {

    private UUID id;
    private Client client;
    private List<OrderItem> items;

    public Order(Client client, List<OrderItem> items) {
        this.id = UUID.randomUUID();
        this.client = client;
        this.items = items;
    }
}
