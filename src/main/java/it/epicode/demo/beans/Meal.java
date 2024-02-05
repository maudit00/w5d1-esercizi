package it.epicode.demo.beans;

import lombok.Data;

@Data
public abstract class Meal {
    private String nome;
    private int calories;
    private double price;
}