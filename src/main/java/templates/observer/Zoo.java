package templates.observer;

import templates.strategy.Animal;

import java.util.List;

public class Zoo {
  private List<Animal> allAnimals;

  public Zoo addNewAnimal(Animal newAnilmal) {
    return this;
  }

  public int getSize() {
    return 0;
  }
}
