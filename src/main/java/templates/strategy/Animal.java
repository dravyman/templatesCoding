package templates.strategy;

import templates.strategy.soundBehavior.SoundBehaviar;

public abstract class Animal {
  private SoundBehaviar soundBehaviar;
  private int age;

  public Animal(SoundBehaviar soundBehaviar) {
    this.soundBehaviar = soundBehaviar;
  }

  public String makeSound() {
    return soundBehaviar.makeSound();
  }

  public int getAge() {
    return age;
  }

  public void grow(int i) {age +=i;}
}
