package templates.observer;

import templates.strategy.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
  private List<Animal> allAnimals;

  public Zoo() {
    allAnimals = new ArrayList<>();
  }

  public Zoo addNewAnimal(Animal newAnilmal) {
    allAnimals.add(newAnilmal);
    return this;
  }

  public int getSize() {
    return allAnimals.size();
  }
}
