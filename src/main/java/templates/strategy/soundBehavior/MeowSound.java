package templates.strategy.soundBehavior;

import templates.strategy.Animal;

public class MeowSound implements SoundBehaviar {
  private Animal kitty;

  @Override
  public String makeSound() {
    return "Мяу" + "-мяу".repeat(kitty.getAge());
  }

  public SoundBehaviar setAnimal(Animal thisAnimal) {
    this.kitty = thisAnimal;
    return this;
  }
}
