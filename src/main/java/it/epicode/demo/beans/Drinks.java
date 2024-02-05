package it.epicode.demo.beans;

import lombok.Data;

@Data
public class Drinks extends Meal{
    private double quantity;
    private int alcohol;

}
