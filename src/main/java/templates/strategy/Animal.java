package templates.strategy;

import templates.strategy.soundBehavior.SoundBehaviar;

public abstract class Animal {
  private SoundBehaviar soundBehaviar;
  private int age;

  Animal(SoundBehaviar soundBehaviar) {
    this.soundBehaviar = soundBehaviar;
  }

  String makeSound() {
    return soundBehaviar.makeSound();
  }

  public int getAge() {
    return age;
  }

  Animal grow(int i) {
    age += i;
    return this;
  }

  SoundBehaviar getSoundBehavior() {return soundBehaviar;}

  void setNewSoundBehavior(SoundBehaviar newSoundBehavior) {this.soundBehaviar = newSoundBehavior;}
}
