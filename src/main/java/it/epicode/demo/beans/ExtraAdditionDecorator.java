package it.epicode.demo.beans;

import lombok.Data;

@Data
public class ExtraAdditionDecorator extends Pizze {
  protected Pizze pizza;
}
