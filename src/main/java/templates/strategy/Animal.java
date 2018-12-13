package templates.strategy;

import templates.strategy.soundBehavior.SoundBehaviar;

import java.io.IOException;
import java.io.Writer;

public abstract class Animal {
  private SoundBehaviar soundBehaviar;
  private int age;

  public int getAge() {
    return age;
  }

  SoundBehaviar getSoundBehavior() {
    return soundBehaviar;
  }
  void setNewSoundBehavior(SoundBehaviar newSoundBehavior) {
    this.soundBehaviar = newSoundBehavior;
  }

  Animal(SoundBehaviar soundBehaviar) {
    this.soundBehaviar = soundBehaviar;
  }

  String makeSound() {
    return soundBehaviar.makeSound();
  }
  void makeSound(Writer writer) throws IOException {
    writer.write(soundBehaviar.makeSound());
    writer.write('\n');
    writer.flush();
  }

  Animal grow(int i) {
    age += i;
    return this;
  }
}
