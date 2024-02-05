package it.epicode.demo.beans;

import java.util.List;

public class ExtraProsciutto extends ExtraAdditionDecorator{
    public ExtraProsciutto(Pizze pizza){
        this.pizza = pizza;
        this.pizza.setNome(pizza.getNome() + " con extra prosciutto");
        this.pizza.setPrice(pizza.getPrice()+ 1.00);
    }

}
