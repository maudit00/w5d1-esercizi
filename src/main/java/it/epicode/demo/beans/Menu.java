package it.epicode.demo.beans;

import lombok.Data;

import java.util.List;

@Data
public class Menu {

    private List<Pizze> pizze;
    private List<Drinks> drinks;
    private List<Toppings> toppings;
}
