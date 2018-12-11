package templates.strategy.soundBehavior;

import templates.strategy.Animal;

public class TigerSound implements SoundBehaviar {
  Animal tiger;

  @Override
  public String makeSound() {
    return "Ррррр" + "р".repeat(tiger.getAge()) + "!";
  }

  public void setAnimal(Animal thisAnimal) {
    this.tiger = thisAnimal;
  };
}
