package it.epicode.demo.beans;

public class ExtraPomodoro extends ExtraAdditionDecorator{
    public ExtraPomodoro(Pizze pizza){
        this.pizza = pizza;
    }

    public String getNome(){
        return pizza.getNome() + " con extra pomodoro";
    }
    @Override
    public double getPrice() {
        return super.getPrice() + 0.8;
    }
}
