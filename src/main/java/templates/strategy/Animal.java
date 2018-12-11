package templates.strategy;

import templates.strategy.soundBehavior.SoundBehaviar;

public abstract class Animal {
  private SoundBehaviar soundBehaviar;

  public Animal(SoundBehaviar soundBehaviar) {
    this.soundBehaviar = soundBehaviar;
  }

  public String makeSound() {
    return soundBehaviar.makeSound();
  }
}
