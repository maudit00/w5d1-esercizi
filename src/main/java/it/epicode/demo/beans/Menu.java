package it.epicode.demo.beans;

import lombok.Data;

import java.util.List;

@Data
public class Menu {
    List<Pizze> pizze;
    List<Drinks> drinks;
    List<Toppings> toppings;
}
