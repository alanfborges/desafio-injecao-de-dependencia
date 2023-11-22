package com.alandev.desafio.services;

import com.alandev.desafio.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {
        double shipTax = 0.0;

        if (order.getBasic() < 100.0) {
            shipTax = 20.00;
        } else if (order.getBasic() >= 100.0 && order.getBasic() < 200.0) {
            shipTax = 12.00;
        } else {
            return 0.0;
        }
        return shipTax;
    }
}
