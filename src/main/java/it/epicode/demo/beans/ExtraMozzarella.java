package it.epicode.demo.beans;

public class ExtraMozzarella extends ExtraAdditionDecorator{
    public ExtraMozzarella(Pizze pizza){
        this.pizza = pizza;
    }

    public String getNome(){
        return pizza.getNome() + " con extra mozzarella";
    }
    @Override
    public double getPrice() {
        return super.getPrice() + 1.20;
    }
}
