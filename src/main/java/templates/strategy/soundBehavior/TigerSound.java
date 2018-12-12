package templates.strategy.soundBehavior;

import templates.strategy.Animal;

public class TigerSound implements SoundBehaviar {
  private Animal tiger;

  @Override
  public String makeSound() {
    return "Ррр" + "р".repeat(tiger.getAge()) + "!";
  }

  public SoundBehaviar setAnimal(Animal thisAnimal) {
    this.tiger = thisAnimal;
    return this;
  }
}
