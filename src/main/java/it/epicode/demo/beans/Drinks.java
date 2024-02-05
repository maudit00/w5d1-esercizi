package it.epicode.demo.beans;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Drinks extends Meal{
    private double quantity;

    @Override
    public String toString() {
        return "Drinks{" + super.toString() +
                "quantity=" + quantity +
                ", alcohol=" + alcohol +
                '}';
    }

    private int alcohol;

}
