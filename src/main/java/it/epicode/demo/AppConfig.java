package it.epicode.demo;

import it.epicode.demo.beans.Drinks;
import it.epicode.demo.beans.Pizze;
import it.epicode.demo.beans.Toppings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Configuration
public class AppConfig {
    @Bean("prosciutto")
    @Scope("prototype")
    public Toppings getProsciutto (){
        Toppings t = new Toppings();
        t.setNome("Prosciutto");
        t.setCalories(100);
        t.setPrice(1.00);
        return t;
    }
    @Bean("mozzarella")
    @Scope("prototype")
    public Toppings getMozzarella (){
        Toppings t = new Toppings();
        t.setNome("Mozzarella");
        t.setCalories(80);
        t.setPrice(1.20);
        return t;
    }
    @Bean("pomodoro")
    @Scope("prototype")
    public Toppings getPomodoro (){
        Toppings t = new Toppings();
        t.setNome("Pomodoro");
        t.setCalories(50);
        t.setPrice(0.80);
        return t;
    }
    @Bean("ananas")
    @Scope("prototype")
    public Toppings getAnanas (){
        Toppings t = new Toppings();
        t.setNome("Ananas");
        t.setCalories(80);
        t.setPrice(1.80);
        return t;
    }
    @Bean("pizzaMargherita")
    @Scope("prototype")
    public Pizze getPizzaMargherita (){
        Pizze p = new Pizze();
        p.setNome("Margherita");
        p.setToppings(List.of(getPomodoro(),getMozzarella()));
        p.setCalories(400);
        p.setPrice(4.0);
        return p;
    }

    @Bean("acqua")
    @Scope("prototype")
    public Drinks getAcqua(){
        Drinks d = new Drinks();
        d.setNome("Acqua");
        d.setCalories(0);
        d.setPrice(1);
        d.setQuantity(0.5);
        d.setAlcohol(0);
        return d;
    }
    @Bean("sprite")
    @Scope("prototype")
    public Drinks getSprite(){
        Drinks d = new Drinks();
        d.setNome("Sprite");
        d.setCalories(150);
        d.setPrice(2.5);
        d.setQuantity(0.33);
        d.setAlcohol(0);
        return d;
    }
}
