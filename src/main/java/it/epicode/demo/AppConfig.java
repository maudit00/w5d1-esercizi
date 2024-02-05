package it.epicode.demo;

import it.epicode.demo.beans.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Configuration
public class AppConfig {
    @Bean("prosciutto")
    @Scope("singleton")
    public Toppings getProsciutto (){
        Toppings t = new Toppings();
        t.setNome("Prosciutto");
        t.setCalories(100);
        t.setPrice(1.00);
        return t;
    }
    @Bean("mozzarella")
    @Scope("singleton")
    public Toppings getMozzarella (){
        Toppings t = new Toppings();
        t.setNome("Mozzarella");
        t.setCalories(80);
        t.setPrice(1.20);
        return t;
    }
    @Bean("pomodoro")
    @Scope("singleton")
    public Toppings getPomodoro (){
        Toppings t = new Toppings();
        t.setNome("Pomodoro");
        t.setCalories(50);
        t.setPrice(0.80);
        return t;
    }
    @Bean("salamePiccante")
    @Scope("singleton")
    public Toppings getSalamePiccante (){
        Toppings t = new Toppings();
        t.setNome("SalamePiccante");
        t.setCalories(250);
        t.setPrice(1.80);
        return t;
    }
    @Bean("ananas")
    @Scope("singleton")
    public Toppings getAnanas (){
        Toppings t = new Toppings();
        t.setNome("Ananas");
        t.setCalories(80);
        t.setPrice(1.80);
        return t;
    }
    @Bean("pizza")
    @Scope("prototype")
    public Pizze getPizzaMargherita (){
        Pizze p = new Pizze();
        p.setNome("Pizza");
        p.setToppings(List.of(getPomodoro(),getMozzarella()));
        p.setCalories(400);
        p.setPrice(4.0);
        return p;
    }
    @Bean("pizzaHawaiana")
    @Scope("prototype")
    public Pizze getPizzaHawaiana (){
        Pizze p = new Pizze();
        p.setNome("Margherita");
        p.setToppings(List.of(getAnanas(),getPomodoro(),getMozzarella()));
        p.setCalories(400);
        p.setPrice(4.0 + getAnanas().getPrice());
        return p;
    }
    @Bean("pizzaDiavola")
    @Scope("prototype")
    public Pizze getPizzaDiavola (){
        Pizze p = new Pizze();
        p.setNome("Diavola");
        p.setToppings(List.of(getSalamePiccante(),getPomodoro(),getMozzarella()));
        p.setCalories(400);
        p.setPrice(4.0 + getAnanas().getPrice());
        return p;
    }


    @Bean("acqua")
    @Scope("singleton")
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
    @Scope("singleton")
    public Drinks getSprite(){
        Drinks d = new Drinks();
        d.setNome("Sprite");
        d.setCalories(150);
        d.setPrice(2.5);
        d.setQuantity(0.33);
        d.setAlcohol(0);
        return d;
    }
    @Bean("margheritaProsciutto")
    @Scope("singleton")
    public ExtraProsciutto getPizzaExtraProsciutto(){
        ExtraProsciutto e = new ExtraProsciutto(getPizzaMargherita());

        return e;
    }

    @Bean("menu")
    @Scope("singleton")
    public Menu getMenu(){
        Menu m = new Menu();
        m.setToppings(List.of(getSalamePiccante(),getProsciutto(),getPomodoro(),getMozzarella()));
        m.setPizze(List.of(getPizzaExtraProsciutto(),getPizzaHawaiana(),getPizzaDiavola(),getPizzaMargherita()));
        m.setDrinks(List.of(getAcqua(),getSprite()));
        return m;

    }
}
