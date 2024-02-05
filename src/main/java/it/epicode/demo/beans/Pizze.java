package it.epicode.demo.beans;

import java.util.List;

import lombok.Data;

@Data
public class Pizze extends Meal {
  private List<Toppings> toppings;

  @Override
  public String toString() {
    return "Pizze{" + super.toString() +
            "toppings=" + toppings +
            '}';
  }
}
