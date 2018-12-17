package templates.strategy;

import templates.observer.Zoo;
import templates.strategy.soundBehavior.MeowSound;
import templates.strategy.soundBehavior.SoundBehaviar;
import templates.strategy.soundBehavior.TigerSound;

import java.beans.PropertyChangeEvent;
import java.io.IOException;

public class Tiger extends Animal {
  public static final String GREETING = "Приветствую тебя, мой друг!";
  private static final int meawAge = 2;

  public Tiger() {
    super(new MeowSound());
    ((MeowSound) this.getSoundBehavior()).setAnimal(this);
  }

  @Override
  Tiger grow(int i) {
    boolean isTigerCub = this.getAge() < meawAge;
    super.grow(i);
    if (isTigerCub && this.getAge() >= meawAge) {
      SoundBehaviar newTigerSound = new TigerSound().setAnimal(this);
      this.setNewSoundBehavior(newTigerSound);
    }
    return this;
  }

  @Override
  public void propertyChange(PropertyChangeEvent changeEvent) {
    try {
      Zoo zoo = (Zoo) changeEvent.getSource();
      zoo.getWritet().write(GREETING);
    } catch (IOException ignored) {}
  }
}
