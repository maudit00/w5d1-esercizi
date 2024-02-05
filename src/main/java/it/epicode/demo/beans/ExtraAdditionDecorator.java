package it.epicode.demo.beans;

import lombok.Data;

@Data
public abstract class ExtraAdditionDecorator extends Pizze {
  protected Pizze pizza;
}
