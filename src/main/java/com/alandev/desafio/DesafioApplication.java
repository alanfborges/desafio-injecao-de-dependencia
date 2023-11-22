package com.alandev.desafio;

import com.alandev.desafio.entities.Order;
import com.alandev.desafio.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;

import java.util.Locale;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

    @Autowired
    private OrderService orderService;

    public static void main(String[] args) {
        SpringApplication.run(DesafioApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Locale.setDefault(Locale.US);
        Order order = new Order(1309, 95.90, 0.0);
        double valorTotal = orderService.total(order);
        System.out.println("Pedido código " + order.getCode());
        System.out.printf("Valor total: R$%.2f", valorTotal);
    }
}
