package templates.strategy;

import templates.observer.Zoo;
import templates.strategy.soundBehavior.QuakSound;

import java.beans.PropertyChangeEvent;
import java.io.IOException;

public class SimpleDuck extends Animal {

  private final static String GREETING = "Привет %s!! Я добрая Утка!!!";

  public SimpleDuck() {
    super(new QuakSound());
  }

  @Override
  public void propertyChange(PropertyChangeEvent changeEvent) {
    try {
      Zoo zoo = (Zoo) changeEvent.getSource();
      Animal newAnimal = (Animal) changeEvent.getNewValue();
      zoo.getWritet().write(String.format(GREETING, newAnimal.getClass().getSimpleName()));
    } catch (IOException ignored) {}
  }
}
