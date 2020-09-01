package com.kodilla.good.patterns.allegro;

import java.time.LocalDateTime;

interface ProductOrderService {
    boolean sell(User user, LocalDateTime orderDate, Product product, int quantity);
}