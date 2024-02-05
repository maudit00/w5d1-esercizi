package it.epicode.demo.beans;

public class ExtraProsciutto extends ExtraAdditionDecorator{
    public ExtraProsciutto(Pizze pizza){
        this.pizza = pizza;
    }

    public String getNome(){
        return pizza.getNome() + " con extra prosciutto";
    }
    @Override
    public double getPrice() {
        return super.getPrice() + 1.00;
    }

    @Override
    public String toString() {
        return "ExtraProsciutto{" +
                "pizza=" + pizza +
                '}';
    }
}
