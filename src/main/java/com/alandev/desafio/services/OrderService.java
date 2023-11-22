package com.alandev.desafio.services;

import com.alandev.desafio.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        double discountTax = order.getDiscount() * order.getBasic() / 100;
        return order.getBasic() - discountTax + shippingService.shipment(order);
    }
}
