package templates.strategy;

import templates.strategy.soundBehavior.SoundBehaviar;

import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.io.Writer;

public abstract class Animal implements PropertyChangeListener {
  private SoundBehaviar soundBehaviar;
  private int age;

  public int getAge() {
    return age;
  }
  protected SoundBehaviar getSoundBehavior() {
    return soundBehaviar;
  }
  protected void setNewSoundBehavior(SoundBehaviar newSoundBehavior) {
    this.soundBehaviar = newSoundBehavior;
  }

  public Animal() {
  }

  protected Animal(SoundBehaviar soundBehaviar) {
    this.soundBehaviar = soundBehaviar;
  }

  public String makeSound() {
    return soundBehaviar.makeSound();
  }
  public void makeSound(Writer writer) throws IOException {
    writer.write(soundBehaviar.makeSound());
    writer.write('\n');
    writer.flush();
  }

  public Animal grow(int i) {
    age += i;
    return this;
  }
}
