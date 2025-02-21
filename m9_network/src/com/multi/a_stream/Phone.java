package com.multi.a_stream;

import java.io.Serial;
import java.io.Serializable;

public class Phone implements Serializable {
    @Serial
    private static final long serialVersionUID = -1119638060573605093L;

//    private static final long serialVersionUID = -8200989365089623396L;

    private String brand;
    private int price;

    public Phone() {
    }

    public Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
